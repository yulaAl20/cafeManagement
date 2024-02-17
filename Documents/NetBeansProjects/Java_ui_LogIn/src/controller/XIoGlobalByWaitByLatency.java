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
@Table(name = "x$io_global_by_wait_by_latency")
@NamedQueries({
    @NamedQuery(name = "XIoGlobalByWaitByLatency.findAll", query = "SELECT x FROM XIoGlobalByWaitByLatency x"),
    @NamedQuery(name = "XIoGlobalByWaitByLatency.findByEventName", query = "SELECT x FROM XIoGlobalByWaitByLatency x WHERE x.eventName = :eventName"),
    @NamedQuery(name = "XIoGlobalByWaitByLatency.findByTotal", query = "SELECT x FROM XIoGlobalByWaitByLatency x WHERE x.total = :total"),
    @NamedQuery(name = "XIoGlobalByWaitByLatency.findByTotalLatency", query = "SELECT x FROM XIoGlobalByWaitByLatency x WHERE x.totalLatency = :totalLatency"),
    @NamedQuery(name = "XIoGlobalByWaitByLatency.findByAvgLatency", query = "SELECT x FROM XIoGlobalByWaitByLatency x WHERE x.avgLatency = :avgLatency"),
    @NamedQuery(name = "XIoGlobalByWaitByLatency.findByMaxLatency", query = "SELECT x FROM XIoGlobalByWaitByLatency x WHERE x.maxLatency = :maxLatency"),
    @NamedQuery(name = "XIoGlobalByWaitByLatency.findByReadLatency", query = "SELECT x FROM XIoGlobalByWaitByLatency x WHERE x.readLatency = :readLatency"),
    @NamedQuery(name = "XIoGlobalByWaitByLatency.findByWriteLatency", query = "SELECT x FROM XIoGlobalByWaitByLatency x WHERE x.writeLatency = :writeLatency"),
    @NamedQuery(name = "XIoGlobalByWaitByLatency.findByMiscLatency", query = "SELECT x FROM XIoGlobalByWaitByLatency x WHERE x.miscLatency = :miscLatency"),
    @NamedQuery(name = "XIoGlobalByWaitByLatency.findByCountRead", query = "SELECT x FROM XIoGlobalByWaitByLatency x WHERE x.countRead = :countRead"),
    @NamedQuery(name = "XIoGlobalByWaitByLatency.findByTotalRead", query = "SELECT x FROM XIoGlobalByWaitByLatency x WHERE x.totalRead = :totalRead"),
    @NamedQuery(name = "XIoGlobalByWaitByLatency.findByAvgRead", query = "SELECT x FROM XIoGlobalByWaitByLatency x WHERE x.avgRead = :avgRead"),
    @NamedQuery(name = "XIoGlobalByWaitByLatency.findByCountWrite", query = "SELECT x FROM XIoGlobalByWaitByLatency x WHERE x.countWrite = :countWrite"),
    @NamedQuery(name = "XIoGlobalByWaitByLatency.findByTotalWritten", query = "SELECT x FROM XIoGlobalByWaitByLatency x WHERE x.totalWritten = :totalWritten"),
    @NamedQuery(name = "XIoGlobalByWaitByLatency.findByAvgWritten", query = "SELECT x FROM XIoGlobalByWaitByLatency x WHERE x.avgWritten = :avgWritten")})
public class XIoGlobalByWaitByLatency implements Serializable {

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
    @Column(name = "avg_latency")
    private long avgLatency;
    @Basic(optional = false)
    @Column(name = "max_latency")
    private long maxLatency;
    @Basic(optional = false)
    @Column(name = "read_latency")
    private long readLatency;
    @Basic(optional = false)
    @Column(name = "write_latency")
    private long writeLatency;
    @Basic(optional = false)
    @Column(name = "misc_latency")
    private long miscLatency;
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

    public XIoGlobalByWaitByLatency() {
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

    public long getReadLatency() {
        return readLatency;
    }

    public void setReadLatency(long readLatency) {
        this.readLatency = readLatency;
    }

    public long getWriteLatency() {
        return writeLatency;
    }

    public void setWriteLatency(long writeLatency) {
        this.writeLatency = writeLatency;
    }

    public long getMiscLatency() {
        return miscLatency;
    }

    public void setMiscLatency(long miscLatency) {
        this.miscLatency = miscLatency;
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
    
}
