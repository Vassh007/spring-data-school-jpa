package com.Suvash.spring.data.jpaschool.repository;

import com.Suvash.spring.data.jpaschool.entity.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TeacherRepository extends JpaRepository<Teacher, Long> {
}
