package com.example.stock.controller;

import com.example.stock.entity.po.Type;
import com.example.stock.entity.query.TypeQuery;
import java.util.List;
import com.example.stock.entity.query.SimplePage;
import com.example.stock.entity.vo.PaginationResultVo;
import com.example.stock.enums.PageSize;
import com.example.stock.service.TypeService;

import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestBody;
import com.example.stock.mappers.TypeMapper;
import com.example.stock.controller.ABaseController;
import com.example.stock.entity.vo.ResponseVo;


	/** 
	 *
	 * @Desoription 类型表controller 控制层
	 * @Auther 摸鱼
	 * @Date 2024-06-07
	 */
@RestController("typeController")
@RequestMapping("/type")
public class TypeController extends ABaseController{

	@Resource
	private TypeService typeService;

	/** 
	 *
	 *  
	 */
	@RequestMapping("/loadDateList")
	public ResponseVo loadDataList(TypeQuery query){
		return getSuccessResponseVo(typeService.findListByParam(query));
	}
	/** 
	 *
	 *  新增
	 */
	@RequestMapping("/add")
	public ResponseVo add(Type bean){
		return getSuccessResponseVo(typeService.add(bean));
	}
	/** 
	 *
	 *  批量新增
	 */
	@RequestMapping("/addBatch")
	public ResponseVo addBatch(@RequestBody List<Type> listBean){
		return getSuccessResponseVo(typeService.addBatch(listBean));
	}
	/** 
	 *
	 *  批量新增/修改
	 */
	@RequestMapping("/addOrUpdateBatch")
	public ResponseVo addOrUpdateBatch(@RequestBody List<Type> listBean){
		return getSuccessResponseVo(typeService.addOrUpdateBatch(listBean));
	}
	/** 
	 *
	 *  根据Id查询
	 */
	@RequestMapping("/getTypeById")
	public ResponseVo getTypeById(Integer id){
		return getSuccessResponseVo(typeService.getTypeById(id));
	}

	/** 
	 *
	 *  根据Id更新
	 */
	@RequestMapping("/updateTypeById")
	public ResponseVo updateTypeById(Type bean, Integer id){
		return getSuccessResponseVo(typeService.updateTypeById(bean,id));
	}

	/** 
	 *
	 *  根据Id删除
	 */
	@RequestMapping("/deleteTypeById")
	public ResponseVo deleteTypeById(Integer id){
		return getSuccessResponseVo(typeService.deleteTypeById(id));
	}

}
