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
@Table(name = "TIE")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Tie.findAll", query = "SELECT t FROM Tie t")
    , @NamedQuery(name = "Tie.findByTypeId", query = "SELECT t FROM Tie t WHERE t.typeId = :typeId")
    , @NamedQuery(name = "Tie.findByBrandName", query = "SELECT t FROM Tie t WHERE t.brandName = :brandName")
    , @NamedQuery(name = "Tie.findBySizes", query = "SELECT t FROM Tie t WHERE t.sizes = :sizes")
    , @NamedQuery(name = "Tie.findByColor", query = "SELECT t FROM Tie t WHERE t.color = :color")
    , @NamedQuery(name = "Tie.findByUPCCode", query = "SELECT t FROM Tie t WHERE t.uPCCode = :uPCCode")})
public class Tie implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "TypeId")
    private String typeId;
    @Column(name = "Brand_Name")
    private String brandName;
    @Column(name = "Sizes")
    private String sizes;
    @Column(name = "Color")
    private String color;
    @Column(name = "UPC_Code")
    private Integer uPCCode;

    public Tie() {
    }

    public Tie(String typeId) {
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

    public String getSizes() {
        return sizes;
    }

    public void setSizes(String sizes) {
        this.sizes = sizes;
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
        if (!(object instanceof Tie)) {
            return false;
        }
        Tie other = (Tie) object;
        if ((this.typeId == null && other.typeId != null) || (this.typeId != null && !this.typeId.equals(other.typeId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "sql.Tie[ typeId=" + typeId + " ]";
    }
    
}
