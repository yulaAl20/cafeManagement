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
@Table(name = "x$waits_global_by_latency")
@NamedQueries({
    @NamedQuery(name = "XWaitsGlobalByLatency.findAll", query = "SELECT x FROM XWaitsGlobalByLatency x"),
    @NamedQuery(name = "XWaitsGlobalByLatency.findByEvents", query = "SELECT x FROM XWaitsGlobalByLatency x WHERE x.events = :events"),
    @NamedQuery(name = "XWaitsGlobalByLatency.findByTotal", query = "SELECT x FROM XWaitsGlobalByLatency x WHERE x.total = :total"),
    @NamedQuery(name = "XWaitsGlobalByLatency.findByTotalLatency", query = "SELECT x FROM XWaitsGlobalByLatency x WHERE x.totalLatency = :totalLatency"),
    @NamedQuery(name = "XWaitsGlobalByLatency.findByAvgLatency", query = "SELECT x FROM XWaitsGlobalByLatency x WHERE x.avgLatency = :avgLatency"),
    @NamedQuery(name = "XWaitsGlobalByLatency.findByMaxLatency", query = "SELECT x FROM XWaitsGlobalByLatency x WHERE x.maxLatency = :maxLatency")})
public class XWaitsGlobalByLatency implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @Column(name = "events")
    private String events;
    @Basic(optional = false)
    @Column(name = "total")
    private long total;
    @Basic(optional = false)
    @Column(name = "total_latency")
    private long totalLatency;
    @Basic(optional = false)
    @Column(name = "avg_latency")
    private long avgLatency;
    @Basic(optional = false)
    @Column(name = "max_latency")
    private long maxLatency;

    public XWaitsGlobalByLatency() {
    }

    public String getEvents() {
        return events;
    }

    public void setEvents(String events) {
        this.events = events;
    }

    public long getTotal() {
        return total;
    }

    public void setTotal(long total) {
        this.total = total;
    }

    public long getTotalLatency() {
        return totalLatency;
    }

    public void setTotalLatency(long totalLatency) {
        this.totalLatency = totalLatency;
    }

    public long getAvgLatency() {
        return avgLatency;
    }

    public void setAvgLatency(long avgLatency) {
        this.avgLatency = avgLatency;
    }

    public long getMaxLatency() {
        return maxLatency;
    }

    public void setMaxLatency(long maxLatency) {
        this.maxLatency = maxLatency;
    }
    
}
