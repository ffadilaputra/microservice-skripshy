package id.polinema.lsp.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Setter
@Getter
@Entity
public class UnitKopetensi {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    @Column
    private String kode_unit;

    @Column
    private String judul_unit;

    @Column
    private String no_skema;

}
