package com.ctart.app.test.user.dao;

import java.sql.SQLException;
import java.util.List;

import com.ctart.app.test.user.vo.UserTestVo;

public interface UserTestDao {
	public List<UserTestVo> selectUserList(UserTestVo userTestVo) throws SQLException;
	
	public UserTestVo selectUser(UserTestVo userTestVo) throws SQLException;
	
	public int updateUser(UserTestVo userTestVo) throws SQLException;

	public int insertUser(UserTestVo userTestVo) throws SQLException;
}
