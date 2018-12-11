package com.pundraherbs.model;

import java.util.List;

public class Product {
	public String productId;
	public String productName;
	public String productSummary;
	public String productPrice;
	public String productDiscount;
	public String productImg;
	private int unitInStock;
	public List<String> productIngredients;
	public List<Dosage> dosage;
	public List<String> packings;
	public List<String> indications;

	public Product() {
	}

	public Product(String productId) {
		this.productId = productId;
	}

	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getProductSummary() {
		return productSummary;
	}

	public void setProductSummary(String productSummary) {
		this.productSummary = productSummary;
	}

	public String getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(String productPrice) {
		this.productPrice = productPrice;
	}

	public String getProductDiscount() {
		return productDiscount;
	}

	public void setProductDiscount(String productDiscount) {
		this.productDiscount = productDiscount;
	}

	public String getProductImg() {
		return productImg;
	}

	public void setProductImg(String productImg) {
		this.productImg = productImg;
	}

	public List<String> getProductIngredients() {
		return productIngredients;
	}

	public void setProductIngredients(List<String> productIngredients) {
		this.productIngredients = productIngredients;
	}

	public List<Dosage> getDosage() {
		return dosage;
	}

	public void setDosage(List<Dosage> dosage) {
		this.dosage = dosage;
	}

	public List<String> getPackings() {
		return packings;
	}

	public void setPackings(List<String> packings) {
		this.packings = packings;
	}

	public List<String> getIndications() {
		return indications;
	}

	public void setIndications(List<String> indications) {
		this.indications = indications;
	}

	public int getUnitInStock() {
		return unitInStock;
	}

	public void setUnitInStock(int unitInStock) {
		this.unitInStock = unitInStock;
	}

	private class Dosage {
		private String person;
		private String dosageAdvice;

		public String getPerson() {
			return person;
		}

		public void setPerson(String person) {
			this.person = person;
		}

		public String getDosageAdvice() {
			return dosageAdvice;
		}

		public void setDosageAdvice(String dosageAdvice) {
			this.dosageAdvice = dosageAdvice;
		}

	}

}
