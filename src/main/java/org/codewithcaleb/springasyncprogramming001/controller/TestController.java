package org.codewithcaleb.springasyncprogramming001.controller;


import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.codewithcaleb.springasyncprogramming001.service.NotificationService;
import org.codewithcaleb.springasyncprogramming001.service.OrderService;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/test")
@RequiredArgsConstructor
@Slf4j
public class TestController {

    private final NotificationService notificationService;
    private final OrderService orderService;
    @GetMapping
    public ResponseEntity<String> processOrder() throws InterruptedException {
        orderService.execute();
        notificationService.execute();
        log.info("Order Completed Successfully");
        return ResponseEntity.status(HttpStatusCode.valueOf(200)).body("Success");
    }
}
