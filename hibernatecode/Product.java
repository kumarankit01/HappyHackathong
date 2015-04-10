// default package
// Generated 28 Dec, 2014 2:51:29 PM by Hibernate Tools 4.0.0

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

/**
 * Product generated by hbm2java
 */
@Entity
@Table(name = "Product", catalog = "salesorderapp")
public class Product implements java.io.Serializable {

	private String productCode;
	private String description;
	private BigDecimal price;
	private int prodQuantity;
	private Set<OrderLines> orderLineses = new HashSet<OrderLines>(0);

	public Product() {
	}

	public Product(String productCode, BigDecimal price, int prodQuantity) {
		this.productCode = productCode;
		this.price = price;
		this.prodQuantity = prodQuantity;
	}

	public Product(String productCode, String description, BigDecimal price,
			int prodQuantity, Set<OrderLines> orderLineses) {
		this.productCode = productCode;
		this.description = description;
		this.price = price;
		this.prodQuantity = prodQuantity;
		this.orderLineses = orderLineses;
	}

	@Id
	@Column(name = "Product_Code", unique = true, nullable = false, length = 30)
	public String getProductCode() {
		return this.productCode;
	}

	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	@Column(name = "Description", length = 150)
	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Column(name = "Price", nullable = false, precision = 10)
	public BigDecimal getPrice() {
		return this.price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	@Column(name = "Prod_Quantity", nullable = false)
	public int getProdQuantity() {
		return this.prodQuantity;
	}

	public void setProdQuantity(int prodQuantity) {
		this.prodQuantity = prodQuantity;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "product")
	public Set<OrderLines> getOrderLineses() {
		return this.orderLineses;
	}

	public void setOrderLineses(Set<OrderLines> orderLineses) {
		this.orderLineses = orderLineses;
	}

}
