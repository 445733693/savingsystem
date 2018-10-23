package com.fis.savingsystem.mapper;

import com.fis.savingsystem.pojo.Interest;
import java.util.List;

public interface InterestMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Interest record);

    Interest selectByPrimaryKey(Integer id);

    List<Interest> selectAll();

    int updateByPrimaryKey(Interest record);
}