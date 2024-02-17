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
@Table(name = "io_global_by_wait_by_latency")
@NamedQueries({
    @NamedQuery(name = "IoGlobalByWaitByLatency.findAll", query = "SELECT i FROM IoGlobalByWaitByLatency i"),
    @NamedQuery(name = "IoGlobalByWaitByLatency.findByEventName", query = "SELECT i FROM IoGlobalByWaitByLatency i WHERE i.eventName = :eventName"),
    @NamedQuery(name = "IoGlobalByWaitByLatency.findByTotal", query = "SELECT i FROM IoGlobalByWaitByLatency i WHERE i.total = :total"),
    @NamedQuery(name = "IoGlobalByWaitByLatency.findByTotalLatency", query = "SELECT i FROM IoGlobalByWaitByLatency i WHERE i.totalLatency = :totalLatency"),
    @NamedQuery(name = "IoGlobalByWaitByLatency.findByAvgLatency", query = "SELECT i FROM IoGlobalByWaitByLatency i WHERE i.avgLatency = :avgLatency"),
    @NamedQuery(name = "IoGlobalByWaitByLatency.findByMaxLatency", query = "SELECT i FROM IoGlobalByWaitByLatency i WHERE i.maxLatency = :maxLatency"),
    @NamedQuery(name = "IoGlobalByWaitByLatency.findByReadLatency", query = "SELECT i FROM IoGlobalByWaitByLatency i WHERE i.readLatency = :readLatency"),
    @NamedQuery(name = "IoGlobalByWaitByLatency.findByWriteLatency", query = "SELECT i FROM IoGlobalByWaitByLatency i WHERE i.writeLatency = :writeLatency"),
    @NamedQuery(name = "IoGlobalByWaitByLatency.findByMiscLatency", query = "SELECT i FROM IoGlobalByWaitByLatency i WHERE i.miscLatency = :miscLatency"),
    @NamedQuery(name = "IoGlobalByWaitByLatency.findByCountRead", query = "SELECT i FROM IoGlobalByWaitByLatency i WHERE i.countRead = :countRead"),
    @NamedQuery(name = "IoGlobalByWaitByLatency.findByTotalRead", query = "SELECT i FROM IoGlobalByWaitByLatency i WHERE i.totalRead = :totalRead"),
    @NamedQuery(name = "IoGlobalByWaitByLatency.findByAvgRead", query = "SELECT i FROM IoGlobalByWaitByLatency i WHERE i.avgRead = :avgRead"),
    @NamedQuery(name = "IoGlobalByWaitByLatency.findByCountWrite", query = "SELECT i FROM IoGlobalByWaitByLatency i WHERE i.countWrite = :countWrite"),
    @NamedQuery(name = "IoGlobalByWaitByLatency.findByTotalWritten", query = "SELECT i FROM IoGlobalByWaitByLatency i WHERE i.totalWritten = :totalWritten"),
    @NamedQuery(name = "IoGlobalByWaitByLatency.findByAvgWritten", query = "SELECT i FROM IoGlobalByWaitByLatency i WHERE i.avgWritten = :avgWritten")})
public class IoGlobalByWaitByLatency implements Serializable {

    private static final long serialVersionUID = 1L;
    @Column(name = "event_name")
    private String eventName;
    @Basic(optional = false)
    @Column(name = "total")
    private long total;
    @Column(name = "total_latency")
    private String totalLatency;
    @Column(name = "avg_latency")
    private String avgLatency;
    @Column(name = "max_latency")
    private String maxLatency;
    @Column(name = "read_latency")
    private String readLatency;
    @Column(name = "write_latency")
    private String writeLatency;
    @Column(name = "misc_latency")
    private String miscLatency;
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

    public IoGlobalByWaitByLatency() {
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

    public String getMaxLatency() {
        return maxLatency;
    }

    public void setMaxLatency(String maxLatency) {
        this.maxLatency = maxLatency;
    }

    public String getReadLatency() {
        return readLatency;
    }

    public void setReadLatency(String readLatency) {
        this.readLatency = readLatency;
    }

    public String getWriteLatency() {
        return writeLatency;
    }

    public void setWriteLatency(String writeLatency) {
        this.writeLatency = writeLatency;
    }

    public String getMiscLatency() {
        return miscLatency;
    }

    public void setMiscLatency(String miscLatency) {
        this.miscLatency = miscLatency;
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
    
}
