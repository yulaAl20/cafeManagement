/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.io.Serializable;
import java.math.BigInteger;
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
@Table(name = "x$schema_flattened_keys")
@NamedQueries({
    @NamedQuery(name = "XSchemaFlattenedKeys.findAll", query = "SELECT x FROM XSchemaFlattenedKeys x"),
    @NamedQuery(name = "XSchemaFlattenedKeys.findByTableSchema", query = "SELECT x FROM XSchemaFlattenedKeys x WHERE x.tableSchema = :tableSchema"),
    @NamedQuery(name = "XSchemaFlattenedKeys.findByTableName", query = "SELECT x FROM XSchemaFlattenedKeys x WHERE x.tableName = :tableName"),
    @NamedQuery(name = "XSchemaFlattenedKeys.findByIndexName", query = "SELECT x FROM XSchemaFlattenedKeys x WHERE x.indexName = :indexName"),
    @NamedQuery(name = "XSchemaFlattenedKeys.findByNonUnique", query = "SELECT x FROM XSchemaFlattenedKeys x WHERE x.nonUnique = :nonUnique"),
    @NamedQuery(name = "XSchemaFlattenedKeys.findBySubpartExists", query = "SELECT x FROM XSchemaFlattenedKeys x WHERE x.subpartExists = :subpartExists")})
public class XSchemaFlattenedKeys implements Serializable {

    private static final long serialVersionUID = 1L;
    @Column(name = "table_schema")
    private String tableSchema;
    @Column(name = "table_name")
    private String tableName;
    @Column(name = "index_name")
    private String indexName;
    @Column(name = "non_unique")
    private Integer nonUnique;
    @Column(name = "subpart_exists")
    private BigInteger subpartExists;
    @Lob
    @Column(name = "index_columns")
    private String indexColumns;

    public XSchemaFlattenedKeys() {
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

    public Integer getNonUnique() {
        return nonUnique;
    }

    public void setNonUnique(Integer nonUnique) {
        this.nonUnique = nonUnique;
    }

    public BigInteger getSubpartExists() {
        return subpartExists;
    }

    public void setSubpartExists(BigInteger subpartExists) {
        this.subpartExists = subpartExists;
    }

    public String getIndexColumns() {
        return indexColumns;
    }

    public void setIndexColumns(String indexColumns) {
        this.indexColumns = indexColumns;
    }
    
}
