/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.io.Serializable;
import java.math.BigDecimal;
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
@Table(name = "x$io_by_thread_by_latency")
@NamedQueries({
    @NamedQuery(name = "XIoByThreadByLatency.findAll", query = "SELECT x FROM XIoByThreadByLatency x"),
    @NamedQuery(name = "XIoByThreadByLatency.findByUser", query = "SELECT x FROM XIoByThreadByLatency x WHERE x.user = :user"),
    @NamedQuery(name = "XIoByThreadByLatency.findByTotal", query = "SELECT x FROM XIoByThreadByLatency x WHERE x.total = :total"),
    @NamedQuery(name = "XIoByThreadByLatency.findByTotalLatency", query = "SELECT x FROM XIoByThreadByLatency x WHERE x.totalLatency = :totalLatency"),
    @NamedQuery(name = "XIoByThreadByLatency.findByMinLatency", query = "SELECT x FROM XIoByThreadByLatency x WHERE x.minLatency = :minLatency"),
    @NamedQuery(name = "XIoByThreadByLatency.findByAvgLatency", query = "SELECT x FROM XIoByThreadByLatency x WHERE x.avgLatency = :avgLatency"),
    @NamedQuery(name = "XIoByThreadByLatency.findByMaxLatency", query = "SELECT x FROM XIoByThreadByLatency x WHERE x.maxLatency = :maxLatency"),
    @NamedQuery(name = "XIoByThreadByLatency.findByThreadId", query = "SELECT x FROM XIoByThreadByLatency x WHERE x.threadId = :threadId"),
    @NamedQuery(name = "XIoByThreadByLatency.findByProcesslistId", query = "SELECT x FROM XIoByThreadByLatency x WHERE x.processlistId = :processlistId")})
public class XIoByThreadByLatency implements Serializable {

    private static final long serialVersionUID = 1L;
    @Column(name = "user")
    private String user;
    @Column(name = "total")
    private BigInteger total;
    @Column(name = "total_latency")
    private BigInteger totalLatency;
    @Column(name = "min_latency")
    private BigInteger minLatency;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "avg_latency")
    private BigDecimal avgLatency;
    @Column(name = "max_latency")
    private BigInteger maxLatency;
    @Basic(optional = false)
    @Column(name = "thread_id")
    private long threadId;
    @Column(name = "processlist_id")
    private BigInteger processlistId;

    public XIoByThreadByLatency() {
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

    public BigInteger getTotalLatency() {
        return totalLatency;
    }

    public void setTotalLatency(BigInteger totalLatency) {
        this.totalLatency = totalLatency;
    }

    public BigInteger getMinLatency() {
        return minLatency;
    }

    public void setMinLatency(BigInteger minLatency) {
        this.minLatency = minLatency;
    }

    public BigDecimal getAvgLatency() {
        return avgLatency;
    }

    public void setAvgLatency(BigDecimal avgLatency) {
        this.avgLatency = avgLatency;
    }

    public BigInteger getMaxLatency() {
        return maxLatency;
    }

    public void setMaxLatency(BigInteger maxLatency) {
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
