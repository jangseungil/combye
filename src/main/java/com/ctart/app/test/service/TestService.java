package com.ctart.app.test.service;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ctart.app.test.dao.TestDao;
import com.ctart.app.test.vo.TestVo;

@Service
public class TestService {
	
	@Autowired
	private TestDao testDao;
	
	public List<TestVo> selectCodeList() throws SQLException {
		return testDao.selectCodeList();
	}
}
