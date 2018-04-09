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
@Table(name = "INVENTORY")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Inventory.findAll", query = "SELECT i FROM Inventory i")
    , @NamedQuery(name = "Inventory.findByUPCCode", query = "SELECT i FROM Inventory i WHERE i.uPCCode = :uPCCode")
    , @NamedQuery(name = "Inventory.findByStock", query = "SELECT i FROM Inventory i WHERE i.stock = :stock")
    , @NamedQuery(name = "Inventory.findByStoreId", query = "SELECT i FROM Inventory i WHERE i.storeId = :storeId")})
public class Inventory implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "UPC_Code")
    private Integer uPCCode;
    @Column(name = "Stock")
    private Integer stock;
    @Column(name = "StoreId")
    private String storeId;

    public Inventory() {
    }

    public Inventory(Integer uPCCode) {
        this.uPCCode = uPCCode;
    }

    public Integer getUPCCode() {
        return uPCCode;
    }

    public void setUPCCode(Integer uPCCode) {
        this.uPCCode = uPCCode;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    public String getStoreId() {
        return storeId;
    }

    public void setStoreId(String storeId) {
        this.storeId = storeId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (uPCCode != null ? uPCCode.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Inventory)) {
            return false;
        }
        Inventory other = (Inventory) object;
        if ((this.uPCCode == null && other.uPCCode != null) || (this.uPCCode != null && !this.uPCCode.equals(other.uPCCode))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "sql.Inventory[ uPCCode=" + uPCCode + " ]";
    }
    
}
