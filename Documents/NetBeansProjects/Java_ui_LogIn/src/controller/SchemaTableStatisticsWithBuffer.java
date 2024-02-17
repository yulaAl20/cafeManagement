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
@Table(name = "schema_table_statistics_with_buffer")
@NamedQueries({
    @NamedQuery(name = "SchemaTableStatisticsWithBuffer.findAll", query = "SELECT s FROM SchemaTableStatisticsWithBuffer s"),
    @NamedQuery(name = "SchemaTableStatisticsWithBuffer.findByTableSchema", query = "SELECT s FROM SchemaTableStatisticsWithBuffer s WHERE s.tableSchema = :tableSchema"),
    @NamedQuery(name = "SchemaTableStatisticsWithBuffer.findByTableName", query = "SELECT s FROM SchemaTableStatisticsWithBuffer s WHERE s.tableName = :tableName"),
    @NamedQuery(name = "SchemaTableStatisticsWithBuffer.findByRowsFetched", query = "SELECT s FROM SchemaTableStatisticsWithBuffer s WHERE s.rowsFetched = :rowsFetched"),
    @NamedQuery(name = "SchemaTableStatisticsWithBuffer.findByFetchLatency", query = "SELECT s FROM SchemaTableStatisticsWithBuffer s WHERE s.fetchLatency = :fetchLatency"),
    @NamedQuery(name = "SchemaTableStatisticsWithBuffer.findByRowsInserted", query = "SELECT s FROM SchemaTableStatisticsWithBuffer s WHERE s.rowsInserted = :rowsInserted"),
    @NamedQuery(name = "SchemaTableStatisticsWithBuffer.findByInsertLatency", query = "SELECT s FROM SchemaTableStatisticsWithBuffer s WHERE s.insertLatency = :insertLatency"),
    @NamedQuery(name = "SchemaTableStatisticsWithBuffer.findByRowsUpdated", query = "SELECT s FROM SchemaTableStatisticsWithBuffer s WHERE s.rowsUpdated = :rowsUpdated"),
    @NamedQuery(name = "SchemaTableStatisticsWithBuffer.findByUpdateLatency", query = "SELECT s FROM SchemaTableStatisticsWithBuffer s WHERE s.updateLatency = :updateLatency"),
    @NamedQuery(name = "SchemaTableStatisticsWithBuffer.findByRowsDeleted", query = "SELECT s FROM SchemaTableStatisticsWithBuffer s WHERE s.rowsDeleted = :rowsDeleted"),
    @NamedQuery(name = "SchemaTableStatisticsWithBuffer.findByDeleteLatency", query = "SELECT s FROM SchemaTableStatisticsWithBuffer s WHERE s.deleteLatency = :deleteLatency"),
    @NamedQuery(name = "SchemaTableStatisticsWithBuffer.findByIoReadRequests", query = "SELECT s FROM SchemaTableStatisticsWithBuffer s WHERE s.ioReadRequests = :ioReadRequests"),
    @NamedQuery(name = "SchemaTableStatisticsWithBuffer.findByIoRead", query = "SELECT s FROM SchemaTableStatisticsWithBuffer s WHERE s.ioRead = :ioRead"),
    @NamedQuery(name = "SchemaTableStatisticsWithBuffer.findByIoReadLatency", query = "SELECT s FROM SchemaTableStatisticsWithBuffer s WHERE s.ioReadLatency = :ioReadLatency"),
    @NamedQuery(name = "SchemaTableStatisticsWithBuffer.findByIoWriteRequests", query = "SELECT s FROM SchemaTableStatisticsWithBuffer s WHERE s.ioWriteRequests = :ioWriteRequests"),
    @NamedQuery(name = "SchemaTableStatisticsWithBuffer.findByIoWrite", query = "SELECT s FROM SchemaTableStatisticsWithBuffer s WHERE s.ioWrite = :ioWrite"),
    @NamedQuery(name = "SchemaTableStatisticsWithBuffer.findByIoWriteLatency", query = "SELECT s FROM SchemaTableStatisticsWithBuffer s WHERE s.ioWriteLatency = :ioWriteLatency"),
    @NamedQuery(name = "SchemaTableStatisticsWithBuffer.findByIoMiscRequests", query = "SELECT s FROM SchemaTableStatisticsWithBuffer s WHERE s.ioMiscRequests = :ioMiscRequests"),
    @NamedQuery(name = "SchemaTableStatisticsWithBuffer.findByIoMiscLatency", query = "SELECT s FROM SchemaTableStatisticsWithBuffer s WHERE s.ioMiscLatency = :ioMiscLatency"),
    @NamedQuery(name = "SchemaTableStatisticsWithBuffer.findByInnodbBufferAllocated", query = "SELECT s FROM SchemaTableStatisticsWithBuffer s WHERE s.innodbBufferAllocated = :innodbBufferAllocated"),
    @NamedQuery(name = "SchemaTableStatisticsWithBuffer.findByInnodbBufferData", query = "SELECT s FROM SchemaTableStatisticsWithBuffer s WHERE s.innodbBufferData = :innodbBufferData"),
    @NamedQuery(name = "SchemaTableStatisticsWithBuffer.findByInnodbBufferFree", query = "SELECT s FROM SchemaTableStatisticsWithBuffer s WHERE s.innodbBufferFree = :innodbBufferFree"),
    @NamedQuery(name = "SchemaTableStatisticsWithBuffer.findByInnodbBufferPages", query = "SELECT s FROM SchemaTableStatisticsWithBuffer s WHERE s.innodbBufferPages = :innodbBufferPages"),
    @NamedQuery(name = "SchemaTableStatisticsWithBuffer.findByInnodbBufferPagesHashed", query = "SELECT s FROM SchemaTableStatisticsWithBuffer s WHERE s.innodbBufferPagesHashed = :innodbBufferPagesHashed"),
    @NamedQuery(name = "SchemaTableStatisticsWithBuffer.findByInnodbBufferPagesOld", query = "SELECT s FROM SchemaTableStatisticsWithBuffer s WHERE s.innodbBufferPagesOld = :innodbBufferPagesOld"),
    @NamedQuery(name = "SchemaTableStatisticsWithBuffer.findByInnodbBufferRowsCached", query = "SELECT s FROM SchemaTableStatisticsWithBuffer s WHERE s.innodbBufferRowsCached = :innodbBufferRowsCached")})
public class SchemaTableStatisticsWithBuffer implements Serializable {

    private static final long serialVersionUID = 1L;
    @Column(name = "table_schema")
    private String tableSchema;
    @Column(name = "table_name")
    private String tableName;
    @Basic(optional = false)
    @Column(name = "rows_fetched")
    private long rowsFetched;
    @Column(name = "fetch_latency")
    private String fetchLatency;
    @Basic(optional = false)
    @Column(name = "rows_inserted")
    private long rowsInserted;
    @Column(name = "insert_latency")
    private String insertLatency;
    @Basic(optional = false)
    @Column(name = "rows_updated")
    private long rowsUpdated;
    @Column(name = "update_latency")
    private String updateLatency;
    @Basic(optional = false)
    @Column(name = "rows_deleted")
    private long rowsDeleted;
    @Column(name = "delete_latency")
    private String deleteLatency;
    @Column(name = "io_read_requests")
    private BigInteger ioReadRequests;
    @Column(name = "io_read")
    private String ioRead;
    @Column(name = "io_read_latency")
    private String ioReadLatency;
    @Column(name = "io_write_requests")
    private BigInteger ioWriteRequests;
    @Column(name = "io_write")
    private String ioWrite;
    @Column(name = "io_write_latency")
    private String ioWriteLatency;
    @Column(name = "io_misc_requests")
    private BigInteger ioMiscRequests;
    @Column(name = "io_misc_latency")
    private String ioMiscLatency;
    @Column(name = "innodb_buffer_allocated")
    private String innodbBufferAllocated;
    @Column(name = "innodb_buffer_data")
    private String innodbBufferData;
    @Column(name = "innodb_buffer_free")
    private String innodbBufferFree;
    @Column(name = "innodb_buffer_pages")
    private BigInteger innodbBufferPages;
    @Column(name = "innodb_buffer_pages_hashed")
    private BigInteger innodbBufferPagesHashed;
    @Column(name = "innodb_buffer_pages_old")
    private BigInteger innodbBufferPagesOld;
    @Column(name = "innodb_buffer_rows_cached")
    private BigInteger innodbBufferRowsCached;

    public SchemaTableStatisticsWithBuffer() {
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

    public String getFetchLatency() {
        return fetchLatency;
    }

    public void setFetchLatency(String fetchLatency) {
        this.fetchLatency = fetchLatency;
    }

    public long getRowsInserted() {
        return rowsInserted;
    }

    public void setRowsInserted(long rowsInserted) {
        this.rowsInserted = rowsInserted;
    }

    public String getInsertLatency() {
        return insertLatency;
    }

    public void setInsertLatency(String insertLatency) {
        this.insertLatency = insertLatency;
    }

    public long getRowsUpdated() {
        return rowsUpdated;
    }

    public void setRowsUpdated(long rowsUpdated) {
        this.rowsUpdated = rowsUpdated;
    }

    public String getUpdateLatency() {
        return updateLatency;
    }

    public void setUpdateLatency(String updateLatency) {
        this.updateLatency = updateLatency;
    }

    public long getRowsDeleted() {
        return rowsDeleted;
    }

    public void setRowsDeleted(long rowsDeleted) {
        this.rowsDeleted = rowsDeleted;
    }

    public String getDeleteLatency() {
        return deleteLatency;
    }

    public void setDeleteLatency(String deleteLatency) {
        this.deleteLatency = deleteLatency;
    }

    public BigInteger getIoReadRequests() {
        return ioReadRequests;
    }

    public void setIoReadRequests(BigInteger ioReadRequests) {
        this.ioReadRequests = ioReadRequests;
    }

    public String getIoRead() {
        return ioRead;
    }

    public void setIoRead(String ioRead) {
        this.ioRead = ioRead;
    }

    public String getIoReadLatency() {
        return ioReadLatency;
    }

    public void setIoReadLatency(String ioReadLatency) {
        this.ioReadLatency = ioReadLatency;
    }

    public BigInteger getIoWriteRequests() {
        return ioWriteRequests;
    }

    public void setIoWriteRequests(BigInteger ioWriteRequests) {
        this.ioWriteRequests = ioWriteRequests;
    }

    public String getIoWrite() {
        return ioWrite;
    }

    public void setIoWrite(String ioWrite) {
        this.ioWrite = ioWrite;
    }

    public String getIoWriteLatency() {
        return ioWriteLatency;
    }

    public void setIoWriteLatency(String ioWriteLatency) {
        this.ioWriteLatency = ioWriteLatency;
    }

    public BigInteger getIoMiscRequests() {
        return ioMiscRequests;
    }

    public void setIoMiscRequests(BigInteger ioMiscRequests) {
        this.ioMiscRequests = ioMiscRequests;
    }

    public String getIoMiscLatency() {
        return ioMiscLatency;
    }

    public void setIoMiscLatency(String ioMiscLatency) {
        this.ioMiscLatency = ioMiscLatency;
    }

    public String getInnodbBufferAllocated() {
        return innodbBufferAllocated;
    }

    public void setInnodbBufferAllocated(String innodbBufferAllocated) {
        this.innodbBufferAllocated = innodbBufferAllocated;
    }

    public String getInnodbBufferData() {
        return innodbBufferData;
    }

    public void setInnodbBufferData(String innodbBufferData) {
        this.innodbBufferData = innodbBufferData;
    }

    public String getInnodbBufferFree() {
        return innodbBufferFree;
    }

    public void setInnodbBufferFree(String innodbBufferFree) {
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
