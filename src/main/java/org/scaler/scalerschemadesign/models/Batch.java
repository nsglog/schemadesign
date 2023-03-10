package org.scaler.scalerschemadesign.models;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import java.util.List;

@Getter
@Setter
@Entity
public class Batch extends BaseModel {
    private String name;
    @ManyToOne
    private Student batchRepresentative;
    @ManyToMany
    private List<Student> students;

}
