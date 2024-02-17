/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
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
@Table(name = "x$user_summary")
@NamedQueries({
    @NamedQuery(name = "XUserSummary.findAll", query = "SELECT x FROM XUserSummary x"),
    @NamedQuery(name = "XUserSummary.findByUser", query = "SELECT x FROM XUserSummary x WHERE x.user = :user"),
    @NamedQuery(name = "XUserSummary.findByStatements", query = "SELECT x FROM XUserSummary x WHERE x.statements = :statements"),
    @NamedQuery(name = "XUserSummary.findByStatementLatency", query = "SELECT x FROM XUserSummary x WHERE x.statementLatency = :statementLatency"),
    @NamedQuery(name = "XUserSummary.findByStatementAvgLatency", query = "SELECT x FROM XUserSummary x WHERE x.statementAvgLatency = :statementAvgLatency"),
    @NamedQuery(name = "XUserSummary.findByTableScans", query = "SELECT x FROM XUserSummary x WHERE x.tableScans = :tableScans"),
    @NamedQuery(name = "XUserSummary.findByFileIos", query = "SELECT x FROM XUserSummary x WHERE x.fileIos = :fileIos"),
    @NamedQuery(name = "XUserSummary.findByFileIoLatency", query = "SELECT x FROM XUserSummary x WHERE x.fileIoLatency = :fileIoLatency"),
    @NamedQuery(name = "XUserSummary.findByCurrentConnections", query = "SELECT x FROM XUserSummary x WHERE x.currentConnections = :currentConnections"),
    @NamedQuery(name = "XUserSummary.findByTotalConnections", query = "SELECT x FROM XUserSummary x WHERE x.totalConnections = :totalConnections"),
    @NamedQuery(name = "XUserSummary.findByUniqueHosts", query = "SELECT x FROM XUserSummary x WHERE x.uniqueHosts = :uniqueHosts"),
    @NamedQuery(name = "XUserSummary.findByCurrentMemory", query = "SELECT x FROM XUserSummary x WHERE x.currentMemory = :currentMemory"),
    @NamedQuery(name = "XUserSummary.findByTotalMemoryAllocated", query = "SELECT x FROM XUserSummary x WHERE x.totalMemoryAllocated = :totalMemoryAllocated")})
public class XUserSummary implements Serializable {

    private static final long serialVersionUID = 1L;
    @Column(name = "user")
    private String user;
    @Column(name = "statements")
    private BigInteger statements;
    @Column(name = "statement_latency")
    private BigInteger statementLatency;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @Column(name = "statement_avg_latency")
    private BigDecimal statementAvgLatency;
    @Column(name = "table_scans")
    private BigInteger tableScans;
    @Column(name = "file_ios")
    private BigInteger fileIos;
    @Column(name = "file_io_latency")
    private BigInteger fileIoLatency;
    @Column(name = "current_connections")
    private BigInteger currentConnections;
    @Column(name = "total_connections")
    private BigInteger totalConnections;
    @Basic(optional = false)
    @Column(name = "unique_hosts")
    private long uniqueHosts;
    @Column(name = "current_memory")
    private BigInteger currentMemory;
    @Column(name = "total_memory_allocated")
    private BigInteger totalMemoryAllocated;

    public XUserSummary() {
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public BigInteger getStatements() {
        return statements;
    }

    public void setStatements(BigInteger statements) {
        this.statements = statements;
    }

    public BigInteger getStatementLatency() {
        return statementLatency;
    }

    public void setStatementLatency(BigInteger statementLatency) {
        this.statementLatency = statementLatency;
    }

    public BigDecimal getStatementAvgLatency() {
        return statementAvgLatency;
    }

    public void setStatementAvgLatency(BigDecimal statementAvgLatency) {
        this.statementAvgLatency = statementAvgLatency;
    }

    public BigInteger getTableScans() {
        return tableScans;
    }

    public void setTableScans(BigInteger tableScans) {
        this.tableScans = tableScans;
    }

    public BigInteger getFileIos() {
        return fileIos;
    }

    public void setFileIos(BigInteger fileIos) {
        this.fileIos = fileIos;
    }

    public BigInteger getFileIoLatency() {
        return fileIoLatency;
    }

    public void setFileIoLatency(BigInteger fileIoLatency) {
        this.fileIoLatency = fileIoLatency;
    }

    public BigInteger getCurrentConnections() {
        return currentConnections;
    }

    public void setCurrentConnections(BigInteger currentConnections) {
        this.currentConnections = currentConnections;
    }

    public BigInteger getTotalConnections() {
        return totalConnections;
    }

    public void setTotalConnections(BigInteger totalConnections) {
        this.totalConnections = totalConnections;
    }

    public long getUniqueHosts() {
        return uniqueHosts;
    }

    public void setUniqueHosts(long uniqueHosts) {
        this.uniqueHosts = uniqueHosts;
    }

    public BigInteger getCurrentMemory() {
        return currentMemory;
    }

    public void setCurrentMemory(BigInteger currentMemory) {
        this.currentMemory = currentMemory;
    }

    public BigInteger getTotalMemoryAllocated() {
        return totalMemoryAllocated;
    }

    public void setTotalMemoryAllocated(BigInteger totalMemoryAllocated) {
        this.totalMemoryAllocated = totalMemoryAllocated;
    }
    
}
