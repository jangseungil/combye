package com.ctart.app.test.user.service;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ctart.app.test.user.dao.UserTestDao;
import com.ctart.app.test.user.vo.UserTestVo;

@Service
public class UserTestService {
	
	@Autowired
	private UserTestDao testDao;
	
	public List<UserTestVo> selectUserList(UserTestVo userTestVo) throws SQLException {
		return testDao.selectUserList(userTestVo);
	}
	
	public UserTestVo selectUser(UserTestVo userTestVo) throws SQLException {
		return testDao.selectUser(userTestVo);
	}
	
	public void updateUser(UserTestVo userTestVo) throws SQLException {
		int result = testDao.updateUser(userTestVo);
	}
	
	public void insertUser(UserTestVo userTestVo) throws SQLException {
		int result = testDao.insertUser(userTestVo);
	}
}
