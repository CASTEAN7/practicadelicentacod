package com.iucosoft.javaeefinalproject.entities;
// Generated Dec 2, 2024 7:11:21 PM by Hibernate Tools 4.3.1

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.UniqueConstraint;
import org.springframework.format.annotation.DateTimeFormat;

/**
 * Pacient generated by hbm2java
 */
@Entity
@Table(name = "pacient",
         catalog = "level4db",
         uniqueConstraints = {
            @UniqueConstraint(columnNames = "telefon")
            , @UniqueConstraint(columnNames = "email")}
)
public class Pacient implements java.io.Serializable {

    private int id;
    private String nume;
    private String prenume;
    
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date dataNasterii;
    
    private int telefon;
    private String email;
    private int idUser;

    public Pacient() {
    }

    public Pacient(int id, String nume, String prenume, Date dataNasterii, int telefon, String email, int idUser) {
        this.id = id;
        this.nume = nume;
        this.prenume = prenume;
        this.dataNasterii = dataNasterii;
        this.telefon = telefon;
        this.email = email;
        this.idUser = idUser;
    }

    @Id
    @GeneratedValue(strategy = IDENTITY)

    @Column(name = "id", unique = true, nullable = false)
    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Column(name = "nume", length = 45)
    public String getNume() {
        return this.nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    @Column(name = "prenume", length = 45)
    public String getPrenume() {
        return this.prenume;
    }

    public void setPrenume(String prenume) {
        this.prenume = prenume;
    }

    
    @Temporal(TemporalType.DATE)
    @Column(name = "data_nasterii", length = 8)
    public Date getDataNasterii() {
        return this.dataNasterii;
    }

    public void setDataNasterii(Date dataNasterii) {
        this.dataNasterii = dataNasterii;
    }

    @Column(name = "telefon", unique = true)
    public Integer getTelefon() {
        return this.telefon;
    }

    public void setTelefon(Integer telefon) {
        this.telefon = telefon;
    }

    @Column(name = "email", unique = true, length = 45)
    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Column(name = "idUser")
    public int getIdUser() {
        return idUser;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }

    @Override
    public String toString() {
        return "Pacient{" + "id=" + id + ", nume=" + nume + ", prenume=" + prenume + ", data_nasterii=" + dataNasterii + ", telefon=" + telefon + ", email=" + email + ", idUser=" + idUser + '}';
    }

    
    
}
