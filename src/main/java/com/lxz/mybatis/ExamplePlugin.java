package com.lxz.mybatis;

import java.util.Properties;

import org.apache.ibatis.plugin.Interceptor;
import org.apache.ibatis.plugin.Intercepts;
import org.apache.ibatis.plugin.Invocation;
import org.apache.ibatis.plugin.Plugin;
import org.apache.ibatis.plugin.Signature;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

// ExamplePlugin.java
@Intercepts({ @Signature(type = ConfigInfoDao.class, method = "queryConfigInfo", args = { Long.class }) })
public class ExamplePlugin implements Interceptor {
    private static final Logger logger = LoggerFactory.getLogger(ExamplePlugin.class);

    public Object intercept(Invocation invocation) throws Throwable {
        return invocation.proceed();
    }

    public Object plugin(Object target) {
        logger.debug("plugin.................................................");
        return Plugin.wrap(target, this);
    }

    public void setProperties(Properties properties) {
    }
}
