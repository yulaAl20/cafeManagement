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
@Table(name = "x$statements_with_temp_tables")
@NamedQueries({
    @NamedQuery(name = "XStatementsWithTempTables.findAll", query = "SELECT x FROM XStatementsWithTempTables x"),
    @NamedQuery(name = "XStatementsWithTempTables.findByDb", query = "SELECT x FROM XStatementsWithTempTables x WHERE x.db = :db"),
    @NamedQuery(name = "XStatementsWithTempTables.findByExecCount", query = "SELECT x FROM XStatementsWithTempTables x WHERE x.execCount = :execCount"),
    @NamedQuery(name = "XStatementsWithTempTables.findByTotalLatency", query = "SELECT x FROM XStatementsWithTempTables x WHERE x.totalLatency = :totalLatency"),
    @NamedQuery(name = "XStatementsWithTempTables.findByMemoryTmpTables", query = "SELECT x FROM XStatementsWithTempTables x WHERE x.memoryTmpTables = :memoryTmpTables"),
    @NamedQuery(name = "XStatementsWithTempTables.findByDiskTmpTables", query = "SELECT x FROM XStatementsWithTempTables x WHERE x.diskTmpTables = :diskTmpTables"),
    @NamedQuery(name = "XStatementsWithTempTables.findByAvgTmpTablesPerQuery", query = "SELECT x FROM XStatementsWithTempTables x WHERE x.avgTmpTablesPerQuery = :avgTmpTablesPerQuery"),
    @NamedQuery(name = "XStatementsWithTempTables.findByTmpTablesToDiskPct", query = "SELECT x FROM XStatementsWithTempTables x WHERE x.tmpTablesToDiskPct = :tmpTablesToDiskPct"),
    @NamedQuery(name = "XStatementsWithTempTables.findByFirstSeen", query = "SELECT x FROM XStatementsWithTempTables x WHERE x.firstSeen = :firstSeen"),
    @NamedQuery(name = "XStatementsWithTempTables.findByLastSeen", query = "SELECT x FROM XStatementsWithTempTables x WHERE x.lastSeen = :lastSeen"),
    @NamedQuery(name = "XStatementsWithTempTables.findByDigest", query = "SELECT x FROM XStatementsWithTempTables x WHERE x.digest = :digest")})
public class XStatementsWithTempTables implements Serializable {

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

    public XStatementsWithTempTables() {
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
