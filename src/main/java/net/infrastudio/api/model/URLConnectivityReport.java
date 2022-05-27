package net.infrastudio.api.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="url_table")
public class URLConnectivityReport {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long sNo;
	
	@Column(name = "Url")
	private String url;
	
	@Column(name = "Status")
	private String status;
	
	@Column(name = "PreProof")
	private String preProof;
	
	@Column(name = "PostProof")
	private String postProof;

	
	public URLConnectivityReport() {
		super();
	}

	public URLConnectivityReport(String url, String status, String preProof, String postProof) {
		super();
		this.url = url;
		this.status = status;
		this.preProof = preProof;
		this.postProof = postProof;
	}

	public long getsNo() {
		return sNo;
	}

	public void setsNo(long sNo) {
		this.sNo = sNo;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getPreProof() {
		return preProof;
	}

	public void setPreProof(String preProof) {
		this.preProof = preProof;
	}

	public String getPostProof() {
		return postProof;
	}

	public void setPostProof(String postProof) {
		this.postProof = postProof;
	}
	
	
	
	
}
