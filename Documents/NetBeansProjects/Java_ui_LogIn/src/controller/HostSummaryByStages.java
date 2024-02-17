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
@Table(name = "host_summary_by_stages")
@NamedQueries({
    @NamedQuery(name = "HostSummaryByStages.findAll", query = "SELECT h FROM HostSummaryByStages h"),
    @NamedQuery(name = "HostSummaryByStages.findByHost", query = "SELECT h FROM HostSummaryByStages h WHERE h.host = :host"),
    @NamedQuery(name = "HostSummaryByStages.findByEventName", query = "SELECT h FROM HostSummaryByStages h WHERE h.eventName = :eventName"),
    @NamedQuery(name = "HostSummaryByStages.findByTotal", query = "SELECT h FROM HostSummaryByStages h WHERE h.total = :total"),
    @NamedQuery(name = "HostSummaryByStages.findByTotalLatency", query = "SELECT h FROM HostSummaryByStages h WHERE h.totalLatency = :totalLatency"),
    @NamedQuery(name = "HostSummaryByStages.findByAvgLatency", query = "SELECT h FROM HostSummaryByStages h WHERE h.avgLatency = :avgLatency")})
public class HostSummaryByStages implements Serializable {

    private static final long serialVersionUID = 1L;
    @Column(name = "host")
    private String host;
    @Basic(optional = false)
    @Column(name = "event_name")
    private String eventName;
    @Basic(optional = false)
    @Column(name = "total")
    private long total;
    @Column(name = "total_latency")
    private String totalLatency;
    @Column(name = "avg_latency")
    private String avgLatency;

    public HostSummaryByStages() {
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
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
    
}
