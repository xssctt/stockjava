package com.example.stock.service.impl;

import com.example.stock.entity.po.Type;
import com.example.stock.entity.query.TypeQuery;
import java.util.List;
import com.example.stock.entity.query.SimplePage;
import com.example.stock.entity.vo.PaginationResultVo;
import com.example.stock.enums.PageSize;
import com.example.stock.service.TypeService;

import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import com.example.stock.mappers.TypeMapper;


	/** 
	 *
	 * @Desoription 类型表service 逻辑层
	 * @Auther 摸鱼
	 * @Date 2024-06-07
	 */
@Service("typeService")
public class TypeServiceImpl implements TypeService{

	@Resource
	private TypeMapper<Type,TypeQuery> typeMapper;

	/** 
	 *
	 *  根据条件查询列表
	 */
	@Override
	public List<Type> findListByParam(TypeQuery query){
	return this.typeMapper.selectList(query);
	}
	/** 
	 *
	 *  根据条件查询多少数量
	 */
	@Override
	public Integer findCountByParam(TypeQuery query){
		return this.typeMapper.selectCount(query);
	}
	/** 
	 *
	 *  分页查询
	 */
	@Override
	public PaginationResultVo<Type> findListByPage(TypeQuery query){
		Integer count=this.findCountByParam(query);
		Integer pageSze= query.getPageSize() == null ? PageSize.SIZE15.getSize() : query.getPageSize();
		SimplePage page=new SimplePage(query.getPageNo(),count,pageSze);
		query.setSimplePage(page);
		List<Type> list=this.findListByParam(query);
		PaginationResultVo<Type> result=new PaginationResultVo<Type>(count,page.getPageSize(),page.getPageNo(),page.getPageTotal(),list);
		return result;
	}
	/** 
	 *
	 *  新增
	 */
	@Override
	public Integer add(Type bean){
		return this.typeMapper.insert(bean);
	}
	/** 
	 *
	 *  批量新增
	 */
	@Override
	public Integer addBatch(List<Type> listBean){
		if (listBean == null || listBean.isEmpty()){
			return 0;
		}
		return this.typeMapper.insertBatch(listBean);
	}
	/** 
	 *
	 *  批量新增/修改
	 */
	@Override
	public Integer addOrUpdateBatch(List<Type> listBean){
		if (listBean == null || listBean.isEmpty()){
			return 0;
		}
		return this.typeMapper.insertOrUpdateBatch(listBean);
	}
	/** 
	 *
	 *  根据Id查询
	 */

	@Override
	public Type getTypeById(Integer id){
		return this.typeMapper.selectById(id);
	}

	/** 
	 *
	 *  根据Id更新
	 */

	@Override
	public Integer updateTypeById(Type bean, Integer id){
		return this.typeMapper.updateById(bean,id);
	}

	/** 
	 *
	 *  根据Id删除
	 */

	@Override
	public Integer deleteTypeById(Integer id){
		return this.typeMapper.deleteById(id);
	}

}
