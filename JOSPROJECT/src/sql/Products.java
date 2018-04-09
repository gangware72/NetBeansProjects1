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
@Table(name = "PRODUCTS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Products.findAll", query = "SELECT p FROM Products p")
    , @NamedQuery(name = "Products.findByUPCCode", query = "SELECT p FROM Products p WHERE p.uPCCode = :uPCCode")
    , @NamedQuery(name = "Products.findByBrandName", query = "SELECT p FROM Products p WHERE p.brandName = :brandName")
    , @NamedQuery(name = "Products.findByTypeID", query = "SELECT p FROM Products p WHERE p.typeID = :typeID")
    , @NamedQuery(name = "Products.findByStock", query = "SELECT p FROM Products p WHERE p.stock = :stock")})
public class Products implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "UPC_Code")
    private Integer uPCCode;
    @Column(name = "Brand_Name")
    private String brandName;
    @Column(name = "TypeID")
    private String typeID;
    @Column(name = "Stock")
    private Integer stock;

    public Products() {
    }

    public Products(Integer uPCCode) {
        this.uPCCode = uPCCode;
    }

    public Integer getUPCCode() {
        return uPCCode;
    }

    public void setUPCCode(Integer uPCCode) {
        this.uPCCode = uPCCode;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public String getTypeID() {
        return typeID;
    }

    public void setTypeID(String typeID) {
        this.typeID = typeID;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
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
        if (!(object instanceof Products)) {
            return false;
        }
        Products other = (Products) object;
        if ((this.uPCCode == null && other.uPCCode != null) || (this.uPCCode != null && !this.uPCCode.equals(other.uPCCode))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "sql.Products[ uPCCode=" + uPCCode + " ]";
    }
    
}
