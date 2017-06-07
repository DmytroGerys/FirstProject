package ua.sport.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
public class subCategory {
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String name;
	
	
	@ManyToOne
	private Category category;
	
	@ManyToMany
	@JoinTable(name="subCategory_commodity",
	joinColumns=@JoinColumn(name="id_subCategory"),
	inverseJoinColumns=@JoinColumn(name="id_commodity"))
	private List<Commodity>commodities;
	
	
	public subCategory() {
		// TODO Auto-generated constructor stub
	}


	public subCategory(int id, String name, Category category,
			List<Commodity> commodities) {
		super();
		this.id = id;
		this.name = name;
		this.category = category;
		this.commodities = commodities;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public Category getCategory() {
		return category;
	}


	public void setCategory(Category category) {
		this.category = category;
	}


	public List<Commodity> getCommodities() {
		return commodities;
	}


	public void setCommodities(List<Commodity> commodities) {
		this.commodities = commodities;
	}


	@Override
	public String toString() {
		return "subCategory [id=" + id + ", name=" + name + ", category="
				+ category + ", commodities=" + commodities + "]";
	}
	
	

}
