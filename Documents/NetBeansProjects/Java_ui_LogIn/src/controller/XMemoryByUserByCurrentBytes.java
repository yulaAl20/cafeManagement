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
@Table(name = "x$memory_by_user_by_current_bytes")
@NamedQueries({
    @NamedQuery(name = "XMemoryByUserByCurrentBytes.findAll", query = "SELECT x FROM XMemoryByUserByCurrentBytes x"),
    @NamedQuery(name = "XMemoryByUserByCurrentBytes.findByUser", query = "SELECT x FROM XMemoryByUserByCurrentBytes x WHERE x.user = :user"),
    @NamedQuery(name = "XMemoryByUserByCurrentBytes.findByCurrentCountUsed", query = "SELECT x FROM XMemoryByUserByCurrentBytes x WHERE x.currentCountUsed = :currentCountUsed"),
    @NamedQuery(name = "XMemoryByUserByCurrentBytes.findByCurrentAllocated", query = "SELECT x FROM XMemoryByUserByCurrentBytes x WHERE x.currentAllocated = :currentAllocated"),
    @NamedQuery(name = "XMemoryByUserByCurrentBytes.findByCurrentAvgAlloc", query = "SELECT x FROM XMemoryByUserByCurrentBytes x WHERE x.currentAvgAlloc = :currentAvgAlloc"),
    @NamedQuery(name = "XMemoryByUserByCurrentBytes.findByCurrentMaxAlloc", query = "SELECT x FROM XMemoryByUserByCurrentBytes x WHERE x.currentMaxAlloc = :currentMaxAlloc"),
    @NamedQuery(name = "XMemoryByUserByCurrentBytes.findByTotalAllocated", query = "SELECT x FROM XMemoryByUserByCurrentBytes x WHERE x.totalAllocated = :totalAllocated")})
public class XMemoryByUserByCurrentBytes implements Serializable {

    private static final long serialVersionUID = 1L;
    @Column(name = "user")
    private String user;
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

    public XMemoryByUserByCurrentBytes() {
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
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
