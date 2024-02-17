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
@Table(name = "x$session")
@NamedQueries({
    @NamedQuery(name = "XSession.findAll", query = "SELECT x FROM XSession x"),
    @NamedQuery(name = "XSession.findByThdId", query = "SELECT x FROM XSession x WHERE x.thdId = :thdId"),
    @NamedQuery(name = "XSession.findByConnId", query = "SELECT x FROM XSession x WHERE x.connId = :connId"),
    @NamedQuery(name = "XSession.findByUser", query = "SELECT x FROM XSession x WHERE x.user = :user"),
    @NamedQuery(name = "XSession.findByDb", query = "SELECT x FROM XSession x WHERE x.db = :db"),
    @NamedQuery(name = "XSession.findByCommand", query = "SELECT x FROM XSession x WHERE x.command = :command"),
    @NamedQuery(name = "XSession.findByState", query = "SELECT x FROM XSession x WHERE x.state = :state"),
    @NamedQuery(name = "XSession.findByTime", query = "SELECT x FROM XSession x WHERE x.time = :time"),
    @NamedQuery(name = "XSession.findByExecutionEngine", query = "SELECT x FROM XSession x WHERE x.executionEngine = :executionEngine"),
    @NamedQuery(name = "XSession.findByStatementLatency", query = "SELECT x FROM XSession x WHERE x.statementLatency = :statementLatency"),
    @NamedQuery(name = "XSession.findByProgress", query = "SELECT x FROM XSession x WHERE x.progress = :progress"),
    @NamedQuery(name = "XSession.findByLockLatency", query = "SELECT x FROM XSession x WHERE x.lockLatency = :lockLatency"),
    @NamedQuery(name = "XSession.findByCpuLatency", query = "SELECT x FROM XSession x WHERE x.cpuLatency = :cpuLatency"),
    @NamedQuery(name = "XSession.findByRowsExamined", query = "SELECT x FROM XSession x WHERE x.rowsExamined = :rowsExamined"),
    @NamedQuery(name = "XSession.findByRowsSent", query = "SELECT x FROM XSession x WHERE x.rowsSent = :rowsSent"),
    @NamedQuery(name = "XSession.findByRowsAffected", query = "SELECT x FROM XSession x WHERE x.rowsAffected = :rowsAffected"),
    @NamedQuery(name = "XSession.findByTmpTables", query = "SELECT x FROM XSession x WHERE x.tmpTables = :tmpTables"),
    @NamedQuery(name = "XSession.findByTmpDiskTables", query = "SELECT x FROM XSession x WHERE x.tmpDiskTables = :tmpDiskTables"),
    @NamedQuery(name = "XSession.findByFullScan", query = "SELECT x FROM XSession x WHERE x.fullScan = :fullScan"),
    @NamedQuery(name = "XSession.findByLastStatementLatency", query = "SELECT x FROM XSession x WHERE x.lastStatementLatency = :lastStatementLatency"),
    @NamedQuery(name = "XSession.findByCurrentMemory", query = "SELECT x FROM XSession x WHERE x.currentMemory = :currentMemory"),
    @NamedQuery(name = "XSession.findByLastWait", query = "SELECT x FROM XSession x WHERE x.lastWait = :lastWait"),
    @NamedQuery(name = "XSession.findByLastWaitLatency", query = "SELECT x FROM XSession x WHERE x.lastWaitLatency = :lastWaitLatency"),
    @NamedQuery(name = "XSession.findBySource", query = "SELECT x FROM XSession x WHERE x.source = :source"),
    @NamedQuery(name = "XSession.findByTrxLatency", query = "SELECT x FROM XSession x WHERE x.trxLatency = :trxLatency"),
    @NamedQuery(name = "XSession.findByTrxState", query = "SELECT x FROM XSession x WHERE x.trxState = :trxState"),
    @NamedQuery(name = "XSession.findByTrxAutocommit", query = "SELECT x FROM XSession x WHERE x.trxAutocommit = :trxAutocommit"),
    @NamedQuery(name = "XSession.findByPid", query = "SELECT x FROM XSession x WHERE x.pid = :pid"),
    @NamedQuery(name = "XSession.findByProgramName", query = "SELECT x FROM XSession x WHERE x.programName = :programName")})
public class XSession implements Serializable {

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
    private BigInteger statementLatency;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "progress")
    private BigDecimal progress;
    @Column(name = "lock_latency")
    private BigInteger lockLatency;
    @Column(name = "cpu_latency")
    private BigInteger cpuLatency;
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
    private BigInteger lastStatementLatency;
    @Column(name = "current_memory")
    private BigInteger currentMemory;
    @Column(name = "last_wait")
    private String lastWait;
    @Column(name = "last_wait_latency")
    private String lastWaitLatency;
    @Column(name = "source")
    private String source;
    @Column(name = "trx_latency")
    private BigInteger trxLatency;
    @Column(name = "trx_state")
    private String trxState;
    @Column(name = "trx_autocommit")
    private String trxAutocommit;
    @Column(name = "pid")
    private String pid;
    @Column(name = "program_name")
    private String programName;

    public XSession() {
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

    public BigInteger getStatementLatency() {
        return statementLatency;
    }

    public void setStatementLatency(BigInteger statementLatency) {
        this.statementLatency = statementLatency;
    }

    public BigDecimal getProgress() {
        return progress;
    }

    public void setProgress(BigDecimal progress) {
        this.progress = progress;
    }

    public BigInteger getLockLatency() {
        return lockLatency;
    }

    public void setLockLatency(BigInteger lockLatency) {
        this.lockLatency = lockLatency;
    }

    public BigInteger getCpuLatency() {
        return cpuLatency;
    }

    public void setCpuLatency(BigInteger cpuLatency) {
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

    public BigInteger getLastStatementLatency() {
        return lastStatementLatency;
    }

    public void setLastStatementLatency(BigInteger lastStatementLatency) {
        this.lastStatementLatency = lastStatementLatency;
    }

    public BigInteger getCurrentMemory() {
        return currentMemory;
    }

    public void setCurrentMemory(BigInteger currentMemory) {
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

    public BigInteger getTrxLatency() {
        return trxLatency;
    }

    public void setTrxLatency(BigInteger trxLatency) {
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
