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

}
