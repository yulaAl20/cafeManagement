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
@Table(name = "x$user_summary_by_file_io")
@NamedQueries({
    @NamedQuery(name = "XUserSummaryByFileIo.findAll", query = "SELECT x FROM XUserSummaryByFileIo x"),
    @NamedQuery(name = "XUserSummaryByFileIo.findByUser", query = "SELECT x FROM XUserSummaryByFileIo x WHERE x.user = :user"),
    @NamedQuery(name = "XUserSummaryByFileIo.findByIos", query = "SELECT x FROM XUserSummaryByFileIo x WHERE x.ios = :ios"),
    @NamedQuery(name = "XUserSummaryByFileIo.findByIoLatency", query = "SELECT x FROM XUserSummaryByFileIo x WHERE x.ioLatency = :ioLatency")})
public class XUserSummaryByFileIo implements Serializable {

    private static final long serialVersionUID = 1L;
    @Column(name = "user")
    private String user;
    @Column(name = "ios")
    private BigInteger ios;
    @Column(name = "io_latency")
    private BigInteger ioLatency;

    public XUserSummaryByFileIo() {
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
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
