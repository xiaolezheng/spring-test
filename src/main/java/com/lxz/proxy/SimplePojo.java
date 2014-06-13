package com.lxz.proxy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SimplePojo implements Pojo {
    private static final Logger logger = LoggerFactory.getLogger(SimplePojo.class);

    public void foo() {
        // this next method invocation is a direct call on the this reference
        this.bar();
        logger.debug("foo....");
    }

    public void bar() {
        // some logic...
        logger.debug("bar....");
    }
}