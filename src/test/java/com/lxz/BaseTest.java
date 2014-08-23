/*
* Copyright (c) 2014 Qunar.com. All Rights Reserved.
*/
package com.lxz;

import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author: xiaole  Date: 14-8-23 Time: 下午8:36
 * @version: \$Id$
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {
        "classpath:spring.xml"})
public class BaseTest {
    protected Logger logger = LoggerFactory.getLogger(getClass());
}