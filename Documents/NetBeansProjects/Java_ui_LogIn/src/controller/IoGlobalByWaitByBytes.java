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
@Table(name = "io_global_by_wait_by_bytes")
@NamedQueries({
    @NamedQuery(name = "IoGlobalByWaitByBytes.findAll", query = "SELECT i FROM IoGlobalByWaitByBytes i"),
    @NamedQuery(name = "IoGlobalByWaitByBytes.findByEventName", query = "SELECT i FROM IoGlobalByWaitByBytes i WHERE i.eventName = :eventName"),
    @NamedQuery(name = "IoGlobalByWaitByBytes.findByTotal", query = "SELECT i FROM IoGlobalByWaitByBytes i WHERE i.total = :total"),
    @NamedQuery(name = "IoGlobalByWaitByBytes.findByTotalLatency", query = "SELECT i FROM IoGlobalByWaitByBytes i WHERE i.totalLatency = :totalLatency"),
    @NamedQuery(name = "IoGlobalByWaitByBytes.findByMinLatency", query = "SELECT i FROM IoGlobalByWaitByBytes i WHERE i.minLatency = :minLatency"),
    @NamedQuery(name = "IoGlobalByWaitByBytes.findByAvgLatency", query = "SELECT i FROM IoGlobalByWaitByBytes i WHERE i.avgLatency = :avgLatency"),
    @NamedQuery(name = "IoGlobalByWaitByBytes.findByMaxLatency", query = "SELECT i FROM IoGlobalByWaitByBytes i WHERE i.maxLatency = :maxLatency"),
    @NamedQuery(name = "IoGlobalByWaitByBytes.findByCountRead", query = "SELECT i FROM IoGlobalByWaitByBytes i WHERE i.countRead = :countRead"),
    @NamedQuery(name = "IoGlobalByWaitByBytes.findByTotalRead", query = "SELECT i FROM IoGlobalByWaitByBytes i WHERE i.totalRead = :totalRead"),
    @NamedQuery(name = "IoGlobalByWaitByBytes.findByAvgRead", query = "SELECT i FROM IoGlobalByWaitByBytes i WHERE i.avgRead = :avgRead"),
    @NamedQuery(name = "IoGlobalByWaitByBytes.findByCountWrite", query = "SELECT i FROM IoGlobalByWaitByBytes i WHERE i.countWrite = :countWrite"),
    @NamedQuery(name = "IoGlobalByWaitByBytes.findByTotalWritten", query = "SELECT i FROM IoGlobalByWaitByBytes i WHERE i.totalWritten = :totalWritten"),
    @NamedQuery(name = "IoGlobalByWaitByBytes.findByAvgWritten", query = "SELECT i FROM IoGlobalByWaitByBytes i WHERE i.avgWritten = :avgWritten"),
    @NamedQuery(name = "IoGlobalByWaitByBytes.findByTotalRequested", query = "SELECT i FROM IoGlobalByWaitByBytes i WHERE i.totalRequested = :totalRequested")})
public class IoGlobalByWaitByBytes implements Serializable {

    private static final long serialVersionUID = 1L;
    @Column(name = "event_name")
    private String eventName;
    @Basic(optional = false)
    @Column(name = "total")
    private long total;
    @Column(name = "total_latency")
    private String totalLatency;
    @Column(name = "min_latency")
    private String minLatency;
    @Column(name = "avg_latency")
    private String avgLatency;
    @Column(name = "max_latency")
    private String maxLatency;
    @Basic(optional = false)
    @Column(name = "count_read")
    private long countRead;
    @Column(name = "total_read")
    private String totalRead;
    @Column(name = "avg_read")
    private String avgRead;
    @Basic(optional = false)
    @Column(name = "count_write")
    private long countWrite;
    @Column(name = "total_written")
    private String totalWritten;
    @Column(name = "avg_written")
    private String avgWritten;
    @Column(name = "total_requested")
    private String totalRequested;

    public IoGlobalByWaitByBytes() {
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

    public long getCountRead() {
        return countRead;
    }

    public void setCountRead(long countRead) {
        this.countRead = countRead;
    }

    public String getTotalRead() {
        return totalRead;
    }

    public void setTotalRead(String totalRead) {
        this.totalRead = totalRead;
    }

    public String getAvgRead() {
        return avgRead;
    }

    public void setAvgRead(String avgRead) {
        this.avgRead = avgRead;
    }

    public long getCountWrite() {
        return countWrite;
    }

    public void setCountWrite(long countWrite) {
        this.countWrite = countWrite;
    }

    public String getTotalWritten() {
        return totalWritten;
    }

    public void setTotalWritten(String totalWritten) {
        this.totalWritten = totalWritten;
    }

    public String getAvgWritten() {
        return avgWritten;
    }

    public void setAvgWritten(String avgWritten) {
        this.avgWritten = avgWritten;
    }

    public String getTotalRequested() {
        return totalRequested;
    }

    public void setTotalRequested(String totalRequested) {
        this.totalRequested = totalRequested;
    }
    
}
