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
@Table(name = "waits_global_by_latency")
@NamedQueries({
    @NamedQuery(name = "WaitsGlobalByLatency.findAll", query = "SELECT w FROM WaitsGlobalByLatency w"),
    @NamedQuery(name = "WaitsGlobalByLatency.findByEvents", query = "SELECT w FROM WaitsGlobalByLatency w WHERE w.events = :events"),
    @NamedQuery(name = "WaitsGlobalByLatency.findByTotal", query = "SELECT w FROM WaitsGlobalByLatency w WHERE w.total = :total"),
    @NamedQuery(name = "WaitsGlobalByLatency.findByTotalLatency", query = "SELECT w FROM WaitsGlobalByLatency w WHERE w.totalLatency = :totalLatency"),
    @NamedQuery(name = "WaitsGlobalByLatency.findByAvgLatency", query = "SELECT w FROM WaitsGlobalByLatency w WHERE w.avgLatency = :avgLatency"),
    @NamedQuery(name = "WaitsGlobalByLatency.findByMaxLatency", query = "SELECT w FROM WaitsGlobalByLatency w WHERE w.maxLatency = :maxLatency")})
public class WaitsGlobalByLatency implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @Column(name = "events")
    private String events;
    @Basic(optional = false)
    @Column(name = "total")
    private long total;
    @Column(name = "total_latency")
    private String totalLatency;
    @Column(name = "avg_latency")
    private String avgLatency;
    @Column(name = "max_latency")
    private String maxLatency;

    public WaitsGlobalByLatency() {
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

    public String getTotalLatency() {
        return totalLatency;
    }

    public void setTotalLatency(String totalLatency) {
        this.totalLatency = totalLatency;
    }

    public String getAvgLatency() {
        return avgLatency;
    }

    public void setAvgLatency(String avgLatency) {
        this.avgLatency = avgLatency;
    }

    public String getMaxLatency() {
        return maxLatency;
    }

    public void setMaxLatency(String maxLatency) {
        this.maxLatency = maxLatency;
    }
    
}
