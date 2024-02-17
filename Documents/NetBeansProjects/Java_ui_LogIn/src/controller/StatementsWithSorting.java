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
@Table(name = "statements_with_sorting")
@NamedQueries({
    @NamedQuery(name = "StatementsWithSorting.findAll", query = "SELECT s FROM StatementsWithSorting s"),
    @NamedQuery(name = "StatementsWithSorting.findByDb", query = "SELECT s FROM StatementsWithSorting s WHERE s.db = :db"),
    @NamedQuery(name = "StatementsWithSorting.findByExecCount", query = "SELECT s FROM StatementsWithSorting s WHERE s.execCount = :execCount"),
    @NamedQuery(name = "StatementsWithSorting.findByTotalLatency", query = "SELECT s FROM StatementsWithSorting s WHERE s.totalLatency = :totalLatency"),
    @NamedQuery(name = "StatementsWithSorting.findBySortMergePasses", query = "SELECT s FROM StatementsWithSorting s WHERE s.sortMergePasses = :sortMergePasses"),
    @NamedQuery(name = "StatementsWithSorting.findByAvgSortMerges", query = "SELECT s FROM StatementsWithSorting s WHERE s.avgSortMerges = :avgSortMerges"),
    @NamedQuery(name = "StatementsWithSorting.findBySortsUsingScans", query = "SELECT s FROM StatementsWithSorting s WHERE s.sortsUsingScans = :sortsUsingScans"),
    @NamedQuery(name = "StatementsWithSorting.findBySortUsingRange", query = "SELECT s FROM StatementsWithSorting s WHERE s.sortUsingRange = :sortUsingRange"),
    @NamedQuery(name = "StatementsWithSorting.findByRowsSorted", query = "SELECT s FROM StatementsWithSorting s WHERE s.rowsSorted = :rowsSorted"),
    @NamedQuery(name = "StatementsWithSorting.findByAvgRowsSorted", query = "SELECT s FROM StatementsWithSorting s WHERE s.avgRowsSorted = :avgRowsSorted"),
    @NamedQuery(name = "StatementsWithSorting.findByFirstSeen", query = "SELECT s FROM StatementsWithSorting s WHERE s.firstSeen = :firstSeen"),
    @NamedQuery(name = "StatementsWithSorting.findByLastSeen", query = "SELECT s FROM StatementsWithSorting s WHERE s.lastSeen = :lastSeen"),
    @NamedQuery(name = "StatementsWithSorting.findByDigest", query = "SELECT s FROM StatementsWithSorting s WHERE s.digest = :digest")})
public class StatementsWithSorting implements Serializable {

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
    @Column(name = "sort_merge_passes")
    private long sortMergePasses;
    @Basic(optional = false)
    @Column(name = "avg_sort_merges")
    private BigInteger avgSortMerges;
    @Basic(optional = false)
    @Column(name = "sorts_using_scans")
    private long sortsUsingScans;
    @Basic(optional = false)
    @Column(name = "sort_using_range")
    private long sortUsingRange;
    @Basic(optional = false)
    @Column(name = "rows_sorted")
    private long rowsSorted;
    @Basic(optional = false)
    @Column(name = "avg_rows_sorted")
    private BigInteger avgRowsSorted;
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

    public StatementsWithSorting() {
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

    public long getSortMergePasses() {
        return sortMergePasses;
    }

    public void setSortMergePasses(long sortMergePasses) {
        this.sortMergePasses = sortMergePasses;
    }

    public BigInteger getAvgSortMerges() {
        return avgSortMerges;
    }

    public void setAvgSortMerges(BigInteger avgSortMerges) {
        this.avgSortMerges = avgSortMerges;
    }

    public long getSortsUsingScans() {
        return sortsUsingScans;
    }

    public void setSortsUsingScans(long sortsUsingScans) {
        this.sortsUsingScans = sortsUsingScans;
    }

    public long getSortUsingRange() {
        return sortUsingRange;
    }

    public void setSortUsingRange(long sortUsingRange) {
        this.sortUsingRange = sortUsingRange;
    }

    public long getRowsSorted() {
        return rowsSorted;
    }

    public void setRowsSorted(long rowsSorted) {
        this.rowsSorted = rowsSorted;
    }

    public BigInteger getAvgRowsSorted() {
        return avgRowsSorted;
    }

    public void setAvgRowsSorted(BigInteger avgRowsSorted) {
        this.avgRowsSorted = avgRowsSorted;
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
