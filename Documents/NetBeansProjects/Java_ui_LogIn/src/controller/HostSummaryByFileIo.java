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
@Table(name = "host_summary_by_file_io")
@NamedQueries({
    @NamedQuery(name = "HostSummaryByFileIo.findAll", query = "SELECT h FROM HostSummaryByFileIo h"),
    @NamedQuery(name = "HostSummaryByFileIo.findByHost", query = "SELECT h FROM HostSummaryByFileIo h WHERE h.host = :host"),
    @NamedQuery(name = "HostSummaryByFileIo.findByIos", query = "SELECT h FROM HostSummaryByFileIo h WHERE h.ios = :ios"),
    @NamedQuery(name = "HostSummaryByFileIo.findByIoLatency", query = "SELECT h FROM HostSummaryByFileIo h WHERE h.ioLatency = :ioLatency")})
public class HostSummaryByFileIo implements Serializable {

    private static final long serialVersionUID = 1L;
    @Column(name = "host")
    private String host;
    @Column(name = "ios")
    private BigInteger ios;
    @Column(name = "io_latency")
    private String ioLatency;

    public HostSummaryByFileIo() {
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

    public String getIoLatency() {
        return ioLatency;
    }

    public void setIoLatency(String ioLatency) {
        this.ioLatency = ioLatency;
    }
    
}
