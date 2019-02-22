package com.sunflower;

import static org.springframework.restdocs.mockmvc.MockMvcRestDocumentation.document;
import static org.springframework.restdocs.mockmvc.MockMvcRestDocumentation.documentationConfiguration;
import static org.springframework.restdocs.mockmvc.RestDocumentationRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.restdocs.JUnitRestDocumentation;
import org.springframework.restdocs.http.HttpDocumentation;
import org.springframework.restdocs.payload.PayloadDocumentation;
import org.springframework.restdocs.snippet.Snippet;
import org.springframework.restdocs.templates.TemplateFormats;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.sunflower.model.SunHouse;


@RunWith(SpringRunner.class)
@SpringBootTest
public class SunHouseDocument {
	
    @Autowired
    public ObjectMapper objectMapper;
    
    @Autowired
    private WebApplicationContext context;
    
    @Rule
    public JUnitRestDocumentation restDocumentation = new JUnitRestDocumentation();
    
    protected MockMvc mockMvc;
    
    
    @Before
	public void setUp() {

		Snippet[] defaultSnippets = new Snippet[] { HttpDocumentation.httpRequest(), HttpDocumentation.httpResponse(),
				PayloadDocumentation.requestBody(), PayloadDocumentation.responseBody() };
		this.mockMvc = MockMvcBuilders.webAppContextSetup(this.context)
				.apply(documentationConfiguration(this.restDocumentation)
						.snippets().withTemplateFormat(TemplateFormats.asciidoctor()).withEncoding("UTF-8")
						.withDefaults(defaultSnippets).and().uris().withScheme("http").withHost("192.168.11.158")
						.withPort(8080).and()).build();
	}
	
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
    
    
    
    @Test
    public void add() throws Exception {

    	SunHouse sh = new SunHouse();
    	
    	sh.setHouseNo("MD8YL-501-04");
    	sh.setHouseName("明德8英明501-04");
    	sh.setHousePicture("00.jpg|01.jpg|02.jpg");
    	sh.setHouseIsRent("空房");
    	sh.setHouseMonthPrice("1200");
    	sh.setHouseYearPrice("12000");
    	sh.setCreateAccount("陈云展");
    	sh.setCreateTime("2019-02-21 15:04:00");
    	
    	
        this.mockMvc.perform(
        		post("/house").contentType("application/json; charset=utf-8").content(
                        this.objectMapper.writeValueAsString(sh)))
              .andExpect(status().isOk())
        	  .andDo(print())
              .andDo(document("restful-house-add"));
    }

}
