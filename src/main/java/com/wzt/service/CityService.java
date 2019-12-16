package com.wzt.service;

import com.wzt.entity.City;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CityService {
    List<City> getCityList();
    Integer getCount();
}
