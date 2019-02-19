package com.sunflower.mapper;

import com.sunflower.model.SunHouse;
import com.sunflower.model.SunHouseExample;
import org.springframework.stereotype.Repository;

/**
 * SunHouseDAO继承基类
 */
@Repository
public interface SunHouseDAO extends MyBatisBaseDao<SunHouse, Integer, SunHouseExample> {
}