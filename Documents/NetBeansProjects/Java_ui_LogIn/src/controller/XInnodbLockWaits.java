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
@Table(name = "x$innodb_lock_waits")
@NamedQueries({
    @NamedQuery(name = "XInnodbLockWaits.findAll", query = "SELECT x FROM XInnodbLockWaits x"),
    @NamedQuery(name = "XInnodbLockWaits.findByWaitStarted", query = "SELECT x FROM XInnodbLockWaits x WHERE x.waitStarted = :waitStarted"),
    @NamedQuery(name = "XInnodbLockWaits.findByWaitAge", query = "SELECT x FROM XInnodbLockWaits x WHERE x.waitAge = :waitAge"),
    @NamedQuery(name = "XInnodbLockWaits.findByWaitAgeSecs", query = "SELECT x FROM XInnodbLockWaits x WHERE x.waitAgeSecs = :waitAgeSecs"),
    @NamedQuery(name = "XInnodbLockWaits.findByLockedTableSchema", query = "SELECT x FROM XInnodbLockWaits x WHERE x.lockedTableSchema = :lockedTableSchema"),
    @NamedQuery(name = "XInnodbLockWaits.findByLockedTableName", query = "SELECT x FROM XInnodbLockWaits x WHERE x.lockedTableName = :lockedTableName"),
    @NamedQuery(name = "XInnodbLockWaits.findByLockedTablePartition", query = "SELECT x FROM XInnodbLockWaits x WHERE x.lockedTablePartition = :lockedTablePartition"),
    @NamedQuery(name = "XInnodbLockWaits.findByLockedTableSubpartition", query = "SELECT x FROM XInnodbLockWaits x WHERE x.lockedTableSubpartition = :lockedTableSubpartition"),
    @NamedQuery(name = "XInnodbLockWaits.findByLockedIndex", query = "SELECT x FROM XInnodbLockWaits x WHERE x.lockedIndex = :lockedIndex"),
    @NamedQuery(name = "XInnodbLockWaits.findByLockedType", query = "SELECT x FROM XInnodbLockWaits x WHERE x.lockedType = :lockedType"),
    @NamedQuery(name = "XInnodbLockWaits.findByWaitingTrxId", query = "SELECT x FROM XInnodbLockWaits x WHERE x.waitingTrxId = :waitingTrxId"),
    @NamedQuery(name = "XInnodbLockWaits.findByWaitingTrxStarted", query = "SELECT x FROM XInnodbLockWaits x WHERE x.waitingTrxStarted = :waitingTrxStarted"),
    @NamedQuery(name = "XInnodbLockWaits.findByWaitingTrxAge", query = "SELECT x FROM XInnodbLockWaits x WHERE x.waitingTrxAge = :waitingTrxAge"),
    @NamedQuery(name = "XInnodbLockWaits.findByWaitingTrxRowsLocked", query = "SELECT x FROM XInnodbLockWaits x WHERE x.waitingTrxRowsLocked = :waitingTrxRowsLocked"),
    @NamedQuery(name = "XInnodbLockWaits.findByWaitingTrxRowsModified", query = "SELECT x FROM XInnodbLockWaits x WHERE x.waitingTrxRowsModified = :waitingTrxRowsModified"),
    @NamedQuery(name = "XInnodbLockWaits.findByWaitingPid", query = "SELECT x FROM XInnodbLockWaits x WHERE x.waitingPid = :waitingPid"),
    @NamedQuery(name = "XInnodbLockWaits.findByWaitingQuery", query = "SELECT x FROM XInnodbLockWaits x WHERE x.waitingQuery = :waitingQuery"),
    @NamedQuery(name = "XInnodbLockWaits.findByWaitingLockId", query = "SELECT x FROM XInnodbLockWaits x WHERE x.waitingLockId = :waitingLockId"),
    @NamedQuery(name = "XInnodbLockWaits.findByWaitingLockMode", query = "SELECT x FROM XInnodbLockWaits x WHERE x.waitingLockMode = :waitingLockMode"),
    @NamedQuery(name = "XInnodbLockWaits.findByBlockingTrxId", query = "SELECT x FROM XInnodbLockWaits x WHERE x.blockingTrxId = :blockingTrxId"),
    @NamedQuery(name = "XInnodbLockWaits.findByBlockingPid", query = "SELECT x FROM XInnodbLockWaits x WHERE x.blockingPid = :blockingPid"),
    @NamedQuery(name = "XInnodbLockWaits.findByBlockingQuery", query = "SELECT x FROM XInnodbLockWaits x WHERE x.blockingQuery = :blockingQuery"),
    @NamedQuery(name = "XInnodbLockWaits.findByBlockingLockId", query = "SELECT x FROM XInnodbLockWaits x WHERE x.blockingLockId = :blockingLockId"),
    @NamedQuery(name = "XInnodbLockWaits.findByBlockingLockMode", query = "SELECT x FROM XInnodbLockWaits x WHERE x.blockingLockMode = :blockingLockMode"),
    @NamedQuery(name = "XInnodbLockWaits.findByBlockingTrxStarted", query = "SELECT x FROM XInnodbLockWaits x WHERE x.blockingTrxStarted = :blockingTrxStarted"),
    @NamedQuery(name = "XInnodbLockWaits.findByBlockingTrxAge", query = "SELECT x FROM XInnodbLockWaits x WHERE x.blockingTrxAge = :blockingTrxAge"),
    @NamedQuery(name = "XInnodbLockWaits.findByBlockingTrxRowsLocked", query = "SELECT x FROM XInnodbLockWaits x WHERE x.blockingTrxRowsLocked = :blockingTrxRowsLocked"),
    @NamedQuery(name = "XInnodbLockWaits.findByBlockingTrxRowsModified", query = "SELECT x FROM XInnodbLockWaits x WHERE x.blockingTrxRowsModified = :blockingTrxRowsModified"),
    @NamedQuery(name = "XInnodbLockWaits.findBySqlKillBlockingQuery", query = "SELECT x FROM XInnodbLockWaits x WHERE x.sqlKillBlockingQuery = :sqlKillBlockingQuery"),
    @NamedQuery(name = "XInnodbLockWaits.findBySqlKillBlockingConnection", query = "SELECT x FROM XInnodbLockWaits x WHERE x.sqlKillBlockingConnection = :sqlKillBlockingConnection")})
public class XInnodbLockWaits implements Serializable {

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

    public XInnodbLockWaits() {
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
