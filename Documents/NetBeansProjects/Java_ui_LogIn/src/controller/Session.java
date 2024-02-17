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
import javax.persistence.Lob;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author User
 */
@Entity
@Table(name = "session")
@NamedQueries({
    @NamedQuery(name = "Session.findAll", query = "SELECT s FROM Session s"),
    @NamedQuery(name = "Session.findByThdId", query = "SELECT s FROM Session s WHERE s.thdId = :thdId"),
    @NamedQuery(name = "Session.findByConnId", query = "SELECT s FROM Session s WHERE s.connId = :connId"),
    @NamedQuery(name = "Session.findByUser", query = "SELECT s FROM Session s WHERE s.user = :user"),
    @NamedQuery(name = "Session.findByDb", query = "SELECT s FROM Session s WHERE s.db = :db"),
    @NamedQuery(name = "Session.findByCommand", query = "SELECT s FROM Session s WHERE s.command = :command"),
    @NamedQuery(name = "Session.findByState", query = "SELECT s FROM Session s WHERE s.state = :state"),
    @NamedQuery(name = "Session.findByTime", query = "SELECT s FROM Session s WHERE s.time = :time"),
    @NamedQuery(name = "Session.findByExecutionEngine", query = "SELECT s FROM Session s WHERE s.executionEngine = :executionEngine"),
    @NamedQuery(name = "Session.findByStatementLatency", query = "SELECT s FROM Session s WHERE s.statementLatency = :statementLatency"),
    @NamedQuery(name = "Session.findByProgress", query = "SELECT s FROM Session s WHERE s.progress = :progress"),
    @NamedQuery(name = "Session.findByLockLatency", query = "SELECT s FROM Session s WHERE s.lockLatency = :lockLatency"),
    @NamedQuery(name = "Session.findByCpuLatency", query = "SELECT s FROM Session s WHERE s.cpuLatency = :cpuLatency"),
    @NamedQuery(name = "Session.findByRowsExamined", query = "SELECT s FROM Session s WHERE s.rowsExamined = :rowsExamined"),
    @NamedQuery(name = "Session.findByRowsSent", query = "SELECT s FROM Session s WHERE s.rowsSent = :rowsSent"),
    @NamedQuery(name = "Session.findByRowsAffected", query = "SELECT s FROM Session s WHERE s.rowsAffected = :rowsAffected"),
    @NamedQuery(name = "Session.findByTmpTables", query = "SELECT s FROM Session s WHERE s.tmpTables = :tmpTables"),
    @NamedQuery(name = "Session.findByTmpDiskTables", query = "SELECT s FROM Session s WHERE s.tmpDiskTables = :tmpDiskTables"),
    @NamedQuery(name = "Session.findByFullScan", query = "SELECT s FROM Session s WHERE s.fullScan = :fullScan"),
    @NamedQuery(name = "Session.findByLastStatementLatency", query = "SELECT s FROM Session s WHERE s.lastStatementLatency = :lastStatementLatency"),
    @NamedQuery(name = "Session.findByCurrentMemory", query = "SELECT s FROM Session s WHERE s.currentMemory = :currentMemory"),
    @NamedQuery(name = "Session.findByLastWait", query = "SELECT s FROM Session s WHERE s.lastWait = :lastWait"),
    @NamedQuery(name = "Session.findByLastWaitLatency", query = "SELECT s FROM Session s WHERE s.lastWaitLatency = :lastWaitLatency"),
    @NamedQuery(name = "Session.findBySource", query = "SELECT s FROM Session s WHERE s.source = :source"),
    @NamedQuery(name = "Session.findByTrxLatency", query = "SELECT s FROM Session s WHERE s.trxLatency = :trxLatency"),
    @NamedQuery(name = "Session.findByTrxState", query = "SELECT s FROM Session s WHERE s.trxState = :trxState"),
    @NamedQuery(name = "Session.findByTrxAutocommit", query = "SELECT s FROM Session s WHERE s.trxAutocommit = :trxAutocommit"),
    @NamedQuery(name = "Session.findByPid", query = "SELECT s FROM Session s WHERE s.pid = :pid"),
    @NamedQuery(name = "Session.findByProgramName", query = "SELECT s FROM Session s WHERE s.programName = :programName")})
public class Session implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @Column(name = "thd_id")
    private long thdId;
    @Column(name = "conn_id")
    private BigInteger connId;
    @Column(name = "user")
    private String user;
    @Column(name = "db")
    private String db;
    @Column(name = "command")
    private String command;
    @Column(name = "state")
    private String state;
    @Column(name = "time")
    private BigInteger time;
    @Lob
    @Column(name = "current_statement")
    private String currentStatement;
    @Column(name = "execution_engine")
    private String executionEngine;
    @Column(name = "statement_latency")
    private String statementLatency;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "progress")
    private BigDecimal progress;
    @Column(name = "lock_latency")
    private String lockLatency;
    @Column(name = "cpu_latency")
    private String cpuLatency;
    @Column(name = "rows_examined")
    private BigInteger rowsExamined;
    @Column(name = "rows_sent")
    private BigInteger rowsSent;
    @Column(name = "rows_affected")
    private BigInteger rowsAffected;
    @Column(name = "tmp_tables")
    private BigInteger tmpTables;
    @Column(name = "tmp_disk_tables")
    private BigInteger tmpDiskTables;
    @Basic(optional = false)
    @Column(name = "full_scan")
    private String fullScan;
    @Lob
    @Column(name = "last_statement")
    private String lastStatement;
    @Column(name = "last_statement_latency")
    private String lastStatementLatency;
    @Column(name = "current_memory")
    private String currentMemory;
    @Column(name = "last_wait")
    private String lastWait;
    @Column(name = "last_wait_latency")
    private String lastWaitLatency;
    @Column(name = "source")
    private String source;
    @Column(name = "trx_latency")
    private String trxLatency;
    @Column(name = "trx_state")
    private String trxState;
    @Column(name = "trx_autocommit")
    private String trxAutocommit;
    @Column(name = "pid")
    private String pid;
    @Column(name = "program_name")
    private String programName;

    public Session() {
    }

    public long getThdId() {
        return thdId;
    }

    public void setThdId(long thdId) {
        this.thdId = thdId;
    }

    public BigInteger getConnId() {
        return connId;
    }

    public void setConnId(BigInteger connId) {
        this.connId = connId;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getDb() {
        return db;
    }

    public void setDb(String db) {
        this.db = db;
    }

    public String getCommand() {
        return command;
    }

    public void setCommand(String command) {
        this.command = command;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public BigInteger getTime() {
        return time;
    }

    public void setTime(BigInteger time) {
        this.time = time;
    }

    public String getCurrentStatement() {
        return currentStatement;
    }

    public void setCurrentStatement(String currentStatement) {
        this.currentStatement = currentStatement;
    }

    public String getExecutionEngine() {
        return executionEngine;
    }

    public void setExecutionEngine(String executionEngine) {
        this.executionEngine = executionEngine;
    }

    public String getStatementLatency() {
        return statementLatency;
    }

    public void setStatementLatency(String statementLatency) {
        this.statementLatency = statementLatency;
    }

    public BigDecimal getProgress() {
        return progress;
    }

    public void setProgress(BigDecimal progress) {
        this.progress = progress;
    }

    public String getLockLatency() {
        return lockLatency;
    }

    public void setLockLatency(String lockLatency) {
        this.lockLatency = lockLatency;
    }

    public String getCpuLatency() {
        return cpuLatency;
    }

    public void setCpuLatency(String cpuLatency) {
        this.cpuLatency = cpuLatency;
    }

    public BigInteger getRowsExamined() {
        return rowsExamined;
    }

    public void setRowsExamined(BigInteger rowsExamined) {
        this.rowsExamined = rowsExamined;
    }

    public BigInteger getRowsSent() {
        return rowsSent;
    }

    public void setRowsSent(BigInteger rowsSent) {
        this.rowsSent = rowsSent;
    }

    public BigInteger getRowsAffected() {
        return rowsAffected;
    }

    public void setRowsAffected(BigInteger rowsAffected) {
        this.rowsAffected = rowsAffected;
    }

    public BigInteger getTmpTables() {
        return tmpTables;
    }

    public void setTmpTables(BigInteger tmpTables) {
        this.tmpTables = tmpTables;
    }

    public BigInteger getTmpDiskTables() {
        return tmpDiskTables;
    }

    public void setTmpDiskTables(BigInteger tmpDiskTables) {
        this.tmpDiskTables = tmpDiskTables;
    }

    public String getFullScan() {
        return fullScan;
    }

    public void setFullScan(String fullScan) {
        this.fullScan = fullScan;
    }

    public String getLastStatement() {
        return lastStatement;
    }

    public void setLastStatement(String lastStatement) {
        this.lastStatement = lastStatement;
    }

    public String getLastStatementLatency() {
        return lastStatementLatency;
    }

    public void setLastStatementLatency(String lastStatementLatency) {
        this.lastStatementLatency = lastStatementLatency;
    }

    public String getCurrentMemory() {
        return currentMemory;
    }

    public void setCurrentMemory(String currentMemory) {
        this.currentMemory = currentMemory;
    }

    public String getLastWait() {
        return lastWait;
    }

    public void setLastWait(String lastWait) {
        this.lastWait = lastWait;
    }

    public String getLastWaitLatency() {
        return lastWaitLatency;
    }

    public void setLastWaitLatency(String lastWaitLatency) {
        this.lastWaitLatency = lastWaitLatency;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getTrxLatency() {
        return trxLatency;
    }

    public void setTrxLatency(String trxLatency) {
        this.trxLatency = trxLatency;
    }

    public String getTrxState() {
        return trxState;
    }

    public void setTrxState(String trxState) {
        this.trxState = trxState;
    }

    public String getTrxAutocommit() {
        return trxAutocommit;
    }

    public void setTrxAutocommit(String trxAutocommit) {
        this.trxAutocommit = trxAutocommit;
    }

    public String getPid() {
        return pid;
    }

    public void setPid(String pid) {
        this.pid = pid;
    }

    public String getProgramName() {
        return programName;
    }

    public void setProgramName(String programName) {
        this.programName = programName;
    }
    
}
