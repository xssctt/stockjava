package com.example.stock.mappers;

import com.example.stock.mappers.BaseMapper;
import org.apache.ibatis.annotations.Param;
	/** 
	 *
	 * @Desoription 出货人员表mappers
	 * @Auther 摸鱼
	 * @Date 2024-06-07
	 */
public interface ShippersMapper<T, P> extends BaseMapper{
	/** 
	 *
	 *  根据ShipperId查询
	 */

	T selectByShipperId(@Param("shipperId") Integer shipperId);

	/** 
	 *
	 *  根据ShipperId更新
	 */

	Integer updateByShipperId(@Param("bean") T t, @Param("shipperId") Integer shipperId);

	/** 
	 *
	 *  根据ShipperId删除
	 */

	Integer deleteByShipperId(@Param("shipperId") Integer shipperId);

}