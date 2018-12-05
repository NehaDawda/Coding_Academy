package com.lnt.hibernate.otm_annotation;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ANSWER_OTM")
public class Answer {
	
	@Id  
	@GeneratedValue(strategy=GenerationType.TABLE)       
	@Column(name = "ans_id")
	private int id;
	     
	@Column(name = "answername")
	private String answername;
	    
	@Column(name = "postedBy")
	private String postedBy;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAnswername() {
		return answername;
	}
	public void setAnswername(String answername) {
		this.answername = answername;
	}
	public String getPostedBy() {
		return postedBy;
	}
	public void setPostedBy(String postedBy) {
		this.postedBy = postedBy;
	}
	
	public String toString(){
		return answername+" by: "+postedBy;
	}
}
