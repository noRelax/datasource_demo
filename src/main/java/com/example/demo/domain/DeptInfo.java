package com.example.demo.domain;

import lombok.Data;

import java.util.Date;

@Data
public class DeptInfo {
    private Long id;
    //热搜词
    private String content;
    //排序号
    private Long sortNumber;
    //热搜词状态（0：正常，1：删除）
    private Integer deleted;

    private Long createdBy;

    private Date createdAt;
    //更新人
    private Long updatedBy;

    private Date updatedAt;
}
