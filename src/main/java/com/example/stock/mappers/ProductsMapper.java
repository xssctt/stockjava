package com.example.stock.mappers;

import com.example.stock.mappers.BaseMapper;
import org.apache.ibatis.annotations.Param;
	/** 
	 *
	 * @Desoription 商品表mappers
	 * @Auther 摸鱼
	 * @Date 2024-06-07
	 */
public interface ProductsMapper<T, P> extends BaseMapper{
	/** 
	 *
	 *  根据ProductId查询
	 */

	T selectByProductId(@Param("productId") Integer productId);

	/** 
	 *
	 *  根据ProductId更新
	 */

	Integer updateByProductId(@Param("bean") T t, @Param("productId") Integer productId);

	/** 
	 *
	 *  根据ProductId删除
	 */

	Integer deleteByProductId(@Param("productId") Integer productId);

	/** 
	 *
	 *  根据ProductCode查询
	 */

	T selectByProductCode(@Param("productCode") String productCode);

	/** 
	 *
	 *  根据ProductCode更新
	 */

	Integer updateByProductCode(@Param("bean") T t, @Param("productCode") String productCode);

	/** 
	 *
	 *  根据ProductCode删除
	 */

	Integer deleteByProductCode(@Param("productCode") String productCode);

}