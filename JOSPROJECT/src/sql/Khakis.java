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
@Table(name = "KHAKIS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Khakis.findAll", query = "SELECT k FROM Khakis k")
    , @NamedQuery(name = "Khakis.findByTypeId", query = "SELECT k FROM Khakis k WHERE k.typeId = :typeId")
    , @NamedQuery(name = "Khakis.findByBrandName", query = "SELECT k FROM Khakis k WHERE k.brandName = :brandName")
    , @NamedQuery(name = "Khakis.findByWaist", query = "SELECT k FROM Khakis k WHERE k.waist = :waist")
    , @NamedQuery(name = "Khakis.findByLength", query = "SELECT k FROM Khakis k WHERE k.length = :length")
    , @NamedQuery(name = "Khakis.findByFit", query = "SELECT k FROM Khakis k WHERE k.fit = :fit")
    , @NamedQuery(name = "Khakis.findByColor", query = "SELECT k FROM Khakis k WHERE k.color = :color")
    , @NamedQuery(name = "Khakis.findByUPCCode", query = "SELECT k FROM Khakis k WHERE k.uPCCode = :uPCCode")})
public class Khakis implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "TypeId")
    private String typeId;
    @Column(name = "Brand_Name")
    private String brandName;
    @Column(name = "Waist")
    private Integer waist;
    @Column(name = "Length")
    private Integer length;
    @Column(name = "Fit")
    private String fit;
    @Column(name = "Color")
    private String color;
    @Column(name = "UPC_Code")
    private Integer uPCCode;

    public Khakis() {
    }

    public Khakis(String typeId) {
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
        if (!(object instanceof Khakis)) {
            return false;
        }
        Khakis other = (Khakis) object;
        if ((this.typeId == null && other.typeId != null) || (this.typeId != null && !this.typeId.equals(other.typeId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "sql.Khakis[ typeId=" + typeId + " ]";
    }
    
}
