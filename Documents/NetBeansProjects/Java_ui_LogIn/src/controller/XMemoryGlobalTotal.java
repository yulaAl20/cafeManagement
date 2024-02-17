/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.io.Serializable;
import java.math.BigInteger;
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
@Table(name = "x$memory_global_total")
@NamedQueries({
    @NamedQuery(name = "XMemoryGlobalTotal.findAll", query = "SELECT x FROM XMemoryGlobalTotal x"),
    @NamedQuery(name = "XMemoryGlobalTotal.findByTotalAllocated", query = "SELECT x FROM XMemoryGlobalTotal x WHERE x.totalAllocated = :totalAllocated")})
public class XMemoryGlobalTotal implements Serializable {

    private static final long serialVersionUID = 1L;
    @Column(name = "total_allocated")
    private BigInteger totalAllocated;

    public XMemoryGlobalTotal() {
    }

    public BigInteger getTotalAllocated() {
        return totalAllocated;
    }

    public void setTotalAllocated(BigInteger totalAllocated) {
        this.totalAllocated = totalAllocated;
    }
    
}
