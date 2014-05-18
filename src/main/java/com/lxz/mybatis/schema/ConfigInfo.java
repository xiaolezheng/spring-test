/*
 * Copyright (c) 2014 Qunar.com. All Rights Reserved.
 */
package com.lxz.mybatis.schema;

import java.io.Serializable;
import java.sql.Date;

/**
 * @author: xiaole Date: 14-5-18 Time: 下午7:37
 * @version: \$Id$
 */
public class ConfigInfo extends PrintEnable implements Serializable {
    private long id;
    private String dataId;
    private String groupId;
    private String content;
    private String md5;
    private Date gmtCreate;

    public ConfigInfo() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getDataId() {
        return dataId;
    }

    public void setDataId(String dataId) {
        this.dataId = dataId;
    }

    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getMd5() {
        return md5;
    }

    public void setMd5(String md5) {
        this.md5 = md5;
    }

    public Date getGmtCreate() {
        return gmtCreate;
    }

    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }
}
