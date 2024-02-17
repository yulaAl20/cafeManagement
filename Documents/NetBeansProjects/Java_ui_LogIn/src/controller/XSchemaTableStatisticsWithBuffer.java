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
@Table(name = "x$schema_table_statistics_with_buffer")
@NamedQueries({
    @NamedQuery(name = "XSchemaTableStatisticsWithBuffer.findAll", query = "SELECT x FROM XSchemaTableStatisticsWithBuffer x"),
    @NamedQuery(name = "XSchemaTableStatisticsWithBuffer.findByTableSchema", query = "SELECT x FROM XSchemaTableStatisticsWithBuffer x WHERE x.tableSchema = :tableSchema"),
    @NamedQuery(name = "XSchemaTableStatisticsWithBuffer.findByTableName", query = "SELECT x FROM XSchemaTableStatisticsWithBuffer x WHERE x.tableName = :tableName"),
    @NamedQuery(name = "XSchemaTableStatisticsWithBuffer.findByRowsFetched", query = "SELECT x FROM XSchemaTableStatisticsWithBuffer x WHERE x.rowsFetched = :rowsFetched"),
    @NamedQuery(name = "XSchemaTableStatisticsWithBuffer.findByFetchLatency", query = "SELECT x FROM XSchemaTableStatisticsWithBuffer x WHERE x.fetchLatency = :fetchLatency"),
    @NamedQuery(name = "XSchemaTableStatisticsWithBuffer.findByRowsInserted", query = "SELECT x FROM XSchemaTableStatisticsWithBuffer x WHERE x.rowsInserted = :rowsInserted"),
    @NamedQuery(name = "XSchemaTableStatisticsWithBuffer.findByInsertLatency", query = "SELECT x FROM XSchemaTableStatisticsWithBuffer x WHERE x.insertLatency = :insertLatency"),
    @NamedQuery(name = "XSchemaTableStatisticsWithBuffer.findByRowsUpdated", query = "SELECT x FROM XSchemaTableStatisticsWithBuffer x WHERE x.rowsUpdated = :rowsUpdated"),
    @NamedQuery(name = "XSchemaTableStatisticsWithBuffer.findByUpdateLatency", query = "SELECT x FROM XSchemaTableStatisticsWithBuffer x WHERE x.updateLatency = :updateLatency"),
    @NamedQuery(name = "XSchemaTableStatisticsWithBuffer.findByRowsDeleted", query = "SELECT x FROM XSchemaTableStatisticsWithBuffer x WHERE x.rowsDeleted = :rowsDeleted"),
    @NamedQuery(name = "XSchemaTableStatisticsWithBuffer.findByDeleteLatency", query = "SELECT x FROM XSchemaTableStatisticsWithBuffer x WHERE x.deleteLatency = :deleteLatency"),
    @NamedQuery(name = "XSchemaTableStatisticsWithBuffer.findByIoReadRequests", query = "SELECT x FROM XSchemaTableStatisticsWithBuffer x WHERE x.ioReadRequests = :ioReadRequests"),
    @NamedQuery(name = "XSchemaTableStatisticsWithBuffer.findByIoRead", query = "SELECT x FROM XSchemaTableStatisticsWithBuffer x WHERE x.ioRead = :ioRead"),
    @NamedQuery(name = "XSchemaTableStatisticsWithBuffer.findByIoReadLatency", query = "SELECT x FROM XSchemaTableStatisticsWithBuffer x WHERE x.ioReadLatency = :ioReadLatency"),
    @NamedQuery(name = "XSchemaTableStatisticsWithBuffer.findByIoWriteRequests", query = "SELECT x FROM XSchemaTableStatisticsWithBuffer x WHERE x.ioWriteRequests = :ioWriteRequests"),
    @NamedQuery(name = "XSchemaTableStatisticsWithBuffer.findByIoWrite", query = "SELECT x FROM XSchemaTableStatisticsWithBuffer x WHERE x.ioWrite = :ioWrite"),
    @NamedQuery(name = "XSchemaTableStatisticsWithBuffer.findByIoWriteLatency", query = "SELECT x FROM XSchemaTableStatisticsWithBuffer x WHERE x.ioWriteLatency = :ioWriteLatency"),
    @NamedQuery(name = "XSchemaTableStatisticsWithBuffer.findByIoMiscRequests", query = "SELECT x FROM XSchemaTableStatisticsWithBuffer x WHERE x.ioMiscRequests = :ioMiscRequests"),
    @NamedQuery(name = "XSchemaTableStatisticsWithBuffer.findByIoMiscLatency", query = "SELECT x FROM XSchemaTableStatisticsWithBuffer x WHERE x.ioMiscLatency = :ioMiscLatency"),
    @NamedQuery(name = "XSchemaTableStatisticsWithBuffer.findByInnodbBufferAllocated", query = "SELECT x FROM XSchemaTableStatisticsWithBuffer x WHERE x.innodbBufferAllocated = :innodbBufferAllocated"),
    @NamedQuery(name = "XSchemaTableStatisticsWithBuffer.findByInnodbBufferData", query = "SELECT x FROM XSchemaTableStatisticsWithBuffer x WHERE x.innodbBufferData = :innodbBufferData"),
    @NamedQuery(name = "XSchemaTableStatisticsWithBuffer.findByInnodbBufferFree", query = "SELECT x FROM XSchemaTableStatisticsWithBuffer x WHERE x.innodbBufferFree = :innodbBufferFree"),
    @NamedQuery(name = "XSchemaTableStatisticsWithBuffer.findByInnodbBufferPages", query = "SELECT x FROM XSchemaTableStatisticsWithBuffer x WHERE x.innodbBufferPages = :innodbBufferPages"),
    @NamedQuery(name = "XSchemaTableStatisticsWithBuffer.findByInnodbBufferPagesHashed", query = "SELECT x FROM XSchemaTableStatisticsWithBuffer x WHERE x.innodbBufferPagesHashed = :innodbBufferPagesHashed"),
    @NamedQuery(name = "XSchemaTableStatisticsWithBuffer.findByInnodbBufferPagesOld", query = "SELECT x FROM XSchemaTableStatisticsWithBuffer x WHERE x.innodbBufferPagesOld = :innodbBufferPagesOld"),
    @NamedQuery(name = "XSchemaTableStatisticsWithBuffer.findByInnodbBufferRowsCached", query = "SELECT x FROM XSchemaTableStatisticsWithBuffer x WHERE x.innodbBufferRowsCached = :innodbBufferRowsCached")})
public class XSchemaTableStatisticsWithBuffer implements Serializable {

    private static final long serialVersionUID = 1L;
    @Column(name = "table_schema")
    private String tableSchema;
    @Column(name = "table_name")
    private String tableName;
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
    @Column(name = "innodb_buffer_allocated")
    private BigInteger innodbBufferAllocated;
    @Column(name = "innodb_buffer_data")
    private BigInteger innodbBufferData;
    @Column(name = "innodb_buffer_free")
    private BigInteger innodbBufferFree;
    @Column(name = "innodb_buffer_pages")
    private BigInteger innodbBufferPages;
    @Column(name = "innodb_buffer_pages_hashed")
    private BigInteger innodbBufferPagesHashed;
    @Column(name = "innodb_buffer_pages_old")
    private BigInteger innodbBufferPagesOld;
    @Column(name = "innodb_buffer_rows_cached")
    private BigInteger innodbBufferRowsCached;

    public XSchemaTableStatisticsWithBuffer() {
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

    public BigInteger getInnodbBufferAllocated() {
        return innodbBufferAllocated;
    }

    public void setInnodbBufferAllocated(BigInteger innodbBufferAllocated) {
        this.innodbBufferAllocated = innodbBufferAllocated;
    }

    public BigInteger getInnodbBufferData() {
        return innodbBufferData;
    }

    public void setInnodbBufferData(BigInteger innodbBufferData) {
        this.innodbBufferData = innodbBufferData;
    }

    public BigInteger getInnodbBufferFree() {
        return innodbBufferFree;
    }

    public void setInnodbBufferFree(BigInteger innodbBufferFree) {
        this.innodbBufferFree = innodbBufferFree;
    }

    public BigInteger getInnodbBufferPages() {
        return innodbBufferPages;
    }

    public void setInnodbBufferPages(BigInteger innodbBufferPages) {
        this.innodbBufferPages = innodbBufferPages;
    }

    public BigInteger getInnodbBufferPagesHashed() {
        return innodbBufferPagesHashed;
    }

    public void setInnodbBufferPagesHashed(BigInteger innodbBufferPagesHashed) {
        this.innodbBufferPagesHashed = innodbBufferPagesHashed;
    }

    public BigInteger getInnodbBufferPagesOld() {
        return innodbBufferPagesOld;
    }

    public void setInnodbBufferPagesOld(BigInteger innodbBufferPagesOld) {
        this.innodbBufferPagesOld = innodbBufferPagesOld;
    }

    public BigInteger getInnodbBufferRowsCached() {
        return innodbBufferRowsCached;
    }

    public void setInnodbBufferRowsCached(BigInteger innodbBufferRowsCached) {
        this.innodbBufferRowsCached = innodbBufferRowsCached;
    }
    
}
