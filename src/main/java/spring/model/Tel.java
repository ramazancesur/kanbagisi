package spring.model;

import javax.faces.bean.ManagedBean;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import Utulity.EnumUtulity;

@Entity
@Table(name="TELEFON")
@ManagedBean(name="tel")
public class Tel extends BaseModel {
	@Column
	private String telNo;
	@Column
	private EnumUtulity.TelType telType;
	public String getTelNo() {
		return telNo;
	}
	public void setTelNo(String telNo) {
		this.telNo = telNo;
	}
	public EnumUtulity.TelType getTelType() {
		return telType;
	}
	public void setTelType(EnumUtulity.TelType telType) {
		this.telType = telType;
	}
	
	
}
