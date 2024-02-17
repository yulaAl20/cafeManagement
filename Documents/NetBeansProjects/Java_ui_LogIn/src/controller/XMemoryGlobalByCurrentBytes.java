/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.io.Serializable;
import java.math.BigDecimal;
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
@Table(name = "x$memory_global_by_current_bytes")
@NamedQueries({
    @NamedQuery(name = "XMemoryGlobalByCurrentBytes.findAll", query = "SELECT x FROM XMemoryGlobalByCurrentBytes x"),
    @NamedQuery(name = "XMemoryGlobalByCurrentBytes.findByEventName", query = "SELECT x FROM XMemoryGlobalByCurrentBytes x WHERE x.eventName = :eventName"),
    @NamedQuery(name = "XMemoryGlobalByCurrentBytes.findByCurrentCount", query = "SELECT x FROM XMemoryGlobalByCurrentBytes x WHERE x.currentCount = :currentCount"),
    @NamedQuery(name = "XMemoryGlobalByCurrentBytes.findByCurrentAlloc", query = "SELECT x FROM XMemoryGlobalByCurrentBytes x WHERE x.currentAlloc = :currentAlloc"),
    @NamedQuery(name = "XMemoryGlobalByCurrentBytes.findByCurrentAvgAlloc", query = "SELECT x FROM XMemoryGlobalByCurrentBytes x WHERE x.currentAvgAlloc = :currentAvgAlloc"),
    @NamedQuery(name = "XMemoryGlobalByCurrentBytes.findByHighCount", query = "SELECT x FROM XMemoryGlobalByCurrentBytes x WHERE x.highCount = :highCount"),
    @NamedQuery(name = "XMemoryGlobalByCurrentBytes.findByHighAlloc", query = "SELECT x FROM XMemoryGlobalByCurrentBytes x WHERE x.highAlloc = :highAlloc"),
    @NamedQuery(name = "XMemoryGlobalByCurrentBytes.findByHighAvgAlloc", query = "SELECT x FROM XMemoryGlobalByCurrentBytes x WHERE x.highAvgAlloc = :highAvgAlloc")})
public class XMemoryGlobalByCurrentBytes implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @Column(name = "event_name")
    private String eventName;
    @Basic(optional = false)
    @Column(name = "current_count")
    private long currentCount;
    @Basic(optional = false)
    @Column(name = "current_alloc")
    private long currentAlloc;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @Column(name = "current_avg_alloc")
    private BigDecimal currentAvgAlloc;
    @Basic(optional = false)
    @Column(name = "high_count")
    private long highCount;
    @Basic(optional = false)
    @Column(name = "high_alloc")
    private long highAlloc;
    @Basic(optional = false)
    @Column(name = "high_avg_alloc")
    private BigDecimal highAvgAlloc;

    public XMemoryGlobalByCurrentBytes() {
    }

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public long getCurrentCount() {
        return currentCount;
    }

    public void setCurrentCount(long currentCount) {
        this.currentCount = currentCount;
    }

    public long getCurrentAlloc() {
        return currentAlloc;
    }

    public void setCurrentAlloc(long currentAlloc) {
        this.currentAlloc = currentAlloc;
    }

    public BigDecimal getCurrentAvgAlloc() {
        return currentAvgAlloc;
    }

    public void setCurrentAvgAlloc(BigDecimal currentAvgAlloc) {
        this.currentAvgAlloc = currentAvgAlloc;
    }

    public long getHighCount() {
        return highCount;
    }

    public void setHighCount(long highCount) {
        this.highCount = highCount;
    }

    public long getHighAlloc() {
        return highAlloc;
    }

    public void setHighAlloc(long highAlloc) {
        this.highAlloc = highAlloc;
    }

    public BigDecimal getHighAvgAlloc() {
        return highAvgAlloc;
    }

    public void setHighAvgAlloc(BigDecimal highAvgAlloc) {
        this.highAvgAlloc = highAvgAlloc;
    }
    
}
