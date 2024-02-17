/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.io.Serializable;
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
@Table(name = "latest_file_io")
@NamedQueries({
    @NamedQuery(name = "LatestFileIo.findAll", query = "SELECT l FROM LatestFileIo l"),
    @NamedQuery(name = "LatestFileIo.findByThread", query = "SELECT l FROM LatestFileIo l WHERE l.thread = :thread"),
    @NamedQuery(name = "LatestFileIo.findByFile", query = "SELECT l FROM LatestFileIo l WHERE l.file = :file"),
    @NamedQuery(name = "LatestFileIo.findByLatency", query = "SELECT l FROM LatestFileIo l WHERE l.latency = :latency"),
    @NamedQuery(name = "LatestFileIo.findByOperation", query = "SELECT l FROM LatestFileIo l WHERE l.operation = :operation"),
    @NamedQuery(name = "LatestFileIo.findByRequested", query = "SELECT l FROM LatestFileIo l WHERE l.requested = :requested")})
public class LatestFileIo implements Serializable {

    private static final long serialVersionUID = 1L;
    @Column(name = "thread")
    private String thread;
    @Column(name = "file")
    private String file;
    @Column(name = "latency")
    private String latency;
    @Basic(optional = false)
    @Column(name = "operation")
    private String operation;
    @Column(name = "requested")
    private String requested;

    public LatestFileIo() {
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

    public String getLatency() {
        return latency;
    }

    public void setLatency(String latency) {
        this.latency = latency;
    }

    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

    public String getRequested() {
        return requested;
    }

    public void setRequested(String requested) {
        this.requested = requested;
    }
    
}
