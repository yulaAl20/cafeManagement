/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
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
@Table(name = "x$memory_by_host_by_current_bytes")
@NamedQueries({
    @NamedQuery(name = "XMemoryByHostByCurrentBytes.findAll", query = "SELECT x FROM XMemoryByHostByCurrentBytes x"),
    @NamedQuery(name = "XMemoryByHostByCurrentBytes.findByHost", query = "SELECT x FROM XMemoryByHostByCurrentBytes x WHERE x.host = :host"),
    @NamedQuery(name = "XMemoryByHostByCurrentBytes.findByCurrentCountUsed", query = "SELECT x FROM XMemoryByHostByCurrentBytes x WHERE x.currentCountUsed = :currentCountUsed"),
    @NamedQuery(name = "XMemoryByHostByCurrentBytes.findByCurrentAllocated", query = "SELECT x FROM XMemoryByHostByCurrentBytes x WHERE x.currentAllocated = :currentAllocated"),
    @NamedQuery(name = "XMemoryByHostByCurrentBytes.findByCurrentAvgAlloc", query = "SELECT x FROM XMemoryByHostByCurrentBytes x WHERE x.currentAvgAlloc = :currentAvgAlloc"),
    @NamedQuery(name = "XMemoryByHostByCurrentBytes.findByCurrentMaxAlloc", query = "SELECT x FROM XMemoryByHostByCurrentBytes x WHERE x.currentMaxAlloc = :currentMaxAlloc"),
    @NamedQuery(name = "XMemoryByHostByCurrentBytes.findByTotalAllocated", query = "SELECT x FROM XMemoryByHostByCurrentBytes x WHERE x.totalAllocated = :totalAllocated")})
public class XMemoryByHostByCurrentBytes implements Serializable {

    private static final long serialVersionUID = 1L;
    @Column(name = "host")
    private String host;
    @Column(name = "current_count_used")
    private BigInteger currentCountUsed;
    @Column(name = "current_allocated")
    private BigInteger currentAllocated;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @Column(name = "current_avg_alloc")
    private BigDecimal currentAvgAlloc;
    @Column(name = "current_max_alloc")
    private BigInteger currentMaxAlloc;
    @Column(name = "total_allocated")
    private BigInteger totalAllocated;

    public XMemoryByHostByCurrentBytes() {
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

    public BigInteger getCurrentAllocated() {
        return currentAllocated;
    }

    public void setCurrentAllocated(BigInteger currentAllocated) {
        this.currentAllocated = currentAllocated;
    }

    public BigDecimal getCurrentAvgAlloc() {
        return currentAvgAlloc;
    }

    public void setCurrentAvgAlloc(BigDecimal currentAvgAlloc) {
        this.currentAvgAlloc = currentAvgAlloc;
    }

    public BigInteger getCurrentMaxAlloc() {
        return currentMaxAlloc;
    }

    public void setCurrentMaxAlloc(BigInteger currentMaxAlloc) {
        this.currentMaxAlloc = currentMaxAlloc;
    }

    public BigInteger getTotalAllocated() {
        return totalAllocated;
    }

    public void setTotalAllocated(BigInteger totalAllocated) {
        this.totalAllocated = totalAllocated;
    }
    
}
