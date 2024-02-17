/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.io.Serializable;
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
@Table(name = "schema_redundant_indexes")
@NamedQueries({
    @NamedQuery(name = "SchemaRedundantIndexes.findAll", query = "SELECT s FROM SchemaRedundantIndexes s"),
    @NamedQuery(name = "SchemaRedundantIndexes.findByTableSchema", query = "SELECT s FROM SchemaRedundantIndexes s WHERE s.tableSchema = :tableSchema"),
    @NamedQuery(name = "SchemaRedundantIndexes.findByTableName", query = "SELECT s FROM SchemaRedundantIndexes s WHERE s.tableName = :tableName"),
    @NamedQuery(name = "SchemaRedundantIndexes.findByRedundantIndexName", query = "SELECT s FROM SchemaRedundantIndexes s WHERE s.redundantIndexName = :redundantIndexName"),
    @NamedQuery(name = "SchemaRedundantIndexes.findByRedundantIndexNonUnique", query = "SELECT s FROM SchemaRedundantIndexes s WHERE s.redundantIndexNonUnique = :redundantIndexNonUnique"),
    @NamedQuery(name = "SchemaRedundantIndexes.findByDominantIndexName", query = "SELECT s FROM SchemaRedundantIndexes s WHERE s.dominantIndexName = :dominantIndexName"),
    @NamedQuery(name = "SchemaRedundantIndexes.findByDominantIndexNonUnique", query = "SELECT s FROM SchemaRedundantIndexes s WHERE s.dominantIndexNonUnique = :dominantIndexNonUnique"),
    @NamedQuery(name = "SchemaRedundantIndexes.findBySubpartExists", query = "SELECT s FROM SchemaRedundantIndexes s WHERE s.subpartExists = :subpartExists"),
    @NamedQuery(name = "SchemaRedundantIndexes.findBySqlDropIndex", query = "SELECT s FROM SchemaRedundantIndexes s WHERE s.sqlDropIndex = :sqlDropIndex")})
public class SchemaRedundantIndexes implements Serializable {

    private static final long serialVersionUID = 1L;
    @Column(name = "table_schema")
    private String tableSchema;
    @Column(name = "table_name")
    private String tableName;
    @Column(name = "redundant_index_name")
    private String redundantIndexName;
    @Lob
    @Column(name = "redundant_index_columns")
    private String redundantIndexColumns;
    @Column(name = "redundant_index_non_unique")
    private Integer redundantIndexNonUnique;
    @Column(name = "dominant_index_name")
    private String dominantIndexName;
    @Lob
    @Column(name = "dominant_index_columns")
    private String dominantIndexColumns;
    @Column(name = "dominant_index_non_unique")
    private Integer dominantIndexNonUnique;
    @Basic(optional = false)
    @Column(name = "subpart_exists")
    private int subpartExists;
    @Column(name = "sql_drop_index")
    private String sqlDropIndex;

    public SchemaRedundantIndexes() {
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

    public String getRedundantIndexName() {
        return redundantIndexName;
    }

    public void setRedundantIndexName(String redundantIndexName) {
        this.redundantIndexName = redundantIndexName;
    }

    public String getRedundantIndexColumns() {
        return redundantIndexColumns;
    }

    public void setRedundantIndexColumns(String redundantIndexColumns) {
        this.redundantIndexColumns = redundantIndexColumns;
    }

    public Integer getRedundantIndexNonUnique() {
        return redundantIndexNonUnique;
    }

    public void setRedundantIndexNonUnique(Integer redundantIndexNonUnique) {
        this.redundantIndexNonUnique = redundantIndexNonUnique;
    }

    public String getDominantIndexName() {
        return dominantIndexName;
    }

    public void setDominantIndexName(String dominantIndexName) {
        this.dominantIndexName = dominantIndexName;
    }

    public String getDominantIndexColumns() {
        return dominantIndexColumns;
    }

    public void setDominantIndexColumns(String dominantIndexColumns) {
        this.dominantIndexColumns = dominantIndexColumns;
    }

    public Integer getDominantIndexNonUnique() {
        return dominantIndexNonUnique;
    }

    public void setDominantIndexNonUnique(Integer dominantIndexNonUnique) {
        this.dominantIndexNonUnique = dominantIndexNonUnique;
    }

    public int getSubpartExists() {
        return subpartExists;
    }

    public void setSubpartExists(int subpartExists) {
        this.subpartExists = subpartExists;
    }

    public String getSqlDropIndex() {
        return sqlDropIndex;
    }

    public void setSqlDropIndex(String sqlDropIndex) {
        this.sqlDropIndex = sqlDropIndex;
    }
    
}
