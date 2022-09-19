package com.mtc.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mtc.app.entity.Customer;

public interface ICustomerRepository extends JpaRepository<Customer, Integer>{

}
