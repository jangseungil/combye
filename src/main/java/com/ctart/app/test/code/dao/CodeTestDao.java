package com.ctart.app.test.code.dao;

import java.sql.SQLException;
import java.util.List;

import com.ctart.app.test.code.vo.CodeTestVo;

public interface CodeTestDao {
	public List<CodeTestVo> selectCodeList() throws SQLException;
}
