package com.demo.adminController.adminRepository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.adminModel.adminModel;

@Repository
public interface AdminRepository extends JpaRepository<adminModel,Long>
{
	adminModel findByEmailAndPassword(String email, String password);
}
