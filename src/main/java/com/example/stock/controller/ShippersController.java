package com.example.stock.controller;

import com.example.stock.entity.po.Shippers;
import com.example.stock.entity.query.ShippersQuery;
import java.util.List;
import com.example.stock.entity.query.SimplePage;
import com.example.stock.entity.vo.PaginationResultVo;
import com.example.stock.enums.PageSize;
import com.example.stock.service.ShippersService;

import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestBody;
import com.example.stock.mappers.ShippersMapper;
import com.example.stock.controller.ABaseController;
import com.example.stock.entity.vo.ResponseVo;


	/** 
	 *
	 * @Desoription 出货人员表controller 控制层
	 * @Auther 摸鱼
	 * @Date 2024-06-07
	 */
@RestController("shippersController")
@RequestMapping("/shippers")
public class ShippersController extends ABaseController{

	@Resource
	private ShippersService shippersService;

	/** 
	 *
	 *  
	 */
	@RequestMapping("/loadDateList")
	public ResponseVo loadDataList(ShippersQuery query){
		return getSuccessResponseVo(shippersService.findListByParam(query));
	}
	/** 
	 *
	 *  新增
	 */
	@RequestMapping("/add")
	public ResponseVo add(Shippers bean){
		return getSuccessResponseVo(shippersService.add(bean));
	}
	/** 
	 *
	 *  批量新增
	 */
	@RequestMapping("/addBatch")
	public ResponseVo addBatch(@RequestBody List<Shippers> listBean){
		return getSuccessResponseVo(shippersService.addBatch(listBean));
	}
	/** 
	 *
	 *  批量新增/修改
	 */
	@RequestMapping("/addOrUpdateBatch")
	public ResponseVo addOrUpdateBatch(@RequestBody List<Shippers> listBean){
		return getSuccessResponseVo(shippersService.addOrUpdateBatch(listBean));
	}
	/** 
	 *
	 *  根据ShipperId查询
	 */
	@RequestMapping("/getShippersByShipperId")
	public ResponseVo getShippersByShipperId(Integer shipperId){
		return getSuccessResponseVo(shippersService.getShippersByShipperId(shipperId));
	}

	/** 
	 *
	 *  根据ShipperId更新
	 */
	@RequestMapping("/updateShippersByShipperId")
	public ResponseVo updateShippersByShipperId(Shippers bean, Integer shipperId){
		return getSuccessResponseVo(shippersService.updateShippersByShipperId(bean,shipperId));
	}

	/** 
	 *
	 *  根据ShipperId删除
	 */
	@RequestMapping("/deleteShippersByShipperId")
	public ResponseVo deleteShippersByShipperId(Integer shipperId){
		return getSuccessResponseVo(shippersService.deleteShippersByShipperId(shipperId));
	}

}
