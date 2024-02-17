/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
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
@Table(name = "schema_auto_increment_columns")
@NamedQueries({
    @NamedQuery(name = "SchemaAutoIncrementColumns.findAll", query = "SELECT s FROM SchemaAutoIncrementColumns s"),
    @NamedQuery(name = "SchemaAutoIncrementColumns.findByTableSchema", query = "SELECT s FROM SchemaAutoIncrementColumns s WHERE s.tableSchema = :tableSchema"),
    @NamedQuery(name = "SchemaAutoIncrementColumns.findByTableName", query = "SELECT s FROM SchemaAutoIncrementColumns s WHERE s.tableName = :tableName"),
    @NamedQuery(name = "SchemaAutoIncrementColumns.findByColumnName", query = "SELECT s FROM SchemaAutoIncrementColumns s WHERE s.columnName = :columnName"),
    @NamedQuery(name = "SchemaAutoIncrementColumns.findByIsSigned", query = "SELECT s FROM SchemaAutoIncrementColumns s WHERE s.isSigned = :isSigned"),
    @NamedQuery(name = "SchemaAutoIncrementColumns.findByIsUnsigned", query = "SELECT s FROM SchemaAutoIncrementColumns s WHERE s.isUnsigned = :isUnsigned"),
    @NamedQuery(name = "SchemaAutoIncrementColumns.findByMaxValue", query = "SELECT s FROM SchemaAutoIncrementColumns s WHERE s.maxValue = :maxValue"),
    @NamedQuery(name = "SchemaAutoIncrementColumns.findByAutoIncrement", query = "SELECT s FROM SchemaAutoIncrementColumns s WHERE s.autoIncrement = :autoIncrement"),
    @NamedQuery(name = "SchemaAutoIncrementColumns.findByAutoIncrementRatio", query = "SELECT s FROM SchemaAutoIncrementColumns s WHERE s.autoIncrementRatio = :autoIncrementRatio")})
public class SchemaAutoIncrementColumns implements Serializable {

    private static final long serialVersionUID = 1L;
    @Column(name = "table_schema")
    private String tableSchema;
    @Column(name = "table_name")
    private String tableName;
    @Column(name = "column_name")
    private String columnName;
    @Lob
    @Column(name = "data_type")
    private String dataType;
    @Basic(optional = false)
    @Lob
    @Column(name = "column_type")
    private String columnType;
    @Basic(optional = false)
    @Column(name = "is_signed")
    private int isSigned;
    @Basic(optional = false)
    @Column(name = "is_unsigned")
    private int isUnsigned;
    @Column(name = "max_value")
    private BigInteger maxValue;
    @Column(name = "auto_increment")
    private BigInteger autoIncrement;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "auto_increment_ratio")
    private BigDecimal autoIncrementRatio;

    public SchemaAutoIncrementColumns() {
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

    public String getColumnName() {
        return columnName;
    }

    public void setColumnName(String columnName) {
        this.columnName = columnName;
    }

    public String getDataType() {
        return dataType;
    }

    public void setDataType(String dataType) {
        this.dataType = dataType;
    }

    public String getColumnType() {
        return columnType;
    }

    public void setColumnType(String columnType) {
        this.columnType = columnType;
    }

    public int getIsSigned() {
        return isSigned;
    }

    public void setIsSigned(int isSigned) {
        this.isSigned = isSigned;
    }

    public int getIsUnsigned() {
        return isUnsigned;
    }

    public void setIsUnsigned(int isUnsigned) {
        this.isUnsigned = isUnsigned;
    }

    public BigInteger getMaxValue() {
        return maxValue;
    }

    public void setMaxValue(BigInteger maxValue) {
        this.maxValue = maxValue;
    }

    public BigInteger getAutoIncrement() {
        return autoIncrement;
    }

    public void setAutoIncrement(BigInteger autoIncrement) {
        this.autoIncrement = autoIncrement;
    }

    public BigDecimal getAutoIncrementRatio() {
        return autoIncrementRatio;
    }

    public void setAutoIncrementRatio(BigDecimal autoIncrementRatio) {
        this.autoIncrementRatio = autoIncrementRatio;
    }
    
}
