package com.ctart.app.test.controller;

import java.sql.SQLException;
import java.util.List;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.ctart.app.test.service.TestService;
import com.ctart.app.test.vo.TestVo;

/**
 * TestController.java
 */
@Controller
@RequestMapping(value = "test")
public class TestController {
	
	private static final Logger logger = LoggerFactory.getLogger(TestController.class);
	
	@Autowired
	private TestService testService;
	
	/**
	 * select test
	 * @throws SQLException 
	 */
	@RequestMapping(value = "", method = RequestMethod.GET)
	public String test(Locale locale, Model model, HttpServletRequest request, HttpServletResponse response) throws SQLException {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		List<TestVo> testVoList = testService.selectCodeList();
		
		model.addAttribute("testVoList", testVoList);
		
		for(TestVo testVo : testVoList) {
		}
		
		return "test/test";
	}
	
}
