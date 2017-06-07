package ua.sport.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;


@Entity
public class Category {
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String name;
	
	@OneToMany(mappedBy="category")
	private List<subCategory> subCategories;
	
	public Category() {
		// TODO Auto-generated constructor stub
	}

	public Category(int id, String name, List<subCategory> subCategories) {
		super();
		this.id = id;
		this.name = name;
		this.subCategories = subCategories;
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

	public List<subCategory> getSubCategories() {
		return subCategories;
	}

	public void setSubCategories(List<subCategory> subCategories) {
		this.subCategories = subCategories;
	}

	@Override
	public String toString() {
		return "Category [id=" + id + ", name=" + name + ", subCategories="
				+ subCategories + "]";
	}
	
	
	

}
