package com.iucosoft.javaeefinalproject.entities;
// Generated Dec 2, 2024 7:11:21 PM by Hibernate Tools 4.3.1

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Cart generated by hbm2java
 */
@Entity
@Table(name = "cart",
         catalog = "level4db"
)
public class Cart implements java.io.Serializable {

    private int id;
    private String denumireConsultatie;
    private int pret;
    private String usernamePacient;

    public Cart() {
    }

    public Cart(int id, String denumireConsultatie, int pret, String usernamePacient) {
        this.id = id;
        this.denumireConsultatie = denumireConsultatie;
        this.pret = pret;
        this.usernamePacient = usernamePacient;
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
    
    @Column(name = "denumireConsultatie", length = 45)
    public String getDomeniu() {
        return denumireConsultatie;
    }

    public void setDomeniu(String denumireConsultatie) {
        this.denumireConsultatie = denumireConsultatie;
    }

    @Column(name = "pret")
    public int getPret() {
        return pret;
    }

    public void setPret(int pret) {
        this.pret = pret;
    }

    @Column(name = "usernamePacient", length = 45)
    public String getUsernamePacient() {
        return usernamePacient;
    }

    public void setUsernamePacient(String usernamePacient) {
        this.usernamePacient = usernamePacient;
    }

    @Override
    public String toString() {
        return "Cart{" + "id=" + id + ", denumireConsultatie=" + denumireConsultatie + ", pret=" + pret + ", usernamePacient=" + usernamePacient + '}';
    }
    
    

}
