package spring.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Id;

public class BaseModel implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 660949740929758008L;
	@Column
	@Id
	private String oid;
	@Column
	private String adi;
	@Column
	private Date createdDate;
	
	
	public Date getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}
	public String getOid() {
		return oid;
	}
	public void setOid(String oid) {
		this.oid = oid;
	}
	public String getAdi() {
		return adi;
	}
	public void setAdi(String adi) {
		this.adi = adi;
	}
	
	
}
