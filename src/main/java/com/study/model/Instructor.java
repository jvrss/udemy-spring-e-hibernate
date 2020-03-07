package com.study.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name="instructor")
@Data
public class Instructor {

    // Annotate the class as an entity and map to db table

    // Define the fields

    // Annotate the fields with db column names

    // ** Set up mapping to InstructorDetail entity

    // Create constructors

    // Generate getter/setter methods

    // Generate toString() method

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="id")
    private int id;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "email")
    private String email;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "instructor_detail_id")
    private InstructorDetail instructorDetail;

    public Instructor() {
    }

    public Instructor(String firstName, String lastName, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }

}
