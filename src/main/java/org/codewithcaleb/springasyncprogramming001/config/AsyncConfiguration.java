package org.codewithcaleb.springasyncprogramming001.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

import java.util.concurrent.Executor;

@Configuration
@EnableAsync
public class AsyncConfiguration {

    //Creating my Custom Thread Pool, and setting my own independent configurations
    //I can have a Qualifier to my Bean i i have different configurations
    @Bean("asyncTaskExecutor")
    public Executor asyncTaskExecutor(){
        ThreadPoolTaskExecutor taskExecutor = new ThreadPoolTaskExecutor();
        taskExecutor.setCorePoolSize(10); //-->Minimum number of threads when using async task executor
        taskExecutor.setQueueCapacity(150);
        taskExecutor.setMaxPoolSize(100); //-->Maximum pool size
        taskExecutor.setThreadNamePrefix("AsyncTaskThread-");
        taskExecutor.initialize();
        return taskExecutor;
    }
}
