package pojo;

// Generated Jun 7, 2015 1:31:52 AM by Hibernate Tools 3.4.0.CR1

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Examination generated by hbm2java
 */
@Entity
@Table(name = "Examination")
public class Examination implements java.io.Serializable {

	private int examId;
	private Date examDate;
	private Date startTime;
	private Date endTime;
	private int examFees;
	private Integer examStatus;
	private Serializable examRoom;
	private Serializable notes;

	public Examination() {
	}

	public Examination(int examId, Date examDate, Date startTime, Date endTime,
			int examFees, Serializable examRoom) {
		this.examId = examId;
		this.examDate = examDate;
		this.startTime = startTime;
		this.endTime = endTime;
		this.examFees = examFees;
		this.examRoom = examRoom;
	}

	public Examination(int examId, Date examDate, Date startTime, Date endTime,
			int examFees, Integer examStatus, Serializable examRoom,
			Serializable notes) {
		this.examId = examId;
		this.examDate = examDate;
		this.startTime = startTime;
		this.endTime = endTime;
		this.examFees = examFees;
		this.examStatus = examStatus;
		this.examRoom = examRoom;
		this.notes = notes;
	}

	@Id
	@Column(name = "ExamID", unique = true, nullable = false)
	public int getExamId() {
		return this.examId;
	}

	public void setExamId(int examId) {
		this.examId = examId;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "ExamDate", nullable = false, length = 10)
	public Date getExamDate() {
		return this.examDate;
	}

	public void setExamDate(Date examDate) {
		this.examDate = examDate;
	}

	@Temporal(TemporalType.TIME)
	@Column(name = "StartTime", nullable = false, length = 16)
	public Date getStartTime() {
		return this.startTime;
	}

	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

	@Temporal(TemporalType.TIME)
	@Column(name = "EndTime", nullable = false, length = 16)
	public Date getEndTime() {
		return this.endTime;
	}

	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}

	@Column(name = "ExamFees", nullable = false)
	public int getExamFees() {
		return this.examFees;
	}

	public void setExamFees(int examFees) {
		this.examFees = examFees;
	}

	@Column(name = "ExamStatus")
	public Integer getExamStatus() {
		return this.examStatus;
	}

	public void setExamStatus(Integer examStatus) {
		this.examStatus = examStatus;
	}

	@Column(name = "ExamRoom", nullable = false)
	public Serializable getExamRoom() {
		return this.examRoom;
	}

	public void setExamRoom(Serializable examRoom) {
		this.examRoom = examRoom;
	}

	@Column(name = "Notes")
	public Serializable getNotes() {
		return this.notes;
	}

	public void setNotes(Serializable notes) {
		this.notes = notes;
	}

}
