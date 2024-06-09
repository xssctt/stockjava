package com.example.stock.service.impl;

import java.util.Date;
import java.math.BigDecimal;
import com.example.stock.entity.po.Shipments;
import com.example.stock.entity.query.ShipmentsQuery;
import java.util.List;
import com.example.stock.entity.query.SimplePage;
import com.example.stock.entity.vo.PaginationResultVo;
import com.example.stock.enums.PageSize;
import com.example.stock.service.ShipmentsService;

import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import com.example.stock.mappers.ShipmentsMapper;


	/** 
	 *
	 * @Desoription 出货记录表service 逻辑层
	 * @Auther 摸鱼
	 * @Date 2024-06-07
	 */
@Service("shipmentsService")
public class ShipmentsServiceImpl implements ShipmentsService{

	@Resource
	private ShipmentsMapper<Shipments,ShipmentsQuery> shipmentsMapper;

	/** 
	 *
	 *  根据条件查询列表
	 */
	@Override
	public List<Shipments> findListByParam(ShipmentsQuery query){
	return this.shipmentsMapper.selectList(query);
	}
	/** 
	 *
	 *  根据条件查询多少数量
	 */
	@Override
	public Integer findCountByParam(ShipmentsQuery query){
		return this.shipmentsMapper.selectCount(query);
	}
	/** 
	 *
	 *  分页查询
	 */
	@Override
	public PaginationResultVo<Shipments> findListByPage(ShipmentsQuery query){
		Integer count=this.findCountByParam(query);
		Integer pageSze= query.getPageSize() == null ? PageSize.SIZE15.getSize() : query.getPageSize();
		SimplePage page=new SimplePage(query.getPageNo(),count,pageSze);
		query.setSimplePage(page);
		List<Shipments> list=this.findListByParam(query);
		PaginationResultVo<Shipments> result=new PaginationResultVo<Shipments>(count,page.getPageSize(),page.getPageNo(),page.getPageTotal(),list);
		return result;
	}
	/** 
	 *
	 *  新增
	 */
	@Override
	public Integer add(Shipments bean){
		return this.shipmentsMapper.insert(bean);
	}
	/** 
	 *
	 *  批量新增
	 */
	@Override
	public Integer addBatch(List<Shipments> listBean){
		if (listBean == null || listBean.isEmpty()){
			return 0;
		}
		return this.shipmentsMapper.insertBatch(listBean);
	}
	/** 
	 *
	 *  批量新增/修改
	 */
	@Override
	public Integer addOrUpdateBatch(List<Shipments> listBean){
		if (listBean == null || listBean.isEmpty()){
			return 0;
		}
		return this.shipmentsMapper.insertOrUpdateBatch(listBean);
	}
	/** 
	 *
	 *  根据ShipmentId查询
	 */

	@Override
	public Shipments getShipmentsByShipmentId(Integer shipmentId){
		return this.shipmentsMapper.selectByShipmentId(shipmentId);
	}

	/** 
	 *
	 *  根据ShipmentId更新
	 */

	@Override
	public Integer updateShipmentsByShipmentId(Shipments bean, Integer shipmentId){
		return this.shipmentsMapper.updateByShipmentId(bean,shipmentId);
	}

	/** 
	 *
	 *  根据ShipmentId删除
	 */

	@Override
	public Integer deleteShipmentsByShipmentId(Integer shipmentId){
		return this.shipmentsMapper.deleteByShipmentId(shipmentId);
	}

}
