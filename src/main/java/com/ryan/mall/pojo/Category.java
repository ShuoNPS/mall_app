package com.ryan.mall.pojo;

import lombok.Data;

import java.util.Date;

@Data
public class Category {
    private Integer id;
    private Integer parentId;
    private String name;
    private Integer status;
    private Date createTime;
    private Date updateTime;
}
