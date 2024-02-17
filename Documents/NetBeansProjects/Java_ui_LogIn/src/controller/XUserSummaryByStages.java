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
@Table(name = "x$user_summary_by_stages")
@NamedQueries({
    @NamedQuery(name = "XUserSummaryByStages.findAll", query = "SELECT x FROM XUserSummaryByStages x"),
    @NamedQuery(name = "XUserSummaryByStages.findByUser", query = "SELECT x FROM XUserSummaryByStages x WHERE x.user = :user"),
    @NamedQuery(name = "XUserSummaryByStages.findByEventName", query = "SELECT x FROM XUserSummaryByStages x WHERE x.eventName = :eventName"),
    @NamedQuery(name = "XUserSummaryByStages.findByTotal", query = "SELECT x FROM XUserSummaryByStages x WHERE x.total = :total"),
    @NamedQuery(name = "XUserSummaryByStages.findByTotalLatency", query = "SELECT x FROM XUserSummaryByStages x WHERE x.totalLatency = :totalLatency"),
    @NamedQuery(name = "XUserSummaryByStages.findByAvgLatency", query = "SELECT x FROM XUserSummaryByStages x WHERE x.avgLatency = :avgLatency")})
public class XUserSummaryByStages implements Serializable {

    private static final long serialVersionUID = 1L;
    @Column(name = "user")
    private String user;
    @Basic(optional = false)
    @Column(name = "event_name")
    private String eventName;
    @Basic(optional = false)
    @Column(name = "total")
    private long total;
    @Basic(optional = false)
    @Column(name = "total_latency")
    private long totalLatency;
    @Basic(optional = false)
    @Column(name = "avg_latency")
    private long avgLatency;

    public XUserSummaryByStages() {
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
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
    
}
