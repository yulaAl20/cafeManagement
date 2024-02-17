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
@Table(name = "x$io_global_by_file_by_latency")
@NamedQueries({
    @NamedQuery(name = "XIoGlobalByFileByLatency.findAll", query = "SELECT x FROM XIoGlobalByFileByLatency x"),
    @NamedQuery(name = "XIoGlobalByFileByLatency.findByFile", query = "SELECT x FROM XIoGlobalByFileByLatency x WHERE x.file = :file"),
    @NamedQuery(name = "XIoGlobalByFileByLatency.findByTotal", query = "SELECT x FROM XIoGlobalByFileByLatency x WHERE x.total = :total"),
    @NamedQuery(name = "XIoGlobalByFileByLatency.findByTotalLatency", query = "SELECT x FROM XIoGlobalByFileByLatency x WHERE x.totalLatency = :totalLatency"),
    @NamedQuery(name = "XIoGlobalByFileByLatency.findByCountRead", query = "SELECT x FROM XIoGlobalByFileByLatency x WHERE x.countRead = :countRead"),
    @NamedQuery(name = "XIoGlobalByFileByLatency.findByReadLatency", query = "SELECT x FROM XIoGlobalByFileByLatency x WHERE x.readLatency = :readLatency"),
    @NamedQuery(name = "XIoGlobalByFileByLatency.findByCountWrite", query = "SELECT x FROM XIoGlobalByFileByLatency x WHERE x.countWrite = :countWrite"),
    @NamedQuery(name = "XIoGlobalByFileByLatency.findByWriteLatency", query = "SELECT x FROM XIoGlobalByFileByLatency x WHERE x.writeLatency = :writeLatency"),
    @NamedQuery(name = "XIoGlobalByFileByLatency.findByCountMisc", query = "SELECT x FROM XIoGlobalByFileByLatency x WHERE x.countMisc = :countMisc"),
    @NamedQuery(name = "XIoGlobalByFileByLatency.findByMiscLatency", query = "SELECT x FROM XIoGlobalByFileByLatency x WHERE x.miscLatency = :miscLatency")})
public class XIoGlobalByFileByLatency implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @Column(name = "file")
    private String file;
    @Basic(optional = false)
    @Column(name = "total")
    private long total;
    @Basic(optional = false)
    @Column(name = "total_latency")
    private long totalLatency;
    @Basic(optional = false)
    @Column(name = "count_read")
    private long countRead;
    @Basic(optional = false)
    @Column(name = "read_latency")
    private long readLatency;
    @Basic(optional = false)
    @Column(name = "count_write")
    private long countWrite;
    @Basic(optional = false)
    @Column(name = "write_latency")
    private long writeLatency;
    @Basic(optional = false)
    @Column(name = "count_misc")
    private long countMisc;
    @Basic(optional = false)
    @Column(name = "misc_latency")
    private long miscLatency;

    public XIoGlobalByFileByLatency() {
    }

    public String getFile() {
        return file;
    }

    public void setFile(String file) {
        this.file = file;
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

    public long getCountRead() {
        return countRead;
    }

    public void setCountRead(long countRead) {
        this.countRead = countRead;
    }

    public long getReadLatency() {
        return readLatency;
    }

    public void setReadLatency(long readLatency) {
        this.readLatency = readLatency;
    }

    public long getCountWrite() {
        return countWrite;
    }

    public void setCountWrite(long countWrite) {
        this.countWrite = countWrite;
    }

    public long getWriteLatency() {
        return writeLatency;
    }

    public void setWriteLatency(long writeLatency) {
        this.writeLatency = writeLatency;
    }

    public long getCountMisc() {
        return countMisc;
    }

    public void setCountMisc(long countMisc) {
        this.countMisc = countMisc;
    }

    public long getMiscLatency() {
        return miscLatency;
    }

    public void setMiscLatency(long miscLatency) {
        this.miscLatency = miscLatency;
    }
    
}
