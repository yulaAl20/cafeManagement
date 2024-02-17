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
@Table(name = "x$ps_digest_95th_percentile_by_avg_us")
@NamedQueries({
    @NamedQuery(name = "XPsDigest95thPercentileByAvgUs.findAll", query = "SELECT x FROM XPsDigest95thPercentileByAvgUs x"),
    @NamedQuery(name = "XPsDigest95thPercentileByAvgUs.findByAvgUs", query = "SELECT x FROM XPsDigest95thPercentileByAvgUs x WHERE x.avgUs = :avgUs"),
    @NamedQuery(name = "XPsDigest95thPercentileByAvgUs.findByPercentile", query = "SELECT x FROM XPsDigest95thPercentileByAvgUs x WHERE x.percentile = :percentile")})
public class XPsDigest95thPercentileByAvgUs implements Serializable {

    private static final long serialVersionUID = 1L;
    @Column(name = "avg_us")
    private BigInteger avgUs;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @Column(name = "percentile")
    private BigDecimal percentile;

    public XPsDigest95thPercentileByAvgUs() {
    }

    public BigInteger getAvgUs() {
        return avgUs;
    }

    public void setAvgUs(BigInteger avgUs) {
        this.avgUs = avgUs;
    }

    public BigDecimal getPercentile() {
        return percentile;
    }

    public void setPercentile(BigDecimal percentile) {
        this.percentile = percentile;
    }
    
}
