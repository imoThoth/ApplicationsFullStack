package com.cupcakes.athena.Model;


import javax.persistence.*;

@Entity
@Table
public class User {

    @Id
    @SequenceGenerator(
            name = "dataModel_sequence",
            sequenceName  = "dataModel_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "dataModel_sequence"
    )
    private int id;
    private String name;
}
