package com.example.stock.service;

import com.example.stock.entity.po.Type;
import com.example.stock.entity.query.TypeQuery;
import java.util.List;
import com.example.stock.entity.vo.PaginationResultVo;


	/** 
	 *
	 * @Desoription 类型表service 逻辑层
	 * @Auther 摸鱼
	 * @Date 2024-06-07
	 */
public interface TypeService {

	/** 
	 *
	 *  根据条件查询列表
	 */
	List<Type> findListByParam(TypeQuery query);
	/** 
	 *
	 *  根据条件查询多少数量
	 */
	Integer findCountByParam(TypeQuery query);
	/** 
	 *
	 *  分页查询
	 */
	PaginationResultVo<Type> findListByPage(TypeQuery query);
	/** 
	 *
	 *  新增
	 */
	Integer add(Type bean);
	/** 
	 *
	 *  批量新增
	 */
	Integer addBatch(List<Type> listBean);
	/** 
	 *
	 *  批量新增/修改
	 */
	Integer addOrUpdateBatch(List<Type> listBean);
	/** 
	 *
	 *  根据Id查询
	 */

	Type getTypeById(Integer id);

	/** 
	 *
	 *  根据Id更新
	 */

	Integer updateTypeById(Type bean, Integer id);

	/** 
	 *
	 *  根据Id删除
	 */

	Integer deleteTypeById(Integer id);

}
