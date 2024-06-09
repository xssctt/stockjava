package com.example.stock.service;

import java.util.Date;
import java.math.BigDecimal;
import com.example.stock.entity.po.Shipments;
import com.example.stock.entity.query.ShipmentsQuery;
import java.util.List;
import com.example.stock.entity.vo.PaginationResultVo;


	/** 
	 *
	 * @Desoription 出货记录表service 逻辑层
	 * @Auther 摸鱼
	 * @Date 2024-06-07
	 */
public interface ShipmentsService {

	/** 
	 *
	 *  根据条件查询列表
	 */
	List<Shipments> findListByParam(ShipmentsQuery query);
	/** 
	 *
	 *  根据条件查询多少数量
	 */
	Integer findCountByParam(ShipmentsQuery query);
	/** 
	 *
	 *  分页查询
	 */
	PaginationResultVo<Shipments> findListByPage(ShipmentsQuery query);
	/** 
	 *
	 *  新增
	 */
	Integer add(Shipments bean);
	/** 
	 *
	 *  批量新增
	 */
	Integer addBatch(List<Shipments> listBean);
	/** 
	 *
	 *  批量新增/修改
	 */
	Integer addOrUpdateBatch(List<Shipments> listBean);
	/** 
	 *
	 *  根据ShipmentId查询
	 */

	Shipments getShipmentsByShipmentId(Integer shipmentId);

	/** 
	 *
	 *  根据ShipmentId更新
	 */

	Integer updateShipmentsByShipmentId(Shipments bean, Integer shipmentId);

	/** 
	 *
	 *  根据ShipmentId删除
	 */

	Integer deleteShipmentsByShipmentId(Integer shipmentId);

}
