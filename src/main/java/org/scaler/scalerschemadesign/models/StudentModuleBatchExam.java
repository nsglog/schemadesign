package org.scaler.scalerschemadesign.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Getter
@Setter
@Entity
public class StudentModuleBatchExam extends BaseModel {
    @ManyToOne
    private ModuleBatchExam moduleBatchExam;
    @ManyToOne
    private Student student;
    private int marks;
    private boolean attended;
    private String result;
}
