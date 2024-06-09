package com.example.stock.service.impl;

import com.example.stock.entity.po.Products;
import com.example.stock.entity.query.ProductsQuery;
import java.util.List;
import com.example.stock.entity.query.SimplePage;
import com.example.stock.entity.vo.PaginationResultVo;
import com.example.stock.enums.PageSize;
import com.example.stock.service.ProductsService;

import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import com.example.stock.mappers.ProductsMapper;


	/** 
	 *
	 * @Desoription 商品表service 逻辑层
	 * @Auther 摸鱼
	 * @Date 2024-06-07
	 */
@Service("productsService")
public class ProductsServiceImpl implements ProductsService{

	@Resource
	private ProductsMapper<Products,ProductsQuery> productsMapper;

	/** 
	 *
	 *  根据条件查询列表
	 */
	@Override
	public List<Products> findListByParam(ProductsQuery query){
	return this.productsMapper.selectList(query);
	}
	/** 
	 *
	 *  根据条件查询多少数量
	 */
	@Override
	public Integer findCountByParam(ProductsQuery query){
		return this.productsMapper.selectCount(query);
	}
	/** 
	 *
	 *  分页查询
	 */
	@Override
	public PaginationResultVo<Products> findListByPage(ProductsQuery query){
		Integer count=this.findCountByParam(query);
		Integer pageSze= query.getPageSize() == null ? PageSize.SIZE15.getSize() : query.getPageSize();
		SimplePage page=new SimplePage(query.getPageNo(),count,pageSze);
		query.setSimplePage(page);
		List<Products> list=this.findListByParam(query);
		PaginationResultVo<Products> result=new PaginationResultVo<Products>(count,page.getPageSize(),page.getPageNo(),page.getPageTotal(),list);
		return result;
	}
	/** 
	 *
	 *  新增
	 */
	@Override
	public Integer add(Products bean){
		return this.productsMapper.insert(bean);
	}
	/** 
	 *
	 *  批量新增
	 */
	@Override
	public Integer addBatch(List<Products> listBean){
		if (listBean == null || listBean.isEmpty()){
			return 0;
		}
		return this.productsMapper.insertBatch(listBean);
	}
	/** 
	 *
	 *  批量新增/修改
	 */
	@Override
	public Integer addOrUpdateBatch(List<Products> listBean){
		if (listBean == null || listBean.isEmpty()){
			return 0;
		}
		return this.productsMapper.insertOrUpdateBatch(listBean);
	}
	/** 
	 *
	 *  根据ProductId查询
	 */

	@Override
	public Products getProductsByProductId(Integer productId){
		return this.productsMapper.selectByProductId(productId);
	}

	/** 
	 *
	 *  根据ProductId更新
	 */

	@Override
	public Integer updateProductsByProductId(Products bean, Integer productId){
		return this.productsMapper.updateByProductId(bean,productId);
	}

	/** 
	 *
	 *  根据ProductId删除
	 */

	@Override
	public Integer deleteProductsByProductId(Integer productId){
		return this.productsMapper.deleteByProductId(productId);
	}

	/** 
	 *
	 *  根据ProductCode查询
	 */

	@Override
	public Products getProductsByProductCode(String productCode){
		return this.productsMapper.selectByProductCode(productCode);
	}

	/** 
	 *
	 *  根据ProductCode更新
	 */

	@Override
	public Integer updateProductsByProductCode(Products bean, String productCode){
		return this.productsMapper.updateByProductCode(bean,productCode);
	}

	/** 
	 *
	 *  根据ProductCode删除
	 */

	@Override
	public Integer deleteProductsByProductCode(String productCode){
		return this.productsMapper.deleteByProductCode(productCode);
	}

}
