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
@Table(name = "x$waits_by_user_by_latency")
@NamedQueries({
    @NamedQuery(name = "XWaitsByUserByLatency.findAll", query = "SELECT x FROM XWaitsByUserByLatency x"),
    @NamedQuery(name = "XWaitsByUserByLatency.findByUser", query = "SELECT x FROM XWaitsByUserByLatency x WHERE x.user = :user"),
    @NamedQuery(name = "XWaitsByUserByLatency.findByEvent", query = "SELECT x FROM XWaitsByUserByLatency x WHERE x.event = :event"),
    @NamedQuery(name = "XWaitsByUserByLatency.findByTotal", query = "SELECT x FROM XWaitsByUserByLatency x WHERE x.total = :total"),
    @NamedQuery(name = "XWaitsByUserByLatency.findByTotalLatency", query = "SELECT x FROM XWaitsByUserByLatency x WHERE x.totalLatency = :totalLatency"),
    @NamedQuery(name = "XWaitsByUserByLatency.findByAvgLatency", query = "SELECT x FROM XWaitsByUserByLatency x WHERE x.avgLatency = :avgLatency"),
    @NamedQuery(name = "XWaitsByUserByLatency.findByMaxLatency", query = "SELECT x FROM XWaitsByUserByLatency x WHERE x.maxLatency = :maxLatency")})
public class XWaitsByUserByLatency implements Serializable {

    private static final long serialVersionUID = 1L;
    @Column(name = "user")
    private String user;
    @Basic(optional = false)
    @Column(name = "event")
    private String event;
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

    public XWaitsByUserByLatency() {
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
