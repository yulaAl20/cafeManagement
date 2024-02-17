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
@Table(name = "io_global_by_file_by_latency")
@NamedQueries({
    @NamedQuery(name = "IoGlobalByFileByLatency.findAll", query = "SELECT i FROM IoGlobalByFileByLatency i"),
    @NamedQuery(name = "IoGlobalByFileByLatency.findByFile", query = "SELECT i FROM IoGlobalByFileByLatency i WHERE i.file = :file"),
    @NamedQuery(name = "IoGlobalByFileByLatency.findByTotal", query = "SELECT i FROM IoGlobalByFileByLatency i WHERE i.total = :total"),
    @NamedQuery(name = "IoGlobalByFileByLatency.findByTotalLatency", query = "SELECT i FROM IoGlobalByFileByLatency i WHERE i.totalLatency = :totalLatency"),
    @NamedQuery(name = "IoGlobalByFileByLatency.findByCountRead", query = "SELECT i FROM IoGlobalByFileByLatency i WHERE i.countRead = :countRead"),
    @NamedQuery(name = "IoGlobalByFileByLatency.findByReadLatency", query = "SELECT i FROM IoGlobalByFileByLatency i WHERE i.readLatency = :readLatency"),
    @NamedQuery(name = "IoGlobalByFileByLatency.findByCountWrite", query = "SELECT i FROM IoGlobalByFileByLatency i WHERE i.countWrite = :countWrite"),
    @NamedQuery(name = "IoGlobalByFileByLatency.findByWriteLatency", query = "SELECT i FROM IoGlobalByFileByLatency i WHERE i.writeLatency = :writeLatency"),
    @NamedQuery(name = "IoGlobalByFileByLatency.findByCountMisc", query = "SELECT i FROM IoGlobalByFileByLatency i WHERE i.countMisc = :countMisc"),
    @NamedQuery(name = "IoGlobalByFileByLatency.findByMiscLatency", query = "SELECT i FROM IoGlobalByFileByLatency i WHERE i.miscLatency = :miscLatency")})
public class IoGlobalByFileByLatency implements Serializable {

    private static final long serialVersionUID = 1L;
    @Column(name = "file")
    private String file;
    @Basic(optional = false)
    @Column(name = "total")
    private long total;
    @Column(name = "total_latency")
    private String totalLatency;
    @Basic(optional = false)
    @Column(name = "count_read")
    private long countRead;
    @Column(name = "read_latency")
    private String readLatency;
    @Basic(optional = false)
    @Column(name = "count_write")
    private long countWrite;
    @Column(name = "write_latency")
    private String writeLatency;
    @Basic(optional = false)
    @Column(name = "count_misc")
    private long countMisc;
    @Column(name = "misc_latency")
    private String miscLatency;

    public IoGlobalByFileByLatency() {
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

    public String getTotalLatency() {
        return totalLatency;
    }

    public void setTotalLatency(String totalLatency) {
        this.totalLatency = totalLatency;
    }

    public long getCountRead() {
        return countRead;
    }

    public void setCountRead(long countRead) {
        this.countRead = countRead;
    }

    public String getReadLatency() {
        return readLatency;
    }

    public void setReadLatency(String readLatency) {
        this.readLatency = readLatency;
    }

    public long getCountWrite() {
        return countWrite;
    }

    public void setCountWrite(long countWrite) {
        this.countWrite = countWrite;
    }

    public String getWriteLatency() {
        return writeLatency;
    }

    public void setWriteLatency(String writeLatency) {
        this.writeLatency = writeLatency;
    }

    public long getCountMisc() {
        return countMisc;
    }

    public void setCountMisc(long countMisc) {
        this.countMisc = countMisc;
    }

    public String getMiscLatency() {
        return miscLatency;
    }

    public void setMiscLatency(String miscLatency) {
        this.miscLatency = miscLatency;
    }
    
}
