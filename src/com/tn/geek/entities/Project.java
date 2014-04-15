package com.tn.geek.entities;

import java.io.Serializable;
import java.lang.String;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Project
 *
 */
@Entity(name = "project")
public class Project implements Serializable {

	
	private int pnumber;
	private String pname;
	private String plocation;
	
	private int deptNo;
	
	private static final long serialVersionUID = 1L;

	public Project() {
		super();
	} 
	
	@Id
	public int getPnumber() {
		return this.pnumber;
	}

	public void setPnumber(int pnumber) {
		this.pnumber = pnumber;
	}   
	public String getPname() {
		return this.pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}   
	public String getPlocation() {
		return this.plocation;
	}

	public void setPlocation(String plocation) {
		this.plocation = plocation;
	}
	
	
	@Column(name = "dept_no")
	public int getDeptNo() {
		return deptNo;
	}
	public void setDeptNo(int deptNo) {
		this.deptNo = deptNo;
	}
	
	
	@Override
    public String toString() {
        return "Project [pnumber=" + pnumber + ", pname=" + pname
                + ", plocation=" + plocation + ", deptNo=" + deptNo + "]";
    }
	
	
   
}
