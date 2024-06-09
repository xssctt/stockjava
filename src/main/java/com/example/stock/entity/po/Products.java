package com.example.stock.entity.po;

import java.io.Serializable;


	/** 
	 *
	 * @Desoription 商品表
	 * @Auther 摸鱼
	 * @Date 2024-06-07
	 */
public class Products implements Serializable{
	/** 
	 *
	 *  商品ID
	 */
	private Integer productId;

	/** 
	 *
	 *  商品名称
	 */
	private String productName;

	/** 
	 *
	 *  商品编码，唯一
	 */
	private String productCode;

	/** 
	 *
	 *  商品类型id
	 */
	private Integer productType;

	public void setProductId(Integer productId) {
		this.productId=productId;
	}

	public Integer getProductId() {
		return this.productId;
	}

	public void setProductName(String productName) {
		this.productName=productName;
	}

	public String getProductName() {
		return this.productName;
	}

	public void setProductCode(String productCode) {
		this.productCode=productCode;
	}

	public String getProductCode() {
		return this.productCode;
	}

	public void setProductType(Integer productType) {
		this.productType=productType;
	}

	public Integer getProductType() {
		return this.productType;
	}

	@Override
	public String toString() {
	return " FieIdInfo{ " + 
	 " 商品ID : ProductId='" +(productId==null ? "空" : productId) + "' "+
	 " 商品名称 : ProductName='" +(productName==null ? "空" : productName) + "' "+
	 " 商品编码，唯一 : ProductCode='" +(productCode==null ? "空" : productCode) + "' "+
	 " 商品类型id : ProductType='" +(productType==null ? "空" : productType) + "' "+ '}'; 
	}
}