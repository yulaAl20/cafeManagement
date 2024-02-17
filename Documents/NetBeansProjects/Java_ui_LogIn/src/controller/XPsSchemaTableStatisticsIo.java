/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.io.Serializable;
import java.math.BigInteger;
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
@Table(name = "x$ps_schema_table_statistics_io")
@NamedQueries({
    @NamedQuery(name = "XPsSchemaTableStatisticsIo.findAll", query = "SELECT x FROM XPsSchemaTableStatisticsIo x"),
    @NamedQuery(name = "XPsSchemaTableStatisticsIo.findByTableSchema", query = "SELECT x FROM XPsSchemaTableStatisticsIo x WHERE x.tableSchema = :tableSchema"),
    @NamedQuery(name = "XPsSchemaTableStatisticsIo.findByTableName", query = "SELECT x FROM XPsSchemaTableStatisticsIo x WHERE x.tableName = :tableName"),
    @NamedQuery(name = "XPsSchemaTableStatisticsIo.findByCountRead", query = "SELECT x FROM XPsSchemaTableStatisticsIo x WHERE x.countRead = :countRead"),
    @NamedQuery(name = "XPsSchemaTableStatisticsIo.findBySumNumberOfBytesRead", query = "SELECT x FROM XPsSchemaTableStatisticsIo x WHERE x.sumNumberOfBytesRead = :sumNumberOfBytesRead"),
    @NamedQuery(name = "XPsSchemaTableStatisticsIo.findBySumTimerRead", query = "SELECT x FROM XPsSchemaTableStatisticsIo x WHERE x.sumTimerRead = :sumTimerRead"),
    @NamedQuery(name = "XPsSchemaTableStatisticsIo.findByCountWrite", query = "SELECT x FROM XPsSchemaTableStatisticsIo x WHERE x.countWrite = :countWrite"),
    @NamedQuery(name = "XPsSchemaTableStatisticsIo.findBySumNumberOfBytesWrite", query = "SELECT x FROM XPsSchemaTableStatisticsIo x WHERE x.sumNumberOfBytesWrite = :sumNumberOfBytesWrite"),
    @NamedQuery(name = "XPsSchemaTableStatisticsIo.findBySumTimerWrite", query = "SELECT x FROM XPsSchemaTableStatisticsIo x WHERE x.sumTimerWrite = :sumTimerWrite"),
    @NamedQuery(name = "XPsSchemaTableStatisticsIo.findByCountMisc", query = "SELECT x FROM XPsSchemaTableStatisticsIo x WHERE x.countMisc = :countMisc"),
    @NamedQuery(name = "XPsSchemaTableStatisticsIo.findBySumTimerMisc", query = "SELECT x FROM XPsSchemaTableStatisticsIo x WHERE x.sumTimerMisc = :sumTimerMisc")})
public class XPsSchemaTableStatisticsIo implements Serializable {

    private static final long serialVersionUID = 1L;
    @Column(name = "table_schema")
    private String tableSchema;
    @Column(name = "table_name")
    private String tableName;
    @Column(name = "count_read")
    private BigInteger countRead;
    @Column(name = "sum_number_of_bytes_read")
    private BigInteger sumNumberOfBytesRead;
    @Column(name = "sum_timer_read")
    private BigInteger sumTimerRead;
    @Column(name = "count_write")
    private BigInteger countWrite;
    @Column(name = "sum_number_of_bytes_write")
    private BigInteger sumNumberOfBytesWrite;
    @Column(name = "sum_timer_write")
    private BigInteger sumTimerWrite;
    @Column(name = "count_misc")
    private BigInteger countMisc;
    @Column(name = "sum_timer_misc")
    private BigInteger sumTimerMisc;

    public XPsSchemaTableStatisticsIo() {
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

    public BigInteger getCountRead() {
        return countRead;
    }

    public void setCountRead(BigInteger countRead) {
        this.countRead = countRead;
    }

    public BigInteger getSumNumberOfBytesRead() {
        return sumNumberOfBytesRead;
    }

    public void setSumNumberOfBytesRead(BigInteger sumNumberOfBytesRead) {
        this.sumNumberOfBytesRead = sumNumberOfBytesRead;
    }

    public BigInteger getSumTimerRead() {
        return sumTimerRead;
    }

    public void setSumTimerRead(BigInteger sumTimerRead) {
        this.sumTimerRead = sumTimerRead;
    }

    public BigInteger getCountWrite() {
        return countWrite;
    }

    public void setCountWrite(BigInteger countWrite) {
        this.countWrite = countWrite;
    }

    public BigInteger getSumNumberOfBytesWrite() {
        return sumNumberOfBytesWrite;
    }

    public void setSumNumberOfBytesWrite(BigInteger sumNumberOfBytesWrite) {
        this.sumNumberOfBytesWrite = sumNumberOfBytesWrite;
    }

    public BigInteger getSumTimerWrite() {
        return sumTimerWrite;
    }

    public void setSumTimerWrite(BigInteger sumTimerWrite) {
        this.sumTimerWrite = sumTimerWrite;
    }

    public BigInteger getCountMisc() {
        return countMisc;
    }

    public void setCountMisc(BigInteger countMisc) {
        this.countMisc = countMisc;
    }

    public BigInteger getSumTimerMisc() {
        return sumTimerMisc;
    }

    public void setSumTimerMisc(BigInteger sumTimerMisc) {
        this.sumTimerMisc = sumTimerMisc;
    }
    
}
