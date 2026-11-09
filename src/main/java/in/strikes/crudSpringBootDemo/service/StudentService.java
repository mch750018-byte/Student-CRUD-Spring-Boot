package in.strikes.crudSpringBootDemo.service;

import in.strikes.crudSpringBootDemo.entity.Student;
import in.strikes.crudSpringBootDemo.repository.StudentRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

    private StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository){
        this.studentRepository=studentRepository;
    }

    public Student createStudent(Student studentReq){
        // business logic
        //store to db
        System.out.println("inside student service");
        Student studentResp = studentRepository.saveStudent(studentReq);
        System.out.println("Existing student service");
        return studentResp;
    }






    // work we will do in this class
    // 1.End point Listen(app/student POST)
    // 2.business logic
    // 3.Interact with database to store
    // 4.Response back to client(postman)
}
