package com.ctart.app.pc.controller;

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
import org.springframework.web.bind.annotation.ResponseBody;

import com.ctart.app.test.user.service.UserTestService;
import com.ctart.app.test.user.vo.UserTestVo;


/**
 * 
 */
@Controller
@RequestMapping(value = "pc")
public class PcController {
	
	private static final Logger logger = LoggerFactory.getLogger(PcController.class);
	
	@Autowired
	private UserTestService userTestService;
	
	/**
	 * 
	 * @throws SQLException 
	 */
	@RequestMapping(value = "", method = RequestMethod.GET)
	public String selectUserList(Locale locale, Model model, UserTestVo userTestVo) throws SQLException {
		//List<UserTestVo> userTestVoList = userTestService.selectUserList(userTestVo);
		//model.addAttribute("userTestVoList", userTestVoList);
		return "pc/byepcmain";
	}
	
	
	/**
	 * json
	 * @throws SQLException 
	 */
	@RequestMapping(value = "/json", method = RequestMethod.POST)
	public @ResponseBody List<UserTestVo> selectUserListJSON(@RequestBody UserTestVo userTestVo) throws SQLException {
		List<UserTestVo> userTestVoList = userTestService.selectUserList(userTestVo);
		return userTestVoList;
	}
	
	/**
	 *
	 * @throws SQLException 
	 */
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public String selectUser(@PathVariable("id") String id, Model model, HttpServletRequest request, HttpServletResponse response) throws SQLException {
		
		UserTestVo userTestVo = userTestService.selectUser(new UserTestVo(id));
		
		model.addAttribute("userTestVo", userTestVo);
		
		return "test/user/testuser";
	}
	
	/**
	 * 
	 * @throws SQLException 
	 */
	@RequestMapping(value = "/{id}/update", method = RequestMethod.GET)
	public String selectUserUpdate(@PathVariable("id") String id, Model model, HttpServletRequest request, HttpServletResponse response) throws SQLException {
		
		UserTestVo userTestVo = userTestService.selectUser(new UserTestVo(id));
		
		model.addAttribute("userTestVo", userTestVo);
		
		return "test/user/testuserupdate";
	}
	
	/**
	 * 
	 * @throws SQLException 
	 */
	@RequestMapping(value = "/{id}/update", method = RequestMethod.POST)
	public String updateUser(@PathVariable("id") String id, @ModelAttribute UserTestVo userTestVo, Model model, HttpServletRequest request, HttpServletResponse response) throws SQLException {
		
		userTestService.updateUser(userTestVo);
		
		
		return "redirect:";

	}
	
}
