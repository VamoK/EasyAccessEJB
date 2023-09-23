/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.tut.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 *
 * @author Vamokuhle Khumalo
 */
@Entity
public class Lecturer implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Column(length = 7)
    private Long id;
    
    @Column(nullable = false)
    private String initials;
    
    @Column(nullable = false)
    private String surname;
    
    @Column(nullable = false)
    private String email;
    
    @Column(nullable = false)
    private String office;
    
    @Column(nullable = false)
    private String password;
    
    
    @OneToMany(fetch = FetchType.LAZY , cascade = CascadeType.MERGE)
    private List<LecturerModules> modules = new ArrayList<>();

    public Lecturer() {
    }

    public Lecturer(Long id, String initials, String surname, String email, String office, String password) {
        this.id = id;
        this.initials = initials;
        this.surname = surname;
        this.email = email;
        this.office = office;
        this.password = password;
    }
    
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getInitials() {
        return initials;
    }

    public void setInitials(String initials) {
        this.initials = initials;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getOffice() {
        return office;
    }

    public void setOffice(String office) {
        this.office = office;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<LecturerModules> getModules() {
        return modules;
    }

    public void setModules(List<LecturerModules> modules) {
        this.modules = modules;
    }

    
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Lecturer)) {
            return false;
        }
        Lecturer other = (Lecturer) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "za.ac.tut.entities.Lecturer[ id=" + id + " ]";
    }
    
}
