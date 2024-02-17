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
@Table(name = "x$user_summary_by_statement_type")
@NamedQueries({
    @NamedQuery(name = "XUserSummaryByStatementType.findAll", query = "SELECT x FROM XUserSummaryByStatementType x"),
    @NamedQuery(name = "XUserSummaryByStatementType.findByUser", query = "SELECT x FROM XUserSummaryByStatementType x WHERE x.user = :user"),
    @NamedQuery(name = "XUserSummaryByStatementType.findByStatement", query = "SELECT x FROM XUserSummaryByStatementType x WHERE x.statement = :statement"),
    @NamedQuery(name = "XUserSummaryByStatementType.findByTotal", query = "SELECT x FROM XUserSummaryByStatementType x WHERE x.total = :total"),
    @NamedQuery(name = "XUserSummaryByStatementType.findByTotalLatency", query = "SELECT x FROM XUserSummaryByStatementType x WHERE x.totalLatency = :totalLatency"),
    @NamedQuery(name = "XUserSummaryByStatementType.findByMaxLatency", query = "SELECT x FROM XUserSummaryByStatementType x WHERE x.maxLatency = :maxLatency"),
    @NamedQuery(name = "XUserSummaryByStatementType.findByLockLatency", query = "SELECT x FROM XUserSummaryByStatementType x WHERE x.lockLatency = :lockLatency"),
    @NamedQuery(name = "XUserSummaryByStatementType.findByCpuLatency", query = "SELECT x FROM XUserSummaryByStatementType x WHERE x.cpuLatency = :cpuLatency"),
    @NamedQuery(name = "XUserSummaryByStatementType.findByRowsSent", query = "SELECT x FROM XUserSummaryByStatementType x WHERE x.rowsSent = :rowsSent"),
    @NamedQuery(name = "XUserSummaryByStatementType.findByRowsExamined", query = "SELECT x FROM XUserSummaryByStatementType x WHERE x.rowsExamined = :rowsExamined"),
    @NamedQuery(name = "XUserSummaryByStatementType.findByRowsAffected", query = "SELECT x FROM XUserSummaryByStatementType x WHERE x.rowsAffected = :rowsAffected"),
    @NamedQuery(name = "XUserSummaryByStatementType.findByFullScans", query = "SELECT x FROM XUserSummaryByStatementType x WHERE x.fullScans = :fullScans")})
public class XUserSummaryByStatementType implements Serializable {

    private static final long serialVersionUID = 1L;
    @Column(name = "user")
    private String user;
    @Column(name = "statement")
    private String statement;
    @Basic(optional = false)
    @Column(name = "total")
    private long total;
    @Basic(optional = false)
    @Column(name = "total_latency")
    private long totalLatency;
    @Basic(optional = false)
    @Column(name = "max_latency")
    private long maxLatency;
    @Basic(optional = false)
    @Column(name = "lock_latency")
    private long lockLatency;
    @Basic(optional = false)
    @Column(name = "cpu_latency")
    private long cpuLatency;
    @Basic(optional = false)
    @Column(name = "rows_sent")
    private long rowsSent;
    @Basic(optional = false)
    @Column(name = "rows_examined")
    private long rowsExamined;
    @Basic(optional = false)
    @Column(name = "rows_affected")
    private long rowsAffected;
    @Basic(optional = false)
    @Column(name = "full_scans")
    private long fullScans;

    public XUserSummaryByStatementType() {
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getStatement() {
        return statement;
    }

    public void setStatement(String statement) {
        this.statement = statement;
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

    public long getMaxLatency() {
        return maxLatency;
    }

    public void setMaxLatency(long maxLatency) {
        this.maxLatency = maxLatency;
    }

    public long getLockLatency() {
        return lockLatency;
    }

    public void setLockLatency(long lockLatency) {
        this.lockLatency = lockLatency;
    }

    public long getCpuLatency() {
        return cpuLatency;
    }

    public void setCpuLatency(long cpuLatency) {
        this.cpuLatency = cpuLatency;
    }

    public long getRowsSent() {
        return rowsSent;
    }

    public void setRowsSent(long rowsSent) {
        this.rowsSent = rowsSent;
    }

    public long getRowsExamined() {
        return rowsExamined;
    }

    public void setRowsExamined(long rowsExamined) {
        this.rowsExamined = rowsExamined;
    }

    public long getRowsAffected() {
        return rowsAffected;
    }

    public void setRowsAffected(long rowsAffected) {
        this.rowsAffected = rowsAffected;
    }

    public long getFullScans() {
        return fullScans;
    }

    public void setFullScans(long fullScans) {
        this.fullScans = fullScans;
    }
    
}
