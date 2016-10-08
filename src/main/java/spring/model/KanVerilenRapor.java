package spring.model;

import javax.faces.bean.ManagedBean;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
@Entity
@Table(name="KANVERILENRAPOR")
@ManagedBean(name="kanVerilenRapors")
public class KanVerilenRapor extends BaseModel{
	@ManyToOne
	private Kisi kisi;
	@ManyToOne
	private Hastahane hastahane;
	@Column
	private float size;
	public Kisi getKisi() {
		return kisi;
	}
	public void setKisi(Kisi kisi) {
		this.kisi = kisi;
	}
	public Hastahane getHastahane() {
		return hastahane;
	}
	public void setHastahane(Hastahane hastahane) {
		this.hastahane = hastahane;
	}
	public float getSize() {
		return size;
	}
	public void setSize(float size) {
		this.size = size;
	}
	
	
}
