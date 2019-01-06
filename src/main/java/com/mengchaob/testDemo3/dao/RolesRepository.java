package com.mengchaob.testDemo3.dao;


import com.mengchaob.testDemo3.user.Roles;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.QueryByExampleExecutor;

/**
 * RolesRepository
 *
 *
 */
public interface RolesRepository extends JpaRepository<Roles,Integer>{

}
