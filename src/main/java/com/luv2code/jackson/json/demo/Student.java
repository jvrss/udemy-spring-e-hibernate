package com.luv2code.jackson.json.demo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class Student {

    private int id;
    private String firstName;
    private String lastName;
    private boolean active;

    private Address address;

    private String[] languages;

}
