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
@Table(name = "schema_object_overview")
@NamedQueries({
    @NamedQuery(name = "SchemaObjectOverview.findAll", query = "SELECT s FROM SchemaObjectOverview s"),
    @NamedQuery(name = "SchemaObjectOverview.findByDb", query = "SELECT s FROM SchemaObjectOverview s WHERE s.db = :db"),
    @NamedQuery(name = "SchemaObjectOverview.findByObjectType", query = "SELECT s FROM SchemaObjectOverview s WHERE s.objectType = :objectType"),
    @NamedQuery(name = "SchemaObjectOverview.findByCount", query = "SELECT s FROM SchemaObjectOverview s WHERE s.count = :count")})
public class SchemaObjectOverview implements Serializable {

    private static final long serialVersionUID = 1L;
    @Column(name = "db")
    private String db;
    @Column(name = "object_type")
    private String objectType;
    @Basic(optional = false)
    @Column(name = "count")
    private long count;

    public SchemaObjectOverview() {
    }

    public String getDb() {
        return db;
    }

    public void setDb(String db) {
        this.db = db;
    }

    public String getObjectType() {
        return objectType;
    }

    public void setObjectType(String objectType) {
        this.objectType = objectType;
    }

    public long getCount() {
        return count;
    }

    public void setCount(long count) {
        this.count = count;
    }
    
}
