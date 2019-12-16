package com.wzt.service.impl;

import com.wzt.entity.City;
import com.wzt.mapper.CityMapper;
import com.wzt.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class CityServiceImpl implements CityService {

    @Resource
    private CityMapper cityMapper;

    @Override
    public List<City> getCityList() {
        return cityMapper.getCityList();
    }

    @Override
    public Integer getCount() {
        return cityMapper.getCount();
    }
}
