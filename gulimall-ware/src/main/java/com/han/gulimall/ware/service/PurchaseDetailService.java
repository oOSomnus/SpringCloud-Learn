package com.han.gulimall.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.han.common.utils.PageUtils;
import com.han.gulimall.ware.entity.PurchaseDetailEntity;

import java.util.Map;

/**
 * @author yhz
 * @email yihang6992@foxmail.com
 * @date 2024-06-15 23:41:59
 */
public interface PurchaseDetailService extends IService<PurchaseDetailEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

