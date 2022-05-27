package net.infrastudio.api.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "test_table")
public class Test {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long SNo;
	
	@Column(name = "test_type")
	private String testType;
	
	@Column(name = "test_input")
	private String testInput;
	
	@Column(name = "Date")
	private String Date;
	
	@Column(name = "Status")
	private String Status;
	
	
	
	public Test() {
		super();
	}
	public Test(String testType, String testInput, String date, String status) {
		super();
		this.testType = testType;
		this.testInput = testInput;
		Date = date;
		Status = status;
	}
	public long getSNo() {
		return SNo;
	}
	public void setSNo(long sNo) {
		SNo = sNo;
	}
	public String getTestType() {
		return testType;
	}
	public void setTestType(String testType) {
		this.testType = testType;
	}
	public String getTestInput() {
		return testInput;
	}
	public void setTestInput(String testInput) {
		this.testInput = testInput;
	}
	public String getDate() {
		return Date;
	}
	public void setDate(String date) {
		Date = date;
	}
	public String getStatus() {
		return Status;
	}
	public void setStatus(String status) {
		Status = status;
	}
	
	
}
