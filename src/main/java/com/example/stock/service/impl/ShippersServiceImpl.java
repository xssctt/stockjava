package com.example.stock.service.impl;

import com.example.stock.entity.po.Shippers;
import com.example.stock.entity.query.ShippersQuery;
import java.util.List;
import com.example.stock.entity.query.SimplePage;
import com.example.stock.entity.vo.PaginationResultVo;
import com.example.stock.enums.PageSize;
import com.example.stock.service.ShippersService;

import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import com.example.stock.mappers.ShippersMapper;


	/** 
	 *
	 * @Desoription 出货人员表service 逻辑层
	 * @Auther 摸鱼
	 * @Date 2024-06-07
	 */
@Service("shippersService")
public class ShippersServiceImpl implements ShippersService{

	@Resource
	private ShippersMapper<Shippers,ShippersQuery> shippersMapper;

	/** 
	 *
	 *  根据条件查询列表
	 */
	@Override
	public List<Shippers> findListByParam(ShippersQuery query){
	return this.shippersMapper.selectList(query);
	}
	/** 
	 *
	 *  根据条件查询多少数量
	 */
	@Override
	public Integer findCountByParam(ShippersQuery query){
		return this.shippersMapper.selectCount(query);
	}
	/** 
	 *
	 *  分页查询
	 */
	@Override
	public PaginationResultVo<Shippers> findListByPage(ShippersQuery query){
		Integer count=this.findCountByParam(query);
		Integer pageSze= query.getPageSize() == null ? PageSize.SIZE15.getSize() : query.getPageSize();
		SimplePage page=new SimplePage(query.getPageNo(),count,pageSze);
		query.setSimplePage(page);
		List<Shippers> list=this.findListByParam(query);
		PaginationResultVo<Shippers> result=new PaginationResultVo<Shippers>(count,page.getPageSize(),page.getPageNo(),page.getPageTotal(),list);
		return result;
	}
	/** 
	 *
	 *  新增
	 */
	@Override
	public Integer add(Shippers bean){
		return this.shippersMapper.insert(bean);
	}
	/** 
	 *
	 *  批量新增
	 */
	@Override
	public Integer addBatch(List<Shippers> listBean){
		if (listBean == null || listBean.isEmpty()){
			return 0;
		}
		return this.shippersMapper.insertBatch(listBean);
	}
	/** 
	 *
	 *  批量新增/修改
	 */
	@Override
	public Integer addOrUpdateBatch(List<Shippers> listBean){
		if (listBean == null || listBean.isEmpty()){
			return 0;
		}
		return this.shippersMapper.insertOrUpdateBatch(listBean);
	}
	/** 
	 *
	 *  根据ShipperId查询
	 */

	@Override
	public Shippers getShippersByShipperId(Integer shipperId){
		return this.shippersMapper.selectByShipperId(shipperId);
	}

	/** 
	 *
	 *  根据ShipperId更新
	 */

	@Override
	public Integer updateShippersByShipperId(Shippers bean, Integer shipperId){
		return this.shippersMapper.updateByShipperId(bean,shipperId);
	}

	/** 
	 *
	 *  根据ShipperId删除
	 */

	@Override
	public Integer deleteShippersByShipperId(Integer shipperId){
		return this.shippersMapper.deleteByShipperId(shipperId);
	}

}
