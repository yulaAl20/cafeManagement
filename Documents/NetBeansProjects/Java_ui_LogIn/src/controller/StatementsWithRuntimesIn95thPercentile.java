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
@Table(name = "statements_with_runtimes_in_95th_percentile")
@NamedQueries({
    @NamedQuery(name = "StatementsWithRuntimesIn95thPercentile.findAll", query = "SELECT s FROM StatementsWithRuntimesIn95thPercentile s"),
    @NamedQuery(name = "StatementsWithRuntimesIn95thPercentile.findByDb", query = "SELECT s FROM StatementsWithRuntimesIn95thPercentile s WHERE s.db = :db"),
    @NamedQuery(name = "StatementsWithRuntimesIn95thPercentile.findByFullScan", query = "SELECT s FROM StatementsWithRuntimesIn95thPercentile s WHERE s.fullScan = :fullScan"),
    @NamedQuery(name = "StatementsWithRuntimesIn95thPercentile.findByExecCount", query = "SELECT s FROM StatementsWithRuntimesIn95thPercentile s WHERE s.execCount = :execCount"),
    @NamedQuery(name = "StatementsWithRuntimesIn95thPercentile.findByErrCount", query = "SELECT s FROM StatementsWithRuntimesIn95thPercentile s WHERE s.errCount = :errCount"),
    @NamedQuery(name = "StatementsWithRuntimesIn95thPercentile.findByWarnCount", query = "SELECT s FROM StatementsWithRuntimesIn95thPercentile s WHERE s.warnCount = :warnCount"),
    @NamedQuery(name = "StatementsWithRuntimesIn95thPercentile.findByTotalLatency", query = "SELECT s FROM StatementsWithRuntimesIn95thPercentile s WHERE s.totalLatency = :totalLatency"),
    @NamedQuery(name = "StatementsWithRuntimesIn95thPercentile.findByMaxLatency", query = "SELECT s FROM StatementsWithRuntimesIn95thPercentile s WHERE s.maxLatency = :maxLatency"),
    @NamedQuery(name = "StatementsWithRuntimesIn95thPercentile.findByAvgLatency", query = "SELECT s FROM StatementsWithRuntimesIn95thPercentile s WHERE s.avgLatency = :avgLatency"),
    @NamedQuery(name = "StatementsWithRuntimesIn95thPercentile.findByRowsSent", query = "SELECT s FROM StatementsWithRuntimesIn95thPercentile s WHERE s.rowsSent = :rowsSent"),
    @NamedQuery(name = "StatementsWithRuntimesIn95thPercentile.findByRowsSentAvg", query = "SELECT s FROM StatementsWithRuntimesIn95thPercentile s WHERE s.rowsSentAvg = :rowsSentAvg"),
    @NamedQuery(name = "StatementsWithRuntimesIn95thPercentile.findByRowsExamined", query = "SELECT s FROM StatementsWithRuntimesIn95thPercentile s WHERE s.rowsExamined = :rowsExamined"),
    @NamedQuery(name = "StatementsWithRuntimesIn95thPercentile.findByRowsExaminedAvg", query = "SELECT s FROM StatementsWithRuntimesIn95thPercentile s WHERE s.rowsExaminedAvg = :rowsExaminedAvg"),
    @NamedQuery(name = "StatementsWithRuntimesIn95thPercentile.findByFirstSeen", query = "SELECT s FROM StatementsWithRuntimesIn95thPercentile s WHERE s.firstSeen = :firstSeen"),
    @NamedQuery(name = "StatementsWithRuntimesIn95thPercentile.findByLastSeen", query = "SELECT s FROM StatementsWithRuntimesIn95thPercentile s WHERE s.lastSeen = :lastSeen"),
    @NamedQuery(name = "StatementsWithRuntimesIn95thPercentile.findByDigest", query = "SELECT s FROM StatementsWithRuntimesIn95thPercentile s WHERE s.digest = :digest")})
public class StatementsWithRuntimesIn95thPercentile implements Serializable {

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
    @Column(name = "first_seen")
    @Temporal(TemporalType.TIMESTAMP)
    private Date firstSeen;
    @Basic(optional = false)
    @Column(name = "last_seen")
    @Temporal(TemporalType.TIMESTAMP)
    private Date lastSeen;
    @Column(name = "digest")
    private String digest;

    public StatementsWithRuntimesIn95thPercentile() {
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

    public String getDigest() {
        return digest;
    }

    public void setDigest(String digest) {
        this.digest = digest;
    }
    
}
