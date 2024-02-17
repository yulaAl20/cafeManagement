/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author User
 */
@Entity
@Table(name = "bill")
@NamedQueries({
    @NamedQuery(name = "Bill.findAll", query = "SELECT b FROM Bill b"),
    @NamedQuery(name = "Bill.findByBno", query = "SELECT b FROM Bill b WHERE b.bno = :bno"),
    @NamedQuery(name = "Bill.findBySeller", query = "SELECT b FROM Bill b WHERE b.seller = :seller"),
    @NamedQuery(name = "Bill.findByBDate", query = "SELECT b FROM Bill b WHERE b.bDate = :bDate"),
    @NamedQuery(name = "Bill.findByAmount", query = "SELECT b FROM Bill b WHERE b.amount = :amount")})
public class Bill implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "B_no")
    private Integer bno;
    @Column(name = "Seller")
    private String seller;
    @Column(name = "BDate")
    private String bDate;
    @Column(name = "Amount")
    private Integer amount;

    public Bill() {
    }

    public Bill(Integer bno) {
        this.bno = bno;
    }

    public Integer getBno() {
        return bno;
    }

    public void setBno(Integer bno) {
        this.bno = bno;
    }

    public String getSeller() {
        return seller;
    }

    public void setSeller(String seller) {
        this.seller = seller;
    }

    public String getBDate() {
        return bDate;
    }

    public void setBDate(String bDate) {
        this.bDate = bDate;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (bno != null ? bno.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Bill)) {
            return false;
        }
        Bill other = (Bill) object;
        if ((this.bno == null && other.bno != null) || (this.bno != null && !this.bno.equals(other.bno))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "controller.Bill[ bno=" + bno + " ]";
    }
    
}
