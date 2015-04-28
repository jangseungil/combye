package com.ctart.app.test.code.dao.impl;

import java.sql.SQLException;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ctart.app.test.code.dao.CodeTestDao;
import com.ctart.app.test.code.vo.CodeTestVo;

@Repository
public class CodeTestDaoImpl   {
	
	@Autowired
    private SqlSession sqlSession;
	
	public List<CodeTestVo> selectCodeList() throws SQLException {
		return sqlSession.selectList("test.selectCodeList");
	}

}
