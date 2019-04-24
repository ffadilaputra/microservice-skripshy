package id.polinema.acessor.managementacessor.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Setter
@Getter
@Entity
public class Acessor {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    @Column
    private String nama_asesi;

    @Column
    private Long nik;

    @Column
    private String tempat_lahir;

    @Column
    private Date tgl_lahir;

    @Column
    private String jenis_kelamin;

    @Column
    private String tempat_tinggal;

    @Column
    private Long kode_kab_kota;

    @Column
    private Long kode_provinsi;

    @Column
    private Long telepon;

    @Column
    private String email;

    @Column
    private Long kode_pendidikan;

    @Column
    private Long kode_pekerjaan;

    @Column
    private Long kode_skema;

    @Column
    private Date tgl_uji;

    @Column
    private Long kode_tuk;

    @Column
    private String no_registrasi_asesor;

    @Column
    private Long kode_kementrian;

    @Column
    private String kbk;


}
