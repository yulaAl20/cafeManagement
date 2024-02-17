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
@Table(name = "wait_classes_global_by_avg_latency")
@NamedQueries({
    @NamedQuery(name = "WaitClassesGlobalByAvgLatency.findAll", query = "SELECT w FROM WaitClassesGlobalByAvgLatency w"),
    @NamedQuery(name = "WaitClassesGlobalByAvgLatency.findByEventClass", query = "SELECT w FROM WaitClassesGlobalByAvgLatency w WHERE w.eventClass = :eventClass"),
    @NamedQuery(name = "WaitClassesGlobalByAvgLatency.findByTotal", query = "SELECT w FROM WaitClassesGlobalByAvgLatency w WHERE w.total = :total"),
    @NamedQuery(name = "WaitClassesGlobalByAvgLatency.findByTotalLatency", query = "SELECT w FROM WaitClassesGlobalByAvgLatency w WHERE w.totalLatency = :totalLatency"),
    @NamedQuery(name = "WaitClassesGlobalByAvgLatency.findByMinLatency", query = "SELECT w FROM WaitClassesGlobalByAvgLatency w WHERE w.minLatency = :minLatency"),
    @NamedQuery(name = "WaitClassesGlobalByAvgLatency.findByAvgLatency", query = "SELECT w FROM WaitClassesGlobalByAvgLatency w WHERE w.avgLatency = :avgLatency"),
    @NamedQuery(name = "WaitClassesGlobalByAvgLatency.findByMaxLatency", query = "SELECT w FROM WaitClassesGlobalByAvgLatency w WHERE w.maxLatency = :maxLatency")})
public class WaitClassesGlobalByAvgLatency implements Serializable {

    private static final long serialVersionUID = 1L;
    @Column(name = "event_class")
    private String eventClass;
    @Column(name = "total")
    private BigInteger total;
    @Column(name = "total_latency")
    private String totalLatency;
    @Column(name = "min_latency")
    private String minLatency;
    @Column(name = "avg_latency")
    private String avgLatency;
    @Column(name = "max_latency")
    private String maxLatency;

    public WaitClassesGlobalByAvgLatency() {
    }

    public String getEventClass() {
        return eventClass;
    }

    public void setEventClass(String eventClass) {
        this.eventClass = eventClass;
    }

    public BigInteger getTotal() {
        return total;
    }

    public void setTotal(BigInteger total) {
        this.total = total;
    }

    public String getTotalLatency() {
        return totalLatency;
    }

    public void setTotalLatency(String totalLatency) {
        this.totalLatency = totalLatency;
    }

    public String getMinLatency() {
        return minLatency;
    }

    public void setMinLatency(String minLatency) {
        this.minLatency = minLatency;
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
