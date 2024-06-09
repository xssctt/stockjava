package com.example.stock.entity.po;

import java.io.Serializable;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;
import com.example.stock.enums.DateTimePatternEnum;
import com.example.stock.Util.DateUtils;
import java.math.BigDecimal;


	/** 
	 *
	 * @Desoription 出货记录表
	 * @Auther 摸鱼
	 * @Date 2024-06-07
	 */
public class Shipments implements Serializable{
	/** 
	 *
	 *  出货ID，自动递增
	 */
	private Integer shipmentId;

	/** 
	 *
	 *  商品ID，外键
	 */
	private Integer productId;

	/** 
	 *
	 *  出货人ID，外键
	 */
	private Integer shipperId;

	/** 
	 *
	 *  出货日期
	 */
	@JsonFormat(pattern = "yyyy-MM-dd",timezone = "GMT+8")
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date shipmentDate;

	/** 
	 *
	 *  出货数量
	 */
	private Integer quantity;

	/** 
	 *
	 *  出货价格
	 */
	private BigDecimal price;

	/** 
	 *
	 *  金额合计
	 */
	private BigDecimal totalAmount;

	/** 
	 *
	 *  已付金额
	 */
	private BigDecimal amountPaid;

	/** 
	 *
	 *  待付金额
	 */
	private BigDecimal amountDue;

	/** 
	 *
	 *  出货备注
	 */
	private String remarks;

	public void setShipmentId(Integer shipmentId) {
		this.shipmentId=shipmentId;
	}

	public Integer getShipmentId() {
		return this.shipmentId;
	}

	public void setProductId(Integer productId) {
		this.productId=productId;
	}

	public Integer getProductId() {
		return this.productId;
	}

	public void setShipperId(Integer shipperId) {
		this.shipperId=shipperId;
	}

	public Integer getShipperId() {
		return this.shipperId;
	}

	public void setShipmentDate(Date shipmentDate) {
		this.shipmentDate=shipmentDate;
	}

	public Date getShipmentDate() {
		return this.shipmentDate;
	}

	public void setQuantity(Integer quantity) {
		this.quantity=quantity;
	}

	public Integer getQuantity() {
		return this.quantity;
	}

	public void setPrice(BigDecimal price) {
		this.price=price;
	}

	public BigDecimal getPrice() {
		return this.price;
	}

	public void setTotalAmount(BigDecimal totalAmount) {
		this.totalAmount=totalAmount;
	}

	public BigDecimal getTotalAmount() {
		return this.totalAmount;
	}

	public void setAmountPaid(BigDecimal amountPaid) {
		this.amountPaid=amountPaid;
	}

	public BigDecimal getAmountPaid() {
		return this.amountPaid;
	}

	public void setAmountDue(BigDecimal amountDue) {
		this.amountDue=amountDue;
	}

	public BigDecimal getAmountDue() {
		return this.amountDue;
	}

	public void setRemarks(String remarks) {
		this.remarks=remarks;
	}

	public String getRemarks() {
		return this.remarks;
	}

	@Override
	public String toString() {
	return " FieIdInfo{ " + 
	 " 出货ID，自动递增 : ShipmentId='" +(shipmentId==null ? "空" : shipmentId) + "' "+
	 " 商品ID，外键 : ProductId='" +(productId==null ? "空" : productId) + "' "+
	 " 出货人ID，外键 : ShipperId='" +(shipperId==null ? "空" : shipperId) + "' "+
	 " 出货日期 : ShipmentDate='" +(shipmentDate==null ? "空" : DateUtils.format(shipmentDate,DateTimePatternEnum.YYYY_MM_DD.getPattern())) + "' "+
	 " 出货数量 : Quantity='" +(quantity==null ? "空" : quantity) + "' "+
	 " 出货价格 : Price='" +(price==null ? "空" : price) + "' "+
	 " 金额合计 : TotalAmount='" +(totalAmount==null ? "空" : totalAmount) + "' "+
	 " 已付金额 : AmountPaid='" +(amountPaid==null ? "空" : amountPaid) + "' "+
	 " 待付金额 : AmountDue='" +(amountDue==null ? "空" : amountDue) + "' "+
	 " 出货备注 : Remarks='" +(remarks==null ? "空" : remarks) + "' "+ '}'; 
	}
}