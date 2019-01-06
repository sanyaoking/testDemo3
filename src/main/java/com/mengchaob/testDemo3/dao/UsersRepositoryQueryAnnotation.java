package com.mengchaob.testDemo3.dao;

import com.mengchaob.testDemo3.user.Users;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.Repository;

import java.util.List;

/**
 * Repository   @Query
 *
 *
 */
public interface UsersRepositoryQueryAnnotation extends Repository<Users, Integer> {

	@Query("from Users where name = ?1")
	List<Users> queryByNameUseHQL(String name);
	
	@Query(value="select * from t_users where name = ?1",nativeQuery=true)
	List<Users> queryByNameUseSQL(String name);
	
	@Query("update Users set name  = ?1 where id  = ?2")
	@Modifying //需要执行一个更新操作
	void updateUsersNameById(String name, Integer id);
}
