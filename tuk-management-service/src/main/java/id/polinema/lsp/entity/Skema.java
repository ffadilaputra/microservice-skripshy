package id.polinema.lsp.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Setter
@Getter
@Entity
public class Skema {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    @Column(name = "kode_unit")
    private String kode_unit;

    @Column(name = "judul_unit")
    private String judul_unit;

}
