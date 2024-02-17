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
@Table(name = "sys_config")
@NamedQueries({
    @NamedQuery(name = "SysConfig.findAll", query = "SELECT s FROM SysConfig s"),
    @NamedQuery(name = "SysConfig.findByVariable", query = "SELECT s FROM SysConfig s WHERE s.variable = :variable"),
    @NamedQuery(name = "SysConfig.findByValue", query = "SELECT s FROM SysConfig s WHERE s.value = :value"),
    @NamedQuery(name = "SysConfig.findBySetTime", query = "SELECT s FROM SysConfig s WHERE s.setTime = :setTime"),
    @NamedQuery(name = "SysConfig.findBySetBy", query = "SELECT s FROM SysConfig s WHERE s.setBy = :setBy")})
public class SysConfig implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "variable")
    private String variable;
    @Column(name = "value")
    private String value;
    @Column(name = "set_time")
    @Temporal(TemporalType.TIMESTAMP)
    private Date setTime;
    @Column(name = "set_by")
    private String setBy;

    public SysConfig() {
    }

    public SysConfig(String variable) {
        this.variable = variable;
    }

    public String getVariable() {
        return variable;
    }

    public void setVariable(String variable) {
        this.variable = variable;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public Date getSetTime() {
        return setTime;
    }

    public void setSetTime(Date setTime) {
        this.setTime = setTime;
    }

    public String getSetBy() {
        return setBy;
    }

    public void setSetBy(String setBy) {
        this.setBy = setBy;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (variable != null ? variable.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SysConfig)) {
            return false;
        }
        SysConfig other = (SysConfig) object;
        if ((this.variable == null && other.variable != null) || (this.variable != null && !this.variable.equals(other.variable))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "controller.SysConfig[ variable=" + variable + " ]";
    }
    
}
