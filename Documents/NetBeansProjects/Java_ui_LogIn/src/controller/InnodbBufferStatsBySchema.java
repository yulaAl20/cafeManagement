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
@Table(name = "innodb_buffer_stats_by_schema")
@NamedQueries({
    @NamedQuery(name = "InnodbBufferStatsBySchema.findAll", query = "SELECT i FROM InnodbBufferStatsBySchema i"),
    @NamedQuery(name = "InnodbBufferStatsBySchema.findByAllocated", query = "SELECT i FROM InnodbBufferStatsBySchema i WHERE i.allocated = :allocated"),
    @NamedQuery(name = "InnodbBufferStatsBySchema.findByData", query = "SELECT i FROM InnodbBufferStatsBySchema i WHERE i.data = :data"),
    @NamedQuery(name = "InnodbBufferStatsBySchema.findByPages", query = "SELECT i FROM InnodbBufferStatsBySchema i WHERE i.pages = :pages"),
    @NamedQuery(name = "InnodbBufferStatsBySchema.findByPagesHashed", query = "SELECT i FROM InnodbBufferStatsBySchema i WHERE i.pagesHashed = :pagesHashed"),
    @NamedQuery(name = "InnodbBufferStatsBySchema.findByPagesOld", query = "SELECT i FROM InnodbBufferStatsBySchema i WHERE i.pagesOld = :pagesOld"),
    @NamedQuery(name = "InnodbBufferStatsBySchema.findByRowsCached", query = "SELECT i FROM InnodbBufferStatsBySchema i WHERE i.rowsCached = :rowsCached")})
public class InnodbBufferStatsBySchema implements Serializable {

    private static final long serialVersionUID = 1L;
    @Lob
    @Column(name = "object_schema")
    private String objectSchema;
    @Column(name = "allocated")
    private String allocated;
    @Column(name = "data")
    private String data;
    @Basic(optional = false)
    @Column(name = "pages")
    private long pages;
    @Basic(optional = false)
    @Column(name = "pages_hashed")
    private long pagesHashed;
    @Basic(optional = false)
    @Column(name = "pages_old")
    private long pagesOld;
    @Column(name = "rows_cached")
    private BigInteger rowsCached;

    public InnodbBufferStatsBySchema() {
    }

    public String getObjectSchema() {
        return objectSchema;
    }

    public void setObjectSchema(String objectSchema) {
        this.objectSchema = objectSchema;
    }

    public String getAllocated() {
        return allocated;
    }

    public void setAllocated(String allocated) {
        this.allocated = allocated;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
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
