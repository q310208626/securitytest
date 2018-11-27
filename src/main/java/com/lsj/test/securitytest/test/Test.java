package com.lsj.test.securitytest.test;

import com.lsj.test.securitytest.SecuritytestApplication;
import com.lsj.test.securitytest.bean.UserBean;
import com.lsj.test.securitytest.bean.UserBeanExample;
import com.lsj.test.securitytest.dao.UserBeanMapper;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * @descriptions: 测试类
 * @version: v1.0.0
 * @author: linsj3
 * @create: 2018-11-27 15:55
 **/
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = SecuritytestApplication.class, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class Test {

    @Autowired
    UserBeanMapper userBeanMapper;

    @Before
    public void before(){
        System.out.println("========== before test ===========");
    }

    @org.junit.Test
    public void MapperExampletest(){
        UserBeanExample userBeanExample = new UserBeanExample();
        UserBeanExample.Criteria criteria =userBeanExample.createCriteria();
        criteria.andUserNameLike("cust");
        List<UserBean> userBeans = userBeanMapper.selectByExample(userBeanExample);
        System.out.println(userBeans.get(0).getUserPassword());
    }
}
