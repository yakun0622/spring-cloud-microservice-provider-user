package com.aronsh.cloud.dao;

import com.aronsh.cloud.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author wangyakun
 * @date 2017/12/27.
 */
@Repository
public interface UserRepository extends JpaRepository<User, Long>{
}
