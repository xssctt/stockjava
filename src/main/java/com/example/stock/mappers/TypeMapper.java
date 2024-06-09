package com.example.stock.mappers;

import com.example.stock.mappers.BaseMapper;
import org.apache.ibatis.annotations.Param;
	/** 
	 *
	 * @Desoription 类型表mappers
	 * @Auther 摸鱼
	 * @Date 2024-06-07
	 */
public interface TypeMapper<T, P> extends BaseMapper{
	/** 
	 *
	 *  根据Id查询
	 */

	T selectById(@Param("id") Integer id);

	/** 
	 *
	 *  根据Id更新
	 */

	Integer updateById(@Param("bean") T t, @Param("id") Integer id);

	/** 
	 *
	 *  根据Id删除
	 */

	Integer deleteById(@Param("id") Integer id);

}