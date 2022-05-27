package net.infrastudio.api.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name="share_drive_table")
@Table(name="share_drive_table")
public class ShareDriveReport {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long no;
	
	@Column(name = "uid")
	private long uid;
	
	@Column(name = "sno")
	private int sno;
	
	@Column(name = "Path")
	private String path;
	
	@Column(name = "CreateFilesTime")
	private float createFilesTime;
	
	@Column(name = "WriteFilesTime")
	private float writeFilesTime;
	
	@Column(name = "MoveFilesTime")
	private float moveFilesTime;
	
	@Column(name = "DeleteFilesTime")
	private float deleteFilesTime;
	
	

	public ShareDriveReport() {
		super();
	}

	public ShareDriveReport(long uid, int sno, String path, float createFilesTime, float writeFilesTime,
			float moveFilesTime, float deleteFilesTime) {
		super();
		this.uid = uid;
		this.sno = sno;
		this.path = path;
		this.createFilesTime = createFilesTime;
		this.writeFilesTime = writeFilesTime;
		this.moveFilesTime = moveFilesTime;
		this.deleteFilesTime = deleteFilesTime;
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

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public float getCreateFilesTime() {
		return createFilesTime;
	}

	public void setCreateFilesTime(float createFilesTime) {
		this.createFilesTime = createFilesTime;
	}

	public float getWriteFilesTime() {
		return writeFilesTime;
	}

	public void setWriteFilesTime(float writeFilesTime) {
		this.writeFilesTime = writeFilesTime;
	}

	public float getMoveFilesTime() {
		return moveFilesTime;
	}

	public void setMoveFilesTime(float moveFilesTime) {
		this.moveFilesTime = moveFilesTime;
	}

	public float getDeleteFilesTime() {
		return deleteFilesTime;
	}

	public void setDeleteFilesTime(float deleteFilesTime) {
		this.deleteFilesTime = deleteFilesTime;
	}
	
	

	
	

}
