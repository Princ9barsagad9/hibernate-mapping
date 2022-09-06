package com.hibernate_mapping.onetomanyandmanytoone;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="ANSWER")
public class Answer {
@Id		
@Column(name="Answer_Id")
private int answerId;
@Column(name="Answer")
private String answer;
@ManyToOne
private Question question;
public int getAnswerId() {
	return answerId;
}
public void setAnswerId(int answerId) {
	this.answerId = answerId;
}
public String getAnswer() {
	return answer;
}
public void setAnswer(String answer) {
	this.answer = answer;
}

public Question getQuestion() {
	return question;
}
public void setQuestion(Question question) {
	this.question = question;
}
public Answer(int answerId, String answer, Question question) {
	super();
	this.answerId = answerId;
	this.answer = answer;
	this.question = question;
}
public Answer() {
	super();
	// TODO Auto-generated constructor stub
}
}
