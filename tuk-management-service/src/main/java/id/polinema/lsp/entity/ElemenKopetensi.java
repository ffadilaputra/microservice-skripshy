package id.polinema.lsp.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Setter
@Getter
@Entity
public class ElemenKopetensi {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    @Column(name = "judul_elemen")
    private String judul_elemen;

    @Column(name = "kode_unit")
    private String kode_unit;

}
