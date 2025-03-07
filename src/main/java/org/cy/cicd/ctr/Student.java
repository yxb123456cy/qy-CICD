package org.cy.cicd.ctr;

import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class Student {
    private Integer id;
    private Integer age;
    private String name;
    private String school;
}
