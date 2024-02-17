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
@Table(name = "user_summary_by_statement_latency")
@NamedQueries({
    @NamedQuery(name = "UserSummaryByStatementLatency.findAll", query = "SELECT u FROM UserSummaryByStatementLatency u"),
    @NamedQuery(name = "UserSummaryByStatementLatency.findByUser", query = "SELECT u FROM UserSummaryByStatementLatency u WHERE u.user = :user"),
    @NamedQuery(name = "UserSummaryByStatementLatency.findByTotal", query = "SELECT u FROM UserSummaryByStatementLatency u WHERE u.total = :total"),
    @NamedQuery(name = "UserSummaryByStatementLatency.findByTotalLatency", query = "SELECT u FROM UserSummaryByStatementLatency u WHERE u.totalLatency = :totalLatency"),
    @NamedQuery(name = "UserSummaryByStatementLatency.findByMaxLatency", query = "SELECT u FROM UserSummaryByStatementLatency u WHERE u.maxLatency = :maxLatency"),
    @NamedQuery(name = "UserSummaryByStatementLatency.findByLockLatency", query = "SELECT u FROM UserSummaryByStatementLatency u WHERE u.lockLatency = :lockLatency"),
    @NamedQuery(name = "UserSummaryByStatementLatency.findByCpuLatency", query = "SELECT u FROM UserSummaryByStatementLatency u WHERE u.cpuLatency = :cpuLatency"),
    @NamedQuery(name = "UserSummaryByStatementLatency.findByRowsSent", query = "SELECT u FROM UserSummaryByStatementLatency u WHERE u.rowsSent = :rowsSent"),
    @NamedQuery(name = "UserSummaryByStatementLatency.findByRowsExamined", query = "SELECT u FROM UserSummaryByStatementLatency u WHERE u.rowsExamined = :rowsExamined"),
    @NamedQuery(name = "UserSummaryByStatementLatency.findByRowsAffected", query = "SELECT u FROM UserSummaryByStatementLatency u WHERE u.rowsAffected = :rowsAffected"),
    @NamedQuery(name = "UserSummaryByStatementLatency.findByFullScans", query = "SELECT u FROM UserSummaryByStatementLatency u WHERE u.fullScans = :fullScans")})
public class UserSummaryByStatementLatency implements Serializable {

    private static final long serialVersionUID = 1L;
    @Column(name = "user")
    private String user;
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

    public UserSummaryByStatementLatency() {
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
