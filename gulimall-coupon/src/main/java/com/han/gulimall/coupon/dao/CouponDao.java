package com.han.gulimall.coupon.dao;

import com.han.gulimall.coupon.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author yhz
 * @email yihang6992@foxmail.com
 * @date 2024-06-15 23:15:35
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}
