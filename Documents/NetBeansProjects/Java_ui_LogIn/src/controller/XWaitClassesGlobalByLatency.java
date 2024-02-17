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
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author User
 */
@Entity
@Table(name = "x$wait_classes_global_by_latency")
@NamedQueries({
    @NamedQuery(name = "XWaitClassesGlobalByLatency.findAll", query = "SELECT x FROM XWaitClassesGlobalByLatency x"),
    @NamedQuery(name = "XWaitClassesGlobalByLatency.findByEventClass", query = "SELECT x FROM XWaitClassesGlobalByLatency x WHERE x.eventClass = :eventClass"),
    @NamedQuery(name = "XWaitClassesGlobalByLatency.findByTotal", query = "SELECT x FROM XWaitClassesGlobalByLatency x WHERE x.total = :total"),
    @NamedQuery(name = "XWaitClassesGlobalByLatency.findByTotalLatency", query = "SELECT x FROM XWaitClassesGlobalByLatency x WHERE x.totalLatency = :totalLatency"),
    @NamedQuery(name = "XWaitClassesGlobalByLatency.findByMinLatency", query = "SELECT x FROM XWaitClassesGlobalByLatency x WHERE x.minLatency = :minLatency"),
    @NamedQuery(name = "XWaitClassesGlobalByLatency.findByAvgLatency", query = "SELECT x FROM XWaitClassesGlobalByLatency x WHERE x.avgLatency = :avgLatency"),
    @NamedQuery(name = "XWaitClassesGlobalByLatency.findByMaxLatency", query = "SELECT x FROM XWaitClassesGlobalByLatency x WHERE x.maxLatency = :maxLatency")})
public class XWaitClassesGlobalByLatency implements Serializable {

    private static final long serialVersionUID = 1L;
    @Column(name = "event_class")
    private String eventClass;
    @Column(name = "total")
    private BigInteger total;
    @Column(name = "total_latency")
    private BigInteger totalLatency;
    @Column(name = "min_latency")
    private BigInteger minLatency;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @Column(name = "avg_latency")
    private BigDecimal avgLatency;
    @Column(name = "max_latency")
    private BigInteger maxLatency;

    public XWaitClassesGlobalByLatency() {
    }

    public String getEventClass() {
        return eventClass;
    }

    public void setEventClass(String eventClass) {
        this.eventClass = eventClass;
    }

    public BigInteger getTotal() {
        return total;
    }

    public void setTotal(BigInteger total) {
        this.total = total;
    }

    public BigInteger getTotalLatency() {
        return totalLatency;
    }

    public void setTotalLatency(BigInteger totalLatency) {
        this.totalLatency = totalLatency;
    }

    public BigInteger getMinLatency() {
        return minLatency;
    }

    public void setMinLatency(BigInteger minLatency) {
        this.minLatency = minLatency;
    }

    public BigDecimal getAvgLatency() {
        return avgLatency;
    }

    public void setAvgLatency(BigDecimal avgLatency) {
        this.avgLatency = avgLatency;
    }

    public BigInteger getMaxLatency() {
        return maxLatency;
    }

    public void setMaxLatency(BigInteger maxLatency) {
        this.maxLatency = maxLatency;
    }
    
}
