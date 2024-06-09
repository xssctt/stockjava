package com.example.stock.controller;

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
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestBody;
import com.example.stock.mappers.ShipmentsMapper;
import com.example.stock.controller.ABaseController;
import com.example.stock.entity.vo.ResponseVo;


	/** 
	 *
	 * @Desoription 出货记录表controller 控制层
	 * @Auther 摸鱼
	 * @Date 2024-06-07
	 */
@RestController("shipmentsController")
@RequestMapping("/shipments")
public class ShipmentsController extends ABaseController{

	@Resource
	private ShipmentsService shipmentsService;

	/** 
	 *
	 *  
	 */
	@RequestMapping("/loadDateList")
	public ResponseVo loadDataList(ShipmentsQuery query){
		return getSuccessResponseVo(shipmentsService.findListByParam(query));
	}
	/** 
	 *
	 *  新增
	 */
	@RequestMapping("/add")
	public ResponseVo add(Shipments bean){
		return getSuccessResponseVo(shipmentsService.add(bean));
	}
	/** 
	 *
	 *  批量新增
	 */
	@RequestMapping("/addBatch")
	public ResponseVo addBatch(@RequestBody List<Shipments> listBean){
		return getSuccessResponseVo(shipmentsService.addBatch(listBean));
	}
	/** 
	 *
	 *  批量新增/修改
	 */
	@RequestMapping("/addOrUpdateBatch")
	public ResponseVo addOrUpdateBatch(@RequestBody List<Shipments> listBean){
		return getSuccessResponseVo(shipmentsService.addOrUpdateBatch(listBean));
	}
	/** 
	 *
	 *  根据ShipmentId查询
	 */
	@RequestMapping("/getShipmentsByShipmentId")
	public ResponseVo getShipmentsByShipmentId(Integer shipmentId){
		return getSuccessResponseVo(shipmentsService.getShipmentsByShipmentId(shipmentId));
	}

	/** 
	 *
	 *  根据ShipmentId更新
	 */
	@RequestMapping("/updateShipmentsByShipmentId")
	public ResponseVo updateShipmentsByShipmentId(Shipments bean, Integer shipmentId){
		return getSuccessResponseVo(shipmentsService.updateShipmentsByShipmentId(bean,shipmentId));
	}

	/** 
	 *
	 *  根据ShipmentId删除
	 */
	@RequestMapping("/deleteShipmentsByShipmentId")
	public ResponseVo deleteShipmentsByShipmentId(Integer shipmentId){
		return getSuccessResponseVo(shipmentsService.deleteShipmentsByShipmentId(shipmentId));
	}

}
