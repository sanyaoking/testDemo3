package com.mengchaob.testDemo3.dao;

import com.mengchaob.testDemo3.user.Users;
import org.springframework.data.repository.PagingAndSortingRepository;
/**
 * 
 *PagingAndSortingRepository接口
 *
 */
public interface UsersRepositoryPagingAndSorting extends PagingAndSortingRepository<Users,Integer> {

}
