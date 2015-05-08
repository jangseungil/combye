package com.ctart.app.pc.service;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ctart.app.pc.dao.PcDao;
import com.ctart.app.pc.vo.PcVo;

@Service
public class PcService {
	
	@Autowired
	private PcDao pcDao;
	
	public List<PcVo> selectCodeList() throws SQLException {
		return pcDao.selectCodeList();
	}
}
