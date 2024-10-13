package tn.esprit.tp_foye;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Getter
@Setter
public class Etudiant {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idEtudiant;
    private String nomEt;
    private String prenomET;
    private Long cin;
    private String ecole;
    private Date DateNaissance;
    @OneToMany(mappedBy = "Etudiant",cascade = CascadeType.ALL)
    private List <Reservation> Reservations = new ArrayList<>();
}
