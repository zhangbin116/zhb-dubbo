package com.zhb;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("dubbo-client.xml");
        context.start();
        IsayHi sayHiService = (IsayHi) context.getBean("hiService");
        String resulst = sayHiService.sayHi("zhangbin");
        System.err.println(resulst);
    }
}
