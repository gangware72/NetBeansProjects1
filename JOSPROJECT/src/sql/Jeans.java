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
@Table(name = "JEANS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Jeans.findAll", query = "SELECT j FROM Jeans j")
    , @NamedQuery(name = "Jeans.findByTypeId", query = "SELECT j FROM Jeans j WHERE j.typeId = :typeId")
    , @NamedQuery(name = "Jeans.findByBrandName", query = "SELECT j FROM Jeans j WHERE j.brandName = :brandName")
    , @NamedQuery(name = "Jeans.findByWaist", query = "SELECT j FROM Jeans j WHERE j.waist = :waist")
    , @NamedQuery(name = "Jeans.findByRise", query = "SELECT j FROM Jeans j WHERE j.rise = :rise")
    , @NamedQuery(name = "Jeans.findByFit", query = "SELECT j FROM Jeans j WHERE j.fit = :fit")
    , @NamedQuery(name = "Jeans.findByColor", query = "SELECT j FROM Jeans j WHERE j.color = :color")
    , @NamedQuery(name = "Jeans.findByUPCCode", query = "SELECT j FROM Jeans j WHERE j.uPCCode = :uPCCode")})
public class Jeans implements Serializable {

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

    public Jeans() {
    }

    public Jeans(String typeId) {
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
        if (!(object instanceof Jeans)) {
            return false;
        }
        Jeans other = (Jeans) object;
        if ((this.typeId == null && other.typeId != null) || (this.typeId != null && !this.typeId.equals(other.typeId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "sql.Jeans[ typeId=" + typeId + " ]";
    }
    
}
