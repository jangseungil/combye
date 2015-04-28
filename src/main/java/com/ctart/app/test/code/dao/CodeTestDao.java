package com.ctart.app.test.code.dao;

import java.sql.SQLException;
import java.util.List;
import org.springframework.stereotype.Repository;
import com.ctart.app.test.code.vo.CodeTestVo;

@Repository
public interface CodeTestDao {
	public List<CodeTestVo> selectCodeList() throws SQLException;
}
