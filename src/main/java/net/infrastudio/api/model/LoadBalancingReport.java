package net.infrastudio.api.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name="loadBalancing_table")
@Table(name="loadBalancing_table")
public class LoadBalancingReport {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long no;
	
	@Column(name = "uid")
	private long uid;
	
	@Column(name = "sno")
	private int sno;
	
	@Column(name = "Output")
	private String output;
	
	@Column(name = "Flipped")
	private String flipped;
	
	

	public LoadBalancingReport() {
		super();
	}

	public LoadBalancingReport(long uid, int sno, String output, String flipped) {
		super();
		this.uid = uid;
		this.sno = sno;
		this.output = output;
		this.flipped = flipped;
	}

	public long getNo() {
		return no;
	}

	public void setNo(long no) {
		this.no = no;
	}

	public long getUid() {
		return uid;
	}

	public void setUid(long uid) {
		this.uid = uid;
	}

	public int getSno() {
		return sno;
	}

	public void setSno(int sno) {
		this.sno = sno;
	}

	public String getOutput() {
		return output;
	}

	public void setOutput(String output) {
		this.output = output;
	}

	public String getFlipped() {
		return flipped;
	}

	public void setFlipped(String flipped) {
		this.flipped = flipped;
	}
	
	
	

	
	

	
	
	

	
	

	
	
	
	

}
