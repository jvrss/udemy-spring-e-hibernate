package com.study.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name="instructor_detail")
@Data
public class InstructorDetail {

    // Annotate the class as an entity and map to db table

    // Define the fields

    // Annotate the fields with db column names

    // Create constructors

    // Generate getter/setter methods

    // Generate toString() method

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="id")
    private int id;

    @Column(name = "youtube_channel")
    private String youtubeChannel;

    @Column(name = "hobby")
    private String hobby;

    // Add new field for instructor (also add getter/setters)

    // Add @OneToOne annotation

    @OneToOne(mappedBy = "instructorDetail", cascade = CascadeType.ALL)
    private Instructor instructor;

    public InstructorDetail() {
    }

    public InstructorDetail(String youtubeChannel, String hobby) {
        this.youtubeChannel = youtubeChannel;
        this.hobby = hobby;
    }


}
