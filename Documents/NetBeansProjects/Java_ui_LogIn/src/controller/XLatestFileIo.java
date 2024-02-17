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
@Table(name = "x$latest_file_io")
@NamedQueries({
    @NamedQuery(name = "XLatestFileIo.findAll", query = "SELECT x FROM XLatestFileIo x"),
    @NamedQuery(name = "XLatestFileIo.findByThread", query = "SELECT x FROM XLatestFileIo x WHERE x.thread = :thread"),
    @NamedQuery(name = "XLatestFileIo.findByFile", query = "SELECT x FROM XLatestFileIo x WHERE x.file = :file"),
    @NamedQuery(name = "XLatestFileIo.findByLatency", query = "SELECT x FROM XLatestFileIo x WHERE x.latency = :latency"),
    @NamedQuery(name = "XLatestFileIo.findByOperation", query = "SELECT x FROM XLatestFileIo x WHERE x.operation = :operation"),
    @NamedQuery(name = "XLatestFileIo.findByRequested", query = "SELECT x FROM XLatestFileIo x WHERE x.requested = :requested")})
public class XLatestFileIo implements Serializable {

    private static final long serialVersionUID = 1L;
    @Column(name = "thread")
    private String thread;
    @Column(name = "file")
    private String file;
    @Column(name = "latency")
    private BigInteger latency;
    @Basic(optional = false)
    @Column(name = "operation")
    private String operation;
    @Column(name = "requested")
    private BigInteger requested;

    public XLatestFileIo() {
    }

    public String getThread() {
        return thread;
    }

    public void setThread(String thread) {
        this.thread = thread;
    }

    public String getFile() {
        return file;
    }

    public void setFile(String file) {
        this.file = file;
    }

    public BigInteger getLatency() {
        return latency;
    }

    public void setLatency(BigInteger latency) {
        this.latency = latency;
    }

    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

    public BigInteger getRequested() {
        return requested;
    }

    public void setRequested(BigInteger requested) {
        this.requested = requested;
    }
    
}
