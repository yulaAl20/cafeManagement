/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Lob;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author User
 */
@Entity
@Table(name = "statements_with_errors_or_warnings")
@NamedQueries({
    @NamedQuery(name = "StatementsWithErrorsOrWarnings.findAll", query = "SELECT s FROM StatementsWithErrorsOrWarnings s"),
    @NamedQuery(name = "StatementsWithErrorsOrWarnings.findByDb", query = "SELECT s FROM StatementsWithErrorsOrWarnings s WHERE s.db = :db"),
    @NamedQuery(name = "StatementsWithErrorsOrWarnings.findByExecCount", query = "SELECT s FROM StatementsWithErrorsOrWarnings s WHERE s.execCount = :execCount"),
    @NamedQuery(name = "StatementsWithErrorsOrWarnings.findByErrors", query = "SELECT s FROM StatementsWithErrorsOrWarnings s WHERE s.errors = :errors"),
    @NamedQuery(name = "StatementsWithErrorsOrWarnings.findByErrorPct", query = "SELECT s FROM StatementsWithErrorsOrWarnings s WHERE s.errorPct = :errorPct"),
    @NamedQuery(name = "StatementsWithErrorsOrWarnings.findByWarnings", query = "SELECT s FROM StatementsWithErrorsOrWarnings s WHERE s.warnings = :warnings"),
    @NamedQuery(name = "StatementsWithErrorsOrWarnings.findByWarningPct", query = "SELECT s FROM StatementsWithErrorsOrWarnings s WHERE s.warningPct = :warningPct"),
    @NamedQuery(name = "StatementsWithErrorsOrWarnings.findByFirstSeen", query = "SELECT s FROM StatementsWithErrorsOrWarnings s WHERE s.firstSeen = :firstSeen"),
    @NamedQuery(name = "StatementsWithErrorsOrWarnings.findByLastSeen", query = "SELECT s FROM StatementsWithErrorsOrWarnings s WHERE s.lastSeen = :lastSeen"),
    @NamedQuery(name = "StatementsWithErrorsOrWarnings.findByDigest", query = "SELECT s FROM StatementsWithErrorsOrWarnings s WHERE s.digest = :digest")})
public class StatementsWithErrorsOrWarnings implements Serializable {

    private static final long serialVersionUID = 1L;
    @Lob
    @Column(name = "query")
    private String query;
    @Column(name = "db")
    private String db;
    @Basic(optional = false)
    @Column(name = "exec_count")
    private long execCount;
    @Basic(optional = false)
    @Column(name = "errors")
    private long errors;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @Column(name = "error_pct")
    private BigDecimal errorPct;
    @Basic(optional = false)
    @Column(name = "warnings")
    private long warnings;
    @Basic(optional = false)
    @Column(name = "warning_pct")
    private BigDecimal warningPct;
    @Basic(optional = false)
    @Column(name = "first_seen")
    @Temporal(TemporalType.TIMESTAMP)
    private Date firstSeen;
    @Basic(optional = false)
    @Column(name = "last_seen")
    @Temporal(TemporalType.TIMESTAMP)
    private Date lastSeen;
    @Column(name = "digest")
    private String digest;

    public StatementsWithErrorsOrWarnings() {
    }

    public String getQuery() {
        return query;
    }

    public void setQuery(String query) {
        this.query = query;
    }

    public String getDb() {
        return db;
    }

    public void setDb(String db) {
        this.db = db;
    }

    public long getExecCount() {
        return execCount;
    }

    public void setExecCount(long execCount) {
        this.execCount = execCount;
    }

    public long getErrors() {
        return errors;
    }

    public void setErrors(long errors) {
        this.errors = errors;
    }

    public BigDecimal getErrorPct() {
        return errorPct;
    }

    public void setErrorPct(BigDecimal errorPct) {
        this.errorPct = errorPct;
    }

    public long getWarnings() {
        return warnings;
    }

    public void setWarnings(long warnings) {
        this.warnings = warnings;
    }

    public BigDecimal getWarningPct() {
        return warningPct;
    }

    public void setWarningPct(BigDecimal warningPct) {
        this.warningPct = warningPct;
    }

    public Date getFirstSeen() {
        return firstSeen;
    }

    public void setFirstSeen(Date firstSeen) {
        this.firstSeen = firstSeen;
    }

    public Date getLastSeen() {
        return lastSeen;
    }

    public void setLastSeen(Date lastSeen) {
        this.lastSeen = lastSeen;
    }

    public String getDigest() {
        return digest;
    }

    public void setDigest(String digest) {
        this.digest = digest;
    }
    
}
