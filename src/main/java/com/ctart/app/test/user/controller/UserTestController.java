package com.ctart.app.test.user.controller;

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

import com.ctart.app.test.user.service.UserTestService;
import com.ctart.app.test.user.vo.UserTestVo;

/**
 * 사용자 테스트 컨트롤러
 */
@Controller
@RequestMapping(value = "test/user")
public class UserTestController {
	
	private static final Logger logger = LoggerFactory.getLogger(UserTestController.class);
	
	@Autowired
	private UserTestService userTestService;
	
	/**
	 * select test
	 * @throws SQLException 
	 */
	@RequestMapping(value = "", method = RequestMethod.GET)
	public String test(Locale locale, Model model, HttpServletRequest request, HttpServletResponse response) throws SQLException {
		List<UserTestVo> userTestVoList = userTestService.selectUserList();
		
		model.addAttribute("userTestVoList", userTestVoList);
		
		return "test/user/testuser";
	}
	
}
