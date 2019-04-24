package id.polinema.acessor.managementacessor.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Setter
@Getter
@Entity
public class Pemohon {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    @Column
    private String nama_lengkap;

    @Column
    private String ttl;

    @Column
    private String jenis_kelamin;

    @Column
    private String kebangsaan;

    @Column
    private String alamat_rumah;

    @Column
    private Long no_telepon_rumah;

    @Column
    private Long no_telepon_kantor;

    @Column
    private Long no_hp;

    @Column
    private Long kodepos;

    @Column
    private String email;

    @Column
    private String nama_lembaga;

    @Column
    private String jabatan;

    @Column
    private String alamat;

    @Column
    private String telp_perusahaan;

    @Column
    private String fax_perusahaan;

    @Column
    private String fax_email;

}
