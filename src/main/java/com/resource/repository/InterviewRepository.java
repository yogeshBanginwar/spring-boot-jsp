package com.resource.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.resource.model.Interview;

@Repository
public interface InterviewRepository extends JpaRepository<Interview, Integer> {

}
