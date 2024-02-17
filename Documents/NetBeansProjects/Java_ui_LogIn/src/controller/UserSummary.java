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
@Table(name = "user_summary")
@NamedQueries({
    @NamedQuery(name = "UserSummary.findAll", query = "SELECT u FROM UserSummary u"),
    @NamedQuery(name = "UserSummary.findByUser", query = "SELECT u FROM UserSummary u WHERE u.user = :user"),
    @NamedQuery(name = "UserSummary.findByStatements", query = "SELECT u FROM UserSummary u WHERE u.statements = :statements"),
    @NamedQuery(name = "UserSummary.findByStatementLatency", query = "SELECT u FROM UserSummary u WHERE u.statementLatency = :statementLatency"),
    @NamedQuery(name = "UserSummary.findByStatementAvgLatency", query = "SELECT u FROM UserSummary u WHERE u.statementAvgLatency = :statementAvgLatency"),
    @NamedQuery(name = "UserSummary.findByTableScans", query = "SELECT u FROM UserSummary u WHERE u.tableScans = :tableScans"),
    @NamedQuery(name = "UserSummary.findByFileIos", query = "SELECT u FROM UserSummary u WHERE u.fileIos = :fileIos"),
    @NamedQuery(name = "UserSummary.findByFileIoLatency", query = "SELECT u FROM UserSummary u WHERE u.fileIoLatency = :fileIoLatency"),
    @NamedQuery(name = "UserSummary.findByCurrentConnections", query = "SELECT u FROM UserSummary u WHERE u.currentConnections = :currentConnections"),
    @NamedQuery(name = "UserSummary.findByTotalConnections", query = "SELECT u FROM UserSummary u WHERE u.totalConnections = :totalConnections"),
    @NamedQuery(name = "UserSummary.findByUniqueHosts", query = "SELECT u FROM UserSummary u WHERE u.uniqueHosts = :uniqueHosts"),
    @NamedQuery(name = "UserSummary.findByCurrentMemory", query = "SELECT u FROM UserSummary u WHERE u.currentMemory = :currentMemory"),
    @NamedQuery(name = "UserSummary.findByTotalMemoryAllocated", query = "SELECT u FROM UserSummary u WHERE u.totalMemoryAllocated = :totalMemoryAllocated")})
public class UserSummary implements Serializable {

    private static final long serialVersionUID = 1L;
    @Column(name = "user")
    private String user;
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
    @Column(name = "unique_hosts")
    private long uniqueHosts;
    @Column(name = "current_memory")
    private String currentMemory;
    @Column(name = "total_memory_allocated")
    private String totalMemoryAllocated;

    public UserSummary() {
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

    public long getUniqueHosts() {
        return uniqueHosts;
    }

    public void setUniqueHosts(long uniqueHosts) {
        this.uniqueHosts = uniqueHosts;
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
