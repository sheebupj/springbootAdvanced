package com.paremal.sheebu.springboot.repository.oracle;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.paremal.sheebu.springboot.entity.oracle.User2;

@Repository
public interface UserRepository2 extends JpaRepository<User2,Integer> {

}
