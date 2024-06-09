package com.example.stock.entity.po;

import java.io.Serializable;


	/** 
	 *
	 * @Desoription 出货人员表
	 * @Auther 摸鱼
	 * @Date 2024-06-07
	 */
public class Shippers implements Serializable{
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

	/** 
	 *
	 *  出货人手机号
	 */
	private String shipperPhone;

	/** 
	 *
	 *  出货人邮箱
	 */
	private String shipperEmail;

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

	@Override
	public String toString() {
	return " FieIdInfo{ " + 
	 " 出货人ID，自动递增 : ShipperId='" +(shipperId==null ? "空" : shipperId) + "' "+
	 " 出货人姓名 : ShipperName='" +(shipperName==null ? "空" : shipperName) + "' "+
	 " 出货人手机号 : ShipperPhone='" +(shipperPhone==null ? "空" : shipperPhone) + "' "+
	 " 出货人邮箱 : ShipperEmail='" +(shipperEmail==null ? "空" : shipperEmail) + "' "+ '}'; 
	}
}