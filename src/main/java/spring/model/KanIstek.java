package spring.model;

import java.util.Date;

import javax.faces.bean.ManagedBean;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import Utulity.EnumUtulity;

@Entity
@Table(name="KANISTEK")
@ManagedBean(name="kanIsteks")
public class KanIstek {

	@Column
	private String istekNotu;
	
	@Column
	private Date kaldildigiTarih;
	
	@Column
	private EnumUtulity.KanGrubu kanGrubu;
	
	@ManyToOne
	private Hastahane hastahane;
	
	public String getIstekNotu() {
		return istekNotu;
	}

	public void setIstekNotu(String istekNotu) {
		this.istekNotu = istekNotu;
	}

	public Hastahane getHastahane() {
		return hastahane;
	}

	public void setHastahane(Hastahane hastahane) {
		this.hastahane = hastahane;
	}

	public Date getKaldildigiTarih() {
		return kaldildigiTarih;
	}

	public void setKaldildigiTarih(Date kaldildigiTarih) {
		this.kaldildigiTarih = kaldildigiTarih;
	}

	public EnumUtulity.KanGrubu getKanGrubu() {
		return kanGrubu;
	}

	public void setKanGrubu(EnumUtulity.KanGrubu kanGrubu) {
		this.kanGrubu = kanGrubu;
	}
	
	
	
}
