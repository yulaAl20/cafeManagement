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
@Table(name = "schema_table_statistics")
@NamedQueries({
    @NamedQuery(name = "SchemaTableStatistics.findAll", query = "SELECT s FROM SchemaTableStatistics s"),
    @NamedQuery(name = "SchemaTableStatistics.findByTableSchema", query = "SELECT s FROM SchemaTableStatistics s WHERE s.tableSchema = :tableSchema"),
    @NamedQuery(name = "SchemaTableStatistics.findByTableName", query = "SELECT s FROM SchemaTableStatistics s WHERE s.tableName = :tableName"),
    @NamedQuery(name = "SchemaTableStatistics.findByTotalLatency", query = "SELECT s FROM SchemaTableStatistics s WHERE s.totalLatency = :totalLatency"),
    @NamedQuery(name = "SchemaTableStatistics.findByRowsFetched", query = "SELECT s FROM SchemaTableStatistics s WHERE s.rowsFetched = :rowsFetched"),
    @NamedQuery(name = "SchemaTableStatistics.findByFetchLatency", query = "SELECT s FROM SchemaTableStatistics s WHERE s.fetchLatency = :fetchLatency"),
    @NamedQuery(name = "SchemaTableStatistics.findByRowsInserted", query = "SELECT s FROM SchemaTableStatistics s WHERE s.rowsInserted = :rowsInserted"),
    @NamedQuery(name = "SchemaTableStatistics.findByInsertLatency", query = "SELECT s FROM SchemaTableStatistics s WHERE s.insertLatency = :insertLatency"),
    @NamedQuery(name = "SchemaTableStatistics.findByRowsUpdated", query = "SELECT s FROM SchemaTableStatistics s WHERE s.rowsUpdated = :rowsUpdated"),
    @NamedQuery(name = "SchemaTableStatistics.findByUpdateLatency", query = "SELECT s FROM SchemaTableStatistics s WHERE s.updateLatency = :updateLatency"),
    @NamedQuery(name = "SchemaTableStatistics.findByRowsDeleted", query = "SELECT s FROM SchemaTableStatistics s WHERE s.rowsDeleted = :rowsDeleted"),
    @NamedQuery(name = "SchemaTableStatistics.findByDeleteLatency", query = "SELECT s FROM SchemaTableStatistics s WHERE s.deleteLatency = :deleteLatency"),
    @NamedQuery(name = "SchemaTableStatistics.findByIoReadRequests", query = "SELECT s FROM SchemaTableStatistics s WHERE s.ioReadRequests = :ioReadRequests"),
    @NamedQuery(name = "SchemaTableStatistics.findByIoRead", query = "SELECT s FROM SchemaTableStatistics s WHERE s.ioRead = :ioRead"),
    @NamedQuery(name = "SchemaTableStatistics.findByIoReadLatency", query = "SELECT s FROM SchemaTableStatistics s WHERE s.ioReadLatency = :ioReadLatency"),
    @NamedQuery(name = "SchemaTableStatistics.findByIoWriteRequests", query = "SELECT s FROM SchemaTableStatistics s WHERE s.ioWriteRequests = :ioWriteRequests"),
    @NamedQuery(name = "SchemaTableStatistics.findByIoWrite", query = "SELECT s FROM SchemaTableStatistics s WHERE s.ioWrite = :ioWrite"),
    @NamedQuery(name = "SchemaTableStatistics.findByIoWriteLatency", query = "SELECT s FROM SchemaTableStatistics s WHERE s.ioWriteLatency = :ioWriteLatency"),
    @NamedQuery(name = "SchemaTableStatistics.findByIoMiscRequests", query = "SELECT s FROM SchemaTableStatistics s WHERE s.ioMiscRequests = :ioMiscRequests"),
    @NamedQuery(name = "SchemaTableStatistics.findByIoMiscLatency", query = "SELECT s FROM SchemaTableStatistics s WHERE s.ioMiscLatency = :ioMiscLatency")})
public class SchemaTableStatistics implements Serializable {

    private static final long serialVersionUID = 1L;
    @Column(name = "table_schema")
    private String tableSchema;
    @Column(name = "table_name")
    private String tableName;
    @Column(name = "total_latency")
    private String totalLatency;
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

    public SchemaTableStatistics() {
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

    public String getTotalLatency() {
        return totalLatency;
    }

    public void setTotalLatency(String totalLatency) {
        this.totalLatency = totalLatency;
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
    
}
