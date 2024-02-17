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
@Table(name = "waits_by_user_by_latency")
@NamedQueries({
    @NamedQuery(name = "WaitsByUserByLatency.findAll", query = "SELECT w FROM WaitsByUserByLatency w"),
    @NamedQuery(name = "WaitsByUserByLatency.findByUser", query = "SELECT w FROM WaitsByUserByLatency w WHERE w.user = :user"),
    @NamedQuery(name = "WaitsByUserByLatency.findByEvent", query = "SELECT w FROM WaitsByUserByLatency w WHERE w.event = :event"),
    @NamedQuery(name = "WaitsByUserByLatency.findByTotal", query = "SELECT w FROM WaitsByUserByLatency w WHERE w.total = :total"),
    @NamedQuery(name = "WaitsByUserByLatency.findByTotalLatency", query = "SELECT w FROM WaitsByUserByLatency w WHERE w.totalLatency = :totalLatency"),
    @NamedQuery(name = "WaitsByUserByLatency.findByAvgLatency", query = "SELECT w FROM WaitsByUserByLatency w WHERE w.avgLatency = :avgLatency"),
    @NamedQuery(name = "WaitsByUserByLatency.findByMaxLatency", query = "SELECT w FROM WaitsByUserByLatency w WHERE w.maxLatency = :maxLatency")})
public class WaitsByUserByLatency implements Serializable {

    private static final long serialVersionUID = 1L;
    @Column(name = "user")
    private String user;
    @Basic(optional = false)
    @Column(name = "event")
    private String event;
    @Basic(optional = false)
    @Column(name = "total")
    private long total;
    @Column(name = "total_latency")
    private String totalLatency;
    @Column(name = "avg_latency")
    private String avgLatency;
    @Column(name = "max_latency")
    private String maxLatency;

    public WaitsByUserByLatency() {
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getEvent() {
        return event;
    }

    public void setEvent(String event) {
        this.event = event;
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
