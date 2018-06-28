package com.regexample.auth.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.regexample.auth.model.Role;

public interface RoleRepository extends JpaRepository<Role, Long>{
}
