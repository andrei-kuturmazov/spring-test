package ru.kuturmazov_a.springapp;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "application Context.xml"
        );
        TestBean testBean = context.getBean("testBean", TestBean.class);
        System.out.println(testBean.getName());
        context.close();
    }
}
