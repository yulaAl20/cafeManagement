/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author User
 */
@Entity
@Table(name = "ps_check_lost_instrumentation")
@NamedQueries({
    @NamedQuery(name = "PsCheckLostInstrumentation.findAll", query = "SELECT p FROM PsCheckLostInstrumentation p"),
    @NamedQuery(name = "PsCheckLostInstrumentation.findByVariableName", query = "SELECT p FROM PsCheckLostInstrumentation p WHERE p.variableName = :variableName"),
    @NamedQuery(name = "PsCheckLostInstrumentation.findByVariableValue", query = "SELECT p FROM PsCheckLostInstrumentation p WHERE p.variableValue = :variableValue")})
public class PsCheckLostInstrumentation implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @Column(name = "variable_name")
    private String variableName;
    @Column(name = "variable_value")
    private String variableValue;

    public PsCheckLostInstrumentation() {
    }

    public String getVariableName() {
        return variableName;
    }

    public void setVariableName(String variableName) {
        this.variableName = variableName;
    }

    public String getVariableValue() {
        return variableValue;
    }

    public void setVariableValue(String variableValue) {
        this.variableValue = variableValue;
    }
    
}
