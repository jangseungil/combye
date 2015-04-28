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
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ctart.app.test.user.service.UserTestService;
import com.ctart.app.test.user.vo.UserTestVo;

/**
 * ����� �׽�Ʈ ��Ʈ�ѷ�
 */
@Controller
@RequestMapping(value = "test/user")
public class UserTestController {
	
	private static final Logger logger = LoggerFactory.getLogger(UserTestController.class);
	
	@Autowired
	private UserTestService userTestService;
	
	/**
	 * ����� ����Ʈ
	 * @throws SQLException 
	 */
	@RequestMapping(value = "", method = RequestMethod.GET)
	public String selectUserList(Locale locale, Model model, UserTestVo userTestVo) throws SQLException {
		List<UserTestVo> userTestVoList = userTestService.selectUserList(userTestVo);
		
		model.addAttribute("userTestVoList", userTestVoList);
		
		return "test/user/testuserlist";
	}
	
	
	/**
	 * ����� ����Ʈ(json)
	 * @throws SQLException 
	 */
	@RequestMapping(value = "/json", method = RequestMethod.POST)
	public @ResponseBody List<UserTestVo> selectUserListJSON(@RequestBody UserTestVo userTestVo) throws SQLException {
		List<UserTestVo> userTestVoList = userTestService.selectUserList(userTestVo);
		return userTestVoList;
	}
	
	/**
	 * ����� ����ȸ
	 * @throws SQLException 
	 */
	@RequestMapping(value = "/{seq}", method = RequestMethod.GET)
	public String selectUser(@PathVariable("seq") String seq, Model model, HttpServletRequest request, HttpServletResponse response) throws SQLException {
		
		UserTestVo userTestVo = userTestService.selectUser(new UserTestVo(seq));
		
		model.addAttribute("userTestVo", userTestVo);
		
		return "test/user/testuser";
	}
	
	/**
	 * ����� ����ȭ��
	 * @throws SQLException 
	 */
	@RequestMapping(value = "/{seq}/update", method = RequestMethod.GET)
	public String selectUserUpdate(@PathVariable("seq") String seq, Model model, HttpServletRequest request, HttpServletResponse response) throws SQLException {
		
		UserTestVo userTestVo = userTestService.selectUser(new UserTestVo(seq));
		
		model.addAttribute("userTestVo", userTestVo);
		
		return "test/user/testuserupdate";
	}
	
	/**
	 * ����� ����
	 * @throws SQLException 
	 */
	@RequestMapping(value = "/{seq}/update", method = RequestMethod.POST)
	public String updateUser(@PathVariable("seq") String seq, @ModelAttribute UserTestVo userTestVo, Model model, HttpServletRequest request, HttpServletResponse response) throws SQLException {
		
		userTestService.updateUser(userTestVo);
		
		
		return "redirect:";

	}
	
}
