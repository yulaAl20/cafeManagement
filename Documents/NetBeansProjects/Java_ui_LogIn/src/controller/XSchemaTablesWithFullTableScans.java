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
@Table(name = "x$schema_tables_with_full_table_scans")
@NamedQueries({
    @NamedQuery(name = "XSchemaTablesWithFullTableScans.findAll", query = "SELECT x FROM XSchemaTablesWithFullTableScans x"),
    @NamedQuery(name = "XSchemaTablesWithFullTableScans.findByObjectSchema", query = "SELECT x FROM XSchemaTablesWithFullTableScans x WHERE x.objectSchema = :objectSchema"),
    @NamedQuery(name = "XSchemaTablesWithFullTableScans.findByObjectName", query = "SELECT x FROM XSchemaTablesWithFullTableScans x WHERE x.objectName = :objectName"),
    @NamedQuery(name = "XSchemaTablesWithFullTableScans.findByRowsFullScanned", query = "SELECT x FROM XSchemaTablesWithFullTableScans x WHERE x.rowsFullScanned = :rowsFullScanned"),
    @NamedQuery(name = "XSchemaTablesWithFullTableScans.findByLatency", query = "SELECT x FROM XSchemaTablesWithFullTableScans x WHERE x.latency = :latency")})
public class XSchemaTablesWithFullTableScans implements Serializable {

    private static final long serialVersionUID = 1L;
    @Column(name = "object_schema")
    private String objectSchema;
    @Column(name = "object_name")
    private String objectName;
    @Basic(optional = false)
    @Column(name = "rows_full_scanned")
    private long rowsFullScanned;
    @Basic(optional = false)
    @Column(name = "latency")
    private long latency;

    public XSchemaTablesWithFullTableScans() {
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

    public long getRowsFullScanned() {
        return rowsFullScanned;
    }

    public void setRowsFullScanned(long rowsFullScanned) {
        this.rowsFullScanned = rowsFullScanned;
    }

    public long getLatency() {
        return latency;
    }

    public void setLatency(long latency) {
        this.latency = latency;
    }
    
}
