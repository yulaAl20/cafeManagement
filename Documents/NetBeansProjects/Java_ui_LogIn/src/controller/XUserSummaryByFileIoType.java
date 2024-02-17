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
@Table(name = "x$user_summary_by_file_io_type")
@NamedQueries({
    @NamedQuery(name = "XUserSummaryByFileIoType.findAll", query = "SELECT x FROM XUserSummaryByFileIoType x"),
    @NamedQuery(name = "XUserSummaryByFileIoType.findByUser", query = "SELECT x FROM XUserSummaryByFileIoType x WHERE x.user = :user"),
    @NamedQuery(name = "XUserSummaryByFileIoType.findByEventName", query = "SELECT x FROM XUserSummaryByFileIoType x WHERE x.eventName = :eventName"),
    @NamedQuery(name = "XUserSummaryByFileIoType.findByTotal", query = "SELECT x FROM XUserSummaryByFileIoType x WHERE x.total = :total"),
    @NamedQuery(name = "XUserSummaryByFileIoType.findByLatency", query = "SELECT x FROM XUserSummaryByFileIoType x WHERE x.latency = :latency"),
    @NamedQuery(name = "XUserSummaryByFileIoType.findByMaxLatency", query = "SELECT x FROM XUserSummaryByFileIoType x WHERE x.maxLatency = :maxLatency")})
public class XUserSummaryByFileIoType implements Serializable {

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
    @Column(name = "latency")
    private long latency;
    @Basic(optional = false)
    @Column(name = "max_latency")
    private long maxLatency;

    public XUserSummaryByFileIoType() {
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

    public long getLatency() {
        return latency;
    }

    public void setLatency(long latency) {
        this.latency = latency;
    }

    public long getMaxLatency() {
        return maxLatency;
    }

    public void setMaxLatency(long maxLatency) {
        this.maxLatency = maxLatency;
    }
    
}
