package com.han.gulimall.order.dao;

import com.han.gulimall.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author yhz
 * @email yihang6992@foxmail.com
 * @date 2024-06-15 23:36:52
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
