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
@Table(name = "host_summary_by_file_io_type")
@NamedQueries({
    @NamedQuery(name = "HostSummaryByFileIoType.findAll", query = "SELECT h FROM HostSummaryByFileIoType h"),
    @NamedQuery(name = "HostSummaryByFileIoType.findByHost", query = "SELECT h FROM HostSummaryByFileIoType h WHERE h.host = :host"),
    @NamedQuery(name = "HostSummaryByFileIoType.findByEventName", query = "SELECT h FROM HostSummaryByFileIoType h WHERE h.eventName = :eventName"),
    @NamedQuery(name = "HostSummaryByFileIoType.findByTotal", query = "SELECT h FROM HostSummaryByFileIoType h WHERE h.total = :total"),
    @NamedQuery(name = "HostSummaryByFileIoType.findByTotalLatency", query = "SELECT h FROM HostSummaryByFileIoType h WHERE h.totalLatency = :totalLatency"),
    @NamedQuery(name = "HostSummaryByFileIoType.findByMaxLatency", query = "SELECT h FROM HostSummaryByFileIoType h WHERE h.maxLatency = :maxLatency")})
public class HostSummaryByFileIoType implements Serializable {

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
    @Column(name = "max_latency")
    private String maxLatency;

    public HostSummaryByFileIoType() {
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

    public String getMaxLatency() {
        return maxLatency;
    }

    public void setMaxLatency(String maxLatency) {
        this.maxLatency = maxLatency;
    }
    
}
