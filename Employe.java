package com.example.OnetomanyLab;
//WAP to create OneToMany relationship between Employee and Project table
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Employe_table")
public class Employe {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
private int eId;
@Override
	public String toString() {
		return "Employe [eId=" + eId + ", eName=" + eName + ", eAge=" + eAge + ", project=" + project + "]";
	}
public Employe() {
		super();
		// TODO Auto-generated constructor stub
	}
public Employe(int eId, String eName, int eAge, Project project) {
		super();
		this.eId = eId;
		this.eName = eName;
		this.eAge = eAge;
		this.project = project;
	}
public int geteId() {
		return eId;
	}
	public void seteId(int eId) {
		this.eId = eId;
	}
	public String geteName() {
		return eName;
	}
	public void seteName(String eName) {
		this.eName = eName;
	}
	public int geteAge() {
		return eAge;
	}
	public void seteAge(int eAge) {
		this.eAge = eAge;
	}
	public Project getProject() {
		return project;
	}
	public void setProject(Project project) {
		this.project = project;
	}
private String eName;
private int eAge;
@ManyToOne
@JoinColumn(name = "pId")
private Project project;
}
