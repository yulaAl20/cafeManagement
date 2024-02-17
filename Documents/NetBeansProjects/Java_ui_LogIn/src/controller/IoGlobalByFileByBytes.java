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
@Table(name = "io_global_by_file_by_bytes")
@NamedQueries({
    @NamedQuery(name = "IoGlobalByFileByBytes.findAll", query = "SELECT i FROM IoGlobalByFileByBytes i"),
    @NamedQuery(name = "IoGlobalByFileByBytes.findByFile", query = "SELECT i FROM IoGlobalByFileByBytes i WHERE i.file = :file"),
    @NamedQuery(name = "IoGlobalByFileByBytes.findByCountRead", query = "SELECT i FROM IoGlobalByFileByBytes i WHERE i.countRead = :countRead"),
    @NamedQuery(name = "IoGlobalByFileByBytes.findByTotalRead", query = "SELECT i FROM IoGlobalByFileByBytes i WHERE i.totalRead = :totalRead"),
    @NamedQuery(name = "IoGlobalByFileByBytes.findByAvgRead", query = "SELECT i FROM IoGlobalByFileByBytes i WHERE i.avgRead = :avgRead"),
    @NamedQuery(name = "IoGlobalByFileByBytes.findByCountWrite", query = "SELECT i FROM IoGlobalByFileByBytes i WHERE i.countWrite = :countWrite"),
    @NamedQuery(name = "IoGlobalByFileByBytes.findByTotalWritten", query = "SELECT i FROM IoGlobalByFileByBytes i WHERE i.totalWritten = :totalWritten"),
    @NamedQuery(name = "IoGlobalByFileByBytes.findByAvgWrite", query = "SELECT i FROM IoGlobalByFileByBytes i WHERE i.avgWrite = :avgWrite"),
    @NamedQuery(name = "IoGlobalByFileByBytes.findByTotal", query = "SELECT i FROM IoGlobalByFileByBytes i WHERE i.total = :total"),
    @NamedQuery(name = "IoGlobalByFileByBytes.findByWritePct", query = "SELECT i FROM IoGlobalByFileByBytes i WHERE i.writePct = :writePct")})
public class IoGlobalByFileByBytes implements Serializable {

    private static final long serialVersionUID = 1L;
    @Column(name = "file")
    private String file;
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
    @Column(name = "avg_write")
    private String avgWrite;
    @Column(name = "total")
    private String total;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @Column(name = "write_pct")
    private BigDecimal writePct;

    public IoGlobalByFileByBytes() {
    }

    public String getFile() {
        return file;
    }

    public void setFile(String file) {
        this.file = file;
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

    public String getAvgWrite() {
        return avgWrite;
    }

    public void setAvgWrite(String avgWrite) {
        this.avgWrite = avgWrite;
    }

    public String getTotal() {
        return total;
    }

    public void setTotal(String total) {
        this.total = total;
    }

    public BigDecimal getWritePct() {
        return writePct;
    }

    public void setWritePct(BigDecimal writePct) {
        this.writePct = writePct;
    }
    
}
