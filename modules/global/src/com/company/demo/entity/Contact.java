package com.company.demo.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import com.haulmont.cuba.core.entity.StandardEntity;
import com.haulmont.chile.core.annotations.NamePattern;

@NamePattern("%s %s %s %s|id,nom,tel,photo")
@Table(name = "DEMO_CONTACT")
@Entity(name = "demo$Contact")
public class Contact extends StandardEntity {
    private static final long serialVersionUID = -1511866877510878404L;

    @Column(name = "NOM", nullable = false, length = 40)
    protected String nom;

    @Column(name = "PRENOM", nullable = false, length = 30)
    protected String prenom;

    @Temporal(TemporalType.DATE)
    @Column(name = "DATE_NAISSANCE")
    protected Date dateNaissance;

    @Column(name = "EMAIL", length = 60)
    protected String email;

    @Column(name = "TEL")
    protected Long tel;

    @Column(name = "PHOTO")
    protected String photo;

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getNom() {
        return nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setDateNaissance(Date dateNaissance) {
        this.dateNaissance = dateNaissance;
    }

    public Date getDateNaissance() {
        return dateNaissance;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setTel(Long tel) {
        this.tel = tel;
    }

    public Long getTel() {
        return tel;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public String getPhoto() {
        return photo;
    }


}