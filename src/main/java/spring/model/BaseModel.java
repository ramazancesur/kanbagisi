package spring.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.hibernate.annotations.GenericGenerator;

public class BaseModel implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 660949740929758008L;
	@Id
	@GeneratedValue(generator = "hibernate-uuid")
	@GenericGenerator(name = "uuid", strategy = "uuid2")
	@Column(name = "oid", unique = true)
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
