package com.innovapptive.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import co.innovapptive.pojo.CustomerPojo;

@Repository
public interface CustomerDao extends JpaRepository<CustomerPojo, Integer>{


}
