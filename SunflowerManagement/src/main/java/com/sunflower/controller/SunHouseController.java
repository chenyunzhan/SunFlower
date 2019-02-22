package com.sunflower.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.sunflower.mapper.SunHouseDAO;
import com.sunflower.model.ResultVo;
import com.sunflower.model.SunHouse;
import com.sunflower.model.SunHouseExample;

@RestController
public class SunHouseController {

	@Autowired
	private SunHouseDAO dao;
	
    @RequestMapping(value="/houseList",method = RequestMethod.POST)
    public ResultVo list(@RequestBody SunHouse sh){
    	
    	SunHouseExample example = new SunHouseExample();
    	SunHouseExample.Criteria criteria = example.createCriteria();
		if(sh.getHouseName()!=null) {
			criteria.andHouseNameLike("");
		}
    	
    	List<SunHouse> resultPageVo = this.dao.selectByExample(example);
        return ResultVo.create(0, resultPageVo, "");
    }
    
    
    @RequestMapping(value="/house",method = RequestMethod.POST)
    public ResultVo add(@RequestBody SunHouse sh){
    	int result = this.dao.insert(sh);
        return ResultVo.create(0, result, "");
    }
}
