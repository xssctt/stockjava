package com.example.stock.controller;



import com.example.stock.entity.vo.ResponseVo;

import com.example.stock.enums.ResponseCodeEnum;

import com.example.stock.exception.BusinessException;


public class ABaseController {
    protected static final String STATUS_SUCCESS="success";
    protected static final String STATUS_ERROR="error";

    protected <T> ResponseVo getSuccessResponseVo(T t){
        ResponseVo<T> responseVo=new ResponseVo<>();
        responseVo.setStatus(STATUS_SUCCESS);
        responseVo.setCode(ResponseCodeEnum.CODE_200.getCode());
        responseVo.setInfo(ResponseCodeEnum.CODE_200.getMsg());
        responseVo.setData(t);

        return responseVo;
    }

    protected <T> ResponseVo getBusinessErrorResponseVo(BusinessException e, T t){
        ResponseVo<T> responseVo=new ResponseVo<>();
        responseVo.setStatus(STATUS_ERROR);


        return responseVo;
    }

    protected <T> ResponseVo getServerErrorResponseVo(T t){
        ResponseVo<T> responseVo=new ResponseVo<>();
        responseVo.setStatus(STATUS_ERROR);
        responseVo.setCode(ResponseCodeEnum.CODE_500.getCode());
        responseVo.setInfo(ResponseCodeEnum.CODE_500.getMsg());
        responseVo.setData(t);

        return responseVo;
    }


}




























