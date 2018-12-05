package com.lnt.hibernate.otm_annotation;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OrderColumn;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "QUESTION_OTM")
public class Question {

	@Id
	@GeneratedValue(strategy = GenerationType.TABLE)
	private int id;

	@Column(name = "qname")
	private String qname;

	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "qid")
	@OrderColumn(name = "type")
	private List<Answer> answers;

	/*
	 * @ManyToOne annotation defines a single-valued association to another entity
	 * class that has many-to-one multiplicity. It is not normally necessary to
	 * specify the target entity explicitly since it can usually be inferred from
	 * the type of the object being referenced.
	 * 
	 * @JoinColumn is used to specify a mapped column 
	 * for joining an entity association.
	 * 
	 * @OneToMany annotation defines a many-valued association with one-to-many
	 * multiplicity. If the collection is defined using generics to specify the
	 * element type, the associated target entity type need not be specified;
	 * otherwise the target entity class must be specified.
	 * 
	 * The association may be bidirectional. In a bidirectional relationship, one of
	 * the sides (and only one) has to be the owner: the owner is responsible for
	 * the association column(s) update. To declare a side as not responsible for
	 * the relationship, the attribute mappedBy is used. mappedBy refers to the
	 * property name of the association on the owner side. In our case, this is
	 * passport. As you can see, you don’t have to (must not) declare the join
	 * column since it has already been declared on the owners side.
	 */
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getQname() {
		return qname;
	}

	public void setQname(String qname) {
		this.qname = qname;
	}

	public List<Answer> getAnswers() {
		return answers;
	}

	public void setAnswers(List<Answer> answers) {
		this.answers = answers;
	}

	@Override
	public String toString() {
		return "Question [id=" + id + ", qname=" + qname + ", answers=" + answers + "]";
	}

}
