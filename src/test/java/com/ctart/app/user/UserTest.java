package com.ctart.app.user;

import java.sql.SQLException;
import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.ctart.app.test.user.service.UserTestService;
import com.ctart.app.test.user.vo.UserTestVo;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"file:src/main/webapp/WEB-INF/spring/root-context.xml", "file:src/main/webapp/WEB-INF/spring/appServlet/servlet-context.xml"})
public class UserTest extends Assert{
	
	@Autowired
	private UserTestService userTestService;
	
	private UserTestVo userTestVo;
	
	@Before
	public void setUp() {
		userTestVo = new UserTestVo();
		userTestVo.setAddress("��⵵ ����� �λ굿");
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
