/*
 * Copyright (c) 2014 Qunar.com. All Rights Reserved.
 */
package com.lxz.mybatis;

import java.io.InputStream;

import com.lxz.mybatis.schema.ConfigInfo;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author: xiaole Date: 14-5-18 Time: 下午7:48
 * @version: \$Id$
 */
public class Test {
    private static final Logger logger = LoggerFactory.getLogger(Test.class);

    public static void main(String[] args) throws Exception {

        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

        SqlSession session = sqlSessionFactory.openSession();
        try {
            ConfigInfoDao mapper = session.getMapper(ConfigInfoDao.class);
            ConfigInfo info = mapper.queryConfigInfo(1L);
            logger.debug("info: {}",info);
        } finally {
            session.close();
        }
    }
}
