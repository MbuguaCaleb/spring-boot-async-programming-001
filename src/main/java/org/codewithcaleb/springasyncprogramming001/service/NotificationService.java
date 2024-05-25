package org.codewithcaleb.springasyncprogramming001.service;


import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class NotificationService {

    @Async("asyncTaskExecutor")
    public void execute() throws InterruptedException {
        log.info("Sending notification");
        Thread.sleep(2000);
        log.info("notification sent successfully");
    }

}
