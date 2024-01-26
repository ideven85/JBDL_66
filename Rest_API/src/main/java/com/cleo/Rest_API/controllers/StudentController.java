package com.cleo.Rest_API.controllers;

import com.cleo.Rest_API.bean.Student;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/students")
public class StudentController {

    private final List<Student> students = new ArrayList<>();

    public StudentController () {
        students.add(new Student(1,"Anchit",12));
        students.add(new Student(2,"Aanchal",13));
        students.add(new Student(3,"Deven",14));
        students.add(new Student(4,"Rachael",15));
        students.add(new Student(5,"Deven Kalra",16));
        students.add(new Student(6,"Idiot",17));
        students.add(new Student(7,"Stupid",18));

    }

    @GetMapping("/{id}")

    public ResponseEntity<?> getStudents(@PathVariable("id")  int studentId){
        Optional<Student> student = students.stream()
                .filter(x->x.getId()==studentId )
                .findFirst();
        if(student.isPresent())
            return ResponseEntity.ok(student.get());
        else{
            return new ResponseEntity<String>("Student with id not found",HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping("")
    public ResponseEntity<?>  getStudent(@RequestParam int id, @RequestParam(required = false) String name){
        Optional<Student> student = students.stream()
                .filter(x->x.getId()==id)


                .findFirst();

        if(student.isPresent()) {

            if (name==null||(student.get().getName().equals(name)))
                return ResponseEntity.ok().header("Idiot","Stupid").body(student.get());


            else
                return new ResponseEntity<String>("Student with given name does not exist",HttpStatus.NOT_FOUND);
        }else{
            return new ResponseEntity<String>("Student with id: " + id + " not found",HttpStatus.NOT_FOUND);

        }

        }

    @GetMapping("/all")
    public ResponseEntity<List<Student>> getAll(){
        return ResponseEntity.ok(students);
    }

    //Just Time pass
    @PostMapping("/create")
    @ResponseStatus(HttpStatus.CREATED)
    public Student createStudent(@RequestBody  Student student){

        System.out.println(student);
        return student;


    }

}
