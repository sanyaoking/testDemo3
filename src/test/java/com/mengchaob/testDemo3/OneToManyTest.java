package com.mengchaob.testDemo3;


import com.mengchaob.testDemo3.dao.UsersRepository;
import com.mengchaob.testDemo3.user.Roles;
import com.mengchaob.testDemo3.user.User;
import com.mengchaob.testDemo3.user.Users;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Example;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Optional;

/**
 * 一对多关联关系测试
 *
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes=TestDemo3Application.class)
public class OneToManyTest {
	
	@Autowired
	private UsersRepository usersRepository;
	
	/**
	 * 一对多关联关系的添加
	 */
	@Test
	public void testSave(){
		//创建一个用户
		Users users = new Users();
		users.setAddress("天津");
		users.setAge(32);
		users.setName("小刚");
		
		//创建一个角色
		Roles roles = new Roles();
		roles.setRolename("管理员");
		
		//关联
		roles.getUsers().add(users);
		users.setRoles(roles);
		
		//保存
		this.usersRepository.save(users);
	}
	
	/**
	 * 一对多关联关系的查询
	 */
	@Test
	public void testFind(){
		Users users = new Users();
		users.setId(4);
		Example<Users>  example = Example.of(users);
		Optional<Users> findOne = this.usersRepository.findOne(example);
		System.out.println(findOne);
		Roles roles = findOne.get().getRoles();
		System.out.println(roles.getRolename());
	}
}
