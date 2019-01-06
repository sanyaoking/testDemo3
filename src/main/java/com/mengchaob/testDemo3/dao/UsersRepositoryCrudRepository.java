package com.mengchaob.testDemo3.dao;

import com.mengchaob.testDemo3.user.Users;
import org.springframework.data.repository.CrudRepository;

/**
 * CrudRepository接口
 *
 *
 */
public interface UsersRepositoryCrudRepository extends CrudRepository<Users, Integer> {

}
