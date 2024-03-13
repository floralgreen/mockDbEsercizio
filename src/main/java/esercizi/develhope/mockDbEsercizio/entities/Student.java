package esercizi.develhope.mockDbEsercizio.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "students")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(nullable = false)
    private String lastName;
    @Column(nullable = false)
    private String firstName;

    @Column(unique = true, nullable = false)
    private String email;

}
