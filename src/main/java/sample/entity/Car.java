package sample.entity;

import com.googlecode.objectify.annotation.Entity;
import com.googlecode.objectify.annotation.Id;

@Entity
public class Car {
    @Id
    Long id;
    String name;
}
