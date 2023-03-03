package com.himanshu.hospitalapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.himanshu.hospitalapp.dto.Hospital;

public interface HospitalRepository extends JpaRepository<Hospital, Integer> {

}
