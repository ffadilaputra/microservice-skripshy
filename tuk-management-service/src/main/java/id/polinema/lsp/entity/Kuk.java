package id.polinema.lsp.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Setter
@Getter
@Entity
public class Kuk {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    @Column
    private String judul_kuk;

    @Column
    private String pertanyaan;

    @Column
    private Long id_elemen;

}
