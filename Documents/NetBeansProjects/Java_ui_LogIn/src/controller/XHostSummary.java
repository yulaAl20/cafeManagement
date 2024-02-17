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
@Table(name = "x$host_summary")
@NamedQueries({
    @NamedQuery(name = "XHostSummary.findAll", query = "SELECT x FROM XHostSummary x"),
    @NamedQuery(name = "XHostSummary.findByHost", query = "SELECT x FROM XHostSummary x WHERE x.host = :host"),
    @NamedQuery(name = "XHostSummary.findByStatements", query = "SELECT x FROM XHostSummary x WHERE x.statements = :statements"),
    @NamedQuery(name = "XHostSummary.findByStatementLatency", query = "SELECT x FROM XHostSummary x WHERE x.statementLatency = :statementLatency"),
    @NamedQuery(name = "XHostSummary.findByStatementAvgLatency", query = "SELECT x FROM XHostSummary x WHERE x.statementAvgLatency = :statementAvgLatency"),
    @NamedQuery(name = "XHostSummary.findByTableScans", query = "SELECT x FROM XHostSummary x WHERE x.tableScans = :tableScans"),
    @NamedQuery(name = "XHostSummary.findByFileIos", query = "SELECT x FROM XHostSummary x WHERE x.fileIos = :fileIos"),
    @NamedQuery(name = "XHostSummary.findByFileIoLatency", query = "SELECT x FROM XHostSummary x WHERE x.fileIoLatency = :fileIoLatency"),
    @NamedQuery(name = "XHostSummary.findByCurrentConnections", query = "SELECT x FROM XHostSummary x WHERE x.currentConnections = :currentConnections"),
    @NamedQuery(name = "XHostSummary.findByTotalConnections", query = "SELECT x FROM XHostSummary x WHERE x.totalConnections = :totalConnections"),
    @NamedQuery(name = "XHostSummary.findByUniqueUsers", query = "SELECT x FROM XHostSummary x WHERE x.uniqueUsers = :uniqueUsers"),
    @NamedQuery(name = "XHostSummary.findByCurrentMemory", query = "SELECT x FROM XHostSummary x WHERE x.currentMemory = :currentMemory"),
    @NamedQuery(name = "XHostSummary.findByTotalMemoryAllocated", query = "SELECT x FROM XHostSummary x WHERE x.totalMemoryAllocated = :totalMemoryAllocated")})
public class XHostSummary implements Serializable {

    private static final long serialVersionUID = 1L;
    @Column(name = "host")
    private String host;
    @Column(name = "statements")
    private BigInteger statements;
    @Column(name = "statement_latency")
    private BigInteger statementLatency;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
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
    @Column(name = "unique_users")
    private long uniqueUsers;
    @Column(name = "current_memory")
    private BigInteger currentMemory;
    @Column(name = "total_memory_allocated")
    private BigInteger totalMemoryAllocated;

    public XHostSummary() {
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
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

    public long getUniqueUsers() {
        return uniqueUsers;
    }

    public void setUniqueUsers(long uniqueUsers) {
        this.uniqueUsers = uniqueUsers;
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
