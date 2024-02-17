/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.io.Serializable;
import java.math.BigInteger;
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
@Table(name = "io_by_thread_by_latency")
@NamedQueries({
    @NamedQuery(name = "IoByThreadByLatency.findAll", query = "SELECT i FROM IoByThreadByLatency i"),
    @NamedQuery(name = "IoByThreadByLatency.findByUser", query = "SELECT i FROM IoByThreadByLatency i WHERE i.user = :user"),
    @NamedQuery(name = "IoByThreadByLatency.findByTotal", query = "SELECT i FROM IoByThreadByLatency i WHERE i.total = :total"),
    @NamedQuery(name = "IoByThreadByLatency.findByTotalLatency", query = "SELECT i FROM IoByThreadByLatency i WHERE i.totalLatency = :totalLatency"),
    @NamedQuery(name = "IoByThreadByLatency.findByMinLatency", query = "SELECT i FROM IoByThreadByLatency i WHERE i.minLatency = :minLatency"),
    @NamedQuery(name = "IoByThreadByLatency.findByAvgLatency", query = "SELECT i FROM IoByThreadByLatency i WHERE i.avgLatency = :avgLatency"),
    @NamedQuery(name = "IoByThreadByLatency.findByMaxLatency", query = "SELECT i FROM IoByThreadByLatency i WHERE i.maxLatency = :maxLatency"),
    @NamedQuery(name = "IoByThreadByLatency.findByThreadId", query = "SELECT i FROM IoByThreadByLatency i WHERE i.threadId = :threadId"),
    @NamedQuery(name = "IoByThreadByLatency.findByProcesslistId", query = "SELECT i FROM IoByThreadByLatency i WHERE i.processlistId = :processlistId")})
public class IoByThreadByLatency implements Serializable {

    private static final long serialVersionUID = 1L;
    @Column(name = "user")
    private String user;
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
    @Basic(optional = false)
    @Column(name = "thread_id")
    private long threadId;
    @Column(name = "processlist_id")
    private BigInteger processlistId;

    public IoByThreadByLatency() {
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
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

    public long getThreadId() {
        return threadId;
    }

    public void setThreadId(long threadId) {
        this.threadId = threadId;
    }

    public BigInteger getProcesslistId() {
        return processlistId;
    }

    public void setProcesslistId(BigInteger processlistId) {
        this.processlistId = processlistId;
    }
    
}
