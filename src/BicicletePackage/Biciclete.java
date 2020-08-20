/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BicicletePackage;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 *
 * @author Gabi
 */
@Entity
@Table(name = "Biciclete", catalog = "CentruBiciclete", schema = "dbo")
@NamedQueries({
    @NamedQuery(name = "Biciclete.findAll", query = "SELECT b FROM Biciclete b")
    , @NamedQuery(name = "Biciclete.findByBicicletaID", query = "SELECT b FROM Biciclete b WHERE b.bicicletaID = :bicicletaID")
    , @NamedQuery(name = "Biciclete.findBySediuID", query = "SELECT b FROM Biciclete b WHERE b.sediuID = :sediuID")
    , @NamedQuery(name = "Biciclete.findByProducator", query = "SELECT b FROM Biciclete b WHERE b.producator = :producator")
    , @NamedQuery(name = "Biciclete.findBySerie", query = "SELECT b FROM Biciclete b WHERE b.serie = :serie")
    , @NamedQuery(name = "Biciclete.findByCuloare", query = "SELECT b FROM Biciclete b WHERE b.culoare = :culoare")
    , @NamedQuery(name = "Biciclete.findByMaterialCadru", query = "SELECT b FROM Biciclete b WHERE b.materialCadru = :materialCadru")
    , @NamedQuery(name = "Biciclete.findByNumarViteze", query = "SELECT b FROM Biciclete b WHERE b.numarViteze = :numarViteze")
    , @NamedQuery(name = "Biciclete.findByPretInchirierePeOra", query = "SELECT b FROM Biciclete b WHERE b.pretInchirierePeOra = :pretInchirierePeOra")})
public class Biciclete implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "BicicletaID")
    private Integer bicicletaID;
    @Column(name = "SediuID")
    private Integer sediuID;
    @Column(name = "Producator")
    private String producator;
    @Column(name = "Serie")
    private String serie;
    @Column(name = "Culoare")
    private String culoare;
    @Column(name = "MaterialCadru")
    private String materialCadru;
    @Column(name = "NumarViteze")
    private Integer numarViteze;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @Column(name = "PretInchirierePeOra")
    private BigDecimal pretInchirierePeOra;

    public Biciclete() {
    }

    public Biciclete(Integer bicicletaID) {
        this.bicicletaID = bicicletaID;
    }

    public Biciclete(Integer bicicletaID, BigDecimal pretInchirierePeOra) {
        this.bicicletaID = bicicletaID;
        this.pretInchirierePeOra = pretInchirierePeOra;
    }

    public Integer getBicicletaID() {
        return bicicletaID;
    }

    public void setBicicletaID(Integer bicicletaID) {
        Integer oldBicicletaID = this.bicicletaID;
        this.bicicletaID = bicicletaID;
        changeSupport.firePropertyChange("bicicletaID", oldBicicletaID, bicicletaID);
    }

    public Integer getSediuID() {
        return sediuID;
    }

    public void setSediuID(Integer sediuID) {
        Integer oldSediuID = this.sediuID;
        this.sediuID = sediuID;
        changeSupport.firePropertyChange("sediuID", oldSediuID, sediuID);
    }

    public String getProducator() {
        return producator;
    }

    public void setProducator(String producator) {
        String oldProducator = this.producator;
        this.producator = producator;
        changeSupport.firePropertyChange("producator", oldProducator, producator);
    }

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        String oldSerie = this.serie;
        this.serie = serie;
        changeSupport.firePropertyChange("serie", oldSerie, serie);
    }

    public String getCuloare() {
        return culoare;
    }

    public void setCuloare(String culoare) {
        String oldCuloare = this.culoare;
        this.culoare = culoare;
        changeSupport.firePropertyChange("culoare", oldCuloare, culoare);
    }

    public String getMaterialCadru() {
        return materialCadru;
    }

    public void setMaterialCadru(String materialCadru) {
        String oldMaterialCadru = this.materialCadru;
        this.materialCadru = materialCadru;
        changeSupport.firePropertyChange("materialCadru", oldMaterialCadru, materialCadru);
    }

    public Integer getNumarViteze() {
        return numarViteze;
    }

    public void setNumarViteze(Integer numarViteze) {
        Integer oldNumarViteze = this.numarViteze;
        this.numarViteze = numarViteze;
        changeSupport.firePropertyChange("numarViteze", oldNumarViteze, numarViteze);
    }

    public BigDecimal getPretInchirierePeOra() {
        return pretInchirierePeOra;
    }

    public void setPretInchirierePeOra(BigDecimal pretInchirierePeOra) {
        BigDecimal oldPretInchirierePeOra = this.pretInchirierePeOra;
        this.pretInchirierePeOra = pretInchirierePeOra;
        changeSupport.firePropertyChange("pretInchirierePeOra", oldPretInchirierePeOra, pretInchirierePeOra);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (bicicletaID != null ? bicicletaID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Biciclete)) {
            return false;
        }
        Biciclete other = (Biciclete) object;
        if ((this.bicicletaID == null && other.bicicletaID != null) || (this.bicicletaID != null && !this.bicicletaID.equals(other.bicicletaID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "BicicletePackage.Biciclete[ bicicletaID=" + bicicletaID + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
