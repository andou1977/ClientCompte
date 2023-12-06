package com.example.clientcompte.entity;


import com.example.clientcompte.enumeration.CompteEnum;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name="compte")
public class Compte {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private int id;
    private double solde;
    @Temporal(TemporalType.DATE)
    private Date date;
    @Enumerated(EnumType.STRING)
    private CompteEnum typecompte;


   @ManyToOne()
   @JoinColumn(name="id_client")
    private Client client;



    public void effectuerDepot(double montant) {
        this.solde += montant;
    }
}
