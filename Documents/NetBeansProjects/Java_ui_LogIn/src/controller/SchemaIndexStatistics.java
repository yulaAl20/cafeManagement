/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.io.Serializable;
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
@Table(name = "schema_index_statistics")
@NamedQueries({
    @NamedQuery(name = "SchemaIndexStatistics.findAll", query = "SELECT s FROM SchemaIndexStatistics s"),
    @NamedQuery(name = "SchemaIndexStatistics.findByTableSchema", query = "SELECT s FROM SchemaIndexStatistics s WHERE s.tableSchema = :tableSchema"),
    @NamedQuery(name = "SchemaIndexStatistics.findByTableName", query = "SELECT s FROM SchemaIndexStatistics s WHERE s.tableName = :tableName"),
    @NamedQuery(name = "SchemaIndexStatistics.findByIndexName", query = "SELECT s FROM SchemaIndexStatistics s WHERE s.indexName = :indexName"),
    @NamedQuery(name = "SchemaIndexStatistics.findByRowsSelected", query = "SELECT s FROM SchemaIndexStatistics s WHERE s.rowsSelected = :rowsSelected"),
    @NamedQuery(name = "SchemaIndexStatistics.findBySelectLatency", query = "SELECT s FROM SchemaIndexStatistics s WHERE s.selectLatency = :selectLatency"),
    @NamedQuery(name = "SchemaIndexStatistics.findByRowsInserted", query = "SELECT s FROM SchemaIndexStatistics s WHERE s.rowsInserted = :rowsInserted"),
    @NamedQuery(name = "SchemaIndexStatistics.findByInsertLatency", query = "SELECT s FROM SchemaIndexStatistics s WHERE s.insertLatency = :insertLatency"),
    @NamedQuery(name = "SchemaIndexStatistics.findByRowsUpdated", query = "SELECT s FROM SchemaIndexStatistics s WHERE s.rowsUpdated = :rowsUpdated"),
    @NamedQuery(name = "SchemaIndexStatistics.findByUpdateLatency", query = "SELECT s FROM SchemaIndexStatistics s WHERE s.updateLatency = :updateLatency"),
    @NamedQuery(name = "SchemaIndexStatistics.findByRowsDeleted", query = "SELECT s FROM SchemaIndexStatistics s WHERE s.rowsDeleted = :rowsDeleted"),
    @NamedQuery(name = "SchemaIndexStatistics.findByDeleteLatency", query = "SELECT s FROM SchemaIndexStatistics s WHERE s.deleteLatency = :deleteLatency")})
public class SchemaIndexStatistics implements Serializable {

    private static final long serialVersionUID = 1L;
    @Column(name = "table_schema")
    private String tableSchema;
    @Column(name = "table_name")
    private String tableName;
    @Column(name = "index_name")
    private String indexName;
    @Basic(optional = false)
    @Column(name = "rows_selected")
    private long rowsSelected;
    @Column(name = "select_latency")
    private String selectLatency;
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

    public SchemaIndexStatistics() {
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

    public String getIndexName() {
        return indexName;
    }

    public void setIndexName(String indexName) {
        this.indexName = indexName;
    }

    public long getRowsSelected() {
        return rowsSelected;
    }

    public void setRowsSelected(long rowsSelected) {
        this.rowsSelected = rowsSelected;
    }

    public String getSelectLatency() {
        return selectLatency;
    }

    public void setSelectLatency(String selectLatency) {
        this.selectLatency = selectLatency;
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
    
}
