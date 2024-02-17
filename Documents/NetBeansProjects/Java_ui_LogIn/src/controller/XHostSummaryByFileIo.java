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
@Table(name = "x$host_summary_by_file_io")
@NamedQueries({
    @NamedQuery(name = "XHostSummaryByFileIo.findAll", query = "SELECT x FROM XHostSummaryByFileIo x"),
    @NamedQuery(name = "XHostSummaryByFileIo.findByHost", query = "SELECT x FROM XHostSummaryByFileIo x WHERE x.host = :host"),
    @NamedQuery(name = "XHostSummaryByFileIo.findByIos", query = "SELECT x FROM XHostSummaryByFileIo x WHERE x.ios = :ios"),
    @NamedQuery(name = "XHostSummaryByFileIo.findByIoLatency", query = "SELECT x FROM XHostSummaryByFileIo x WHERE x.ioLatency = :ioLatency")})
public class XHostSummaryByFileIo implements Serializable {

    private static final long serialVersionUID = 1L;
    @Column(name = "host")
    private String host;
    @Column(name = "ios")
    private BigInteger ios;
    @Column(name = "io_latency")
    private BigInteger ioLatency;

    public XHostSummaryByFileIo() {
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public BigInteger getIos() {
        return ios;
    }

    public void setIos(BigInteger ios) {
        this.ios = ios;
    }

    public BigInteger getIoLatency() {
        return ioLatency;
    }

    public void setIoLatency(BigInteger ioLatency) {
        this.ioLatency = ioLatency;
    }
    
}
