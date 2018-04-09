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
@Table(name = "JACKET")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Jacket.findAll", query = "SELECT j FROM Jacket j")
    , @NamedQuery(name = "Jacket.findByTypeId", query = "SELECT j FROM Jacket j WHERE j.typeId = :typeId")
    , @NamedQuery(name = "Jacket.findByBrandName", query = "SELECT j FROM Jacket j WHERE j.brandName = :brandName")
    , @NamedQuery(name = "Jacket.findByChest", query = "SELECT j FROM Jacket j WHERE j.chest = :chest")
    , @NamedQuery(name = "Jacket.findByLength", query = "SELECT j FROM Jacket j WHERE j.length = :length")
    , @NamedQuery(name = "Jacket.findByFit", query = "SELECT j FROM Jacket j WHERE j.fit = :fit")
    , @NamedQuery(name = "Jacket.findByColor", query = "SELECT j FROM Jacket j WHERE j.color = :color")
    , @NamedQuery(name = "Jacket.findByUPCCode", query = "SELECT j FROM Jacket j WHERE j.uPCCode = :uPCCode")})
public class Jacket implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "TypeId")
    private String typeId;
    @Column(name = "Brand_Name")
    private String brandName;
    @Column(name = "Chest")
    private Integer chest;
    @Column(name = "Length")
    private Integer length;
    @Column(name = "Fit")
    private String fit;
    @Column(name = "Color")
    private String color;
    @Column(name = "UPC_Code")
    private Integer uPCCode;

    public Jacket() {
    }

    public Jacket(String typeId) {
        this.typeId = typeId;
    }

    public String getTypeId() {
        return typeId;
    }

    public void setTypeId(String typeId) {
        this.typeId = typeId;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public Integer getChest() {
        return chest;
    }

    public void setChest(Integer chest) {
        this.chest = chest;
    }

    public Integer getLength() {
        return length;
    }

    public void setLength(Integer length) {
        this.length = length;
    }

    public String getFit() {
        return fit;
    }

    public void setFit(String fit) {
        this.fit = fit;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Integer getUPCCode() {
        return uPCCode;
    }

    public void setUPCCode(Integer uPCCode) {
        this.uPCCode = uPCCode;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (typeId != null ? typeId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Jacket)) {
            return false;
        }
        Jacket other = (Jacket) object;
        if ((this.typeId == null && other.typeId != null) || (this.typeId != null && !this.typeId.equals(other.typeId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "sql.Jacket[ typeId=" + typeId + " ]";
    }
    
}
