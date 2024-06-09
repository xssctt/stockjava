package com.example.stock.entity.query;

import java.util.Date;
import java.math.BigDecimal;
import com.example.stock.entity.query.BaseQuery;


	/** 
	 *
	 * @Desoription 出货记录表查询对象
	 * @Auther 摸鱼
	 * @Date 2024-06-07
	 */
public class ShipmentsQuery extends BaseQuery{
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
	private Date shipmentDate;

	private String shipmentDateStart;

	private String shipmentDateEnd;

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

	private String remarksFuzzy;

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

	public void setShipmentDateStart(String shipmentDateStart) {
		this.shipmentDateStart=shipmentDateStart;
	}

	public String getShipmentDateStart() {
		return this.shipmentDateStart;
	}

	public void setShipmentDateEnd(String shipmentDateEnd) {
		this.shipmentDateEnd=shipmentDateEnd;
	}

	public String getShipmentDateEnd() {
		return this.shipmentDateEnd;
	}

	public void setRemarksFuzzy(String remarksFuzzy) {
		this.remarksFuzzy=remarksFuzzy;
	}

	public String getRemarksFuzzy() {
		return this.remarksFuzzy;
	}

}