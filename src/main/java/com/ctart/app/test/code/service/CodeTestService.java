package com.ctart.app.test.code.service;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ctart.app.test.code.dao.CodeTestDao;
import com.ctart.app.test.code.vo.CodeTestVo;

@Service
public class CodeTestService {
	
	@Autowired
	private CodeTestDao testDao;
	
	public List<CodeTestVo> selectCodeList() throws SQLException {
		return testDao.selectCodeList();
	}
}
