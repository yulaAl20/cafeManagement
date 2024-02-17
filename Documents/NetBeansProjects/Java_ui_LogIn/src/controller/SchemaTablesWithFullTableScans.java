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
@Table(name = "schema_tables_with_full_table_scans")
@NamedQueries({
    @NamedQuery(name = "SchemaTablesWithFullTableScans.findAll", query = "SELECT s FROM SchemaTablesWithFullTableScans s"),
    @NamedQuery(name = "SchemaTablesWithFullTableScans.findByObjectSchema", query = "SELECT s FROM SchemaTablesWithFullTableScans s WHERE s.objectSchema = :objectSchema"),
    @NamedQuery(name = "SchemaTablesWithFullTableScans.findByObjectName", query = "SELECT s FROM SchemaTablesWithFullTableScans s WHERE s.objectName = :objectName"),
    @NamedQuery(name = "SchemaTablesWithFullTableScans.findByRowsFullScanned", query = "SELECT s FROM SchemaTablesWithFullTableScans s WHERE s.rowsFullScanned = :rowsFullScanned"),
    @NamedQuery(name = "SchemaTablesWithFullTableScans.findByLatency", query = "SELECT s FROM SchemaTablesWithFullTableScans s WHERE s.latency = :latency")})
public class SchemaTablesWithFullTableScans implements Serializable {

    private static final long serialVersionUID = 1L;
    @Column(name = "object_schema")
    private String objectSchema;
    @Column(name = "object_name")
    private String objectName;
    @Basic(optional = false)
    @Column(name = "rows_full_scanned")
    private long rowsFullScanned;
    @Column(name = "latency")
    private String latency;

    public SchemaTablesWithFullTableScans() {
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

    public String getLatency() {
        return latency;
    }

    public void setLatency(String latency) {
        this.latency = latency;
    }
    
}
