package com.ctart.app.test.user.dao;

import java.sql.SQLException;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.ctart.app.test.user.vo.UserTestVo;

@Repository
public interface UserTestDao {
	public List<UserTestVo> selectUserList(UserTestVo userTestVo) throws SQLException;
	
	public UserTestVo selectUser(UserTestVo userTestVo) throws SQLException;
	
	public void updateUser(UserTestVo userTestVo) throws SQLException;

	public void insertUser(UserTestVo userTestVo) throws SQLException;
}
