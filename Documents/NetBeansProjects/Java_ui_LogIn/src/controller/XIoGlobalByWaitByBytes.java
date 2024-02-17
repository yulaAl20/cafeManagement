/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.io.Serializable;
import java.math.BigDecimal;
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
@Table(name = "x$io_global_by_wait_by_bytes")
@NamedQueries({
    @NamedQuery(name = "XIoGlobalByWaitByBytes.findAll", query = "SELECT x FROM XIoGlobalByWaitByBytes x"),
    @NamedQuery(name = "XIoGlobalByWaitByBytes.findByEventName", query = "SELECT x FROM XIoGlobalByWaitByBytes x WHERE x.eventName = :eventName"),
    @NamedQuery(name = "XIoGlobalByWaitByBytes.findByTotal", query = "SELECT x FROM XIoGlobalByWaitByBytes x WHERE x.total = :total"),
    @NamedQuery(name = "XIoGlobalByWaitByBytes.findByTotalLatency", query = "SELECT x FROM XIoGlobalByWaitByBytes x WHERE x.totalLatency = :totalLatency"),
    @NamedQuery(name = "XIoGlobalByWaitByBytes.findByMinLatency", query = "SELECT x FROM XIoGlobalByWaitByBytes x WHERE x.minLatency = :minLatency"),
    @NamedQuery(name = "XIoGlobalByWaitByBytes.findByAvgLatency", query = "SELECT x FROM XIoGlobalByWaitByBytes x WHERE x.avgLatency = :avgLatency"),
    @NamedQuery(name = "XIoGlobalByWaitByBytes.findByMaxLatency", query = "SELECT x FROM XIoGlobalByWaitByBytes x WHERE x.maxLatency = :maxLatency"),
    @NamedQuery(name = "XIoGlobalByWaitByBytes.findByCountRead", query = "SELECT x FROM XIoGlobalByWaitByBytes x WHERE x.countRead = :countRead"),
    @NamedQuery(name = "XIoGlobalByWaitByBytes.findByTotalRead", query = "SELECT x FROM XIoGlobalByWaitByBytes x WHERE x.totalRead = :totalRead"),
    @NamedQuery(name = "XIoGlobalByWaitByBytes.findByAvgRead", query = "SELECT x FROM XIoGlobalByWaitByBytes x WHERE x.avgRead = :avgRead"),
    @NamedQuery(name = "XIoGlobalByWaitByBytes.findByCountWrite", query = "SELECT x FROM XIoGlobalByWaitByBytes x WHERE x.countWrite = :countWrite"),
    @NamedQuery(name = "XIoGlobalByWaitByBytes.findByTotalWritten", query = "SELECT x FROM XIoGlobalByWaitByBytes x WHERE x.totalWritten = :totalWritten"),
    @NamedQuery(name = "XIoGlobalByWaitByBytes.findByAvgWritten", query = "SELECT x FROM XIoGlobalByWaitByBytes x WHERE x.avgWritten = :avgWritten"),
    @NamedQuery(name = "XIoGlobalByWaitByBytes.findByTotalRequested", query = "SELECT x FROM XIoGlobalByWaitByBytes x WHERE x.totalRequested = :totalRequested")})
public class XIoGlobalByWaitByBytes implements Serializable {

    private static final long serialVersionUID = 1L;
    @Column(name = "event_name")
    private String eventName;
    @Basic(optional = false)
    @Column(name = "total")
    private long total;
    @Basic(optional = false)
    @Column(name = "total_latency")
    private long totalLatency;
    @Basic(optional = false)
    @Column(name = "min_latency")
    private long minLatency;
    @Basic(optional = false)
    @Column(name = "avg_latency")
    private long avgLatency;
    @Basic(optional = false)
    @Column(name = "max_latency")
    private long maxLatency;
    @Basic(optional = false)
    @Column(name = "count_read")
    private long countRead;
    @Basic(optional = false)
    @Column(name = "total_read")
    private long totalRead;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @Column(name = "avg_read")
    private BigDecimal avgRead;
    @Basic(optional = false)
    @Column(name = "count_write")
    private long countWrite;
    @Basic(optional = false)
    @Column(name = "total_written")
    private long totalWritten;
    @Basic(optional = false)
    @Column(name = "avg_written")
    private BigDecimal avgWritten;
    @Basic(optional = false)
    @Column(name = "total_requested")
    private long totalRequested;

    public XIoGlobalByWaitByBytes() {
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

    public long getMinLatency() {
        return minLatency;
    }

    public void setMinLatency(long minLatency) {
        this.minLatency = minLatency;
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

    public long getCountRead() {
        return countRead;
    }

    public void setCountRead(long countRead) {
        this.countRead = countRead;
    }

    public long getTotalRead() {
        return totalRead;
    }

    public void setTotalRead(long totalRead) {
        this.totalRead = totalRead;
    }

    public BigDecimal getAvgRead() {
        return avgRead;
    }

    public void setAvgRead(BigDecimal avgRead) {
        this.avgRead = avgRead;
    }

    public long getCountWrite() {
        return countWrite;
    }

    public void setCountWrite(long countWrite) {
        this.countWrite = countWrite;
    }

    public long getTotalWritten() {
        return totalWritten;
    }

    public void setTotalWritten(long totalWritten) {
        this.totalWritten = totalWritten;
    }

    public BigDecimal getAvgWritten() {
        return avgWritten;
    }

    public void setAvgWritten(BigDecimal avgWritten) {
        this.avgWritten = avgWritten;
    }

    public long getTotalRequested() {
        return totalRequested;
    }

    public void setTotalRequested(long totalRequested) {
        this.totalRequested = totalRequested;
    }
    
}
