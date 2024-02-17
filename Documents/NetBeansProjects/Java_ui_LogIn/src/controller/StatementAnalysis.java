/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Lob;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author User
 */
@Entity
@Table(name = "statement_analysis")
@NamedQueries({
    @NamedQuery(name = "StatementAnalysis.findAll", query = "SELECT s FROM StatementAnalysis s"),
    @NamedQuery(name = "StatementAnalysis.findByDb", query = "SELECT s FROM StatementAnalysis s WHERE s.db = :db"),
    @NamedQuery(name = "StatementAnalysis.findByFullScan", query = "SELECT s FROM StatementAnalysis s WHERE s.fullScan = :fullScan"),
    @NamedQuery(name = "StatementAnalysis.findByExecCount", query = "SELECT s FROM StatementAnalysis s WHERE s.execCount = :execCount"),
    @NamedQuery(name = "StatementAnalysis.findByErrCount", query = "SELECT s FROM StatementAnalysis s WHERE s.errCount = :errCount"),
    @NamedQuery(name = "StatementAnalysis.findByWarnCount", query = "SELECT s FROM StatementAnalysis s WHERE s.warnCount = :warnCount"),
    @NamedQuery(name = "StatementAnalysis.findByTotalLatency", query = "SELECT s FROM StatementAnalysis s WHERE s.totalLatency = :totalLatency"),
    @NamedQuery(name = "StatementAnalysis.findByMaxLatency", query = "SELECT s FROM StatementAnalysis s WHERE s.maxLatency = :maxLatency"),
    @NamedQuery(name = "StatementAnalysis.findByAvgLatency", query = "SELECT s FROM StatementAnalysis s WHERE s.avgLatency = :avgLatency"),
    @NamedQuery(name = "StatementAnalysis.findByLockLatency", query = "SELECT s FROM StatementAnalysis s WHERE s.lockLatency = :lockLatency"),
    @NamedQuery(name = "StatementAnalysis.findByCpuLatency", query = "SELECT s FROM StatementAnalysis s WHERE s.cpuLatency = :cpuLatency"),
    @NamedQuery(name = "StatementAnalysis.findByRowsSent", query = "SELECT s FROM StatementAnalysis s WHERE s.rowsSent = :rowsSent"),
    @NamedQuery(name = "StatementAnalysis.findByRowsSentAvg", query = "SELECT s FROM StatementAnalysis s WHERE s.rowsSentAvg = :rowsSentAvg"),
    @NamedQuery(name = "StatementAnalysis.findByRowsExamined", query = "SELECT s FROM StatementAnalysis s WHERE s.rowsExamined = :rowsExamined"),
    @NamedQuery(name = "StatementAnalysis.findByRowsExaminedAvg", query = "SELECT s FROM StatementAnalysis s WHERE s.rowsExaminedAvg = :rowsExaminedAvg"),
    @NamedQuery(name = "StatementAnalysis.findByRowsAffected", query = "SELECT s FROM StatementAnalysis s WHERE s.rowsAffected = :rowsAffected"),
    @NamedQuery(name = "StatementAnalysis.findByRowsAffectedAvg", query = "SELECT s FROM StatementAnalysis s WHERE s.rowsAffectedAvg = :rowsAffectedAvg"),
    @NamedQuery(name = "StatementAnalysis.findByTmpTables", query = "SELECT s FROM StatementAnalysis s WHERE s.tmpTables = :tmpTables"),
    @NamedQuery(name = "StatementAnalysis.findByTmpDiskTables", query = "SELECT s FROM StatementAnalysis s WHERE s.tmpDiskTables = :tmpDiskTables"),
    @NamedQuery(name = "StatementAnalysis.findByRowsSorted", query = "SELECT s FROM StatementAnalysis s WHERE s.rowsSorted = :rowsSorted"),
    @NamedQuery(name = "StatementAnalysis.findBySortMergePasses", query = "SELECT s FROM StatementAnalysis s WHERE s.sortMergePasses = :sortMergePasses"),
    @NamedQuery(name = "StatementAnalysis.findByMaxControlledMemory", query = "SELECT s FROM StatementAnalysis s WHERE s.maxControlledMemory = :maxControlledMemory"),
    @NamedQuery(name = "StatementAnalysis.findByMaxTotalMemory", query = "SELECT s FROM StatementAnalysis s WHERE s.maxTotalMemory = :maxTotalMemory"),
    @NamedQuery(name = "StatementAnalysis.findByDigest", query = "SELECT s FROM StatementAnalysis s WHERE s.digest = :digest"),
    @NamedQuery(name = "StatementAnalysis.findByFirstSeen", query = "SELECT s FROM StatementAnalysis s WHERE s.firstSeen = :firstSeen"),
    @NamedQuery(name = "StatementAnalysis.findByLastSeen", query = "SELECT s FROM StatementAnalysis s WHERE s.lastSeen = :lastSeen")})
public class StatementAnalysis implements Serializable {

    private static final long serialVersionUID = 1L;
    @Lob
    @Column(name = "query")
    private String query;
    @Column(name = "db")
    private String db;
    @Basic(optional = false)
    @Column(name = "full_scan")
    private String fullScan;
    @Basic(optional = false)
    @Column(name = "exec_count")
    private long execCount;
    @Basic(optional = false)
    @Column(name = "err_count")
    private long errCount;
    @Basic(optional = false)
    @Column(name = "warn_count")
    private long warnCount;
    @Column(name = "total_latency")
    private String totalLatency;
    @Column(name = "max_latency")
    private String maxLatency;
    @Column(name = "avg_latency")
    private String avgLatency;
    @Column(name = "lock_latency")
    private String lockLatency;
    @Column(name = "cpu_latency")
    private String cpuLatency;
    @Basic(optional = false)
    @Column(name = "rows_sent")
    private long rowsSent;
    @Basic(optional = false)
    @Column(name = "rows_sent_avg")
    private BigInteger rowsSentAvg;
    @Basic(optional = false)
    @Column(name = "rows_examined")
    private long rowsExamined;
    @Basic(optional = false)
    @Column(name = "rows_examined_avg")
    private BigInteger rowsExaminedAvg;
    @Basic(optional = false)
    @Column(name = "rows_affected")
    private long rowsAffected;
    @Basic(optional = false)
    @Column(name = "rows_affected_avg")
    private BigInteger rowsAffectedAvg;
    @Basic(optional = false)
    @Column(name = "tmp_tables")
    private long tmpTables;
    @Basic(optional = false)
    @Column(name = "tmp_disk_tables")
    private long tmpDiskTables;
    @Basic(optional = false)
    @Column(name = "rows_sorted")
    private long rowsSorted;
    @Basic(optional = false)
    @Column(name = "sort_merge_passes")
    private long sortMergePasses;
    @Column(name = "max_controlled_memory")
    private String maxControlledMemory;
    @Column(name = "max_total_memory")
    private String maxTotalMemory;
    @Column(name = "digest")
    private String digest;
    @Basic(optional = false)
    @Column(name = "first_seen")
    @Temporal(TemporalType.TIMESTAMP)
    private Date firstSeen;
    @Basic(optional = false)
    @Column(name = "last_seen")
    @Temporal(TemporalType.TIMESTAMP)
    private Date lastSeen;

    public StatementAnalysis() {
    }

    public String getQuery() {
        return query;
    }

    public void setQuery(String query) {
        this.query = query;
    }

    public String getDb() {
        return db;
    }

    public void setDb(String db) {
        this.db = db;
    }

    public String getFullScan() {
        return fullScan;
    }

    public void setFullScan(String fullScan) {
        this.fullScan = fullScan;
    }

    public long getExecCount() {
        return execCount;
    }

    public void setExecCount(long execCount) {
        this.execCount = execCount;
    }

    public long getErrCount() {
        return errCount;
    }

    public void setErrCount(long errCount) {
        this.errCount = errCount;
    }

    public long getWarnCount() {
        return warnCount;
    }

    public void setWarnCount(long warnCount) {
        this.warnCount = warnCount;
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

    public String getAvgLatency() {
        return avgLatency;
    }

    public void setAvgLatency(String avgLatency) {
        this.avgLatency = avgLatency;
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

    public BigInteger getRowsSentAvg() {
        return rowsSentAvg;
    }

    public void setRowsSentAvg(BigInteger rowsSentAvg) {
        this.rowsSentAvg = rowsSentAvg;
    }

    public long getRowsExamined() {
        return rowsExamined;
    }

    public void setRowsExamined(long rowsExamined) {
        this.rowsExamined = rowsExamined;
    }

    public BigInteger getRowsExaminedAvg() {
        return rowsExaminedAvg;
    }

    public void setRowsExaminedAvg(BigInteger rowsExaminedAvg) {
        this.rowsExaminedAvg = rowsExaminedAvg;
    }

    public long getRowsAffected() {
        return rowsAffected;
    }

    public void setRowsAffected(long rowsAffected) {
        this.rowsAffected = rowsAffected;
    }

    public BigInteger getRowsAffectedAvg() {
        return rowsAffectedAvg;
    }

    public void setRowsAffectedAvg(BigInteger rowsAffectedAvg) {
        this.rowsAffectedAvg = rowsAffectedAvg;
    }

    public long getTmpTables() {
        return tmpTables;
    }

    public void setTmpTables(long tmpTables) {
        this.tmpTables = tmpTables;
    }

    public long getTmpDiskTables() {
        return tmpDiskTables;
    }

    public void setTmpDiskTables(long tmpDiskTables) {
        this.tmpDiskTables = tmpDiskTables;
    }

    public long getRowsSorted() {
        return rowsSorted;
    }

    public void setRowsSorted(long rowsSorted) {
        this.rowsSorted = rowsSorted;
    }

    public long getSortMergePasses() {
        return sortMergePasses;
    }

    public void setSortMergePasses(long sortMergePasses) {
        this.sortMergePasses = sortMergePasses;
    }

    public String getMaxControlledMemory() {
        return maxControlledMemory;
    }

    public void setMaxControlledMemory(String maxControlledMemory) {
        this.maxControlledMemory = maxControlledMemory;
    }

    public String getMaxTotalMemory() {
        return maxTotalMemory;
    }

    public void setMaxTotalMemory(String maxTotalMemory) {
        this.maxTotalMemory = maxTotalMemory;
    }

    public String getDigest() {
        return digest;
    }

    public void setDigest(String digest) {
        this.digest = digest;
    }

    public Date getFirstSeen() {
        return firstSeen;
    }

    public void setFirstSeen(Date firstSeen) {
        this.firstSeen = firstSeen;
    }

    public Date getLastSeen() {
        return lastSeen;
    }

    public void setLastSeen(Date lastSeen) {
        this.lastSeen = lastSeen;
    }
    
}
