/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BicicletePackage;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
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
@Table(name = "Sedii", catalog = "CentruBiciclete", schema = "dbo")
@NamedQueries({
    @NamedQuery(name = "Sedii.findAll", query = "SELECT s FROM Sedii s")
    , @NamedQuery(name = "Sedii.findBySediuID", query = "SELECT s FROM Sedii s WHERE s.sediuID = :sediuID")
    , @NamedQuery(name = "Sedii.findByNume", query = "SELECT s FROM Sedii s WHERE s.nume = :nume")
    , @NamedQuery(name = "Sedii.findByJudet", query = "SELECT s FROM Sedii s WHERE s.judet = :judet")
    , @NamedQuery(name = "Sedii.findByOras", query = "SELECT s FROM Sedii s WHERE s.oras = :oras")
    , @NamedQuery(name = "Sedii.findByStrada", query = "SELECT s FROM Sedii s WHERE s.strada = :strada")
    , @NamedQuery(name = "Sedii.findByNumar", query = "SELECT s FROM Sedii s WHERE s.numar = :numar")
    , @NamedQuery(name = "Sedii.findByNumarTelefonContact", query = "SELECT s FROM Sedii s WHERE s.numarTelefonContact = :numarTelefonContact")
    , @NamedQuery(name = "Sedii.findByManagerID", query = "SELECT s FROM Sedii s WHERE s.managerID = :managerID")})
public class Sedii implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "SediuID")
    private Integer sediuID;
    @Column(name = "Nume")
    private String nume;
    @Basic(optional = false)
    @Column(name = "Judet")
    private String judet;
    @Basic(optional = false)
    @Column(name = "Oras")
    private String oras;
    @Basic(optional = false)
    @Column(name = "Strada")
    private String strada;
    @Basic(optional = false)
    @Column(name = "Numar")
    private String numar;
    @Basic(optional = false)
    @Column(name = "NumarTelefonContact")
    private String numarTelefonContact;
    @Column(name = "ManagerID")
    private Integer managerID;

    public Sedii() {
    }

    public Sedii(Integer sediuID) {
        this.sediuID = sediuID;
    }

    public Sedii(Integer sediuID, String judet, String oras, String strada, String numar, String numarTelefonContact) {
        this.sediuID = sediuID;
        this.judet = judet;
        this.oras = oras;
        this.strada = strada;
        this.numar = numar;
        this.numarTelefonContact = numarTelefonContact;
    }

    public Integer getSediuID() {
        return sediuID;
    }

    public void setSediuID(Integer sediuID) {
        Integer oldSediuID = this.sediuID;
        this.sediuID = sediuID;
        changeSupport.firePropertyChange("sediuID", oldSediuID, sediuID);
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        String oldNume = this.nume;
        this.nume = nume;
        changeSupport.firePropertyChange("nume", oldNume, nume);
    }

    public String getJudet() {
        return judet;
    }

    public void setJudet(String judet) {
        String oldJudet = this.judet;
        this.judet = judet;
        changeSupport.firePropertyChange("judet", oldJudet, judet);
    }

    public String getOras() {
        return oras;
    }

    public void setOras(String oras) {
        String oldOras = this.oras;
        this.oras = oras;
        changeSupport.firePropertyChange("oras", oldOras, oras);
    }

    public String getStrada() {
        return strada;
    }

    public void setStrada(String strada) {
        String oldStrada = this.strada;
        this.strada = strada;
        changeSupport.firePropertyChange("strada", oldStrada, strada);
    }

    public String getNumar() {
        return numar;
    }

    public void setNumar(String numar) {
        String oldNumar = this.numar;
        this.numar = numar;
        changeSupport.firePropertyChange("numar", oldNumar, numar);
    }

    public String getNumarTelefonContact() {
        return numarTelefonContact;
    }

    public void setNumarTelefonContact(String numarTelefonContact) {
        String oldNumarTelefonContact = this.numarTelefonContact;
        this.numarTelefonContact = numarTelefonContact;
        changeSupport.firePropertyChange("numarTelefonContact", oldNumarTelefonContact, numarTelefonContact);
    }

    public Integer getManagerID() {
        return managerID;
    }

    public void setManagerID(Integer managerID) {
        Integer oldManagerID = this.managerID;
        this.managerID = managerID;
        changeSupport.firePropertyChange("managerID", oldManagerID, managerID);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (sediuID != null ? sediuID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Sedii)) {
            return false;
        }
        Sedii other = (Sedii) object;
        if ((this.sediuID == null && other.sediuID != null) || (this.sediuID != null && !this.sediuID.equals(other.sediuID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "BicicletePackage.Sedii[ sediuID=" + sediuID + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
