package com.sunflower.mapper;

import com.sunflower.model.SunOrder;
import com.sunflower.model.SunOrderExample;
import org.springframework.stereotype.Repository;

/**
 * SunOrderDAO继承基类
 */
@Repository
public interface SunOrderDAO extends MyBatisBaseDao<SunOrder, Integer, SunOrderExample> {
}