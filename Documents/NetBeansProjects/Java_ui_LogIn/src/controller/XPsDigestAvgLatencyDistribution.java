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
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author User
 */
@Entity
@Table(name = "x$ps_digest_avg_latency_distribution")
@NamedQueries({
    @NamedQuery(name = "XPsDigestAvgLatencyDistribution.findAll", query = "SELECT x FROM XPsDigestAvgLatencyDistribution x"),
    @NamedQuery(name = "XPsDigestAvgLatencyDistribution.findByCnt", query = "SELECT x FROM XPsDigestAvgLatencyDistribution x WHERE x.cnt = :cnt"),
    @NamedQuery(name = "XPsDigestAvgLatencyDistribution.findByAvgUs", query = "SELECT x FROM XPsDigestAvgLatencyDistribution x WHERE x.avgUs = :avgUs")})
public class XPsDigestAvgLatencyDistribution implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @Column(name = "cnt")
    private long cnt;
    @Column(name = "avg_us")
    private BigInteger avgUs;

    public XPsDigestAvgLatencyDistribution() {
    }

    public long getCnt() {
        return cnt;
    }

    public void setCnt(long cnt) {
        this.cnt = cnt;
    }

    public BigInteger getAvgUs() {
        return avgUs;
    }

    public void setAvgUs(BigInteger avgUs) {
        this.avgUs = avgUs;
    }
    
}
