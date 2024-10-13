package tn.esprit.tp_foye;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
public class Foyer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idFoyer;
    private String nomFoyer;
    private  Long capaciteFoyer;
    @ManyToOne
    @JoinColumn(name = "idUniversite")
    private Universite Universite ;

    @OneToMany (mappedBy = "Foyer",cascade = CascadeType.ALL)
    private List <bloc> blocs = new ArrayList<>();

}
