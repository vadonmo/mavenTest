package com.vadon.service.impl;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.vadon.model.User;
import com.vadon.service.IUserService;
/**
 * 配置spring和junit整合，junit启动时加载springIOC容器 spring-test,junit
 */
@RunWith(SpringJUnit4ClassRunner.class)
// 告诉junit spring配置文件
@ContextConfiguration({ "classpath:applicationContext.xml"})
public class IUserServiceTest {

    @Autowired
    public IUserService userService;
    
    @Test
    public void getUserByIdTest(){
     
        User user = userService.getUserById(1);
        System.out.println(user.getUserName());
    }
    
}
/*public class IUserServiceTest {

	public static void main(String[] args) {
		ApplicationContext application = new ClassPathXmlApplicationContext("applicationContext.xml");
		IUserService uService = (IUserService) application.getBean("userService");
		User user = uService.getUserById(1);
		System.out.println(user.getUserName());
	}

}*/
