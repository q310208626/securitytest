package com.lsj.test.securitytest;

import com.lsj.test.securitytest.dao.UserBeanMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class SecuritytestApplicationTests {


	@Test
	public void contextLoads() {
		System.out.println(1);
	}

}
