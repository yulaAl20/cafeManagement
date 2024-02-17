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
@Table(name = "host_summary_by_statement_latency")
@NamedQueries({
    @NamedQuery(name = "HostSummaryByStatementLatency.findAll", query = "SELECT h FROM HostSummaryByStatementLatency h"),
    @NamedQuery(name = "HostSummaryByStatementLatency.findByHost", query = "SELECT h FROM HostSummaryByStatementLatency h WHERE h.host = :host"),
    @NamedQuery(name = "HostSummaryByStatementLatency.findByTotal", query = "SELECT h FROM HostSummaryByStatementLatency h WHERE h.total = :total"),
    @NamedQuery(name = "HostSummaryByStatementLatency.findByTotalLatency", query = "SELECT h FROM HostSummaryByStatementLatency h WHERE h.totalLatency = :totalLatency"),
    @NamedQuery(name = "HostSummaryByStatementLatency.findByMaxLatency", query = "SELECT h FROM HostSummaryByStatementLatency h WHERE h.maxLatency = :maxLatency"),
    @NamedQuery(name = "HostSummaryByStatementLatency.findByLockLatency", query = "SELECT h FROM HostSummaryByStatementLatency h WHERE h.lockLatency = :lockLatency"),
    @NamedQuery(name = "HostSummaryByStatementLatency.findByCpuLatency", query = "SELECT h FROM HostSummaryByStatementLatency h WHERE h.cpuLatency = :cpuLatency"),
    @NamedQuery(name = "HostSummaryByStatementLatency.findByRowsSent", query = "SELECT h FROM HostSummaryByStatementLatency h WHERE h.rowsSent = :rowsSent"),
    @NamedQuery(name = "HostSummaryByStatementLatency.findByRowsExamined", query = "SELECT h FROM HostSummaryByStatementLatency h WHERE h.rowsExamined = :rowsExamined"),
    @NamedQuery(name = "HostSummaryByStatementLatency.findByRowsAffected", query = "SELECT h FROM HostSummaryByStatementLatency h WHERE h.rowsAffected = :rowsAffected"),
    @NamedQuery(name = "HostSummaryByStatementLatency.findByFullScans", query = "SELECT h FROM HostSummaryByStatementLatency h WHERE h.fullScans = :fullScans")})
public class HostSummaryByStatementLatency implements Serializable {

    private static final long serialVersionUID = 1L;
    @Column(name = "host")
    private String host;
    @Column(name = "total")
    private BigInteger total;
    @Column(name = "total_latency")
    private String totalLatency;
    @Column(name = "max_latency")
    private String maxLatency;
    @Column(name = "lock_latency")
    private String lockLatency;
    @Column(name = "cpu_latency")
    private String cpuLatency;
    @Column(name = "rows_sent")
    private BigInteger rowsSent;
    @Column(name = "rows_examined")
    private BigInteger rowsExamined;
    @Column(name = "rows_affected")
    private BigInteger rowsAffected;
    @Column(name = "full_scans")
    private BigInteger fullScans;

    public HostSummaryByStatementLatency() {
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

    public String getTotalLatency() {
        return totalLatency;
    }

    public void setTotalLatency(String totalLatency) {
        this.totalLatency = totalLatency;
    }

    public String getMaxLatency() {
        return maxLatency;
    }

    public void setMaxLatency(String maxLatency) {
        this.maxLatency = maxLatency;
    }

    public String getLockLatency() {
        return lockLatency;
    }

    public void setLockLatency(String lockLatency) {
        this.lockLatency = lockLatency;
    }

    public String getCpuLatency() {
        return cpuLatency;
    }

    public void setCpuLatency(String cpuLatency) {
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
