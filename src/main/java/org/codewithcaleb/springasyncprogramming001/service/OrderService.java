package org.codewithcaleb.springasyncprogramming001.service;


import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class OrderService {
    public void execute() throws InterruptedException {
        Thread.sleep(1500);
        log.info("Make order");
    }
}
