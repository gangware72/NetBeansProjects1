/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sql;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author edgargangwareiv
 */
@Entity
@Table(name = "VENDORS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Vendors.findAll", query = "SELECT v FROM Vendors v")
    , @NamedQuery(name = "Vendors.findByVendorsID", query = "SELECT v FROM Vendors v WHERE v.vendorsID = :vendorsID")
    , @NamedQuery(name = "Vendors.findByName", query = "SELECT v FROM Vendors v WHERE v.name = :name")})
public class Vendors implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "VendorsID")
    private String vendorsID;
    @Column(name = "name")
    private String name;

    public Vendors() {
    }

    public Vendors(String vendorsID) {
        this.vendorsID = vendorsID;
    }

    public String getVendorsID() {
        return vendorsID;
    }

    public void setVendorsID(String vendorsID) {
        this.vendorsID = vendorsID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (vendorsID != null ? vendorsID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Vendors)) {
            return false;
        }
        Vendors other = (Vendors) object;
        if ((this.vendorsID == null && other.vendorsID != null) || (this.vendorsID != null && !this.vendorsID.equals(other.vendorsID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "sql.Vendors[ vendorsID=" + vendorsID + " ]";
    }
    
}
