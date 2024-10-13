package tn.esprit.tp_foye;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
public class Universite {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idUniversite;
    private String nomUniversite;
    private String adress;
    @OneToMany(mappedBy = "Universite", cascade = CascadeType.ALL)
    private List<Foyer> Foyers = new ArrayList<>();
}
