package com.example.demo.dao;

import com.example.demo.domain.DeptInfo;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface HisDeptInfoMapper {
    @Select("select * from hot_word")
    List<DeptInfo> listDept();
}
