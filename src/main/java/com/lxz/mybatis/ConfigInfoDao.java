/*
 * Copyright (c) 2014 Qunar.com. All Rights Reserved.
 */
package com.lxz.mybatis;

import com.lxz.mybatis.schema.ConfigInfo;

/**
 * @author: xiaole Date: 14-5-18 Time: 下午7:36
 * @version: \$Id$
 */
public interface ConfigInfoDao {
    public ConfigInfo queryConfigInfo(Long id);
}
