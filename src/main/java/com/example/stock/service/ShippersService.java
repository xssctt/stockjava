package com.example.stock.service;

import com.example.stock.entity.po.Shippers;
import com.example.stock.entity.query.ShippersQuery;
import java.util.List;
import com.example.stock.entity.vo.PaginationResultVo;


	/** 
	 *
	 * @Desoription 出货人员表service 逻辑层
	 * @Auther 摸鱼
	 * @Date 2024-06-07
	 */
public interface ShippersService {

	/** 
	 *
	 *  根据条件查询列表
	 */
	List<Shippers> findListByParam(ShippersQuery query);
	/** 
	 *
	 *  根据条件查询多少数量
	 */
	Integer findCountByParam(ShippersQuery query);
	/** 
	 *
	 *  分页查询
	 */
	PaginationResultVo<Shippers> findListByPage(ShippersQuery query);
	/** 
	 *
	 *  新增
	 */
	Integer add(Shippers bean);
	/** 
	 *
	 *  批量新增
	 */
	Integer addBatch(List<Shippers> listBean);
	/** 
	 *
	 *  批量新增/修改
	 */
	Integer addOrUpdateBatch(List<Shippers> listBean);
	/** 
	 *
	 *  根据ShipperId查询
	 */

	Shippers getShippersByShipperId(Integer shipperId);

	/** 
	 *
	 *  根据ShipperId更新
	 */

	Integer updateShippersByShipperId(Shippers bean, Integer shipperId);

	/** 
	 *
	 *  根据ShipperId删除
	 */

	Integer deleteShippersByShipperId(Integer shipperId);

}
