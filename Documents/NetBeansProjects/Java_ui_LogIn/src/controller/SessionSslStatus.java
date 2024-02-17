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
@Table(name = "session_ssl_status")
@NamedQueries({
    @NamedQuery(name = "SessionSslStatus.findAll", query = "SELECT s FROM SessionSslStatus s"),
    @NamedQuery(name = "SessionSslStatus.findByThreadId", query = "SELECT s FROM SessionSslStatus s WHERE s.threadId = :threadId"),
    @NamedQuery(name = "SessionSslStatus.findBySslVersion", query = "SELECT s FROM SessionSslStatus s WHERE s.sslVersion = :sslVersion"),
    @NamedQuery(name = "SessionSslStatus.findBySslCipher", query = "SELECT s FROM SessionSslStatus s WHERE s.sslCipher = :sslCipher"),
    @NamedQuery(name = "SessionSslStatus.findBySslSessionsReused", query = "SELECT s FROM SessionSslStatus s WHERE s.sslSessionsReused = :sslSessionsReused")})
public class SessionSslStatus implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @Column(name = "thread_id")
    private long threadId;
    @Column(name = "ssl_version")
    private String sslVersion;
    @Column(name = "ssl_cipher")
    private String sslCipher;
    @Column(name = "ssl_sessions_reused")
    private String sslSessionsReused;

    public SessionSslStatus() {
    }

    public long getThreadId() {
        return threadId;
    }

    public void setThreadId(long threadId) {
        this.threadId = threadId;
    }

    public String getSslVersion() {
        return sslVersion;
    }

    public void setSslVersion(String sslVersion) {
        this.sslVersion = sslVersion;
    }

    public String getSslCipher() {
        return sslCipher;
    }

    public void setSslCipher(String sslCipher) {
        this.sslCipher = sslCipher;
    }

    public String getSslSessionsReused() {
        return sslSessionsReused;
    }

    public void setSslSessionsReused(String sslSessionsReused) {
        this.sslSessionsReused = sslSessionsReused;
    }
    
}
