package com.example.stock.mappers;

import com.example.stock.mappers.BaseMapper;
import org.apache.ibatis.annotations.Param;
import java.util.Date;
import java.math.BigDecimal;
	/** 
	 *
	 * @Desoription 出货记录表mappers
	 * @Auther 摸鱼
	 * @Date 2024-06-07
	 */
public interface ShipmentsMapper<T, P> extends BaseMapper{
	/** 
	 *
	 *  根据ShipmentId查询
	 */

	T selectByShipmentId(@Param("shipmentId") Integer shipmentId);

	/** 
	 *
	 *  根据ShipmentId更新
	 */

	Integer updateByShipmentId(@Param("bean") T t, @Param("shipmentId") Integer shipmentId);

	/** 
	 *
	 *  根据ShipmentId删除
	 */

	Integer deleteByShipmentId(@Param("shipmentId") Integer shipmentId);

}