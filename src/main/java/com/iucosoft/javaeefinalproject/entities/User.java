package com.iucosoft.javaeefinalproject.entities;
// Generated Dec 2, 2024 7:11:21 PM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

/**
 * User generated by hbm2java
 */
@Entity
@Table(name="user"
    ,catalog="level4db"
    , uniqueConstraints = @UniqueConstraint(columnNames="username") 
)
public class User  implements java.io.Serializable {


     private int id;
     private String username;
     private String password;
     private String statut;
     

    public User() {
    }

    public User(int id, String username, String password, String statut) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.statut = statut;
    }

     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="id", unique=true, nullable=false)
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }

    
    @Column(name="username", unique=true, length=45)
    public String getUsername() {
        return this.username;
    }
    
    public void setUsername(String username) {
        this.username = username;
    }

    
    @Column(name="password", length=45)
    public String getPassword() {
        return this.password;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }

    
    @Column(name="statut", length=45)
    public String getStatut() {
        return this.statut;
    }
    
    public void setStatut(String statut) {
        this.statut = statut;
    }

    @Override
    public String toString() {
        return "User{" + "id=" + id + ", username=" + username + ", password=" + password + ", statut=" + statut + '}';
    }

}


