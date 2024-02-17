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
@Table(name = "memory_by_host_by_current_bytes")
@NamedQueries({
    @NamedQuery(name = "MemoryByHostByCurrentBytes.findAll", query = "SELECT m FROM MemoryByHostByCurrentBytes m"),
    @NamedQuery(name = "MemoryByHostByCurrentBytes.findByHost", query = "SELECT m FROM MemoryByHostByCurrentBytes m WHERE m.host = :host"),
    @NamedQuery(name = "MemoryByHostByCurrentBytes.findByCurrentCountUsed", query = "SELECT m FROM MemoryByHostByCurrentBytes m WHERE m.currentCountUsed = :currentCountUsed"),
    @NamedQuery(name = "MemoryByHostByCurrentBytes.findByCurrentAllocated", query = "SELECT m FROM MemoryByHostByCurrentBytes m WHERE m.currentAllocated = :currentAllocated"),
    @NamedQuery(name = "MemoryByHostByCurrentBytes.findByCurrentAvgAlloc", query = "SELECT m FROM MemoryByHostByCurrentBytes m WHERE m.currentAvgAlloc = :currentAvgAlloc"),
    @NamedQuery(name = "MemoryByHostByCurrentBytes.findByCurrentMaxAlloc", query = "SELECT m FROM MemoryByHostByCurrentBytes m WHERE m.currentMaxAlloc = :currentMaxAlloc"),
    @NamedQuery(name = "MemoryByHostByCurrentBytes.findByTotalAllocated", query = "SELECT m FROM MemoryByHostByCurrentBytes m WHERE m.totalAllocated = :totalAllocated")})
public class MemoryByHostByCurrentBytes implements Serializable {

    private static final long serialVersionUID = 1L;
    @Column(name = "host")
    private String host;
    @Column(name = "current_count_used")
    private BigInteger currentCountUsed;
    @Column(name = "current_allocated")
    private String currentAllocated;
    @Column(name = "current_avg_alloc")
    private String currentAvgAlloc;
    @Column(name = "current_max_alloc")
    private String currentMaxAlloc;
    @Column(name = "total_allocated")
    private String totalAllocated;

    public MemoryByHostByCurrentBytes() {
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public BigInteger getCurrentCountUsed() {
        return currentCountUsed;
    }

    public void setCurrentCountUsed(BigInteger currentCountUsed) {
        this.currentCountUsed = currentCountUsed;
    }

    public String getCurrentAllocated() {
        return currentAllocated;
    }

    public void setCurrentAllocated(String currentAllocated) {
        this.currentAllocated = currentAllocated;
    }

    public String getCurrentAvgAlloc() {
        return currentAvgAlloc;
    }

    public void setCurrentAvgAlloc(String currentAvgAlloc) {
        this.currentAvgAlloc = currentAvgAlloc;
    }

    public String getCurrentMaxAlloc() {
        return currentMaxAlloc;
    }

    public void setCurrentMaxAlloc(String currentMaxAlloc) {
        this.currentMaxAlloc = currentMaxAlloc;
    }

    public String getTotalAllocated() {
        return totalAllocated;
    }

    public void setTotalAllocated(String totalAllocated) {
        this.totalAllocated = totalAllocated;
    }
    
}
