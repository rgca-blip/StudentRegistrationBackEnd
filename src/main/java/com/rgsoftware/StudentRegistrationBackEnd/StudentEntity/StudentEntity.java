/*
 * package com.rgsoftware.StudentRegistrationBackEnd.StudentEntity;
 * 
 * import jakarta.persistence.Entity; import jakarta.persistence.Table;
 * 
 * @Entity
 * 
 * @Table(name = "student") public class StudentEntity { private long studentId;
 * private String studentFirstName; private String studentLastName;
 * 
 * public StudentEntity(long studentId, String studentFirstName, String
 * studentLastName) { super(); this.studentId = studentId; this.studentFirstName
 * = studentFirstName; this.studentLastName = studentLastName; }
 * 
 * public StudentEntity() { super(); }
 * 
 * public long getStudentId() { return studentId; }
 * 
 * public void setStudentId(long studentId) { this.studentId = studentId; }
 * 
 * public String getStudentFirstName() { return studentFirstName; }
 * 
 * public void setStudentFirstName(String studentFirstName) {
 * this.studentFirstName = studentFirstName; }
 * 
 * public String getStudentLastName() { return studentLastName; }
 * 
 * public void setStudentLastName(String studentLastName) { this.studentLastName
 * = studentLastName; }
 * 
 * @Override public int hashCode() { final int prime = 31; int result = 1;
 * result = prime * result + ((studentFirstName == null) ? 0 :
 * studentFirstName.hashCode()); result = prime * result + (int) (studentId ^
 * (studentId >>> 32)); result = prime * result + ((studentLastName == null) ? 0
 * : studentLastName.hashCode()); return result; }
 * 
 * @Override public boolean equals(Object obj) { if (this == obj) return true;
 * if (obj == null) return false; if (getClass() != obj.getClass()) return
 * false; StudentEntity other = (StudentEntity) obj; if (studentFirstName ==
 * null) { if (other.studentFirstName != null) return false; } else if
 * (!studentFirstName.equals(other.studentFirstName)) return false; if
 * (studentId != other.studentId) return false; if (studentLastName == null) {
 * if (other.studentLastName != null) return false; } else if
 * (!studentLastName.equals(other.studentLastName)) return false; return true; }
 * 
 * @Override public String toString() { return "StudentEntity [studentId=" +
 * studentId + ", studentFirstName=" + studentFirstName + ", studentLastName=" +
 * studentLastName + "]"; }
 * 
 * }
 */