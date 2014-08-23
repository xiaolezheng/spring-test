package com.lxz.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.util.StopWatch;

@Service
public class SimpleProfiler {
    private static final Logger logger = LoggerFactory.getLogger(SimpleProfiler.class);

    private ThreadLocal<Long> threadLocal = new ThreadLocal<Long>();

    public void before(){
        logger.debug("前置通知");
        threadLocal.set(System.currentTimeMillis());
    }

    public void after(){
        long time = System.currentTimeMillis() - threadLocal.get().longValue();
        logger.debug("后置通知");
        logger.debug("time: {}", time);
        threadLocal.remove();
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
