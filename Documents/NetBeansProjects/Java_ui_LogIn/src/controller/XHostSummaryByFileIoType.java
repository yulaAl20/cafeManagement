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
@Table(name = "x$host_summary_by_file_io_type")
@NamedQueries({
    @NamedQuery(name = "XHostSummaryByFileIoType.findAll", query = "SELECT x FROM XHostSummaryByFileIoType x"),
    @NamedQuery(name = "XHostSummaryByFileIoType.findByHost", query = "SELECT x FROM XHostSummaryByFileIoType x WHERE x.host = :host"),
    @NamedQuery(name = "XHostSummaryByFileIoType.findByEventName", query = "SELECT x FROM XHostSummaryByFileIoType x WHERE x.eventName = :eventName"),
    @NamedQuery(name = "XHostSummaryByFileIoType.findByTotal", query = "SELECT x FROM XHostSummaryByFileIoType x WHERE x.total = :total"),
    @NamedQuery(name = "XHostSummaryByFileIoType.findByTotalLatency", query = "SELECT x FROM XHostSummaryByFileIoType x WHERE x.totalLatency = :totalLatency"),
    @NamedQuery(name = "XHostSummaryByFileIoType.findByMaxLatency", query = "SELECT x FROM XHostSummaryByFileIoType x WHERE x.maxLatency = :maxLatency")})
public class XHostSummaryByFileIoType implements Serializable {

    private static final long serialVersionUID = 1L;
    @Column(name = "host")
    private String host;
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
    @Column(name = "max_latency")
    private long maxLatency;

    public XHostSummaryByFileIoType() {
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

    public long getTotalLatency() {
        return totalLatency;
    }

    public void setTotalLatency(long totalLatency) {
        this.totalLatency = totalLatency;
    }

    public long getMaxLatency() {
        return maxLatency;
    }

    public void setMaxLatency(long maxLatency) {
        this.maxLatency = maxLatency;
    }
    
}
