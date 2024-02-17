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
@Table(name = "x$schema_table_statistics")
@NamedQueries({
    @NamedQuery(name = "XSchemaTableStatistics.findAll", query = "SELECT x FROM XSchemaTableStatistics x"),
    @NamedQuery(name = "XSchemaTableStatistics.findByTableSchema", query = "SELECT x FROM XSchemaTableStatistics x WHERE x.tableSchema = :tableSchema"),
    @NamedQuery(name = "XSchemaTableStatistics.findByTableName", query = "SELECT x FROM XSchemaTableStatistics x WHERE x.tableName = :tableName"),
    @NamedQuery(name = "XSchemaTableStatistics.findByTotalLatency", query = "SELECT x FROM XSchemaTableStatistics x WHERE x.totalLatency = :totalLatency"),
    @NamedQuery(name = "XSchemaTableStatistics.findByRowsFetched", query = "SELECT x FROM XSchemaTableStatistics x WHERE x.rowsFetched = :rowsFetched"),
    @NamedQuery(name = "XSchemaTableStatistics.findByFetchLatency", query = "SELECT x FROM XSchemaTableStatistics x WHERE x.fetchLatency = :fetchLatency"),
    @NamedQuery(name = "XSchemaTableStatistics.findByRowsInserted", query = "SELECT x FROM XSchemaTableStatistics x WHERE x.rowsInserted = :rowsInserted"),
    @NamedQuery(name = "XSchemaTableStatistics.findByInsertLatency", query = "SELECT x FROM XSchemaTableStatistics x WHERE x.insertLatency = :insertLatency"),
    @NamedQuery(name = "XSchemaTableStatistics.findByRowsUpdated", query = "SELECT x FROM XSchemaTableStatistics x WHERE x.rowsUpdated = :rowsUpdated"),
    @NamedQuery(name = "XSchemaTableStatistics.findByUpdateLatency", query = "SELECT x FROM XSchemaTableStatistics x WHERE x.updateLatency = :updateLatency"),
    @NamedQuery(name = "XSchemaTableStatistics.findByRowsDeleted", query = "SELECT x FROM XSchemaTableStatistics x WHERE x.rowsDeleted = :rowsDeleted"),
    @NamedQuery(name = "XSchemaTableStatistics.findByDeleteLatency", query = "SELECT x FROM XSchemaTableStatistics x WHERE x.deleteLatency = :deleteLatency"),
    @NamedQuery(name = "XSchemaTableStatistics.findByIoReadRequests", query = "SELECT x FROM XSchemaTableStatistics x WHERE x.ioReadRequests = :ioReadRequests"),
    @NamedQuery(name = "XSchemaTableStatistics.findByIoRead", query = "SELECT x FROM XSchemaTableStatistics x WHERE x.ioRead = :ioRead"),
    @NamedQuery(name = "XSchemaTableStatistics.findByIoReadLatency", query = "SELECT x FROM XSchemaTableStatistics x WHERE x.ioReadLatency = :ioReadLatency"),
    @NamedQuery(name = "XSchemaTableStatistics.findByIoWriteRequests", query = "SELECT x FROM XSchemaTableStatistics x WHERE x.ioWriteRequests = :ioWriteRequests"),
    @NamedQuery(name = "XSchemaTableStatistics.findByIoWrite", query = "SELECT x FROM XSchemaTableStatistics x WHERE x.ioWrite = :ioWrite"),
    @NamedQuery(name = "XSchemaTableStatistics.findByIoWriteLatency", query = "SELECT x FROM XSchemaTableStatistics x WHERE x.ioWriteLatency = :ioWriteLatency"),
    @NamedQuery(name = "XSchemaTableStatistics.findByIoMiscRequests", query = "SELECT x FROM XSchemaTableStatistics x WHERE x.ioMiscRequests = :ioMiscRequests"),
    @NamedQuery(name = "XSchemaTableStatistics.findByIoMiscLatency", query = "SELECT x FROM XSchemaTableStatistics x WHERE x.ioMiscLatency = :ioMiscLatency")})
public class XSchemaTableStatistics implements Serializable {

    private static final long serialVersionUID = 1L;
    @Column(name = "table_schema")
    private String tableSchema;
    @Column(name = "table_name")
    private String tableName;
    @Basic(optional = false)
    @Column(name = "total_latency")
    private long totalLatency;
    @Basic(optional = false)
    @Column(name = "rows_fetched")
    private long rowsFetched;
    @Basic(optional = false)
    @Column(name = "fetch_latency")
    private long fetchLatency;
    @Basic(optional = false)
    @Column(name = "rows_inserted")
    private long rowsInserted;
    @Basic(optional = false)
    @Column(name = "insert_latency")
    private long insertLatency;
    @Basic(optional = false)
    @Column(name = "rows_updated")
    private long rowsUpdated;
    @Basic(optional = false)
    @Column(name = "update_latency")
    private long updateLatency;
    @Basic(optional = false)
    @Column(name = "rows_deleted")
    private long rowsDeleted;
    @Basic(optional = false)
    @Column(name = "delete_latency")
    private long deleteLatency;
    @Column(name = "io_read_requests")
    private BigInteger ioReadRequests;
    @Column(name = "io_read")
    private BigInteger ioRead;
    @Column(name = "io_read_latency")
    private BigInteger ioReadLatency;
    @Column(name = "io_write_requests")
    private BigInteger ioWriteRequests;
    @Column(name = "io_write")
    private BigInteger ioWrite;
    @Column(name = "io_write_latency")
    private BigInteger ioWriteLatency;
    @Column(name = "io_misc_requests")
    private BigInteger ioMiscRequests;
    @Column(name = "io_misc_latency")
    private BigInteger ioMiscLatency;

    public XSchemaTableStatistics() {
    }

    public String getTableSchema() {
        return tableSchema;
    }

    public void setTableSchema(String tableSchema) {
        this.tableSchema = tableSchema;
    }

    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    public long getTotalLatency() {
        return totalLatency;
    }

    public void setTotalLatency(long totalLatency) {
        this.totalLatency = totalLatency;
    }

    public long getRowsFetched() {
        return rowsFetched;
    }

    public void setRowsFetched(long rowsFetched) {
        this.rowsFetched = rowsFetched;
    }

    public long getFetchLatency() {
        return fetchLatency;
    }

    public void setFetchLatency(long fetchLatency) {
        this.fetchLatency = fetchLatency;
    }

    public long getRowsInserted() {
        return rowsInserted;
    }

    public void setRowsInserted(long rowsInserted) {
        this.rowsInserted = rowsInserted;
    }

    public long getInsertLatency() {
        return insertLatency;
    }

    public void setInsertLatency(long insertLatency) {
        this.insertLatency = insertLatency;
    }

    public long getRowsUpdated() {
        return rowsUpdated;
    }

    public void setRowsUpdated(long rowsUpdated) {
        this.rowsUpdated = rowsUpdated;
    }

    public long getUpdateLatency() {
        return updateLatency;
    }

    public void setUpdateLatency(long updateLatency) {
        this.updateLatency = updateLatency;
    }

    public long getRowsDeleted() {
        return rowsDeleted;
    }

    public void setRowsDeleted(long rowsDeleted) {
        this.rowsDeleted = rowsDeleted;
    }

    public long getDeleteLatency() {
        return deleteLatency;
    }

    public void setDeleteLatency(long deleteLatency) {
        this.deleteLatency = deleteLatency;
    }

    public BigInteger getIoReadRequests() {
        return ioReadRequests;
    }

    public void setIoReadRequests(BigInteger ioReadRequests) {
        this.ioReadRequests = ioReadRequests;
    }

    public BigInteger getIoRead() {
        return ioRead;
    }

    public void setIoRead(BigInteger ioRead) {
        this.ioRead = ioRead;
    }

    public BigInteger getIoReadLatency() {
        return ioReadLatency;
    }

    public void setIoReadLatency(BigInteger ioReadLatency) {
        this.ioReadLatency = ioReadLatency;
    }

    public BigInteger getIoWriteRequests() {
        return ioWriteRequests;
    }

    public void setIoWriteRequests(BigInteger ioWriteRequests) {
        this.ioWriteRequests = ioWriteRequests;
    }

    public BigInteger getIoWrite() {
        return ioWrite;
    }

    public void setIoWrite(BigInteger ioWrite) {
        this.ioWrite = ioWrite;
    }

    public BigInteger getIoWriteLatency() {
        return ioWriteLatency;
    }

    public void setIoWriteLatency(BigInteger ioWriteLatency) {
        this.ioWriteLatency = ioWriteLatency;
    }

    public BigInteger getIoMiscRequests() {
        return ioMiscRequests;
    }

    public void setIoMiscRequests(BigInteger ioMiscRequests) {
        this.ioMiscRequests = ioMiscRequests;
    }

    public BigInteger getIoMiscLatency() {
        return ioMiscLatency;
    }

    public void setIoMiscLatency(BigInteger ioMiscLatency) {
        this.ioMiscLatency = ioMiscLatency;
    }
    
}
