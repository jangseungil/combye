package com.ctart.app.user;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.sql.SQLException;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import com.ctart.app.test.user.service.UserTestService;
import com.ctart.app.test.user.vo.UserTestVo;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"file:src/main/webapp/WEB-INF/spring/root-context.xml", "file:src/main/webapp/WEB-INF/spring/appServlet/servlet-context.xml"})
@Transactional
public class UserTest {
	
	@Autowired
	private UserTestService userTestService;
	
	private UserTestVo userTestVo;
	
	@Before
	public void setUp() {
		userTestVo = new UserTestVo();
		userTestVo.setType("C");
		userTestVo.setSex("1");
		userTestVo.setName("�ڵ���");
		userTestVo.setBirth("19850511");
		userTestVo.setPhone("01032321212");
		userTestVo.setZipcode("322333");
		userTestVo.setAddress("����� ���α� �ξ����");
	}

	@Test
	public void user() throws SQLException {
		
		List<UserTestVo> resultVo = userTestService.selectUserList(new UserTestVo());
		
		//selectUserList �׽�Ʈ
		assertNotNull(resultVo);
		
		//selesctUser �׽�Ʈ
		assertNotNull(userTestService.selectUser(new UserTestVo(resultVo.get(0).getSeq())));
		
		//updateUser �׽�Ʈ
		userTestVo.setSeq(resultVo.get(0).getSeq());
		userTestService.updateUser(userTestVo);
		UserTestVo updatedVo = userTestService.selectUser(new UserTestVo(resultVo.get(0).getSeq()));
		assertEquals(userTestVo.getAddress(), updatedVo.getAddress());
	}
	
}
