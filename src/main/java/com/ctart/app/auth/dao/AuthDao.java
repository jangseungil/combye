package com.ctart.app.auth.dao;

import java.sql.SQLException;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.ctart.app.auth.vo.AuthVo;

@Repository
public interface AuthDao {
	public List<AuthVo> selectAuthList(AuthVo authVo) throws SQLException;
	
	public AuthVo selectAuth(AuthVo authVo) throws SQLException;
}
