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
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

/**
 *
 * @author Gabi
 */
@Entity
@Table(name = "Angajati", catalog = "CentruBiciclete", schema = "dbo")
@NamedQueries({
    @NamedQuery(name = "Angajati.findAll", query = "SELECT a FROM Angajati a")
    , @NamedQuery(name = "Angajati.findByAngajatID", query = "SELECT a FROM Angajati a WHERE a.angajatID = :angajatID")
    , @NamedQuery(name = "Angajati.findBySediuID", query = "SELECT a FROM Angajati a WHERE a.sediuID = :sediuID")
    , @NamedQuery(name = "Angajati.findByNume", query = "SELECT a FROM Angajati a WHERE a.nume = :nume")
    , @NamedQuery(name = "Angajati.findByPrenume", query = "SELECT a FROM Angajati a WHERE a.prenume = :prenume")
    , @NamedQuery(name = "Angajati.findByCnp", query = "SELECT a FROM Angajati a WHERE a.cnp = :cnp")
    , @NamedQuery(name = "Angajati.findByJudet", query = "SELECT a FROM Angajati a WHERE a.judet = :judet")
    , @NamedQuery(name = "Angajati.findByOras", query = "SELECT a FROM Angajati a WHERE a.oras = :oras")
    , @NamedQuery(name = "Angajati.findByStrada", query = "SELECT a FROM Angajati a WHERE a.strada = :strada")
    , @NamedQuery(name = "Angajati.findByNumar", query = "SELECT a FROM Angajati a WHERE a.numar = :numar")
    , @NamedQuery(name = "Angajati.findBySex", query = "SELECT a FROM Angajati a WHERE a.sex = :sex")
    , @NamedQuery(name = "Angajati.findByDataNasterii", query = "SELECT a FROM Angajati a WHERE a.dataNasterii = :dataNasterii")
    , @NamedQuery(name = "Angajati.findByDataAngajarii", query = "SELECT a FROM Angajati a WHERE a.dataAngajarii = :dataAngajarii")
    , @NamedQuery(name = "Angajati.findBySalariu", query = "SELECT a FROM Angajati a WHERE a.salariu = :salariu")
    , @NamedQuery(name = "Angajati.findByUserID", query = "SELECT a FROM Angajati a WHERE a.userID = :userID")})
public class Angajati implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "AngajatID")
    private Integer angajatID;
    @Column(name = "SediuID")
    private Integer sediuID;
    @Basic(optional = false)
    @Column(name = "Nume")
    private String nume;
    @Basic(optional = false)
    @Column(name = "Prenume")
    private String prenume;
    @Basic(optional = false)
    @Column(name = "CNP")
    private String cnp;
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
    @Column(name = "Sex")
    private Character sex;
    @Column(name = "DataNasterii")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dataNasterii;
    @Column(name = "DataAngajarii")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dataAngajarii;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @Column(name = "Salariu")
    private BigDecimal salariu;
    @Column(name = "UserID")
    private Integer userID;

    public Angajati() {
    }

    public Angajati(Integer angajatID) {
        this.angajatID = angajatID;
    }

    public Angajati(Integer angajatID, String nume, String prenume, String cnp, String judet, String oras, String strada, String numar, BigDecimal salariu) {
        this.angajatID = angajatID;
        this.nume = nume;
        this.prenume = prenume;
        this.cnp = cnp;
        this.judet = judet;
        this.oras = oras;
        this.strada = strada;
        this.numar = numar;
        this.salariu = salariu;
    }

    public Integer getAngajatID() {
        return angajatID;
    }

    public void setAngajatID(Integer angajatID) {
        Integer oldAngajatID = this.angajatID;
        this.angajatID = angajatID;
        changeSupport.firePropertyChange("angajatID", oldAngajatID, angajatID);
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

    public String getPrenume() {
        return prenume;
    }

    public void setPrenume(String prenume) {
        String oldPrenume = this.prenume;
        this.prenume = prenume;
        changeSupport.firePropertyChange("prenume", oldPrenume, prenume);
    }

    public String getCnp() {
        return cnp;
    }

    public void setCnp(String cnp) {
        String oldCnp = this.cnp;
        this.cnp = cnp;
        changeSupport.firePropertyChange("cnp", oldCnp, cnp);
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

    public Character getSex() {
        return sex;
    }

    public void setSex(Character sex) {
        Character oldSex = this.sex;
        this.sex = sex;
        changeSupport.firePropertyChange("sex", oldSex, sex);
    }

    public Date getDataNasterii() {
        return dataNasterii;
    }

    public void setDataNasterii(Date dataNasterii) {
        Date oldDataNasterii = this.dataNasterii;
        this.dataNasterii = dataNasterii;
        changeSupport.firePropertyChange("dataNasterii", oldDataNasterii, dataNasterii);
    }

    public Date getDataAngajarii() {
        return dataAngajarii;
    }

    public void setDataAngajarii(Date dataAngajarii) {
        Date oldDataAngajarii = this.dataAngajarii;
        this.dataAngajarii = dataAngajarii;
        changeSupport.firePropertyChange("dataAngajarii", oldDataAngajarii, dataAngajarii);
    }

    public BigDecimal getSalariu() {
        return salariu;
    }

    public void setSalariu(BigDecimal salariu) {
        BigDecimal oldSalariu = this.salariu;
        this.salariu = salariu;
        changeSupport.firePropertyChange("salariu", oldSalariu, salariu);
    }

    public Integer getUserID() {
        return userID;
    }

    public void setUserID(Integer userID) {
        Integer oldUserID = this.userID;
        this.userID = userID;
        changeSupport.firePropertyChange("userID", oldUserID, userID);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (angajatID != null ? angajatID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Angajati)) {
            return false;
        }
        Angajati other = (Angajati) object;
        if ((this.angajatID == null && other.angajatID != null) || (this.angajatID != null && !this.angajatID.equals(other.angajatID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "BicicletePackage.Angajati[ angajatID=" + angajatID + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
