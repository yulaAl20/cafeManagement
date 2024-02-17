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
@Table(name = "x$statements_with_full_table_scans")
@NamedQueries({
    @NamedQuery(name = "XStatementsWithFullTableScans.findAll", query = "SELECT x FROM XStatementsWithFullTableScans x"),
    @NamedQuery(name = "XStatementsWithFullTableScans.findByDb", query = "SELECT x FROM XStatementsWithFullTableScans x WHERE x.db = :db"),
    @NamedQuery(name = "XStatementsWithFullTableScans.findByExecCount", query = "SELECT x FROM XStatementsWithFullTableScans x WHERE x.execCount = :execCount"),
    @NamedQuery(name = "XStatementsWithFullTableScans.findByTotalLatency", query = "SELECT x FROM XStatementsWithFullTableScans x WHERE x.totalLatency = :totalLatency"),
    @NamedQuery(name = "XStatementsWithFullTableScans.findByNoIndexUsedCount", query = "SELECT x FROM XStatementsWithFullTableScans x WHERE x.noIndexUsedCount = :noIndexUsedCount"),
    @NamedQuery(name = "XStatementsWithFullTableScans.findByNoGoodIndexUsedCount", query = "SELECT x FROM XStatementsWithFullTableScans x WHERE x.noGoodIndexUsedCount = :noGoodIndexUsedCount"),
    @NamedQuery(name = "XStatementsWithFullTableScans.findByNoIndexUsedPct", query = "SELECT x FROM XStatementsWithFullTableScans x WHERE x.noIndexUsedPct = :noIndexUsedPct"),
    @NamedQuery(name = "XStatementsWithFullTableScans.findByRowsSent", query = "SELECT x FROM XStatementsWithFullTableScans x WHERE x.rowsSent = :rowsSent"),
    @NamedQuery(name = "XStatementsWithFullTableScans.findByRowsExamined", query = "SELECT x FROM XStatementsWithFullTableScans x WHERE x.rowsExamined = :rowsExamined"),
    @NamedQuery(name = "XStatementsWithFullTableScans.findByRowsSentAvg", query = "SELECT x FROM XStatementsWithFullTableScans x WHERE x.rowsSentAvg = :rowsSentAvg"),
    @NamedQuery(name = "XStatementsWithFullTableScans.findByRowsExaminedAvg", query = "SELECT x FROM XStatementsWithFullTableScans x WHERE x.rowsExaminedAvg = :rowsExaminedAvg"),
    @NamedQuery(name = "XStatementsWithFullTableScans.findByFirstSeen", query = "SELECT x FROM XStatementsWithFullTableScans x WHERE x.firstSeen = :firstSeen"),
    @NamedQuery(name = "XStatementsWithFullTableScans.findByLastSeen", query = "SELECT x FROM XStatementsWithFullTableScans x WHERE x.lastSeen = :lastSeen"),
    @NamedQuery(name = "XStatementsWithFullTableScans.findByDigest", query = "SELECT x FROM XStatementsWithFullTableScans x WHERE x.digest = :digest")})
public class XStatementsWithFullTableScans implements Serializable {

    private static final long serialVersionUID = 1L;
    @Lob
    @Column(name = "query")
    private String query;
    @Column(name = "db")
    private String db;
    @Basic(optional = false)
    @Column(name = "exec_count")
    private long execCount;
    @Basic(optional = false)
    @Column(name = "total_latency")
    private long totalLatency;
    @Basic(optional = false)
    @Column(name = "no_index_used_count")
    private long noIndexUsedCount;
    @Basic(optional = false)
    @Column(name = "no_good_index_used_count")
    private long noGoodIndexUsedCount;
    @Basic(optional = false)
    @Column(name = "no_index_used_pct")
    private BigInteger noIndexUsedPct;
    @Basic(optional = false)
    @Column(name = "rows_sent")
    private long rowsSent;
    @Basic(optional = false)
    @Column(name = "rows_examined")
    private long rowsExamined;
    @Column(name = "rows_sent_avg")
    private BigInteger rowsSentAvg;
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

    public XStatementsWithFullTableScans() {
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

    public long getExecCount() {
        return execCount;
    }

    public void setExecCount(long execCount) {
        this.execCount = execCount;
    }

    public long getTotalLatency() {
        return totalLatency;
    }

    public void setTotalLatency(long totalLatency) {
        this.totalLatency = totalLatency;
    }

    public long getNoIndexUsedCount() {
        return noIndexUsedCount;
    }

    public void setNoIndexUsedCount(long noIndexUsedCount) {
        this.noIndexUsedCount = noIndexUsedCount;
    }

    public long getNoGoodIndexUsedCount() {
        return noGoodIndexUsedCount;
    }

    public void setNoGoodIndexUsedCount(long noGoodIndexUsedCount) {
        this.noGoodIndexUsedCount = noGoodIndexUsedCount;
    }

    public BigInteger getNoIndexUsedPct() {
        return noIndexUsedPct;
    }

    public void setNoIndexUsedPct(BigInteger noIndexUsedPct) {
        this.noIndexUsedPct = noIndexUsedPct;
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

    public BigInteger getRowsSentAvg() {
        return rowsSentAvg;
    }

    public void setRowsSentAvg(BigInteger rowsSentAvg) {
        this.rowsSentAvg = rowsSentAvg;
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
