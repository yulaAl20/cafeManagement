/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author User
 */
@Entity
@Table(name = "customerdetails")
@NamedQueries({
    @NamedQuery(name = "Customerdetails.findAll", query = "SELECT c FROM Customerdetails c"),
    @NamedQuery(name = "Customerdetails.findById", query = "SELECT c FROM Customerdetails c WHERE c.id = :id"),
    @NamedQuery(name = "Customerdetails.findByFirstName", query = "SELECT c FROM Customerdetails c WHERE c.firstName = :firstName")})
public class Customerdetails implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ID")
    private Integer id;
    @Column(name = "first_name")
    private String firstName;

    public Customerdetails() {
    }

    public Customerdetails(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
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
        if (!(object instanceof Customerdetails)) {
            return false;
        }
        Customerdetails other = (Customerdetails) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "controller.Customerdetails[ id=" + id + " ]";
    }
    
}
