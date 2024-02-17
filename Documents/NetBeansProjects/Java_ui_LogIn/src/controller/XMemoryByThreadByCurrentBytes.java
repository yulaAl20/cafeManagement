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
@Table(name = "x$memory_by_thread_by_current_bytes")
@NamedQueries({
    @NamedQuery(name = "XMemoryByThreadByCurrentBytes.findAll", query = "SELECT x FROM XMemoryByThreadByCurrentBytes x"),
    @NamedQuery(name = "XMemoryByThreadByCurrentBytes.findByThreadId", query = "SELECT x FROM XMemoryByThreadByCurrentBytes x WHERE x.threadId = :threadId"),
    @NamedQuery(name = "XMemoryByThreadByCurrentBytes.findByUser", query = "SELECT x FROM XMemoryByThreadByCurrentBytes x WHERE x.user = :user"),
    @NamedQuery(name = "XMemoryByThreadByCurrentBytes.findByCurrentCountUsed", query = "SELECT x FROM XMemoryByThreadByCurrentBytes x WHERE x.currentCountUsed = :currentCountUsed"),
    @NamedQuery(name = "XMemoryByThreadByCurrentBytes.findByCurrentAllocated", query = "SELECT x FROM XMemoryByThreadByCurrentBytes x WHERE x.currentAllocated = :currentAllocated"),
    @NamedQuery(name = "XMemoryByThreadByCurrentBytes.findByCurrentAvgAlloc", query = "SELECT x FROM XMemoryByThreadByCurrentBytes x WHERE x.currentAvgAlloc = :currentAvgAlloc"),
    @NamedQuery(name = "XMemoryByThreadByCurrentBytes.findByCurrentMaxAlloc", query = "SELECT x FROM XMemoryByThreadByCurrentBytes x WHERE x.currentMaxAlloc = :currentMaxAlloc"),
    @NamedQuery(name = "XMemoryByThreadByCurrentBytes.findByTotalAllocated", query = "SELECT x FROM XMemoryByThreadByCurrentBytes x WHERE x.totalAllocated = :totalAllocated")})
public class XMemoryByThreadByCurrentBytes implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @Column(name = "thread_id")
    private long threadId;
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

    public XMemoryByThreadByCurrentBytes() {
    }

    public long getThreadId() {
        return threadId;
    }

    public void setThreadId(long threadId) {
        this.threadId = threadId;
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
