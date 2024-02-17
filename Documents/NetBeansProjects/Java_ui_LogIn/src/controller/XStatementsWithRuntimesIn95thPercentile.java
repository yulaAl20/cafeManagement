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
@Table(name = "x$statements_with_runtimes_in_95th_percentile")
@NamedQueries({
    @NamedQuery(name = "XStatementsWithRuntimesIn95thPercentile.findAll", query = "SELECT x FROM XStatementsWithRuntimesIn95thPercentile x"),
    @NamedQuery(name = "XStatementsWithRuntimesIn95thPercentile.findByDb", query = "SELECT x FROM XStatementsWithRuntimesIn95thPercentile x WHERE x.db = :db"),
    @NamedQuery(name = "XStatementsWithRuntimesIn95thPercentile.findByFullScan", query = "SELECT x FROM XStatementsWithRuntimesIn95thPercentile x WHERE x.fullScan = :fullScan"),
    @NamedQuery(name = "XStatementsWithRuntimesIn95thPercentile.findByExecCount", query = "SELECT x FROM XStatementsWithRuntimesIn95thPercentile x WHERE x.execCount = :execCount"),
    @NamedQuery(name = "XStatementsWithRuntimesIn95thPercentile.findByErrCount", query = "SELECT x FROM XStatementsWithRuntimesIn95thPercentile x WHERE x.errCount = :errCount"),
    @NamedQuery(name = "XStatementsWithRuntimesIn95thPercentile.findByWarnCount", query = "SELECT x FROM XStatementsWithRuntimesIn95thPercentile x WHERE x.warnCount = :warnCount"),
    @NamedQuery(name = "XStatementsWithRuntimesIn95thPercentile.findByTotalLatency", query = "SELECT x FROM XStatementsWithRuntimesIn95thPercentile x WHERE x.totalLatency = :totalLatency"),
    @NamedQuery(name = "XStatementsWithRuntimesIn95thPercentile.findByMaxLatency", query = "SELECT x FROM XStatementsWithRuntimesIn95thPercentile x WHERE x.maxLatency = :maxLatency"),
    @NamedQuery(name = "XStatementsWithRuntimesIn95thPercentile.findByAvgLatency", query = "SELECT x FROM XStatementsWithRuntimesIn95thPercentile x WHERE x.avgLatency = :avgLatency"),
    @NamedQuery(name = "XStatementsWithRuntimesIn95thPercentile.findByRowsSent", query = "SELECT x FROM XStatementsWithRuntimesIn95thPercentile x WHERE x.rowsSent = :rowsSent"),
    @NamedQuery(name = "XStatementsWithRuntimesIn95thPercentile.findByRowsSentAvg", query = "SELECT x FROM XStatementsWithRuntimesIn95thPercentile x WHERE x.rowsSentAvg = :rowsSentAvg"),
    @NamedQuery(name = "XStatementsWithRuntimesIn95thPercentile.findByRowsExamined", query = "SELECT x FROM XStatementsWithRuntimesIn95thPercentile x WHERE x.rowsExamined = :rowsExamined"),
    @NamedQuery(name = "XStatementsWithRuntimesIn95thPercentile.findByRowsExaminedAvg", query = "SELECT x FROM XStatementsWithRuntimesIn95thPercentile x WHERE x.rowsExaminedAvg = :rowsExaminedAvg"),
    @NamedQuery(name = "XStatementsWithRuntimesIn95thPercentile.findByFirstSeen", query = "SELECT x FROM XStatementsWithRuntimesIn95thPercentile x WHERE x.firstSeen = :firstSeen"),
    @NamedQuery(name = "XStatementsWithRuntimesIn95thPercentile.findByLastSeen", query = "SELECT x FROM XStatementsWithRuntimesIn95thPercentile x WHERE x.lastSeen = :lastSeen"),
    @NamedQuery(name = "XStatementsWithRuntimesIn95thPercentile.findByDigest", query = "SELECT x FROM XStatementsWithRuntimesIn95thPercentile x WHERE x.digest = :digest")})
public class XStatementsWithRuntimesIn95thPercentile implements Serializable {

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

    public XStatementsWithRuntimesIn95thPercentile() {
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
