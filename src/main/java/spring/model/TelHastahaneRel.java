package spring.model;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.ManyToOne;

public class TelHastahaneRel {
	@ManyToOne
	private Hastahane hastahane;
	@Column
	private Tel Tel;
	public Hastahane getHastahane() {
		return hastahane;
	}
	public void setHastahane(Hastahane hastahane) {
		this.hastahane = hastahane;
	}
	public Tel getTel() {
		return Tel;
	}
	public void setTel(Tel tel) {
		Tel = tel;
	}
	
}
