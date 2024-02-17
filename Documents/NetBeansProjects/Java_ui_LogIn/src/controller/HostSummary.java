/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.io.Serializable;
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
@Table(name = "host_summary")
@NamedQueries({
    @NamedQuery(name = "HostSummary.findAll", query = "SELECT h FROM HostSummary h"),
    @NamedQuery(name = "HostSummary.findByHost", query = "SELECT h FROM HostSummary h WHERE h.host = :host"),
    @NamedQuery(name = "HostSummary.findByStatements", query = "SELECT h FROM HostSummary h WHERE h.statements = :statements"),
    @NamedQuery(name = "HostSummary.findByStatementLatency", query = "SELECT h FROM HostSummary h WHERE h.statementLatency = :statementLatency"),
    @NamedQuery(name = "HostSummary.findByStatementAvgLatency", query = "SELECT h FROM HostSummary h WHERE h.statementAvgLatency = :statementAvgLatency"),
    @NamedQuery(name = "HostSummary.findByTableScans", query = "SELECT h FROM HostSummary h WHERE h.tableScans = :tableScans"),
    @NamedQuery(name = "HostSummary.findByFileIos", query = "SELECT h FROM HostSummary h WHERE h.fileIos = :fileIos"),
    @NamedQuery(name = "HostSummary.findByFileIoLatency", query = "SELECT h FROM HostSummary h WHERE h.fileIoLatency = :fileIoLatency"),
    @NamedQuery(name = "HostSummary.findByCurrentConnections", query = "SELECT h FROM HostSummary h WHERE h.currentConnections = :currentConnections"),
    @NamedQuery(name = "HostSummary.findByTotalConnections", query = "SELECT h FROM HostSummary h WHERE h.totalConnections = :totalConnections"),
    @NamedQuery(name = "HostSummary.findByUniqueUsers", query = "SELECT h FROM HostSummary h WHERE h.uniqueUsers = :uniqueUsers"),
    @NamedQuery(name = "HostSummary.findByCurrentMemory", query = "SELECT h FROM HostSummary h WHERE h.currentMemory = :currentMemory"),
    @NamedQuery(name = "HostSummary.findByTotalMemoryAllocated", query = "SELECT h FROM HostSummary h WHERE h.totalMemoryAllocated = :totalMemoryAllocated")})
public class HostSummary implements Serializable {

    private static final long serialVersionUID = 1L;
    @Column(name = "host")
    private String host;
    @Column(name = "statements")
    private BigInteger statements;
    @Column(name = "statement_latency")
    private String statementLatency;
    @Column(name = "statement_avg_latency")
    private String statementAvgLatency;
    @Column(name = "table_scans")
    private BigInteger tableScans;
    @Column(name = "file_ios")
    private BigInteger fileIos;
    @Column(name = "file_io_latency")
    private String fileIoLatency;
    @Column(name = "current_connections")
    private BigInteger currentConnections;
    @Column(name = "total_connections")
    private BigInteger totalConnections;
    @Basic(optional = false)
    @Column(name = "unique_users")
    private long uniqueUsers;
    @Column(name = "current_memory")
    private String currentMemory;
    @Column(name = "total_memory_allocated")
    private String totalMemoryAllocated;

    public HostSummary() {
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

    public String getStatementLatency() {
        return statementLatency;
    }

    public void setStatementLatency(String statementLatency) {
        this.statementLatency = statementLatency;
    }

    public String getStatementAvgLatency() {
        return statementAvgLatency;
    }

    public void setStatementAvgLatency(String statementAvgLatency) {
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

    public String getFileIoLatency() {
        return fileIoLatency;
    }

    public void setFileIoLatency(String fileIoLatency) {
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

    public String getCurrentMemory() {
        return currentMemory;
    }

    public void setCurrentMemory(String currentMemory) {
        this.currentMemory = currentMemory;
    }

    public String getTotalMemoryAllocated() {
        return totalMemoryAllocated;
    }

    public void setTotalMemoryAllocated(String totalMemoryAllocated) {
        this.totalMemoryAllocated = totalMemoryAllocated;
    }
    
}
