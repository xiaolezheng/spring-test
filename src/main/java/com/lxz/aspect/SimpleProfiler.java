package com.lxz.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.util.StopWatch;

public class SimpleProfiler {
    private static final Logger logger = LoggerFactory.getLogger(SimpleProfiler.class);

    public void before(){
        logger.debug("前置通知");
    }

    public void after(){
        logger.debug("后置通知");
    }

    public Object profile(ProceedingJoinPoint call) throws Throwable {
        StopWatch clock = new StopWatch("Profiling");
        try {
            clock.start(call.toShortString());
            return call.proceed();
        } finally {
            clock.stop();
            logger.debug(clock.prettyPrint());
        }
    }
}
