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
@Table(name = "statements_with_temp_tables")
@NamedQueries({
    @NamedQuery(name = "StatementsWithTempTables.findAll", query = "SELECT s FROM StatementsWithTempTables s"),
    @NamedQuery(name = "StatementsWithTempTables.findByDb", query = "SELECT s FROM StatementsWithTempTables s WHERE s.db = :db"),
    @NamedQuery(name = "StatementsWithTempTables.findByExecCount", query = "SELECT s FROM StatementsWithTempTables s WHERE s.execCount = :execCount"),
    @NamedQuery(name = "StatementsWithTempTables.findByTotalLatency", query = "SELECT s FROM StatementsWithTempTables s WHERE s.totalLatency = :totalLatency"),
    @NamedQuery(name = "StatementsWithTempTables.findByMemoryTmpTables", query = "SELECT s FROM StatementsWithTempTables s WHERE s.memoryTmpTables = :memoryTmpTables"),
    @NamedQuery(name = "StatementsWithTempTables.findByDiskTmpTables", query = "SELECT s FROM StatementsWithTempTables s WHERE s.diskTmpTables = :diskTmpTables"),
    @NamedQuery(name = "StatementsWithTempTables.findByAvgTmpTablesPerQuery", query = "SELECT s FROM StatementsWithTempTables s WHERE s.avgTmpTablesPerQuery = :avgTmpTablesPerQuery"),
    @NamedQuery(name = "StatementsWithTempTables.findByTmpTablesToDiskPct", query = "SELECT s FROM StatementsWithTempTables s WHERE s.tmpTablesToDiskPct = :tmpTablesToDiskPct"),
    @NamedQuery(name = "StatementsWithTempTables.findByFirstSeen", query = "SELECT s FROM StatementsWithTempTables s WHERE s.firstSeen = :firstSeen"),
    @NamedQuery(name = "StatementsWithTempTables.findByLastSeen", query = "SELECT s FROM StatementsWithTempTables s WHERE s.lastSeen = :lastSeen"),
    @NamedQuery(name = "StatementsWithTempTables.findByDigest", query = "SELECT s FROM StatementsWithTempTables s WHERE s.digest = :digest")})
public class StatementsWithTempTables implements Serializable {

    private static final long serialVersionUID = 1L;
    @Lob
    @Column(name = "query")
    private String query;
    @Column(name = "db")
    private String db;
    @Basic(optional = false)
    @Column(name = "exec_count")
    private long execCount;
    @Column(name = "total_latency")
    private String totalLatency;
    @Basic(optional = false)
    @Column(name = "memory_tmp_tables")
    private long memoryTmpTables;
    @Basic(optional = false)
    @Column(name = "disk_tmp_tables")
    private long diskTmpTables;
    @Basic(optional = false)
    @Column(name = "avg_tmp_tables_per_query")
    private BigInteger avgTmpTablesPerQuery;
    @Basic(optional = false)
    @Column(name = "tmp_tables_to_disk_pct")
    private BigInteger tmpTablesToDiskPct;
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

    public StatementsWithTempTables() {
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

    public String getTotalLatency() {
        return totalLatency;
    }

    public void setTotalLatency(String totalLatency) {
        this.totalLatency = totalLatency;
    }

    public long getMemoryTmpTables() {
        return memoryTmpTables;
    }

    public void setMemoryTmpTables(long memoryTmpTables) {
        this.memoryTmpTables = memoryTmpTables;
    }

    public long getDiskTmpTables() {
        return diskTmpTables;
    }

    public void setDiskTmpTables(long diskTmpTables) {
        this.diskTmpTables = diskTmpTables;
    }

    public BigInteger getAvgTmpTablesPerQuery() {
        return avgTmpTablesPerQuery;
    }

    public void setAvgTmpTablesPerQuery(BigInteger avgTmpTablesPerQuery) {
        this.avgTmpTablesPerQuery = avgTmpTablesPerQuery;
    }

    public BigInteger getTmpTablesToDiskPct() {
        return tmpTablesToDiskPct;
    }

    public void setTmpTablesToDiskPct(BigInteger tmpTablesToDiskPct) {
        this.tmpTablesToDiskPct = tmpTablesToDiskPct;
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
