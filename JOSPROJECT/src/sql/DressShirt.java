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
@Table(name = "DRESS_SHIRT")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DressShirt.findAll", query = "SELECT d FROM DressShirt d")
    , @NamedQuery(name = "DressShirt.findByTypeId", query = "SELECT d FROM DressShirt d WHERE d.typeId = :typeId")
    , @NamedQuery(name = "DressShirt.findByBrandName", query = "SELECT d FROM DressShirt d WHERE d.brandName = :brandName")
    , @NamedQuery(name = "DressShirt.findByNeckSizes", query = "SELECT d FROM DressShirt d WHERE d.neckSizes = :neckSizes")
    , @NamedQuery(name = "DressShirt.findBySleeveLength", query = "SELECT d FROM DressShirt d WHERE d.sleeveLength = :sleeveLength")
    , @NamedQuery(name = "DressShirt.findByFit", query = "SELECT d FROM DressShirt d WHERE d.fit = :fit")
    , @NamedQuery(name = "DressShirt.findByColor", query = "SELECT d FROM DressShirt d WHERE d.color = :color")
    , @NamedQuery(name = "DressShirt.findByUPCCode", query = "SELECT d FROM DressShirt d WHERE d.uPCCode = :uPCCode")})
public class DressShirt implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "TypeId")
    private String typeId;
    @Column(name = "Brand_Name")
    private String brandName;
    @Column(name = "Neck_Sizes")
    private Integer neckSizes;
    @Column(name = "Sleeve_Length")
    private Integer sleeveLength;
    @Column(name = "Fit")
    private String fit;
    @Column(name = "Color")
    private String color;
    @Column(name = "UPC_Code")
    private Integer uPCCode;

    public DressShirt() {
    }

    public DressShirt(String typeId) {
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

    public Integer getNeckSizes() {
        return neckSizes;
    }

    public void setNeckSizes(Integer neckSizes) {
        this.neckSizes = neckSizes;
    }

    public Integer getSleeveLength() {
        return sleeveLength;
    }

    public void setSleeveLength(Integer sleeveLength) {
        this.sleeveLength = sleeveLength;
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
        if (!(object instanceof DressShirt)) {
            return false;
        }
        DressShirt other = (DressShirt) object;
        if ((this.typeId == null && other.typeId != null) || (this.typeId != null && !this.typeId.equals(other.typeId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "sql.DressShirt[ typeId=" + typeId + " ]";
    }
    
}
