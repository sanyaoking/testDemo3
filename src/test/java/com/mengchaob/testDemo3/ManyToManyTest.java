package com.mengchaob.testDemo3;

import com.mengchaob.testDemo3.dao.RolesRepository;
import com.mengchaob.testDemo3.user.Menus;
import com.mengchaob.testDemo3.user.Roles;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Set;

/**
 * 多对多的关联关系的测试
 *
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes=TestDemo3Application.class)
public class ManyToManyTest {

	@Autowired
	private RolesRepository rolesRepository;
	
	/**
	 * 添加测试
	 */
	@Test
	public void testSave(){
		//创建角色对象
		Roles r = new Roles();
		r.setRolename("项目经理");
		
		//创建菜单对象
		Menus menus = new Menus();
		menus.setMenusname("xxxx管理系统");
		menus.setFatherid(0);
		
		Menus menus2 = new Menus();
		menus2.setFatherid(1);
		menus2.setMenusname("项目管理");
		//关联
		r.getMenus().add(menus);
		r.getMenus().add(menus2);
		menus.getRoles().add(r);
		menus2.getRoles().add(r);
		//保存
		this.rolesRepository.save(r);
	}
	
	/**
	 * 查询操作
	 */
/*	@Test
	public void testFind(){
		Roles roles = this.rolesRepository.findOne(2);
		System.out.println(roles.getRolename());
		Set<Menus> menus = roles.getMenus();
		for (Menus menus2 : menus) {
			System.out.println(menus2);
		}
	}*/
}
