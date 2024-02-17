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
import javax.persistence.Lob;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author User
 */
@Entity
@Table(name = "schema_table_lock_waits")
@NamedQueries({
    @NamedQuery(name = "SchemaTableLockWaits.findAll", query = "SELECT s FROM SchemaTableLockWaits s"),
    @NamedQuery(name = "SchemaTableLockWaits.findByObjectSchema", query = "SELECT s FROM SchemaTableLockWaits s WHERE s.objectSchema = :objectSchema"),
    @NamedQuery(name = "SchemaTableLockWaits.findByObjectName", query = "SELECT s FROM SchemaTableLockWaits s WHERE s.objectName = :objectName"),
    @NamedQuery(name = "SchemaTableLockWaits.findByWaitingThreadId", query = "SELECT s FROM SchemaTableLockWaits s WHERE s.waitingThreadId = :waitingThreadId"),
    @NamedQuery(name = "SchemaTableLockWaits.findByWaitingPid", query = "SELECT s FROM SchemaTableLockWaits s WHERE s.waitingPid = :waitingPid"),
    @NamedQuery(name = "SchemaTableLockWaits.findByWaitingLockType", query = "SELECT s FROM SchemaTableLockWaits s WHERE s.waitingLockType = :waitingLockType"),
    @NamedQuery(name = "SchemaTableLockWaits.findByWaitingLockDuration", query = "SELECT s FROM SchemaTableLockWaits s WHERE s.waitingLockDuration = :waitingLockDuration"),
    @NamedQuery(name = "SchemaTableLockWaits.findByWaitingQuerySecs", query = "SELECT s FROM SchemaTableLockWaits s WHERE s.waitingQuerySecs = :waitingQuerySecs"),
    @NamedQuery(name = "SchemaTableLockWaits.findByWaitingQueryRowsAffected", query = "SELECT s FROM SchemaTableLockWaits s WHERE s.waitingQueryRowsAffected = :waitingQueryRowsAffected"),
    @NamedQuery(name = "SchemaTableLockWaits.findByWaitingQueryRowsExamined", query = "SELECT s FROM SchemaTableLockWaits s WHERE s.waitingQueryRowsExamined = :waitingQueryRowsExamined"),
    @NamedQuery(name = "SchemaTableLockWaits.findByBlockingThreadId", query = "SELECT s FROM SchemaTableLockWaits s WHERE s.blockingThreadId = :blockingThreadId"),
    @NamedQuery(name = "SchemaTableLockWaits.findByBlockingPid", query = "SELECT s FROM SchemaTableLockWaits s WHERE s.blockingPid = :blockingPid"),
    @NamedQuery(name = "SchemaTableLockWaits.findByBlockingLockType", query = "SELECT s FROM SchemaTableLockWaits s WHERE s.blockingLockType = :blockingLockType"),
    @NamedQuery(name = "SchemaTableLockWaits.findByBlockingLockDuration", query = "SELECT s FROM SchemaTableLockWaits s WHERE s.blockingLockDuration = :blockingLockDuration"),
    @NamedQuery(name = "SchemaTableLockWaits.findBySqlKillBlockingQuery", query = "SELECT s FROM SchemaTableLockWaits s WHERE s.sqlKillBlockingQuery = :sqlKillBlockingQuery"),
    @NamedQuery(name = "SchemaTableLockWaits.findBySqlKillBlockingConnection", query = "SELECT s FROM SchemaTableLockWaits s WHERE s.sqlKillBlockingConnection = :sqlKillBlockingConnection")})
public class SchemaTableLockWaits implements Serializable {

    private static final long serialVersionUID = 1L;
    @Column(name = "object_schema")
    private String objectSchema;
    @Column(name = "object_name")
    private String objectName;
    @Basic(optional = false)
    @Column(name = "waiting_thread_id")
    private long waitingThreadId;
    @Column(name = "waiting_pid")
    private BigInteger waitingPid;
    @Lob
    @Column(name = "waiting_account")
    private String waitingAccount;
    @Basic(optional = false)
    @Column(name = "waiting_lock_type")
    private String waitingLockType;
    @Basic(optional = false)
    @Column(name = "waiting_lock_duration")
    private String waitingLockDuration;
    @Lob
    @Column(name = "waiting_query")
    private String waitingQuery;
    @Column(name = "waiting_query_secs")
    private BigInteger waitingQuerySecs;
    @Column(name = "waiting_query_rows_affected")
    private BigInteger waitingQueryRowsAffected;
    @Column(name = "waiting_query_rows_examined")
    private BigInteger waitingQueryRowsExamined;
    @Basic(optional = false)
    @Column(name = "blocking_thread_id")
    private long blockingThreadId;
    @Column(name = "blocking_pid")
    private BigInteger blockingPid;
    @Lob
    @Column(name = "blocking_account")
    private String blockingAccount;
    @Basic(optional = false)
    @Column(name = "blocking_lock_type")
    private String blockingLockType;
    @Basic(optional = false)
    @Column(name = "blocking_lock_duration")
    private String blockingLockDuration;
    @Column(name = "sql_kill_blocking_query")
    private String sqlKillBlockingQuery;
    @Column(name = "sql_kill_blocking_connection")
    private String sqlKillBlockingConnection;

    public SchemaTableLockWaits() {
    }

    public String getObjectSchema() {
        return objectSchema;
    }

    public void setObjectSchema(String objectSchema) {
        this.objectSchema = objectSchema;
    }

    public String getObjectName() {
        return objectName;
    }

    public void setObjectName(String objectName) {
        this.objectName = objectName;
    }

    public long getWaitingThreadId() {
        return waitingThreadId;
    }

    public void setWaitingThreadId(long waitingThreadId) {
        this.waitingThreadId = waitingThreadId;
    }

    public BigInteger getWaitingPid() {
        return waitingPid;
    }

    public void setWaitingPid(BigInteger waitingPid) {
        this.waitingPid = waitingPid;
    }

    public String getWaitingAccount() {
        return waitingAccount;
    }

    public void setWaitingAccount(String waitingAccount) {
        this.waitingAccount = waitingAccount;
    }

    public String getWaitingLockType() {
        return waitingLockType;
    }

    public void setWaitingLockType(String waitingLockType) {
        this.waitingLockType = waitingLockType;
    }

    public String getWaitingLockDuration() {
        return waitingLockDuration;
    }

    public void setWaitingLockDuration(String waitingLockDuration) {
        this.waitingLockDuration = waitingLockDuration;
    }

    public String getWaitingQuery() {
        return waitingQuery;
    }

    public void setWaitingQuery(String waitingQuery) {
        this.waitingQuery = waitingQuery;
    }

    public BigInteger getWaitingQuerySecs() {
        return waitingQuerySecs;
    }

    public void setWaitingQuerySecs(BigInteger waitingQuerySecs) {
        this.waitingQuerySecs = waitingQuerySecs;
    }

    public BigInteger getWaitingQueryRowsAffected() {
        return waitingQueryRowsAffected;
    }

    public void setWaitingQueryRowsAffected(BigInteger waitingQueryRowsAffected) {
        this.waitingQueryRowsAffected = waitingQueryRowsAffected;
    }

    public BigInteger getWaitingQueryRowsExamined() {
        return waitingQueryRowsExamined;
    }

    public void setWaitingQueryRowsExamined(BigInteger waitingQueryRowsExamined) {
        this.waitingQueryRowsExamined = waitingQueryRowsExamined;
    }

    public long getBlockingThreadId() {
        return blockingThreadId;
    }

    public void setBlockingThreadId(long blockingThreadId) {
        this.blockingThreadId = blockingThreadId;
    }

    public BigInteger getBlockingPid() {
        return blockingPid;
    }

    public void setBlockingPid(BigInteger blockingPid) {
        this.blockingPid = blockingPid;
    }

    public String getBlockingAccount() {
        return blockingAccount;
    }

    public void setBlockingAccount(String blockingAccount) {
        this.blockingAccount = blockingAccount;
    }

    public String getBlockingLockType() {
        return blockingLockType;
    }

    public void setBlockingLockType(String blockingLockType) {
        this.blockingLockType = blockingLockType;
    }

    public String getBlockingLockDuration() {
        return blockingLockDuration;
    }

    public void setBlockingLockDuration(String blockingLockDuration) {
        this.blockingLockDuration = blockingLockDuration;
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
