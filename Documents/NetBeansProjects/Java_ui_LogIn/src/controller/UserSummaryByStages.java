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
@Table(name = "user_summary_by_stages")
@NamedQueries({
    @NamedQuery(name = "UserSummaryByStages.findAll", query = "SELECT u FROM UserSummaryByStages u"),
    @NamedQuery(name = "UserSummaryByStages.findByUser", query = "SELECT u FROM UserSummaryByStages u WHERE u.user = :user"),
    @NamedQuery(name = "UserSummaryByStages.findByEventName", query = "SELECT u FROM UserSummaryByStages u WHERE u.eventName = :eventName"),
    @NamedQuery(name = "UserSummaryByStages.findByTotal", query = "SELECT u FROM UserSummaryByStages u WHERE u.total = :total"),
    @NamedQuery(name = "UserSummaryByStages.findByTotalLatency", query = "SELECT u FROM UserSummaryByStages u WHERE u.totalLatency = :totalLatency"),
    @NamedQuery(name = "UserSummaryByStages.findByAvgLatency", query = "SELECT u FROM UserSummaryByStages u WHERE u.avgLatency = :avgLatency")})
public class UserSummaryByStages implements Serializable {

    private static final long serialVersionUID = 1L;
    @Column(name = "user")
    private String user;
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

    public UserSummaryByStages() {
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
