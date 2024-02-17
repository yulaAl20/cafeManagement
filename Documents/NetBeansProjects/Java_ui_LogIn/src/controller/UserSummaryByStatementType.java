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
@Table(name = "user_summary_by_statement_type")
@NamedQueries({
    @NamedQuery(name = "UserSummaryByStatementType.findAll", query = "SELECT u FROM UserSummaryByStatementType u"),
    @NamedQuery(name = "UserSummaryByStatementType.findByUser", query = "SELECT u FROM UserSummaryByStatementType u WHERE u.user = :user"),
    @NamedQuery(name = "UserSummaryByStatementType.findByStatement", query = "SELECT u FROM UserSummaryByStatementType u WHERE u.statement = :statement"),
    @NamedQuery(name = "UserSummaryByStatementType.findByTotal", query = "SELECT u FROM UserSummaryByStatementType u WHERE u.total = :total"),
    @NamedQuery(name = "UserSummaryByStatementType.findByTotalLatency", query = "SELECT u FROM UserSummaryByStatementType u WHERE u.totalLatency = :totalLatency"),
    @NamedQuery(name = "UserSummaryByStatementType.findByMaxLatency", query = "SELECT u FROM UserSummaryByStatementType u WHERE u.maxLatency = :maxLatency"),
    @NamedQuery(name = "UserSummaryByStatementType.findByLockLatency", query = "SELECT u FROM UserSummaryByStatementType u WHERE u.lockLatency = :lockLatency"),
    @NamedQuery(name = "UserSummaryByStatementType.findByCpuLatency", query = "SELECT u FROM UserSummaryByStatementType u WHERE u.cpuLatency = :cpuLatency"),
    @NamedQuery(name = "UserSummaryByStatementType.findByRowsSent", query = "SELECT u FROM UserSummaryByStatementType u WHERE u.rowsSent = :rowsSent"),
    @NamedQuery(name = "UserSummaryByStatementType.findByRowsExamined", query = "SELECT u FROM UserSummaryByStatementType u WHERE u.rowsExamined = :rowsExamined"),
    @NamedQuery(name = "UserSummaryByStatementType.findByRowsAffected", query = "SELECT u FROM UserSummaryByStatementType u WHERE u.rowsAffected = :rowsAffected"),
    @NamedQuery(name = "UserSummaryByStatementType.findByFullScans", query = "SELECT u FROM UserSummaryByStatementType u WHERE u.fullScans = :fullScans")})
public class UserSummaryByStatementType implements Serializable {

    private static final long serialVersionUID = 1L;
    @Column(name = "user")
    private String user;
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

    public UserSummaryByStatementType() {
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
