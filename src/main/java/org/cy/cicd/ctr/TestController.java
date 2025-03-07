package org.cy.cicd.ctr;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;


@RestController
@RequestMapping("/CiCD")
@Slf4j
@CrossOrigin("*")
public class TestController {
    private final ConcurrentHashMap<Integer, Student> map = new ConcurrentHashMap<>();

    @PostConstruct
    public void initMap() {
        for (int i = 0; i < 10000; i++) {
            Student student = new Student();
            student.setId(i)
                    .setAge(i + 1)
                    .setSchool("清华大学")
                    .setName("小陈" + (i + 1) + "号");
            map.put(i, student);
        }
    }

    @GetMapping("/list")
    public List<Student> list() {
        return map.values().stream().toList();
    }
}
