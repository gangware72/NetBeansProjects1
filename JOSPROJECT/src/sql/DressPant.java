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
@Table(name = "DRESS_PANT")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DressPant.findAll", query = "SELECT d FROM DressPant d")
    , @NamedQuery(name = "DressPant.findByTypeId", query = "SELECT d FROM DressPant d WHERE d.typeId = :typeId")
    , @NamedQuery(name = "DressPant.findByBrandName", query = "SELECT d FROM DressPant d WHERE d.brandName = :brandName")
    , @NamedQuery(name = "DressPant.findByWaist", query = "SELECT d FROM DressPant d WHERE d.waist = :waist")
    , @NamedQuery(name = "DressPant.findByRise", query = "SELECT d FROM DressPant d WHERE d.rise = :rise")
    , @NamedQuery(name = "DressPant.findByFit", query = "SELECT d FROM DressPant d WHERE d.fit = :fit")
    , @NamedQuery(name = "DressPant.findByColor", query = "SELECT d FROM DressPant d WHERE d.color = :color")
    , @NamedQuery(name = "DressPant.findByUPCCode", query = "SELECT d FROM DressPant d WHERE d.uPCCode = :uPCCode")})
public class DressPant implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "TypeId")
    private String typeId;
    @Column(name = "Brand_Name")
    private String brandName;
    @Column(name = "Waist")
    private Integer waist;
    @Column(name = "Rise")
    private Integer rise;
    @Column(name = "Fit")
    private String fit;
    @Column(name = "Color")
    private String color;
    @Column(name = "UPC_Code")
    private Integer uPCCode;

    public DressPant() {
    }

    public DressPant(String typeId) {
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

    public Integer getWaist() {
        return waist;
    }

    public void setWaist(Integer waist) {
        this.waist = waist;
    }

    public Integer getRise() {
        return rise;
    }

    public void setRise(Integer rise) {
        this.rise = rise;
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
        if (!(object instanceof DressPant)) {
            return false;
        }
        DressPant other = (DressPant) object;
        if ((this.typeId == null && other.typeId != null) || (this.typeId != null && !this.typeId.equals(other.typeId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "sql.DressPant[ typeId=" + typeId + " ]";
    }
    
}
