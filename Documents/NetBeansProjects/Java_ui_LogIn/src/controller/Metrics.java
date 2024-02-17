/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Lob;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author User
 */
@Entity
@Table(name = "metrics")
@NamedQueries({
    @NamedQuery(name = "Metrics.findAll", query = "SELECT m FROM Metrics m"),
    @NamedQuery(name = "Metrics.findByVariablename", query = "SELECT m FROM Metrics m WHERE m.variablename = :variablename"),
    @NamedQuery(name = "Metrics.findByType", query = "SELECT m FROM Metrics m WHERE m.type = :type"),
    @NamedQuery(name = "Metrics.findByEnabled", query = "SELECT m FROM Metrics m WHERE m.enabled = :enabled")})
public class Metrics implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @Column(name = "Variable_name")
    private String variablename;
    @Lob
    @Column(name = "Variable_value")
    private String variablevalue;
    @Basic(optional = false)
    @Column(name = "Type")
    private String type;
    @Basic(optional = false)
    @Column(name = "Enabled")
    private String enabled;

    public Metrics() {
    }

    public String getVariablename() {
        return variablename;
    }

    public void setVariablename(String variablename) {
        this.variablename = variablename;
    }

    public String getVariablevalue() {
        return variablevalue;
    }

    public void setVariablevalue(String variablevalue) {
        this.variablevalue = variablevalue;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getEnabled() {
        return enabled;
    }

    public void setEnabled(String enabled) {
        this.enabled = enabled;
    }
    
}
