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
@Table(name = "x$host_summary_by_statement_type")
@NamedQueries({
    @NamedQuery(name = "XHostSummaryByStatementType.findAll", query = "SELECT x FROM XHostSummaryByStatementType x"),
    @NamedQuery(name = "XHostSummaryByStatementType.findByHost", query = "SELECT x FROM XHostSummaryByStatementType x WHERE x.host = :host"),
    @NamedQuery(name = "XHostSummaryByStatementType.findByStatement", query = "SELECT x FROM XHostSummaryByStatementType x WHERE x.statement = :statement"),
    @NamedQuery(name = "XHostSummaryByStatementType.findByTotal", query = "SELECT x FROM XHostSummaryByStatementType x WHERE x.total = :total"),
    @NamedQuery(name = "XHostSummaryByStatementType.findByTotalLatency", query = "SELECT x FROM XHostSummaryByStatementType x WHERE x.totalLatency = :totalLatency"),
    @NamedQuery(name = "XHostSummaryByStatementType.findByMaxLatency", query = "SELECT x FROM XHostSummaryByStatementType x WHERE x.maxLatency = :maxLatency"),
    @NamedQuery(name = "XHostSummaryByStatementType.findByLockLatency", query = "SELECT x FROM XHostSummaryByStatementType x WHERE x.lockLatency = :lockLatency"),
    @NamedQuery(name = "XHostSummaryByStatementType.findByCpuLatency", query = "SELECT x FROM XHostSummaryByStatementType x WHERE x.cpuLatency = :cpuLatency"),
    @NamedQuery(name = "XHostSummaryByStatementType.findByRowsSent", query = "SELECT x FROM XHostSummaryByStatementType x WHERE x.rowsSent = :rowsSent"),
    @NamedQuery(name = "XHostSummaryByStatementType.findByRowsExamined", query = "SELECT x FROM XHostSummaryByStatementType x WHERE x.rowsExamined = :rowsExamined"),
    @NamedQuery(name = "XHostSummaryByStatementType.findByRowsAffected", query = "SELECT x FROM XHostSummaryByStatementType x WHERE x.rowsAffected = :rowsAffected"),
    @NamedQuery(name = "XHostSummaryByStatementType.findByFullScans", query = "SELECT x FROM XHostSummaryByStatementType x WHERE x.fullScans = :fullScans")})
public class XHostSummaryByStatementType implements Serializable {

    private static final long serialVersionUID = 1L;
    @Column(name = "host")
    private String host;
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

    public XHostSummaryByStatementType() {
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
