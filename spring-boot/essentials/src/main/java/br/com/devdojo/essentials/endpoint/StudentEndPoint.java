package br.com.devdojo.essentials.endpoint;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.devdojo.essentials.error.CustomTypeError;
import br.com.devdojo.essentials.model.Student;
import br.com.devdojo.essentials.utils.DateUtil;
import org.springframework.web.bind.annotation.RequestParam;



@RestController
@RequestMapping("student")
public class StudentEndPoint {
    private final DateUtil dateUtil;

    @Autowired
    public StudentEndPoint(final DateUtil dateUtil) {
        this.dateUtil = dateUtil;
    }

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<List<Student>> listAll() {
        System.out.println("/student/list acesso: " + dateUtil.formatLocalDateToDatabaseStyle(LocalDateTime.now()));
        return new ResponseEntity<>(Student.studentList, HttpStatus.OK);
    }

    @RequestMapping(method=RequestMethod.GET, path= "/{id}")  
    public ResponseEntity<?> getStudentById(@PathVariable("id") final int id) {
        final Student student = new Student();
        student.setId(id);
        final int index =  Student.studentList.indexOf(student);
        if(index == -1)
        {
            return new ResponseEntity<>(new CustomTypeError("Student not found"), HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(Student.studentList.get(index),HttpStatus.OK );    
    }
    @RequestMapping(method=RequestMethod.POST)
        public ResponseEntity<?> save(@RequestBody Student student){
            Student.studentList.add(student);
            return new ResponseEntity<>(student,HttpStatus.OK);
        }

    @RequestMapping(method=RequestMethod.DELETE)
    public ResponseEntity<?> delete(@RequestBody Student student) {
        Student.studentList.remove(student);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @RequestMapping(method=RequestMethod.PUT)
    public ResponseEntity<?> update(@RequestBody Student student){
        Student.studentList.remove(student);
        Student.studentList.add(student);

        return new ResponseEntity<>(HttpStatus.OK);
    }
    
    
}