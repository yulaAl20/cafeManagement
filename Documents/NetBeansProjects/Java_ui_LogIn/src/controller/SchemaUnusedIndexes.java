/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.io.Serializable;
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
@Table(name = "schema_unused_indexes")
@NamedQueries({
    @NamedQuery(name = "SchemaUnusedIndexes.findAll", query = "SELECT s FROM SchemaUnusedIndexes s"),
    @NamedQuery(name = "SchemaUnusedIndexes.findByObjectSchema", query = "SELECT s FROM SchemaUnusedIndexes s WHERE s.objectSchema = :objectSchema"),
    @NamedQuery(name = "SchemaUnusedIndexes.findByObjectName", query = "SELECT s FROM SchemaUnusedIndexes s WHERE s.objectName = :objectName"),
    @NamedQuery(name = "SchemaUnusedIndexes.findByIndexName", query = "SELECT s FROM SchemaUnusedIndexes s WHERE s.indexName = :indexName")})
public class SchemaUnusedIndexes implements Serializable {

    private static final long serialVersionUID = 1L;
    @Column(name = "object_schema")
    private String objectSchema;
    @Column(name = "object_name")
    private String objectName;
    @Column(name = "index_name")
    private String indexName;

    public SchemaUnusedIndexes() {
    }

    public String getObjectSchema() {
        return objectSchema;
    }

    public void setObjectSchema(String objectSchema) {
        this.objectSchema = objectSchema;
    }

    public String getObjectName() {
        return objectName;
    }

    public void setObjectName(String objectName) {
        this.objectName = objectName;
    }

    public String getIndexName() {
        return indexName;
    }

    public void setIndexName(String indexName) {
        this.indexName = indexName;
    }
    
}
