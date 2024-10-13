package tn.esprit.tp_foye;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Entity
@Getter
@Setter
public class Reservation {
    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private String idReservation;
    private Date anneeUniversitaire;
    private Boolean estValide;
    @ManyToOne
    @JoinColumn(name = "idEtudiant")
    private Etudiant Etudiant;

    @ManyToOne
    @JoinColumn (name = "Idchamber")
    private  Chambre Chambre;
}
