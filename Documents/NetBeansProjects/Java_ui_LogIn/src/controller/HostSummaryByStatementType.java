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
@Table(name = "host_summary_by_statement_type")
@NamedQueries({
    @NamedQuery(name = "HostSummaryByStatementType.findAll", query = "SELECT h FROM HostSummaryByStatementType h"),
    @NamedQuery(name = "HostSummaryByStatementType.findByHost", query = "SELECT h FROM HostSummaryByStatementType h WHERE h.host = :host"),
    @NamedQuery(name = "HostSummaryByStatementType.findByStatement", query = "SELECT h FROM HostSummaryByStatementType h WHERE h.statement = :statement"),
    @NamedQuery(name = "HostSummaryByStatementType.findByTotal", query = "SELECT h FROM HostSummaryByStatementType h WHERE h.total = :total"),
    @NamedQuery(name = "HostSummaryByStatementType.findByTotalLatency", query = "SELECT h FROM HostSummaryByStatementType h WHERE h.totalLatency = :totalLatency"),
    @NamedQuery(name = "HostSummaryByStatementType.findByMaxLatency", query = "SELECT h FROM HostSummaryByStatementType h WHERE h.maxLatency = :maxLatency"),
    @NamedQuery(name = "HostSummaryByStatementType.findByLockLatency", query = "SELECT h FROM HostSummaryByStatementType h WHERE h.lockLatency = :lockLatency"),
    @NamedQuery(name = "HostSummaryByStatementType.findByCpuLatency", query = "SELECT h FROM HostSummaryByStatementType h WHERE h.cpuLatency = :cpuLatency"),
    @NamedQuery(name = "HostSummaryByStatementType.findByRowsSent", query = "SELECT h FROM HostSummaryByStatementType h WHERE h.rowsSent = :rowsSent"),
    @NamedQuery(name = "HostSummaryByStatementType.findByRowsExamined", query = "SELECT h FROM HostSummaryByStatementType h WHERE h.rowsExamined = :rowsExamined"),
    @NamedQuery(name = "HostSummaryByStatementType.findByRowsAffected", query = "SELECT h FROM HostSummaryByStatementType h WHERE h.rowsAffected = :rowsAffected"),
    @NamedQuery(name = "HostSummaryByStatementType.findByFullScans", query = "SELECT h FROM HostSummaryByStatementType h WHERE h.fullScans = :fullScans")})
public class HostSummaryByStatementType implements Serializable {

    private static final long serialVersionUID = 1L;
    @Column(name = "host")
    private String host;
    @Column(name = "statement")
    private String statement;
    @Basic(optional = false)
    @Column(name = "total")
    private long total;
    @Column(name = "total_latency")
    private String totalLatency;
    @Column(name = "max_latency")
    private String maxLatency;
    @Column(name = "lock_latency")
    private String lockLatency;
    @Column(name = "cpu_latency")
    private String cpuLatency;
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

    public HostSummaryByStatementType() {
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
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
