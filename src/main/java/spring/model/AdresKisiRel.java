package spring.model;

import java.util.Set;

import javax.faces.bean.ManagedBean;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table
@ManagedBean
public class AdresKisiRel extends BaseModel {
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "ADRES")
	@Column
	private Set<Adres> adres;
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "KISI")
	@Column
	private Set<Kisi> kisi;
	public Set<Adres> getAdres() {
		return adres;
	}
	public void setAdres(Set<Adres> adres) {
		this.adres = adres;
	}
	public Set<Kisi> getKisi() {
		return kisi;
	}
	public void setKisi(Set<Kisi> kisi) {
		this.kisi = kisi;
	}

}
