package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="shopper")
public class Shopper {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="SHOPPER_ID")
	private int id;
	@Column(name="SHOPPER_NAME")
	private String shopperName;

	public Shopper() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Shopper(String shopperName) {
		super();
		this.shopperName = shopperName;
	}

	public Shopper(int id, String shopperName) {
		super();
		this.id = id;
		this.shopperName = shopperName;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getShopperName() {
		return shopperName;
	}

	public void setShopperName(String shopperName) {
		this.shopperName = shopperName;
	}

	@Override
	public String toString() {
		return "Shopper [id=" + id + ", shopperName=" + shopperName + "]";
	}
}
