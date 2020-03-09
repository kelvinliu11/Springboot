package com.threads.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.concurrent.TimeUnit;

/**
 * @Author: liukun
 * @Description:
 * @Date: 2020/3/5.14:13
 */
@RestController
public class ThreadsTestController {

    @RequestMapping("/test/tomcat/threads")
    public String testTomcatThreads() throws InterruptedException {
        System.out.println(Thread.currentThread().getName()+new Date());
        Thread.sleep(30000);
        return "hello";
    }

}
