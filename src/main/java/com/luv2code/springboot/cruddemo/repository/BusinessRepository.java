package com.luv2code.springboot.cruddemo.repository;

import com.luv2code.springboot.cruddemo.entity.Business;
import com.luv2code.springboot.cruddemo.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Optional;

public interface BusinessRepository extends JpaRepository<Business, Integer> {

    boolean existsByEmail(String email);


    boolean existsByName(String name);

}











