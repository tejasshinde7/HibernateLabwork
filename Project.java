package com.example.OnetomanyLab;
//WAP to create OneToMany relationship between Employee and Project table
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
@Entity
@Table(name = "project_table")
public class Project {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
private int pId;
@Override
	public String toString() {
		return "Project [pId=" + pId + ", pName=" + pName + ", pmembers=" + pmembers + ", employeess=" + employeess
				+ "]";
	}
public Project() {
		super();
		// TODO Auto-generated constructor stub
	}
public Project(int pId, String pName, int pmembers, List<Employe> employeess) {
		super();
		this.pId = pId;
		this.pName = pName;
		this.pmembers = pmembers;
		this.employeess = employeess;
	}
public int getpId() {
		return pId;
	}
	public void setpId(int pId) {
		this.pId = pId;
	}
	public String getpName() {
		return pName;
	}
	public void setpName(String pName) {
		this.pName = pName;
	}
	public int getPmembers() {
		return pmembers;
	}
	public void setPmembers(int pmembers) {
		this.pmembers = pmembers;
	}
	public List<Employe> getEmployeess() {
		return employeess;
	}
	public void setEmployeess(List<Employe> employeess) {
		this.employeess = employeess;
	}
private String pName;
private int pmembers;
@OneToMany(mappedBy = "project",cascade = CascadeType.ALL)
private List<Employe> employeess=new ArrayList<Employe>();
}
