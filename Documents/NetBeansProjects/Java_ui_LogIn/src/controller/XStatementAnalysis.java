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
@Table(name = "x$statement_analysis")
@NamedQueries({
    @NamedQuery(name = "XStatementAnalysis.findAll", query = "SELECT x FROM XStatementAnalysis x"),
    @NamedQuery(name = "XStatementAnalysis.findByDb", query = "SELECT x FROM XStatementAnalysis x WHERE x.db = :db"),
    @NamedQuery(name = "XStatementAnalysis.findByFullScan", query = "SELECT x FROM XStatementAnalysis x WHERE x.fullScan = :fullScan"),
    @NamedQuery(name = "XStatementAnalysis.findByExecCount", query = "SELECT x FROM XStatementAnalysis x WHERE x.execCount = :execCount"),
    @NamedQuery(name = "XStatementAnalysis.findByExecSecondaryCount", query = "SELECT x FROM XStatementAnalysis x WHERE x.execSecondaryCount = :execSecondaryCount"),
    @NamedQuery(name = "XStatementAnalysis.findByErrCount", query = "SELECT x FROM XStatementAnalysis x WHERE x.errCount = :errCount"),
    @NamedQuery(name = "XStatementAnalysis.findByWarnCount", query = "SELECT x FROM XStatementAnalysis x WHERE x.warnCount = :warnCount"),
    @NamedQuery(name = "XStatementAnalysis.findByTotalLatency", query = "SELECT x FROM XStatementAnalysis x WHERE x.totalLatency = :totalLatency"),
    @NamedQuery(name = "XStatementAnalysis.findByMaxLatency", query = "SELECT x FROM XStatementAnalysis x WHERE x.maxLatency = :maxLatency"),
    @NamedQuery(name = "XStatementAnalysis.findByAvgLatency", query = "SELECT x FROM XStatementAnalysis x WHERE x.avgLatency = :avgLatency"),
    @NamedQuery(name = "XStatementAnalysis.findByLockLatency", query = "SELECT x FROM XStatementAnalysis x WHERE x.lockLatency = :lockLatency"),
    @NamedQuery(name = "XStatementAnalysis.findByCpuLatency", query = "SELECT x FROM XStatementAnalysis x WHERE x.cpuLatency = :cpuLatency"),
    @NamedQuery(name = "XStatementAnalysis.findByRowsSent", query = "SELECT x FROM XStatementAnalysis x WHERE x.rowsSent = :rowsSent"),
    @NamedQuery(name = "XStatementAnalysis.findByRowsSentAvg", query = "SELECT x FROM XStatementAnalysis x WHERE x.rowsSentAvg = :rowsSentAvg"),
    @NamedQuery(name = "XStatementAnalysis.findByRowsExamined", query = "SELECT x FROM XStatementAnalysis x WHERE x.rowsExamined = :rowsExamined"),
    @NamedQuery(name = "XStatementAnalysis.findByRowsExaminedAvg", query = "SELECT x FROM XStatementAnalysis x WHERE x.rowsExaminedAvg = :rowsExaminedAvg"),
    @NamedQuery(name = "XStatementAnalysis.findByRowsAffected", query = "SELECT x FROM XStatementAnalysis x WHERE x.rowsAffected = :rowsAffected"),
    @NamedQuery(name = "XStatementAnalysis.findByRowsAffectedAvg", query = "SELECT x FROM XStatementAnalysis x WHERE x.rowsAffectedAvg = :rowsAffectedAvg"),
    @NamedQuery(name = "XStatementAnalysis.findByTmpTables", query = "SELECT x FROM XStatementAnalysis x WHERE x.tmpTables = :tmpTables"),
    @NamedQuery(name = "XStatementAnalysis.findByTmpDiskTables", query = "SELECT x FROM XStatementAnalysis x WHERE x.tmpDiskTables = :tmpDiskTables"),
    @NamedQuery(name = "XStatementAnalysis.findByRowsSorted", query = "SELECT x FROM XStatementAnalysis x WHERE x.rowsSorted = :rowsSorted"),
    @NamedQuery(name = "XStatementAnalysis.findBySortMergePasses", query = "SELECT x FROM XStatementAnalysis x WHERE x.sortMergePasses = :sortMergePasses"),
    @NamedQuery(name = "XStatementAnalysis.findByMaxControlledMemory", query = "SELECT x FROM XStatementAnalysis x WHERE x.maxControlledMemory = :maxControlledMemory"),
    @NamedQuery(name = "XStatementAnalysis.findByMaxTotalMemory", query = "SELECT x FROM XStatementAnalysis x WHERE x.maxTotalMemory = :maxTotalMemory"),
    @NamedQuery(name = "XStatementAnalysis.findByDigest", query = "SELECT x FROM XStatementAnalysis x WHERE x.digest = :digest"),
    @NamedQuery(name = "XStatementAnalysis.findByFirstSeen", query = "SELECT x FROM XStatementAnalysis x WHERE x.firstSeen = :firstSeen"),
    @NamedQuery(name = "XStatementAnalysis.findByLastSeen", query = "SELECT x FROM XStatementAnalysis x WHERE x.lastSeen = :lastSeen")})
public class XStatementAnalysis implements Serializable {

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
    @Column(name = "exec_secondary_count")
    private long execSecondaryCount;
    @Basic(optional = false)
    @Column(name = "err_count")
    private long errCount;
    @Basic(optional = false)
    @Column(name = "warn_count")
    private long warnCount;
    @Basic(optional = false)
    @Column(name = "total_latency")
    private long totalLatency;
    @Basic(optional = false)
    @Column(name = "max_latency")
    private long maxLatency;
    @Basic(optional = false)
    @Column(name = "avg_latency")
    private long avgLatency;
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
    @Basic(optional = false)
    @Column(name = "max_controlled_memory")
    private long maxControlledMemory;
    @Basic(optional = false)
    @Column(name = "max_total_memory")
    private long maxTotalMemory;
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

    public XStatementAnalysis() {
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

    public long getExecSecondaryCount() {
        return execSecondaryCount;
    }

    public void setExecSecondaryCount(long execSecondaryCount) {
        this.execSecondaryCount = execSecondaryCount;
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

    public long getAvgLatency() {
        return avgLatency;
    }

    public void setAvgLatency(long avgLatency) {
        this.avgLatency = avgLatency;
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

    public long getMaxControlledMemory() {
        return maxControlledMemory;
    }

    public void setMaxControlledMemory(long maxControlledMemory) {
        this.maxControlledMemory = maxControlledMemory;
    }

    public long getMaxTotalMemory() {
        return maxTotalMemory;
    }

    public void setMaxTotalMemory(long maxTotalMemory) {
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
