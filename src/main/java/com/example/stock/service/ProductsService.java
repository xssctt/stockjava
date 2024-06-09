package com.example.stock.service;

import com.example.stock.entity.po.Products;
import com.example.stock.entity.query.ProductsQuery;
import java.util.List;
import com.example.stock.entity.vo.PaginationResultVo;


	/** 
	 *
	 * @Desoription 商品表service 逻辑层
	 * @Auther 摸鱼
	 * @Date 2024-06-07
	 */
public interface ProductsService {

	/** 
	 *
	 *  根据条件查询列表
	 */
	List<Products> findListByParam(ProductsQuery query);
	/** 
	 *
	 *  根据条件查询多少数量
	 */
	Integer findCountByParam(ProductsQuery query);
	/** 
	 *
	 *  分页查询
	 */
	PaginationResultVo<Products> findListByPage(ProductsQuery query);
	/** 
	 *
	 *  新增
	 */
	Integer add(Products bean);
	/** 
	 *
	 *  批量新增
	 */
	Integer addBatch(List<Products> listBean);
	/** 
	 *
	 *  批量新增/修改
	 */
	Integer addOrUpdateBatch(List<Products> listBean);
	/** 
	 *
	 *  根据ProductId查询
	 */

	Products getProductsByProductId(Integer productId);

	/** 
	 *
	 *  根据ProductId更新
	 */

	Integer updateProductsByProductId(Products bean, Integer productId);

	/** 
	 *
	 *  根据ProductId删除
	 */

	Integer deleteProductsByProductId(Integer productId);

	/** 
	 *
	 *  根据ProductCode查询
	 */

	Products getProductsByProductCode(String productCode);

	/** 
	 *
	 *  根据ProductCode更新
	 */

	Integer updateProductsByProductCode(Products bean, String productCode);

	/** 
	 *
	 *  根据ProductCode删除
	 */

	Integer deleteProductsByProductCode(String productCode);

}
