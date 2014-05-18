/*
 * Copyright (c) 2014 Qunar.com. All Rights Reserved.
 */
package com.lxz.mybatis.schema;

import com.lxz.util.JsonUtil;

/**
 * @author: xiaole Date: 14-5-18 Time: 下午7:44
 * @version: \$Id$
 */
public abstract class PrintEnable {
    public String toString() {
        return JsonUtil.encode(this);
    }
}
