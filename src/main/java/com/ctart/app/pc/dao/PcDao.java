package com.ctart.app.pc.dao;

import java.sql.SQLException;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.ctart.app.pc.vo.PcVo;

@Repository
public interface PcDao {
	public List<PcVo> selectCodeList() throws SQLException;
}
