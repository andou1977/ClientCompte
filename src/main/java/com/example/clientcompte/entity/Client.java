package com.example.clientcompte.entity;


import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
@Table(name ="Client")
public class Client {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name = "id_client")
    private int id;
    private String nom;
    private int age;
    @Temporal(TemporalType.DATE)
    private Date date;

    @JsonIgnore
      @OneToMany(mappedBy = "client",fetch = FetchType.LAZY)
    private List<Compte> comptes;

}
