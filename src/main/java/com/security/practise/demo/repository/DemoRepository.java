package com.security.practise.demo.repository;

import com.security.practise.demo.model.Users;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DemoRepository extends CrudRepository<Users, String> {
    Users getUserByUsername(String snehal);
}
