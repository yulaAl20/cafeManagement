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
@Table(name = "user_summary_by_file_io_type")
@NamedQueries({
    @NamedQuery(name = "UserSummaryByFileIoType.findAll", query = "SELECT u FROM UserSummaryByFileIoType u"),
    @NamedQuery(name = "UserSummaryByFileIoType.findByUser", query = "SELECT u FROM UserSummaryByFileIoType u WHERE u.user = :user"),
    @NamedQuery(name = "UserSummaryByFileIoType.findByEventName", query = "SELECT u FROM UserSummaryByFileIoType u WHERE u.eventName = :eventName"),
    @NamedQuery(name = "UserSummaryByFileIoType.findByTotal", query = "SELECT u FROM UserSummaryByFileIoType u WHERE u.total = :total"),
    @NamedQuery(name = "UserSummaryByFileIoType.findByLatency", query = "SELECT u FROM UserSummaryByFileIoType u WHERE u.latency = :latency"),
    @NamedQuery(name = "UserSummaryByFileIoType.findByMaxLatency", query = "SELECT u FROM UserSummaryByFileIoType u WHERE u.maxLatency = :maxLatency")})
public class UserSummaryByFileIoType implements Serializable {

    private static final long serialVersionUID = 1L;
    @Column(name = "user")
    private String user;
    @Basic(optional = false)
    @Column(name = "event_name")
    private String eventName;
    @Basic(optional = false)
    @Column(name = "total")
    private long total;
    @Column(name = "latency")
    private String latency;
    @Column(name = "max_latency")
    private String maxLatency;

    public UserSummaryByFileIoType() {
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

    public String getLatency() {
        return latency;
    }

    public void setLatency(String latency) {
        this.latency = latency;
    }

    public String getMaxLatency() {
        return maxLatency;
    }

    public void setMaxLatency(String maxLatency) {
        this.maxLatency = maxLatency;
    }
    
}
