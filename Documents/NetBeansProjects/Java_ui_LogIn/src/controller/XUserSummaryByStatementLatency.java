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
@Table(name = "x$user_summary_by_statement_latency")
@NamedQueries({
    @NamedQuery(name = "XUserSummaryByStatementLatency.findAll", query = "SELECT x FROM XUserSummaryByStatementLatency x"),
    @NamedQuery(name = "XUserSummaryByStatementLatency.findByUser", query = "SELECT x FROM XUserSummaryByStatementLatency x WHERE x.user = :user"),
    @NamedQuery(name = "XUserSummaryByStatementLatency.findByTotal", query = "SELECT x FROM XUserSummaryByStatementLatency x WHERE x.total = :total"),
    @NamedQuery(name = "XUserSummaryByStatementLatency.findByTotalLatency", query = "SELECT x FROM XUserSummaryByStatementLatency x WHERE x.totalLatency = :totalLatency"),
    @NamedQuery(name = "XUserSummaryByStatementLatency.findByMaxLatency", query = "SELECT x FROM XUserSummaryByStatementLatency x WHERE x.maxLatency = :maxLatency"),
    @NamedQuery(name = "XUserSummaryByStatementLatency.findByLockLatency", query = "SELECT x FROM XUserSummaryByStatementLatency x WHERE x.lockLatency = :lockLatency"),
    @NamedQuery(name = "XUserSummaryByStatementLatency.findByCpuLatency", query = "SELECT x FROM XUserSummaryByStatementLatency x WHERE x.cpuLatency = :cpuLatency"),
    @NamedQuery(name = "XUserSummaryByStatementLatency.findByRowsSent", query = "SELECT x FROM XUserSummaryByStatementLatency x WHERE x.rowsSent = :rowsSent"),
    @NamedQuery(name = "XUserSummaryByStatementLatency.findByRowsExamined", query = "SELECT x FROM XUserSummaryByStatementLatency x WHERE x.rowsExamined = :rowsExamined"),
    @NamedQuery(name = "XUserSummaryByStatementLatency.findByRowsAffected", query = "SELECT x FROM XUserSummaryByStatementLatency x WHERE x.rowsAffected = :rowsAffected"),
    @NamedQuery(name = "XUserSummaryByStatementLatency.findByFullScans", query = "SELECT x FROM XUserSummaryByStatementLatency x WHERE x.fullScans = :fullScans")})
public class XUserSummaryByStatementLatency implements Serializable {

    private static final long serialVersionUID = 1L;
    @Column(name = "user")
    private String user;
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

    public XUserSummaryByStatementLatency() {
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
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
