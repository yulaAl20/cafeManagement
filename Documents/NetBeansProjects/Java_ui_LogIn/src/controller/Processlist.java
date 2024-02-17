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
@Table(name = "processlist")
@NamedQueries({
    @NamedQuery(name = "Processlist.findAll", query = "SELECT p FROM Processlist p"),
    @NamedQuery(name = "Processlist.findById", query = "SELECT p FROM Processlist p WHERE p.id = :id"),
    @NamedQuery(name = "Processlist.findByUser", query = "SELECT p FROM Processlist p WHERE p.user = :user"),
    @NamedQuery(name = "Processlist.findByHost", query = "SELECT p FROM Processlist p WHERE p.host = :host"),
    @NamedQuery(name = "Processlist.findByDb", query = "SELECT p FROM Processlist p WHERE p.db = :db"),
    @NamedQuery(name = "Processlist.findByCommand", query = "SELECT p FROM Processlist p WHERE p.command = :command"),
    @NamedQuery(name = "Processlist.findByTime", query = "SELECT p FROM Processlist p WHERE p.time = :time"),
    @NamedQuery(name = "Processlist.findByState", query = "SELECT p FROM Processlist p WHERE p.state = :state"),
    @NamedQuery(name = "Processlist.findByInfo", query = "SELECT p FROM Processlist p WHERE p.info = :info"),
    @NamedQuery(name = "Processlist.findById1", query = "SELECT p FROM Processlist p WHERE p.id1 = :id1"),
    @NamedQuery(name = "Processlist.findByUser1", query = "SELECT p FROM Processlist p WHERE p.user1 = :user1"),
    @NamedQuery(name = "Processlist.findByHost1", query = "SELECT p FROM Processlist p WHERE p.host1 = :host1"),
    @NamedQuery(name = "Processlist.findByDb1", query = "SELECT p FROM Processlist p WHERE p.db1 = :db1"),
    @NamedQuery(name = "Processlist.findByCommand1", query = "SELECT p FROM Processlist p WHERE p.command1 = :command1"),
    @NamedQuery(name = "Processlist.findByTime1", query = "SELECT p FROM Processlist p WHERE p.time1 = :time1"),
    @NamedQuery(name = "Processlist.findByState1", query = "SELECT p FROM Processlist p WHERE p.state1 = :state1"),
    @NamedQuery(name = "Processlist.findByExecutionEngine", query = "SELECT p FROM Processlist p WHERE p.executionEngine = :executionEngine"),
    @NamedQuery(name = "Processlist.findByThdId", query = "SELECT p FROM Processlist p WHERE p.thdId = :thdId"),
    @NamedQuery(name = "Processlist.findByConnId", query = "SELECT p FROM Processlist p WHERE p.connId = :connId"),
    @NamedQuery(name = "Processlist.findByUser2", query = "SELECT p FROM Processlist p WHERE p.user2 = :user2"),
    @NamedQuery(name = "Processlist.findByDb2", query = "SELECT p FROM Processlist p WHERE p.db2 = :db2"),
    @NamedQuery(name = "Processlist.findByCommand2", query = "SELECT p FROM Processlist p WHERE p.command2 = :command2"),
    @NamedQuery(name = "Processlist.findByState2", query = "SELECT p FROM Processlist p WHERE p.state2 = :state2"),
    @NamedQuery(name = "Processlist.findByTime2", query = "SELECT p FROM Processlist p WHERE p.time2 = :time2"),
    @NamedQuery(name = "Processlist.findByExecutionEngine1", query = "SELECT p FROM Processlist p WHERE p.executionEngine1 = :executionEngine1"),
    @NamedQuery(name = "Processlist.findByStatementLatency", query = "SELECT p FROM Processlist p WHERE p.statementLatency = :statementLatency"),
    @NamedQuery(name = "Processlist.findByProgress", query = "SELECT p FROM Processlist p WHERE p.progress = :progress"),
    @NamedQuery(name = "Processlist.findByLockLatency", query = "SELECT p FROM Processlist p WHERE p.lockLatency = :lockLatency"),
    @NamedQuery(name = "Processlist.findByCpuLatency", query = "SELECT p FROM Processlist p WHERE p.cpuLatency = :cpuLatency"),
    @NamedQuery(name = "Processlist.findByRowsExamined", query = "SELECT p FROM Processlist p WHERE p.rowsExamined = :rowsExamined"),
    @NamedQuery(name = "Processlist.findByRowsSent", query = "SELECT p FROM Processlist p WHERE p.rowsSent = :rowsSent"),
    @NamedQuery(name = "Processlist.findByRowsAffected", query = "SELECT p FROM Processlist p WHERE p.rowsAffected = :rowsAffected"),
    @NamedQuery(name = "Processlist.findByTmpTables", query = "SELECT p FROM Processlist p WHERE p.tmpTables = :tmpTables"),
    @NamedQuery(name = "Processlist.findByTmpDiskTables", query = "SELECT p FROM Processlist p WHERE p.tmpDiskTables = :tmpDiskTables"),
    @NamedQuery(name = "Processlist.findByFullScan", query = "SELECT p FROM Processlist p WHERE p.fullScan = :fullScan"),
    @NamedQuery(name = "Processlist.findByLastStatementLatency", query = "SELECT p FROM Processlist p WHERE p.lastStatementLatency = :lastStatementLatency"),
    @NamedQuery(name = "Processlist.findByCurrentMemory", query = "SELECT p FROM Processlist p WHERE p.currentMemory = :currentMemory"),
    @NamedQuery(name = "Processlist.findByLastWait", query = "SELECT p FROM Processlist p WHERE p.lastWait = :lastWait"),
    @NamedQuery(name = "Processlist.findByLastWaitLatency", query = "SELECT p FROM Processlist p WHERE p.lastWaitLatency = :lastWaitLatency"),
    @NamedQuery(name = "Processlist.findBySource", query = "SELECT p FROM Processlist p WHERE p.source = :source"),
    @NamedQuery(name = "Processlist.findByTrxLatency", query = "SELECT p FROM Processlist p WHERE p.trxLatency = :trxLatency"),
    @NamedQuery(name = "Processlist.findByTrxState", query = "SELECT p FROM Processlist p WHERE p.trxState = :trxState"),
    @NamedQuery(name = "Processlist.findByTrxAutocommit", query = "SELECT p FROM Processlist p WHERE p.trxAutocommit = :trxAutocommit"),
    @NamedQuery(name = "Processlist.findByPid", query = "SELECT p FROM Processlist p WHERE p.pid = :pid"),
    @NamedQuery(name = "Processlist.findByProgramName", query = "SELECT p FROM Processlist p WHERE p.programName = :programName")})
public class Processlist implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @Column(name = "ID")
    private long id;
    @Basic(optional = false)
    @Column(name = "USER")
    private String user;
    @Basic(optional = false)
    @Column(name = "HOST")
    private String host;
    @Column(name = "DB")
    private String db;
    @Basic(optional = false)
    @Column(name = "COMMAND")
    private String command;
    @Basic(optional = false)
    @Column(name = "TIME")
    private int time;
    @Column(name = "STATE")
    private String state;
    @Column(name = "INFO")
    private String info;
    @Basic(optional = false)
    @Column(name = "ID")
    private long id1;
    @Column(name = "USER")
    private String user1;
    @Column(name = "HOST")
    private String host1;
    @Column(name = "DB")
    private String db1;
    @Column(name = "COMMAND")
    private String command1;
    @Column(name = "TIME")
    private BigInteger time1;
    @Column(name = "STATE")
    private String state1;
    @Lob
    @Column(name = "INFO")
    private String info1;
    @Column(name = "EXECUTION_ENGINE")
    private String executionEngine;
    @Basic(optional = false)
    @Column(name = "thd_id")
    private long thdId;
    @Column(name = "conn_id")
    private BigInteger connId;
    @Column(name = "user")
    private String user2;
    @Column(name = "db")
    private String db2;
    @Column(name = "command")
    private String command2;
    @Column(name = "state")
    private String state2;
    @Column(name = "time")
    private BigInteger time2;
    @Lob
    @Column(name = "current_statement")
    private String currentStatement;
    @Column(name = "execution_engine")
    private String executionEngine1;
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

    public Processlist() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
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

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public long getId1() {
        return id1;
    }

    public void setId1(long id1) {
        this.id1 = id1;
    }

    public String getUser1() {
        return user1;
    }

    public void setUser1(String user1) {
        this.user1 = user1;
    }

    public String getHost1() {
        return host1;
    }

    public void setHost1(String host1) {
        this.host1 = host1;
    }

    public String getDb1() {
        return db1;
    }

    public void setDb1(String db1) {
        this.db1 = db1;
    }

    public String getCommand1() {
        return command1;
    }

    public void setCommand1(String command1) {
        this.command1 = command1;
    }

    public BigInteger getTime1() {
        return time1;
    }

    public void setTime1(BigInteger time1) {
        this.time1 = time1;
    }

    public String getState1() {
        return state1;
    }

    public void setState1(String state1) {
        this.state1 = state1;
    }

    public String getInfo1() {
        return info1;
    }

    public void setInfo1(String info1) {
        this.info1 = info1;
    }

    public String getExecutionEngine() {
        return executionEngine;
    }

    public void setExecutionEngine(String executionEngine) {
        this.executionEngine = executionEngine;
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

    public String getUser2() {
        return user2;
    }

    public void setUser2(String user2) {
        this.user2 = user2;
    }

    public String getDb2() {
        return db2;
    }

    public void setDb2(String db2) {
        this.db2 = db2;
    }

    public String getCommand2() {
        return command2;
    }

    public void setCommand2(String command2) {
        this.command2 = command2;
    }

    public String getState2() {
        return state2;
    }

    public void setState2(String state2) {
        this.state2 = state2;
    }

    public BigInteger getTime2() {
        return time2;
    }

    public void setTime2(BigInteger time2) {
        this.time2 = time2;
    }

    public String getCurrentStatement() {
        return currentStatement;
    }

    public void setCurrentStatement(String currentStatement) {
        this.currentStatement = currentStatement;
    }

    public String getExecutionEngine1() {
        return executionEngine1;
    }

    public void setExecutionEngine1(String executionEngine1) {
        this.executionEngine1 = executionEngine1;
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
