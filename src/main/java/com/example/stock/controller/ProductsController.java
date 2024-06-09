package com.example.stock.controller;

import com.example.stock.entity.po.Products;
import com.example.stock.entity.query.ProductsQuery;
import java.util.List;
import com.example.stock.entity.query.SimplePage;
import com.example.stock.entity.vo.PaginationResultVo;
import com.example.stock.enums.PageSize;
import com.example.stock.service.ProductsService;

import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestBody;
import com.example.stock.mappers.ProductsMapper;
import com.example.stock.controller.ABaseController;
import com.example.stock.entity.vo.ResponseVo;


	/** 
	 *
	 * @Desoription 商品表controller 控制层
	 * @Auther 摸鱼
	 * @Date 2024-06-07
	 */
@RestController("productsController")
@RequestMapping("/products")
public class ProductsController extends ABaseController{

	@Resource
	private ProductsService productsService;

	/** 
	 *
	 *  
	 */
	@RequestMapping("/loadDateList")
	public ResponseVo loadDataList(ProductsQuery query){
		return getSuccessResponseVo(productsService.findListByParam(query));
	}
	/** 
	 *
	 *  新增
	 */
	@RequestMapping("/add")
	public ResponseVo add(Products bean){
		return getSuccessResponseVo(productsService.add(bean));
	}
	/** 
	 *
	 *  批量新增
	 */
	@RequestMapping("/addBatch")
	public ResponseVo addBatch(@RequestBody List<Products> listBean){
		return getSuccessResponseVo(productsService.addBatch(listBean));
	}
	/** 
	 *
	 *  批量新增/修改
	 */
	@RequestMapping("/addOrUpdateBatch")
	public ResponseVo addOrUpdateBatch(@RequestBody List<Products> listBean){
		return getSuccessResponseVo(productsService.addOrUpdateBatch(listBean));
	}
	/** 
	 *
	 *  根据ProductId查询
	 */
	@RequestMapping("/getProductsByProductId")
	public ResponseVo getProductsByProductId(Integer productId){
		return getSuccessResponseVo(productsService.getProductsByProductId(productId));
	}

	/** 
	 *
	 *  根据ProductId更新
	 */
	@RequestMapping("/updateProductsByProductId")
	public ResponseVo updateProductsByProductId(Products bean, Integer productId){
		return getSuccessResponseVo(productsService.updateProductsByProductId(bean,productId));
	}

	/** 
	 *
	 *  根据ProductId删除
	 */
	@RequestMapping("/deleteProductsByProductId")
	public ResponseVo deleteProductsByProductId(Integer productId){
		return getSuccessResponseVo(productsService.deleteProductsByProductId(productId));
	}

	/** 
	 *
	 *  根据ProductCode查询
	 */
	@RequestMapping("/getProductsByProductCode")
	public ResponseVo getProductsByProductCode(String productCode){
		return getSuccessResponseVo(productsService.getProductsByProductCode(productCode));
	}

	/** 
	 *
	 *  根据ProductCode更新
	 */
	@RequestMapping("/updateProductsByProductCode")
	public ResponseVo updateProductsByProductCode(Products bean, String productCode){
		return getSuccessResponseVo(productsService.updateProductsByProductCode(bean,productCode));
	}

	/** 
	 *
	 *  根据ProductCode删除
	 */
	@RequestMapping("/deleteProductsByProductCode")
	public ResponseVo deleteProductsByProductCode(String productCode){
		return getSuccessResponseVo(productsService.deleteProductsByProductCode(productCode));
	}

}
