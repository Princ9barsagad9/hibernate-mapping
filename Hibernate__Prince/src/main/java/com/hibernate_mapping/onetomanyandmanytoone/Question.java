package com.hibernate_mapping.onetomanyandmanytoone;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;


@Entity
@Table(name="QUESTION")
public class Question {
@Id
@Column(name="Question_Id")
 private int questionId;
@Column(name="Question")
 private String question;
@OneToMany(mappedBy="question")
private List<Answer> answer;
public int getQuestionId() {
	return questionId;
}
public void setQuestionId(int questionId) {
	this.questionId = questionId;
}
public String getQuestion() {
	return question;
}
public void setQuestion(String question) {
	this.question = question;
}

public Question(int questionId, String question, List<Answer> answer) {
	super();
	this.questionId = questionId;
	this.question = question;
	this.answer = answer;
}
public List<Answer> getAnswer() {
	return answer;
}
public void setAnswer(List<Answer> answer) {
	this.answer = answer;
}
public Question() {
	super();
	// TODO Auto-generated constructor stub
}



}
