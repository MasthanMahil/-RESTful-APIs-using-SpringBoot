package com.Document.Documentation.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Document {
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	private long id;
	private String departmentName;
	private String departmentCode;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getDepartmentName() {
		return departmentName;
	}
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	public String getDepartmentCode() {
		return departmentCode;
	}
	public void setDepartmentCode(String departmentCode) {
		this.departmentCode = departmentCode;
	}
	public Document(long id, String departmentName, String departmentCode) {
		super();
		this.id = id;
		this.departmentName = departmentName;
		this.departmentCode = departmentCode;
	}
	public Document(){
		
}
	@Override
	public String toString() {
		return "Document [id=" + id + ", departmentName=" + departmentName + ", departmentCode=" + departmentCode
				+ ", getId()=" + getId() + ", getDepartmentName()=" + getDepartmentName() + ", getDepartmentCode()="
				+ getDepartmentCode() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}
	
}

