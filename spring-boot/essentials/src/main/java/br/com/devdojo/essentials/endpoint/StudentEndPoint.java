package br.com.devdojo.essentials.endpoint;

import java.util.List;
import static java.util.Arrays.asList;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.devdojo.essentials.model.Student;
import br.com.devdojo.essentials.utils.DateUtil;

@RestController
@RequestMapping("student")
public class StudentEndPoint {

    @Autowired
    private DateUtil dateUtil;

    @RequestMapping(method = RequestMethod.GET, path = "/list")
    public List<Student> listAll() {
        System.out.println("/student/list acesso: " + dateUtil.formatLocalDateToDatabaseStyle(LocalDateTime.now()));
        return asList(new Student("Lucas"), new Student("Ana"));
    }

}