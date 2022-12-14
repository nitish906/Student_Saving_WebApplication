package com.masai.repositery;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.masai.entity.Student;

@Repository
public interface StudentDao extends JpaRepository<Student, Integer> {

}
