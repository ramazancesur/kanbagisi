package spring.model;

import javax.persistence.CascadeType;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

public class TelKisiRel extends BaseModel {
	@ManyToOne
	private Kisi kisi;
	
	@OneToOne(fetch = FetchType.LAZY, mappedBy = "TELEFON")
	private Tel tel;

	public Kisi getKisi() {
		return kisi;
	}

	public void setKisi(Kisi kisi) {
		this.kisi = kisi;
	}

	public Tel getTel() {
		return tel;
	}

	public void setTel(Tel tel) {
		this.tel = tel;
	}
}
