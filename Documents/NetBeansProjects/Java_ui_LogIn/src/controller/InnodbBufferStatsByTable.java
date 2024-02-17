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
@Table(name = "innodb_buffer_stats_by_table")
@NamedQueries({
    @NamedQuery(name = "InnodbBufferStatsByTable.findAll", query = "SELECT i FROM InnodbBufferStatsByTable i"),
    @NamedQuery(name = "InnodbBufferStatsByTable.findByAllocated", query = "SELECT i FROM InnodbBufferStatsByTable i WHERE i.allocated = :allocated"),
    @NamedQuery(name = "InnodbBufferStatsByTable.findByData", query = "SELECT i FROM InnodbBufferStatsByTable i WHERE i.data = :data"),
    @NamedQuery(name = "InnodbBufferStatsByTable.findByPages", query = "SELECT i FROM InnodbBufferStatsByTable i WHERE i.pages = :pages"),
    @NamedQuery(name = "InnodbBufferStatsByTable.findByPagesHashed", query = "SELECT i FROM InnodbBufferStatsByTable i WHERE i.pagesHashed = :pagesHashed"),
    @NamedQuery(name = "InnodbBufferStatsByTable.findByPagesOld", query = "SELECT i FROM InnodbBufferStatsByTable i WHERE i.pagesOld = :pagesOld"),
    @NamedQuery(name = "InnodbBufferStatsByTable.findByRowsCached", query = "SELECT i FROM InnodbBufferStatsByTable i WHERE i.rowsCached = :rowsCached")})
public class InnodbBufferStatsByTable implements Serializable {

    private static final long serialVersionUID = 1L;
    @Lob
    @Column(name = "object_schema")
    private String objectSchema;
    @Lob
    @Column(name = "object_name")
    private String objectName;
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

    public InnodbBufferStatsByTable() {
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
