package pojo;

// Generated Jun 7, 2015 1:31:52 AM by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * UserExaminationId generated by hbm2java
 */
@Embeddable
public class UserExaminationId implements java.io.Serializable {

	private int userId;
	private int examId;

	public UserExaminationId() {
	}

	public UserExaminationId(int userId, int examId) {
		this.userId = userId;
		this.examId = examId;
	}

	@Column(name = "UserID", nullable = false)
	public int getUserId() {
		return this.userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	@Column(name = "ExamID", nullable = false)
	public int getExamId() {
		return this.examId;
	}

	public void setExamId(int examId) {
		this.examId = examId;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof UserExaminationId))
			return false;
		UserExaminationId castOther = (UserExaminationId) other;

		return (this.getUserId() == castOther.getUserId())
				&& (this.getExamId() == castOther.getExamId());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getUserId();
		result = 37 * result + this.getExamId();
		return result;
	}

}