package in.strikes.crudSpringBootDemo.repository;

import in.strikes.crudSpringBootDemo.entity.Student;
import org.springframework.stereotype.Component;

@Component
public class StudentRepository {

    public Student saveStudent(Student studentReq){
        System.out.println("inside student repository");
        System.out.println("Exiting student repository");
        //store to DB;
       Student s1  = new Student();
       s1.setName("mohit");
       s1.setAge(21);
       s1.setEmail("mohit@gmail.com");
       s1.setRollNo(101);
       s1.setSubject("Spring Framework");
       return s1;
    }
}
