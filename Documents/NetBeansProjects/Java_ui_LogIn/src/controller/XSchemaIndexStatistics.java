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
@Table(name = "x$schema_index_statistics")
@NamedQueries({
    @NamedQuery(name = "XSchemaIndexStatistics.findAll", query = "SELECT x FROM XSchemaIndexStatistics x"),
    @NamedQuery(name = "XSchemaIndexStatistics.findByTableSchema", query = "SELECT x FROM XSchemaIndexStatistics x WHERE x.tableSchema = :tableSchema"),
    @NamedQuery(name = "XSchemaIndexStatistics.findByTableName", query = "SELECT x FROM XSchemaIndexStatistics x WHERE x.tableName = :tableName"),
    @NamedQuery(name = "XSchemaIndexStatistics.findByIndexName", query = "SELECT x FROM XSchemaIndexStatistics x WHERE x.indexName = :indexName"),
    @NamedQuery(name = "XSchemaIndexStatistics.findByRowsSelected", query = "SELECT x FROM XSchemaIndexStatistics x WHERE x.rowsSelected = :rowsSelected"),
    @NamedQuery(name = "XSchemaIndexStatistics.findBySelectLatency", query = "SELECT x FROM XSchemaIndexStatistics x WHERE x.selectLatency = :selectLatency"),
    @NamedQuery(name = "XSchemaIndexStatistics.findByRowsInserted", query = "SELECT x FROM XSchemaIndexStatistics x WHERE x.rowsInserted = :rowsInserted"),
    @NamedQuery(name = "XSchemaIndexStatistics.findByInsertLatency", query = "SELECT x FROM XSchemaIndexStatistics x WHERE x.insertLatency = :insertLatency"),
    @NamedQuery(name = "XSchemaIndexStatistics.findByRowsUpdated", query = "SELECT x FROM XSchemaIndexStatistics x WHERE x.rowsUpdated = :rowsUpdated"),
    @NamedQuery(name = "XSchemaIndexStatistics.findByUpdateLatency", query = "SELECT x FROM XSchemaIndexStatistics x WHERE x.updateLatency = :updateLatency"),
    @NamedQuery(name = "XSchemaIndexStatistics.findByRowsDeleted", query = "SELECT x FROM XSchemaIndexStatistics x WHERE x.rowsDeleted = :rowsDeleted"),
    @NamedQuery(name = "XSchemaIndexStatistics.findByDeleteLatency", query = "SELECT x FROM XSchemaIndexStatistics x WHERE x.deleteLatency = :deleteLatency")})
public class XSchemaIndexStatistics implements Serializable {

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
    @Basic(optional = false)
    @Column(name = "select_latency")
    private long selectLatency;
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

    public XSchemaIndexStatistics() {
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

    public long getSelectLatency() {
        return selectLatency;
    }

    public void setSelectLatency(long selectLatency) {
        this.selectLatency = selectLatency;
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
    
}
