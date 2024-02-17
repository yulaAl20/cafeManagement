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
import javax.persistence.Lob;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author User
 */
@Entity
@Table(name = "x$innodb_buffer_stats_by_schema")
@NamedQueries({
    @NamedQuery(name = "XInnodbBufferStatsBySchema.findAll", query = "SELECT x FROM XInnodbBufferStatsBySchema x"),
    @NamedQuery(name = "XInnodbBufferStatsBySchema.findByAllocated", query = "SELECT x FROM XInnodbBufferStatsBySchema x WHERE x.allocated = :allocated"),
    @NamedQuery(name = "XInnodbBufferStatsBySchema.findByData", query = "SELECT x FROM XInnodbBufferStatsBySchema x WHERE x.data = :data"),
    @NamedQuery(name = "XInnodbBufferStatsBySchema.findByPages", query = "SELECT x FROM XInnodbBufferStatsBySchema x WHERE x.pages = :pages"),
    @NamedQuery(name = "XInnodbBufferStatsBySchema.findByPagesHashed", query = "SELECT x FROM XInnodbBufferStatsBySchema x WHERE x.pagesHashed = :pagesHashed"),
    @NamedQuery(name = "XInnodbBufferStatsBySchema.findByPagesOld", query = "SELECT x FROM XInnodbBufferStatsBySchema x WHERE x.pagesOld = :pagesOld"),
    @NamedQuery(name = "XInnodbBufferStatsBySchema.findByRowsCached", query = "SELECT x FROM XInnodbBufferStatsBySchema x WHERE x.rowsCached = :rowsCached")})
public class XInnodbBufferStatsBySchema implements Serializable {

    private static final long serialVersionUID = 1L;
    @Lob
    @Column(name = "object_schema")
    private String objectSchema;
    @Column(name = "allocated")
    private BigInteger allocated;
    @Column(name = "data")
    private BigInteger data;
    @Basic(optional = false)
    @Column(name = "pages")
    private long pages;
    @Basic(optional = false)
    @Column(name = "pages_hashed")
    private long pagesHashed;
    @Basic(optional = false)
    @Column(name = "pages_old")
    private long pagesOld;
    @Basic(optional = false)
    @Column(name = "rows_cached")
    private BigInteger rowsCached;

    public XInnodbBufferStatsBySchema() {
    }

    public String getObjectSchema() {
        return objectSchema;
    }

    public void setObjectSchema(String objectSchema) {
        this.objectSchema = objectSchema;
    }

    public BigInteger getAllocated() {
        return allocated;
    }

    public void setAllocated(BigInteger allocated) {
        this.allocated = allocated;
    }

    public BigInteger getData() {
        return data;
    }

    public void setData(BigInteger data) {
        this.data = data;
    }

    public long getPages() {
        return pages;
    }

    public void setPages(long pages) {
        this.pages = pages;
    }

    public long getPagesHashed() {
        return pagesHashed;
    }

    public void setPagesHashed(long pagesHashed) {
        this.pagesHashed = pagesHashed;
    }

    public long getPagesOld() {
        return pagesOld;
    }

    public void setPagesOld(long pagesOld) {
        this.pagesOld = pagesOld;
    }

    public BigInteger getRowsCached() {
        return rowsCached;
    }

    public void setRowsCached(BigInteger rowsCached) {
        this.rowsCached = rowsCached;
    }
    
}
