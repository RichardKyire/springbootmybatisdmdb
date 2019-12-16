package com.wzt.mapper;

import com.wzt.entity.City;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CityMapper {

//    @Select("SELECT * FROM DMHR.CITY ;")
    //达梦不支持mybatis的自动映射
    List<City> getCityList();

    Integer getCount();
}
