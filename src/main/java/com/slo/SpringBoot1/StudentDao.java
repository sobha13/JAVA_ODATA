package com.slo.SpringBoot1;

import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentDao extends JpaRepository<StudentPojo, Integer>{

}
