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
@Table(name = "innodb_lock_waits")
@NamedQueries({
    @NamedQuery(name = "InnodbLockWaits.findAll", query = "SELECT i FROM InnodbLockWaits i"),
    @NamedQuery(name = "InnodbLockWaits.findByWaitStarted", query = "SELECT i FROM InnodbLockWaits i WHERE i.waitStarted = :waitStarted"),
    @NamedQuery(name = "InnodbLockWaits.findByWaitAge", query = "SELECT i FROM InnodbLockWaits i WHERE i.waitAge = :waitAge"),
    @NamedQuery(name = "InnodbLockWaits.findByWaitAgeSecs", query = "SELECT i FROM InnodbLockWaits i WHERE i.waitAgeSecs = :waitAgeSecs"),
    @NamedQuery(name = "InnodbLockWaits.findByLockedTableSchema", query = "SELECT i FROM InnodbLockWaits i WHERE i.lockedTableSchema = :lockedTableSchema"),
    @NamedQuery(name = "InnodbLockWaits.findByLockedTableName", query = "SELECT i FROM InnodbLockWaits i WHERE i.lockedTableName = :lockedTableName"),
    @NamedQuery(name = "InnodbLockWaits.findByLockedTablePartition", query = "SELECT i FROM InnodbLockWaits i WHERE i.lockedTablePartition = :lockedTablePartition"),
    @NamedQuery(name = "InnodbLockWaits.findByLockedTableSubpartition", query = "SELECT i FROM InnodbLockWaits i WHERE i.lockedTableSubpartition = :lockedTableSubpartition"),
    @NamedQuery(name = "InnodbLockWaits.findByLockedIndex", query = "SELECT i FROM InnodbLockWaits i WHERE i.lockedIndex = :lockedIndex"),
    @NamedQuery(name = "InnodbLockWaits.findByLockedType", query = "SELECT i FROM InnodbLockWaits i WHERE i.lockedType = :lockedType"),
    @NamedQuery(name = "InnodbLockWaits.findByWaitingTrxId", query = "SELECT i FROM InnodbLockWaits i WHERE i.waitingTrxId = :waitingTrxId"),
    @NamedQuery(name = "InnodbLockWaits.findByWaitingTrxStarted", query = "SELECT i FROM InnodbLockWaits i WHERE i.waitingTrxStarted = :waitingTrxStarted"),
    @NamedQuery(name = "InnodbLockWaits.findByWaitingTrxAge", query = "SELECT i FROM InnodbLockWaits i WHERE i.waitingTrxAge = :waitingTrxAge"),
    @NamedQuery(name = "InnodbLockWaits.findByWaitingTrxRowsLocked", query = "SELECT i FROM InnodbLockWaits i WHERE i.waitingTrxRowsLocked = :waitingTrxRowsLocked"),
    @NamedQuery(name = "InnodbLockWaits.findByWaitingTrxRowsModified", query = "SELECT i FROM InnodbLockWaits i WHERE i.waitingTrxRowsModified = :waitingTrxRowsModified"),
    @NamedQuery(name = "InnodbLockWaits.findByWaitingPid", query = "SELECT i FROM InnodbLockWaits i WHERE i.waitingPid = :waitingPid"),
    @NamedQuery(name = "InnodbLockWaits.findByWaitingLockId", query = "SELECT i FROM InnodbLockWaits i WHERE i.waitingLockId = :waitingLockId"),
    @NamedQuery(name = "InnodbLockWaits.findByWaitingLockMode", query = "SELECT i FROM InnodbLockWaits i WHERE i.waitingLockMode = :waitingLockMode"),
    @NamedQuery(name = "InnodbLockWaits.findByBlockingTrxId", query = "SELECT i FROM InnodbLockWaits i WHERE i.blockingTrxId = :blockingTrxId"),
    @NamedQuery(name = "InnodbLockWaits.findByBlockingPid", query = "SELECT i FROM InnodbLockWaits i WHERE i.blockingPid = :blockingPid"),
    @NamedQuery(name = "InnodbLockWaits.findByBlockingLockId", query = "SELECT i FROM InnodbLockWaits i WHERE i.blockingLockId = :blockingLockId"),
    @NamedQuery(name = "InnodbLockWaits.findByBlockingLockMode", query = "SELECT i FROM InnodbLockWaits i WHERE i.blockingLockMode = :blockingLockMode"),
    @NamedQuery(name = "InnodbLockWaits.findByBlockingTrxStarted", query = "SELECT i FROM InnodbLockWaits i WHERE i.blockingTrxStarted = :blockingTrxStarted"),
    @NamedQuery(name = "InnodbLockWaits.findByBlockingTrxAge", query = "SELECT i FROM InnodbLockWaits i WHERE i.blockingTrxAge = :blockingTrxAge"),
    @NamedQuery(name = "InnodbLockWaits.findByBlockingTrxRowsLocked", query = "SELECT i FROM InnodbLockWaits i WHERE i.blockingTrxRowsLocked = :blockingTrxRowsLocked"),
    @NamedQuery(name = "InnodbLockWaits.findByBlockingTrxRowsModified", query = "SELECT i FROM InnodbLockWaits i WHERE i.blockingTrxRowsModified = :blockingTrxRowsModified"),
    @NamedQuery(name = "InnodbLockWaits.findBySqlKillBlockingQuery", query = "SELECT i FROM InnodbLockWaits i WHERE i.sqlKillBlockingQuery = :sqlKillBlockingQuery"),
    @NamedQuery(name = "InnodbLockWaits.findBySqlKillBlockingConnection", query = "SELECT i FROM InnodbLockWaits i WHERE i.sqlKillBlockingConnection = :sqlKillBlockingConnection")})
public class InnodbLockWaits implements Serializable {

    private static final long serialVersionUID = 1L;
    @Column(name = "wait_started")
    @Temporal(TemporalType.TIMESTAMP)
    private Date waitStarted;
    @Column(name = "wait_age")
    @Temporal(TemporalType.TIME)
    private Date waitAge;
    @Column(name = "wait_age_secs")
    private BigInteger waitAgeSecs;
    @Lob
    @Column(name = "locked_table")
    private String lockedTable;
    @Column(name = "locked_table_schema")
    private String lockedTableSchema;
    @Column(name = "locked_table_name")
    private String lockedTableName;
    @Column(name = "locked_table_partition")
    private String lockedTablePartition;
    @Column(name = "locked_table_subpartition")
    private String lockedTableSubpartition;
    @Column(name = "locked_index")
    private String lockedIndex;
    @Basic(optional = false)
    @Column(name = "locked_type")
    private String lockedType;
    @Basic(optional = false)
    @Column(name = "waiting_trx_id")
    private long waitingTrxId;
    @Basic(optional = false)
    @Column(name = "waiting_trx_started")
    @Temporal(TemporalType.TIMESTAMP)
    private Date waitingTrxStarted;
    @Column(name = "waiting_trx_age")
    @Temporal(TemporalType.TIME)
    private Date waitingTrxAge;
    @Basic(optional = false)
    @Column(name = "waiting_trx_rows_locked")
    private long waitingTrxRowsLocked;
    @Basic(optional = false)
    @Column(name = "waiting_trx_rows_modified")
    private long waitingTrxRowsModified;
    @Basic(optional = false)
    @Column(name = "waiting_pid")
    private long waitingPid;
    @Lob
    @Column(name = "waiting_query")
    private String waitingQuery;
    @Basic(optional = false)
    @Column(name = "waiting_lock_id")
    private String waitingLockId;
    @Basic(optional = false)
    @Column(name = "waiting_lock_mode")
    private String waitingLockMode;
    @Basic(optional = false)
    @Column(name = "blocking_trx_id")
    private long blockingTrxId;
    @Basic(optional = false)
    @Column(name = "blocking_pid")
    private long blockingPid;
    @Lob
    @Column(name = "blocking_query")
    private String blockingQuery;
    @Basic(optional = false)
    @Column(name = "blocking_lock_id")
    private String blockingLockId;
    @Basic(optional = false)
    @Column(name = "blocking_lock_mode")
    private String blockingLockMode;
    @Basic(optional = false)
    @Column(name = "blocking_trx_started")
    @Temporal(TemporalType.TIMESTAMP)
    private Date blockingTrxStarted;
    @Column(name = "blocking_trx_age")
    @Temporal(TemporalType.TIME)
    private Date blockingTrxAge;
    @Basic(optional = false)
    @Column(name = "blocking_trx_rows_locked")
    private long blockingTrxRowsLocked;
    @Basic(optional = false)
    @Column(name = "blocking_trx_rows_modified")
    private long blockingTrxRowsModified;
    @Basic(optional = false)
    @Column(name = "sql_kill_blocking_query")
    private String sqlKillBlockingQuery;
    @Basic(optional = false)
    @Column(name = "sql_kill_blocking_connection")
    private String sqlKillBlockingConnection;

    public InnodbLockWaits() {
    }

    public Date getWaitStarted() {
        return waitStarted;
    }

    public void setWaitStarted(Date waitStarted) {
        this.waitStarted = waitStarted;
    }

    public Date getWaitAge() {
        return waitAge;
    }

    public void setWaitAge(Date waitAge) {
        this.waitAge = waitAge;
    }

    public BigInteger getWaitAgeSecs() {
        return waitAgeSecs;
    }

    public void setWaitAgeSecs(BigInteger waitAgeSecs) {
        this.waitAgeSecs = waitAgeSecs;
    }

    public String getLockedTable() {
        return lockedTable;
    }

    public void setLockedTable(String lockedTable) {
        this.lockedTable = lockedTable;
    }

    public String getLockedTableSchema() {
        return lockedTableSchema;
    }

    public void setLockedTableSchema(String lockedTableSchema) {
        this.lockedTableSchema = lockedTableSchema;
    }

    public String getLockedTableName() {
        return lockedTableName;
    }

    public void setLockedTableName(String lockedTableName) {
        this.lockedTableName = lockedTableName;
    }

    public String getLockedTablePartition() {
        return lockedTablePartition;
    }

    public void setLockedTablePartition(String lockedTablePartition) {
        this.lockedTablePartition = lockedTablePartition;
    }

    public String getLockedTableSubpartition() {
        return lockedTableSubpartition;
    }

    public void setLockedTableSubpartition(String lockedTableSubpartition) {
        this.lockedTableSubpartition = lockedTableSubpartition;
    }

    public String getLockedIndex() {
        return lockedIndex;
    }

    public void setLockedIndex(String lockedIndex) {
        this.lockedIndex = lockedIndex;
    }

    public String getLockedType() {
        return lockedType;
    }

    public void setLockedType(String lockedType) {
        this.lockedType = lockedType;
    }

    public long getWaitingTrxId() {
        return waitingTrxId;
    }

    public void setWaitingTrxId(long waitingTrxId) {
        this.waitingTrxId = waitingTrxId;
    }

    public Date getWaitingTrxStarted() {
        return waitingTrxStarted;
    }

    public void setWaitingTrxStarted(Date waitingTrxStarted) {
        this.waitingTrxStarted = waitingTrxStarted;
    }

    public Date getWaitingTrxAge() {
        return waitingTrxAge;
    }

    public void setWaitingTrxAge(Date waitingTrxAge) {
        this.waitingTrxAge = waitingTrxAge;
    }

    public long getWaitingTrxRowsLocked() {
        return waitingTrxRowsLocked;
    }

    public void setWaitingTrxRowsLocked(long waitingTrxRowsLocked) {
        this.waitingTrxRowsLocked = waitingTrxRowsLocked;
    }

    public long getWaitingTrxRowsModified() {
        return waitingTrxRowsModified;
    }

    public void setWaitingTrxRowsModified(long waitingTrxRowsModified) {
        this.waitingTrxRowsModified = waitingTrxRowsModified;
    }

    public long getWaitingPid() {
        return waitingPid;
    }

    public void setWaitingPid(long waitingPid) {
        this.waitingPid = waitingPid;
    }

    public String getWaitingQuery() {
        return waitingQuery;
    }

    public void setWaitingQuery(String waitingQuery) {
        this.waitingQuery = waitingQuery;
    }

    public String getWaitingLockId() {
        return waitingLockId;
    }

    public void setWaitingLockId(String waitingLockId) {
        this.waitingLockId = waitingLockId;
    }

    public String getWaitingLockMode() {
        return waitingLockMode;
    }

    public void setWaitingLockMode(String waitingLockMode) {
        this.waitingLockMode = waitingLockMode;
    }

    public long getBlockingTrxId() {
        return blockingTrxId;
    }

    public void setBlockingTrxId(long blockingTrxId) {
        this.blockingTrxId = blockingTrxId;
    }

    public long getBlockingPid() {
        return blockingPid;
    }

    public void setBlockingPid(long blockingPid) {
        this.blockingPid = blockingPid;
    }

    public String getBlockingQuery() {
        return blockingQuery;
    }

    public void setBlockingQuery(String blockingQuery) {
        this.blockingQuery = blockingQuery;
    }

    public String getBlockingLockId() {
        return blockingLockId;
    }

    public void setBlockingLockId(String blockingLockId) {
        this.blockingLockId = blockingLockId;
    }

    public String getBlockingLockMode() {
        return blockingLockMode;
    }

    public void setBlockingLockMode(String blockingLockMode) {
        this.blockingLockMode = blockingLockMode;
    }

    public Date getBlockingTrxStarted() {
        return blockingTrxStarted;
    }

    public void setBlockingTrxStarted(Date blockingTrxStarted) {
        this.blockingTrxStarted = blockingTrxStarted;
    }

    public Date getBlockingTrxAge() {
        return blockingTrxAge;
    }

    public void setBlockingTrxAge(Date blockingTrxAge) {
        this.blockingTrxAge = blockingTrxAge;
    }

    public long getBlockingTrxRowsLocked() {
        return blockingTrxRowsLocked;
    }

    public void setBlockingTrxRowsLocked(long blockingTrxRowsLocked) {
        this.blockingTrxRowsLocked = blockingTrxRowsLocked;
    }

    public long getBlockingTrxRowsModified() {
        return blockingTrxRowsModified;
    }

    public void setBlockingTrxRowsModified(long blockingTrxRowsModified) {
        this.blockingTrxRowsModified = blockingTrxRowsModified;
    }

    public String getSqlKillBlockingQuery() {
        return sqlKillBlockingQuery;
    }

    public void setSqlKillBlockingQuery(String sqlKillBlockingQuery) {
        this.sqlKillBlockingQuery = sqlKillBlockingQuery;
    }

    public String getSqlKillBlockingConnection() {
        return sqlKillBlockingConnection;
    }

    public void setSqlKillBlockingConnection(String sqlKillBlockingConnection) {
        this.sqlKillBlockingConnection = sqlKillBlockingConnection;
    }
    
}
