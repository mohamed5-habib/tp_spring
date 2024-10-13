package tn.esprit.tp_foye;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
public class bloc {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idBloc;
    private String nomBloc;
    private Long capaciteBloc;
    @ManyToOne
    @JoinColumn(name = "idFoyer")
    private Foyer Foyer;
    @OneToMany (mappedBy = "bloc",cascade = CascadeType.ALL)
    private List <Chambre> Chambres = new ArrayList<>();



}
