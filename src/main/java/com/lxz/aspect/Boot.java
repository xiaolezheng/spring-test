package com.lxz.aspect;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public final class Boot {
    private static final Logger logger = LoggerFactory.getLogger(Boot.class);

    public static void main(final String[] args) throws Exception {
        BeanFactory ctx = new ClassPathXmlApplicationContext("classpath:spring.xml");
        FooService foo = (FooService) ctx.getBean("fooService");
        logger.debug(foo.getFoo("Pengo", 12));
        logger.debug("ceshi: {}",12);
    }
}
