package com.vrs.binding;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public class product {
    
	@NotNull(message = "Id is mandatory")
	private Integer pid;
	@NotNull(message = "Product name is mandatory")
	@Size(min = 3,max = 10)
	private String pname;
	@NotNull(message = "Product price is Mandatory")
	private Double price;
	
	public Integer getPid() {
		return pid;
	}
	public void setPid(Integer pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public  Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "product [pid=" + pid + ", pname=" + pname + ", price=" + price + "]";
	}
	
}
