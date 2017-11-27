package com.gc.dto;

import java.io.Serializable;

public class ProductDto implements Serializable {
	/**
	 * The serialization runtime associates with each serializable class a version
	 * number, called a serialVersionUID, which is used during deserialization to
	 * verify that the sender and receiver of a serialized object have loaded
	 * classes for that object that are compatible with respect to serialization.
	 */
	private static final long serialVersionUID = 1L;
	private int productID;
	private String code;
	private String description;
	private double listPrice;

	public ProductDto() {

		// productID = 0;
		// code = "";
		// description = "";
		// listPrice = 0;
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
		return "Primary key assigned as 0, represents us assigning null to the query: " + productID + ", code=" + code
				+ ", description=" + description + ", listPrice=" + listPrice;
	}

}
