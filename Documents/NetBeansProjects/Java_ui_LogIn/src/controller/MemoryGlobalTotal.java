/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.io.Serializable;
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
@Table(name = "memory_global_total")
@NamedQueries({
    @NamedQuery(name = "MemoryGlobalTotal.findAll", query = "SELECT m FROM MemoryGlobalTotal m"),
    @NamedQuery(name = "MemoryGlobalTotal.findByTotalAllocated", query = "SELECT m FROM MemoryGlobalTotal m WHERE m.totalAllocated = :totalAllocated")})
public class MemoryGlobalTotal implements Serializable {

    private static final long serialVersionUID = 1L;
    @Column(name = "total_allocated")
    private String totalAllocated;

    public MemoryGlobalTotal() {
    }

    public String getTotalAllocated() {
        return totalAllocated;
    }

    public void setTotalAllocated(String totalAllocated) {
        this.totalAllocated = totalAllocated;
    }
    
}
