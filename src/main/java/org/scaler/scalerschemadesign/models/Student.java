package org.scaler.scalerschemadesign.models;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import java.util.List;
@Getter
@Setter
@Entity
public class Student extends BaseModel {
    private String name;
    private String email;
    private String password;
    @ManyToMany
    private List<Batch> batches;
    @OneToMany(mappedBy = "batchRepresentative")
    private List<Batch> classRepresentativeOf;
}
