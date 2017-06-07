package ua.sport.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
 public class Commodity{
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String name;
	private double price;
	private double capacity;
	
	@ManyToOne(fetch=FetchType.LAZY)
	private MeasuringSystem system;
	
	@ManyToMany
	@JoinTable(name="user_commodity",
	joinColumns=@JoinColumn(name="id_commodity"),
	inverseJoinColumns=@JoinColumn(name="id_user "))
	private List<User> users;
	
	@ManyToMany
	@JoinTable(name="subcategory_commodity",
	joinColumns=@JoinColumn(name="id_commodity"),
	inverseJoinColumns=@JoinColumn(name="id_subcategory"))
	private List<subCategory> subCategories;
	
	public Commodity() {
		// TODO Auto-generated constructor stub
	}

	public Commodity(String name, double price,
			double capacity) {
		super();
		this.name = name;
		this.price = price;
		this.capacity = capacity;
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


	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getCapacity() {
		return capacity;
	}

	public void setCapacity(double capacity) {
		this.capacity = capacity;
	}

	public List<User> getUsers() {
		return users;
	}

	public void setUsers(List<User> users) {
		this.users = users;
	}

	public List<subCategory> getSubCategories() {
		return subCategories;
	}

	public void setSubCategories(List<subCategory> subCategories) {
		this.subCategories = subCategories;
	}

	@Override
	public String toString() {
		return "Commodity [id=" + id + ", name=" + name + ", "
				+ "price=" + price + ", capacity=" + capacity +"]";
	}
	
	

}
