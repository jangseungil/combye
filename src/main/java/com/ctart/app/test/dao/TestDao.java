package com.ctart.app.test.dao;

import java.sql.SQLException;
import java.util.List;

import com.ctart.app.test.vo.TestVo;

public interface TestDao {
	public List<TestVo> selectCodeList() throws SQLException;
}
