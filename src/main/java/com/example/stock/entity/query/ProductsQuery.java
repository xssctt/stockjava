package com.example.stock.entity.query;

import com.example.stock.entity.query.BaseQuery;


	/** 
	 *
	 * @Desoription 商品表查询对象
	 * @Auther 摸鱼
	 * @Date 2024-06-07
	 */
public class ProductsQuery extends BaseQuery{
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

	private String productNameFuzzy;

	/** 
	 *
	 *  商品编码，唯一
	 */
	private String productCode;

	private String productCodeFuzzy;

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

	public void setProductNameFuzzy(String productNameFuzzy) {
		this.productNameFuzzy=productNameFuzzy;
	}

	public String getProductNameFuzzy() {
		return this.productNameFuzzy;
	}

	public void setProductCodeFuzzy(String productCodeFuzzy) {
		this.productCodeFuzzy=productCodeFuzzy;
	}

	public String getProductCodeFuzzy() {
		return this.productCodeFuzzy;
	}

}