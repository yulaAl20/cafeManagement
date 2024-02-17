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
@Table(name = "x$io_global_by_file_by_bytes")
@NamedQueries({
    @NamedQuery(name = "XIoGlobalByFileByBytes.findAll", query = "SELECT x FROM XIoGlobalByFileByBytes x"),
    @NamedQuery(name = "XIoGlobalByFileByBytes.findByFile", query = "SELECT x FROM XIoGlobalByFileByBytes x WHERE x.file = :file"),
    @NamedQuery(name = "XIoGlobalByFileByBytes.findByCountRead", query = "SELECT x FROM XIoGlobalByFileByBytes x WHERE x.countRead = :countRead"),
    @NamedQuery(name = "XIoGlobalByFileByBytes.findByTotalRead", query = "SELECT x FROM XIoGlobalByFileByBytes x WHERE x.totalRead = :totalRead"),
    @NamedQuery(name = "XIoGlobalByFileByBytes.findByAvgRead", query = "SELECT x FROM XIoGlobalByFileByBytes x WHERE x.avgRead = :avgRead"),
    @NamedQuery(name = "XIoGlobalByFileByBytes.findByCountWrite", query = "SELECT x FROM XIoGlobalByFileByBytes x WHERE x.countWrite = :countWrite"),
    @NamedQuery(name = "XIoGlobalByFileByBytes.findByTotalWritten", query = "SELECT x FROM XIoGlobalByFileByBytes x WHERE x.totalWritten = :totalWritten"),
    @NamedQuery(name = "XIoGlobalByFileByBytes.findByAvgWrite", query = "SELECT x FROM XIoGlobalByFileByBytes x WHERE x.avgWrite = :avgWrite"),
    @NamedQuery(name = "XIoGlobalByFileByBytes.findByTotal", query = "SELECT x FROM XIoGlobalByFileByBytes x WHERE x.total = :total"),
    @NamedQuery(name = "XIoGlobalByFileByBytes.findByWritePct", query = "SELECT x FROM XIoGlobalByFileByBytes x WHERE x.writePct = :writePct")})
public class XIoGlobalByFileByBytes implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @Column(name = "file")
    private String file;
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
    @Column(name = "avg_write")
    private BigDecimal avgWrite;
    @Basic(optional = false)
    @Column(name = "total")
    private long total;
    @Basic(optional = false)
    @Column(name = "write_pct")
    private BigDecimal writePct;

    public XIoGlobalByFileByBytes() {
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

    public BigDecimal getAvgWrite() {
        return avgWrite;
    }

    public void setAvgWrite(BigDecimal avgWrite) {
        this.avgWrite = avgWrite;
    }

    public long getTotal() {
        return total;
    }

    public void setTotal(long total) {
        this.total = total;
    }

    public BigDecimal getWritePct() {
        return writePct;
    }

    public void setWritePct(BigDecimal writePct) {
        this.writePct = writePct;
    }
    
}
