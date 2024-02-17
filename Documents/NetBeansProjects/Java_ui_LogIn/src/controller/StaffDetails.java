/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author User
 */
@Entity
@Table(name = "staff_details")
@NamedQueries({
    @NamedQuery(name = "StaffDetails.findAll", query = "SELECT s FROM StaffDetails s"),
    @NamedQuery(name = "StaffDetails.findByEId", query = "SELECT s FROM StaffDetails s WHERE s.eId = :eId"),
    @NamedQuery(name = "StaffDetails.findByPassword", query = "SELECT s FROM StaffDetails s WHERE s.password = :password"),
    @NamedQuery(name = "StaffDetails.findBySecurityQuestion", query = "SELECT s FROM StaffDetails s WHERE s.securityQuestion = :securityQuestion"),
    @NamedQuery(name = "StaffDetails.findBySecurityAnswer", query = "SELECT s FROM StaffDetails s WHERE s.securityAnswer = :securityAnswer"),
    @NamedQuery(name = "StaffDetails.findByPhone", query = "SELECT s FROM StaffDetails s WHERE s.phone = :phone"),
    @NamedQuery(name = "StaffDetails.findByAddress", query = "SELECT s FROM StaffDetails s WHERE s.address = :address"),
    @NamedQuery(name = "StaffDetails.findByEmail", query = "SELECT s FROM StaffDetails s WHERE s.email = :email"),
    @NamedQuery(name = "StaffDetails.findByDob", query = "SELECT s FROM StaffDetails s WHERE s.dob = :dob")})
public class StaffDetails implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "E_ID")
    private String eId;
    @Column(name = "password")
    private String password;
    @Column(name = "security_question")
    private String securityQuestion;
    @Column(name = "security_answer")
    private String securityAnswer;
    @Column(name = "phone")
    private Integer phone;
    @Column(name = "address")
    private String address;
    @Column(name = "email")
    private String email;
    @Column(name = "dob")
    @Temporal(TemporalType.DATE)
    private Date dob;

    public StaffDetails() {
    }

    public StaffDetails(String eId) {
        this.eId = eId;
    }

    public String getEId() {
        return eId;
    }

    public void setEId(String eId) {
        this.eId = eId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getSecurityQuestion() {
        return securityQuestion;
    }

    public void setSecurityQuestion(String securityQuestion) {
        this.securityQuestion = securityQuestion;
    }

    public String getSecurityAnswer() {
        return securityAnswer;
    }

    public void setSecurityAnswer(String securityAnswer) {
        this.securityAnswer = securityAnswer;
    }

    public Integer getPhone() {
        return phone;
    }

    public void setPhone(Integer phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (eId != null ? eId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof StaffDetails)) {
            return false;
        }
        StaffDetails other = (StaffDetails) object;
        if ((this.eId == null && other.eId != null) || (this.eId != null && !this.eId.equals(other.eId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "controller.StaffDetails[ eId=" + eId + " ]";
    }
    
}
