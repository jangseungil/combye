package com.ctart.app.test.dao.impl;

import java.sql.SQLException;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ctart.app.test.dao.TestDao;
import com.ctart.app.test.vo.TestVo;

@Repository
public class TestDaoImpl implements TestDao {
	
	@Autowired
    private SqlSession sqlSession;
	
	@Override
	public List<TestVo> test() throws SQLException {
		List<TestVo> testVoList = sqlSession.selectList("test.selectCodeList");

		return testVoList;
	}

}
