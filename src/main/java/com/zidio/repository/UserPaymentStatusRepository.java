/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.zidio.repository;


import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.zidio.entity.UserPaymentStatus;

@Repository
public interface UserPaymentStatusRepository extends JpaRepository<UserPaymentStatus, Long> {

	Optional<UserPaymentStatus> findByUserId(Long id);

}
