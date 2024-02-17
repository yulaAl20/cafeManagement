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
@Table(name = "memory_global_by_current_bytes")
@NamedQueries({
    @NamedQuery(name = "MemoryGlobalByCurrentBytes.findAll", query = "SELECT m FROM MemoryGlobalByCurrentBytes m"),
    @NamedQuery(name = "MemoryGlobalByCurrentBytes.findByEventName", query = "SELECT m FROM MemoryGlobalByCurrentBytes m WHERE m.eventName = :eventName"),
    @NamedQuery(name = "MemoryGlobalByCurrentBytes.findByCurrentCount", query = "SELECT m FROM MemoryGlobalByCurrentBytes m WHERE m.currentCount = :currentCount"),
    @NamedQuery(name = "MemoryGlobalByCurrentBytes.findByCurrentAlloc", query = "SELECT m FROM MemoryGlobalByCurrentBytes m WHERE m.currentAlloc = :currentAlloc"),
    @NamedQuery(name = "MemoryGlobalByCurrentBytes.findByCurrentAvgAlloc", query = "SELECT m FROM MemoryGlobalByCurrentBytes m WHERE m.currentAvgAlloc = :currentAvgAlloc"),
    @NamedQuery(name = "MemoryGlobalByCurrentBytes.findByHighCount", query = "SELECT m FROM MemoryGlobalByCurrentBytes m WHERE m.highCount = :highCount"),
    @NamedQuery(name = "MemoryGlobalByCurrentBytes.findByHighAlloc", query = "SELECT m FROM MemoryGlobalByCurrentBytes m WHERE m.highAlloc = :highAlloc"),
    @NamedQuery(name = "MemoryGlobalByCurrentBytes.findByHighAvgAlloc", query = "SELECT m FROM MemoryGlobalByCurrentBytes m WHERE m.highAvgAlloc = :highAvgAlloc")})
public class MemoryGlobalByCurrentBytes implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @Column(name = "event_name")
    private String eventName;
    @Basic(optional = false)
    @Column(name = "current_count")
    private long currentCount;
    @Column(name = "current_alloc")
    private String currentAlloc;
    @Column(name = "current_avg_alloc")
    private String currentAvgAlloc;
    @Basic(optional = false)
    @Column(name = "high_count")
    private long highCount;
    @Column(name = "high_alloc")
    private String highAlloc;
    @Column(name = "high_avg_alloc")
    private String highAvgAlloc;

    public MemoryGlobalByCurrentBytes() {
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

    public String getCurrentAlloc() {
        return currentAlloc;
    }

    public void setCurrentAlloc(String currentAlloc) {
        this.currentAlloc = currentAlloc;
    }

    public String getCurrentAvgAlloc() {
        return currentAvgAlloc;
    }

    public void setCurrentAvgAlloc(String currentAvgAlloc) {
        this.currentAvgAlloc = currentAvgAlloc;
    }

    public long getHighCount() {
        return highCount;
    }

    public void setHighCount(long highCount) {
        this.highCount = highCount;
    }

    public String getHighAlloc() {
        return highAlloc;
    }

    public void setHighAlloc(String highAlloc) {
        this.highAlloc = highAlloc;
    }

    public String getHighAvgAlloc() {
        return highAvgAlloc;
    }

    public void setHighAvgAlloc(String highAvgAlloc) {
        this.highAvgAlloc = highAvgAlloc;
    }
    
}
