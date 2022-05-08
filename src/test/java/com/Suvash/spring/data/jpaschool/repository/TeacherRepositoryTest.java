package com.Suvash.spring.data.jpaschool.repository;

import com.Suvash.spring.data.jpaschool.entity.Course;
import com.Suvash.spring.data.jpaschool.entity.Teacher;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class TeacherRepositoryTest {

    @Autowired
    private TeacherRepository teacherRepository;

    Course courseCS =
            Course.builder()
                    .title("CS")
                    .credit(3)
                    .build();

    Course courseBA =
            Course.builder()
                    .title("BA")
                    .credit(3)
                    .build();
    @Test
    public void saveTeacher(){
        Teacher teacher =
                Teacher.builder()
                        .firstName("Jonathan")
                        .lastName("Gelin")
                       // .courses(List.of(courseCS, courseBA))
                                .build();

        teacherRepository.save(teacher);
    }
}