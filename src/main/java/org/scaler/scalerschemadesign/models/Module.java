package org.scaler.scalerschemadesign.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;

@Getter
@Setter
@Entity
public class Module extends BaseModel {
    private String name;
}
