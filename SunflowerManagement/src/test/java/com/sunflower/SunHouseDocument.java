package com.sunflower;

import static org.springframework.restdocs.mockmvc.MockMvcRestDocumentation.document;
import static org.springframework.restdocs.mockmvc.RestDocumentationRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.web.servlet.MockMvc;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.sunflower.model.SunHouse;

public class SunHouseDocument {
	
    @Autowired
    public ObjectMapper objectMapper;
    
    protected MockMvc mockMvc;
	
    @Test
    public void list() throws Exception {

    	SunHouse sh = new SunHouse();
        this.mockMvc.perform(
        		post("/houseList").contentType("application/json; charset=utf-8").content(
                        this.objectMapper.writeValueAsString(sh)))
              .andExpect(status().isOk())
        	  .andDo(print())
              .andDo(document("restful-house-list"));
    }

}
