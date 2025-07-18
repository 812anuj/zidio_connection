package com.zidio.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.zidio.Enum.Role;
import com.zidio.entity.AdminUser;


@Repository
public interface AdminUserRepository extends JpaRepository<AdminUser,Long>{
	AdminUser findByEmail(String email);
	List<AdminUser> findByRole(Role role);

}

