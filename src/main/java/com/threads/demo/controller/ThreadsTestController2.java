package com.threads.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: liukun
 * @Description:
 * @Date: 2020/3/5.14:13
 */
@RestController
public class ThreadsTestController2 {

    @RequestMapping("/test/tomcat/threads2")
    public void testTomcatThreads() {
        System.out.println(Thread.currentThread().getName());
        System.out.println(Thread.currentThread().getName());
        System.out.println(Thread.currentThread().getName());
        System.out.println(Thread.currentThread().getName());
        System.out.println(Thread.currentThread().getName());
    }

}
