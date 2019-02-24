package com.resource.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "interview")
public class Interview {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;
	private String interviewer_name;
	private String interviewie_exp;
	private String interviewie_skills;
	public Interview() {
	}
	public Interview(Integer id, String interviewer_name, String interviewie_exp, String interviewie_skills) {
		this.id = id;
		this.interviewer_name = interviewer_name;
		this.interviewie_exp = interviewie_exp;
		this.interviewie_skills = interviewie_skills;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getInterviewer_name() {
		return interviewer_name;
	}
	public void setInterviewer_name(String interviewer_name) {
		this.interviewer_name = interviewer_name;
	}
	public String getInterviewie_exp() {
		return interviewie_exp;
	}
	public void setInterviewie_exp(String interviewie_exp) {
		this.interviewie_exp = interviewie_exp;
	}
	public String getInterviewie_skills() {
		return interviewie_skills;
	}
	public void setInterviewie_skills(String interviewie_skills) {
		this.interviewie_skills = interviewie_skills;
	}
	
	

}
