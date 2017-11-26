package com.gc.dto;

import java.io.Serializable;

public class ProductDto implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int productID;
	private String code;
	private String description;
	private double listPrice;

	public ProductDto() {

//		productID = 0;
//		code = "";
//		description = "";
//		listPrice = 0;
	}

	public ProductDto(int productID, String code, String description, double listPrice) {
		super();
		this.productID = productID;
		this.code = code;
		this.description = description;
		this.listPrice = listPrice;
	}

	public int getProductID() {
		return productID;
	}

	public void setProductID(int productID) {
		this.productID = productID;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getListPrice() {
		return listPrice;
	}

	public void setListPrice(double listPrice) {
		this.listPrice = listPrice;
	}

	@Override
	public String toString() {
		return "ProductDto [productID=" + productID + ", code=" + code + ", description=" + description + ", listPrice="
				+ listPrice + "]";
	}
	

}
