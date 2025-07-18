package com.zidio.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.zidio.entity.Payment;

@Repository
public interface PaymentRepository extends JpaRepository<Payment,Long>  {
	
	

}
