package com.example.stock.entity.query;

import com.example.stock.entity.query.BaseQuery;


	/** 
	 *
	 * @Desoription 出货人员表查询对象
	 * @Auther 摸鱼
	 * @Date 2024-06-07
	 */
public class ShippersQuery extends BaseQuery{
	/** 
	 *
	 *  出货人ID，自动递增
	 */
	private Integer shipperId;

	/** 
	 *
	 *  出货人姓名
	 */
	private String shipperName;

	private String shipperNameFuzzy;

	/** 
	 *
	 *  出货人手机号
	 */
	private String shipperPhone;

	private String shipperPhoneFuzzy;

	/** 
	 *
	 *  出货人邮箱
	 */
	private String shipperEmail;

	private String shipperEmailFuzzy;

	public void setShipperId(Integer shipperId) {
		this.shipperId=shipperId;
	}

	public Integer getShipperId() {
		return this.shipperId;
	}

	public void setShipperName(String shipperName) {
		this.shipperName=shipperName;
	}

	public String getShipperName() {
		return this.shipperName;
	}

	public void setShipperPhone(String shipperPhone) {
		this.shipperPhone=shipperPhone;
	}

	public String getShipperPhone() {
		return this.shipperPhone;
	}

	public void setShipperEmail(String shipperEmail) {
		this.shipperEmail=shipperEmail;
	}

	public String getShipperEmail() {
		return this.shipperEmail;
	}

	public void setShipperNameFuzzy(String shipperNameFuzzy) {
		this.shipperNameFuzzy=shipperNameFuzzy;
	}

	public String getShipperNameFuzzy() {
		return this.shipperNameFuzzy;
	}

	public void setShipperPhoneFuzzy(String shipperPhoneFuzzy) {
		this.shipperPhoneFuzzy=shipperPhoneFuzzy;
	}

	public String getShipperPhoneFuzzy() {
		return this.shipperPhoneFuzzy;
	}

	public void setShipperEmailFuzzy(String shipperEmailFuzzy) {
		this.shipperEmailFuzzy=shipperEmailFuzzy;
	}

	public String getShipperEmailFuzzy() {
		return this.shipperEmailFuzzy;
	}

}