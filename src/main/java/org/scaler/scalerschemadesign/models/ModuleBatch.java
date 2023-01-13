package org.scaler.scalerschemadesign.models;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import java.util.Date;
@Getter
@Setter
@Entity
public class ModuleBatch extends BaseModel {
    @ManyToOne
    private Module module;
    @ManyToOne
    private Batch batch;
    private Date startDate;
}
