package com.ctart.app.test.user.dao.impl;

import java.sql.SQLException;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ctart.app.test.user.dao.UserTestDao;
import com.ctart.app.test.user.vo.UserTestVo;

@Repository
public class UserTestDaoImpl implements UserTestDao {
	
	@Autowired
    private SqlSession sqlSession;
	
	@Override
	public List<UserTestVo> selectUserList() throws SQLException {
		return sqlSession.selectList("test.selectUserList");
	}
	
	@Override
	public UserTestVo selectUser(UserTestVo userTestVo) throws SQLException {
		return sqlSession.selectOne("test.selectUser", userTestVo);
	}

	@Override
	public int updateUser(UserTestVo userTestVo) throws SQLException {
		return sqlSession.update("test.updateUser", userTestVo);
	}

	@Override
	public int insertUser(UserTestVo userTestVo) throws SQLException {
		return sqlSession.insert("test.insertUser", userTestVo);
	}

}
