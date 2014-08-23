/*
* Copyright (c) 2014 Qunar.com. All Rights Reserved.
*/
package com.lxz.service;

import com.lxz.BaseTest;
import com.lxz.aspect.FooService;
import org.junit.Test;

import javax.annotation.Resource;

/**
 * @author: xiaole  Date: 14-8-23 Time: 下午8:46
 * @version: \$Id$
 */
public class BeanTest extends BaseTest {
    @Resource
    private FooService fooService;

    @Test
    public void testBean(){
        logger.debug(fooService.getFoo("Pengo", 12));
        logger.debug("name: {}, sex: {}, age: {}, grade: {}","jim", "男", 12,2);
    }
}