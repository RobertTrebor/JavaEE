package de.lengsfeld.virtualremembrance;

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
 * @author Tyler Durden
 */
@Entity
@Table(name = "COUNTRY")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "find", query = "SELECT c FROM Country c WHERE c.countrycode = 'AA'"),
    @NamedQuery(name = "Country.findAll", query = "SELECT c FROM Country c"),
    @NamedQuery(name = "Country.findByCountrycode", query = "SELECT c FROM Country c WHERE c.countrycode = :countrycode"),
    @NamedQuery(name = "Country.findByCountryname", query = "SELECT c FROM Country c WHERE c.countryname = :countryname")})
public class Country implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "COUNTRYCODE")
    private String countrycode;
    @Basic(optional = false)
    @Column(name = "COUNTRYNAME")
    private String countryname;

    public Country() {
    }

    public Country(String countrycode) {
        this.countrycode = countrycode;
    }

    public Country(String countrycode, String countryname) {
        this.countrycode = countrycode;
        this.countryname = countryname;
    }

    public String getCountrycode() {
        return countrycode;
    }

    public void setCountrycode(String countrycode) {
        this.countrycode = countrycode;
    }

    public String getCountryname() {
        return countryname;
    }

    public void setCountryname(String countryname) {
        this.countryname = countryname;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (countrycode != null ? countrycode.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Country)) {
            return false;
        }
        Country other = (Country) object;
        if ((this.countrycode == null && other.countrycode != null) || (this.countrycode != null && !this.countrycode.equals(other.countrycode))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "de.lengsfeld.virtualremembrance.Country[ countrycode=" + countrycode + " ]";
    }
    
}
