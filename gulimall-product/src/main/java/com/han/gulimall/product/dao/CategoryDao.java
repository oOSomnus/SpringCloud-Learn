package com.han.gulimall.product.dao;

import com.han.gulimall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author yhz
 * @email yihang6992@foxmail.com
 * @date 2024-06-15 14:02:00
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
