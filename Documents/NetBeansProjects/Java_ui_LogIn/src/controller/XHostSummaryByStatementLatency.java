/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.io.Serializable;
import java.math.BigInteger;
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
@Table(name = "x$host_summary_by_statement_latency")
@NamedQueries({
    @NamedQuery(name = "XHostSummaryByStatementLatency.findAll", query = "SELECT x FROM XHostSummaryByStatementLatency x"),
    @NamedQuery(name = "XHostSummaryByStatementLatency.findByHost", query = "SELECT x FROM XHostSummaryByStatementLatency x WHERE x.host = :host"),
    @NamedQuery(name = "XHostSummaryByStatementLatency.findByTotal", query = "SELECT x FROM XHostSummaryByStatementLatency x WHERE x.total = :total"),
    @NamedQuery(name = "XHostSummaryByStatementLatency.findByTotalLatency", query = "SELECT x FROM XHostSummaryByStatementLatency x WHERE x.totalLatency = :totalLatency"),
    @NamedQuery(name = "XHostSummaryByStatementLatency.findByMaxLatency", query = "SELECT x FROM XHostSummaryByStatementLatency x WHERE x.maxLatency = :maxLatency"),
    @NamedQuery(name = "XHostSummaryByStatementLatency.findByLockLatency", query = "SELECT x FROM XHostSummaryByStatementLatency x WHERE x.lockLatency = :lockLatency"),
    @NamedQuery(name = "XHostSummaryByStatementLatency.findByCpuLatency", query = "SELECT x FROM XHostSummaryByStatementLatency x WHERE x.cpuLatency = :cpuLatency"),
    @NamedQuery(name = "XHostSummaryByStatementLatency.findByRowsSent", query = "SELECT x FROM XHostSummaryByStatementLatency x WHERE x.rowsSent = :rowsSent"),
    @NamedQuery(name = "XHostSummaryByStatementLatency.findByRowsExamined", query = "SELECT x FROM XHostSummaryByStatementLatency x WHERE x.rowsExamined = :rowsExamined"),
    @NamedQuery(name = "XHostSummaryByStatementLatency.findByRowsAffected", query = "SELECT x FROM XHostSummaryByStatementLatency x WHERE x.rowsAffected = :rowsAffected"),
    @NamedQuery(name = "XHostSummaryByStatementLatency.findByFullScans", query = "SELECT x FROM XHostSummaryByStatementLatency x WHERE x.fullScans = :fullScans")})
public class XHostSummaryByStatementLatency implements Serializable {

    private static final long serialVersionUID = 1L;
    @Column(name = "host")
    private String host;
    @Column(name = "total")
    private BigInteger total;
    @Column(name = "total_latency")
    private BigInteger totalLatency;
    @Column(name = "max_latency")
    private BigInteger maxLatency;
    @Column(name = "lock_latency")
    private BigInteger lockLatency;
    @Column(name = "cpu_latency")
    private BigInteger cpuLatency;
    @Column(name = "rows_sent")
    private BigInteger rowsSent;
    @Column(name = "rows_examined")
    private BigInteger rowsExamined;
    @Column(name = "rows_affected")
    private BigInteger rowsAffected;
    @Column(name = "full_scans")
    private BigInteger fullScans;

    public XHostSummaryByStatementLatency() {
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
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

    public BigInteger getMaxLatency() {
        return maxLatency;
    }

    public void setMaxLatency(BigInteger maxLatency) {
        this.maxLatency = maxLatency;
    }

    public BigInteger getLockLatency() {
        return lockLatency;
    }

    public void setLockLatency(BigInteger lockLatency) {
        this.lockLatency = lockLatency;
    }

    public BigInteger getCpuLatency() {
        return cpuLatency;
    }

    public void setCpuLatency(BigInteger cpuLatency) {
        this.cpuLatency = cpuLatency;
    }

    public BigInteger getRowsSent() {
        return rowsSent;
    }

    public void setRowsSent(BigInteger rowsSent) {
        this.rowsSent = rowsSent;
    }

    public BigInteger getRowsExamined() {
        return rowsExamined;
    }

    public void setRowsExamined(BigInteger rowsExamined) {
        this.rowsExamined = rowsExamined;
    }

    public BigInteger getRowsAffected() {
        return rowsAffected;
    }

    public void setRowsAffected(BigInteger rowsAffected) {
        this.rowsAffected = rowsAffected;
    }

    public BigInteger getFullScans() {
        return fullScans;
    }

    public void setFullScans(BigInteger fullScans) {
        this.fullScans = fullScans;
    }
    
}
