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
@Table(name = "STORES")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Stores.findAll", query = "SELECT s FROM Stores s")
    , @NamedQuery(name = "Stores.findByStoreID", query = "SELECT s FROM Stores s WHERE s.storeID = :storeID")
    , @NamedQuery(name = "Stores.findByPurchaseID", query = "SELECT s FROM Stores s WHERE s.purchaseID = :purchaseID")
    , @NamedQuery(name = "Stores.findByLocation", query = "SELECT s FROM Stores s WHERE s.location = :location")
    , @NamedQuery(name = "Stores.findByHours", query = "SELECT s FROM Stores s WHERE s.hours = :hours")})
public class Stores implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "StoreID")
    private String storeID;
    @Column(name = "PurchaseID")
    private String purchaseID;
    @Column(name = "Location")
    private String location;
    @Column(name = "Hours")
    private String hours;

    public Stores() {
    }

    public Stores(String storeID) {
        this.storeID = storeID;
    }

    public String getStoreID() {
        return storeID;
    }

    public void setStoreID(String storeID) {
        this.storeID = storeID;
    }

    public String getPurchaseID() {
        return purchaseID;
    }

    public void setPurchaseID(String purchaseID) {
        this.purchaseID = purchaseID;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getHours() {
        return hours;
    }

    public void setHours(String hours) {
        this.hours = hours;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (storeID != null ? storeID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Stores)) {
            return false;
        }
        Stores other = (Stores) object;
        if ((this.storeID == null && other.storeID != null) || (this.storeID != null && !this.storeID.equals(other.storeID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "sql.Stores[ storeID=" + storeID + " ]";
    }
    
}
