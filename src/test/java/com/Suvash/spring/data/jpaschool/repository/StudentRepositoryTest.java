package com.Suvash.spring.data.jpaschool.repository;

import com.Suvash.spring.data.jpaschool.entity.Guardian;
import com.Suvash.spring.data.jpaschool.entity.Student;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;


@SpringBootTest
class StudentRepositoryTest {

    @Autowired
    private StudentRepository studentRepository;
/*
    @Test
    public void saveStudent() {
        Student student = Student.builder()
                .emailId("whowhatme1@gmail.com")
                .firstName("Suvash")
                .lastName("Shrestha")
                //.guardianName("Sukriya")
                //.guardianEmail("sukriyasth111@gmail.com ")
                //.guardianMobile("99999999999")
                .build();

        studentRepository.save(student);
    }

    @Test
    public void saveStudentWithGuardian() {

        Guardian guardian = Guardian.builder()
                .email("sukriyasth111@gmail.com ")
                .name("Sukriya")
                .mobile("99999999999")
                .build();

        Student student = Student.builder()
                .firstName("Jaden")
                .lastName("Shrestha")
                .emailId("vassh@hotmail.com ")
                .guardian(guardian)
                .build();

        studentRepository.save(student);

    }*/

    @Test
    public void printAllStudent() {
        List<Student> studentList =
                studentRepository.findAll();

        System.out.println("studentList = " + studentList);
    }

    @Test
    public void printStudentByFirstNAme(){

        List<Student> students =
                studentRepository.findByFirstName("Jaden");

        System.out.println("students= " + students);

    }

    @Test
    public void printStudentByFirstNAmeContaining(){

        List<Student> students =
                studentRepository.findByFirstNameContaining("Ja");

        System.out.println("students= " + students);

    }

    @Test
    public void printStudentBasedOnGuardianName(){
        List<Student> students =
                studentRepository.findByGuardianName("Sukriya");
        System.out.println("students = " + students);
    }

    @Test
    public void printgetStudentByEmailAddress() {
        Student student =
                studentRepository.getStudentByEmailAddress(
                        "vassh007@hotmail.com"
                );

        System.out.println("student = " + student);
    }

    @Test
    public void printGetStudentFirstNameByEmailAddress() {
        String firstName =
                studentRepository.getStudentFirstNameByEmailAddress(
                        "vassh@hotmail.com"
                );
        System.out.println("firstName = " + firstName);
    }

    @Test
    public void printGetStudentByEmailAddressNative() {
        Student student =
                studentRepository.getStudentByEmailAddressNative(
                        "whowhatme1@gmail.com"
                );
        System.out.println("student =  " + student);
    }

    @Test
    public void printGetStudentByEmailAddressNativeNamedParam() {
        Student student =
                studentRepository.getStudentByEmailAddressNativeNamedParam(
                        "whowhatme1@gmail.com"
                );
        System.out.println("student =  " + student);
    }

    @Test
    public void updateStudentNameByEmailIdTest() {
        studentRepository.updateStudentNameByEmailId(
                "Vash",
                "whowhatme1@gmail.com"
        );
    }
}