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
@Table(name = "user_summary_by_file_io")
@NamedQueries({
    @NamedQuery(name = "UserSummaryByFileIo.findAll", query = "SELECT u FROM UserSummaryByFileIo u"),
    @NamedQuery(name = "UserSummaryByFileIo.findByUser", query = "SELECT u FROM UserSummaryByFileIo u WHERE u.user = :user"),
    @NamedQuery(name = "UserSummaryByFileIo.findByIos", query = "SELECT u FROM UserSummaryByFileIo u WHERE u.ios = :ios"),
    @NamedQuery(name = "UserSummaryByFileIo.findByIoLatency", query = "SELECT u FROM UserSummaryByFileIo u WHERE u.ioLatency = :ioLatency")})
public class UserSummaryByFileIo implements Serializable {

    private static final long serialVersionUID = 1L;
    @Column(name = "user")
    private String user;
    @Column(name = "ios")
    private BigInteger ios;
    @Column(name = "io_latency")
    private String ioLatency;

    public UserSummaryByFileIo() {
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

    public String getIoLatency() {
        return ioLatency;
    }

    public void setIoLatency(String ioLatency) {
        this.ioLatency = ioLatency;
    }
    
}
