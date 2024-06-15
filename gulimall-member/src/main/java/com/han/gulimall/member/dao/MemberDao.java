package com.han.gulimall.member.dao;

import com.han.gulimall.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author yhz
 * @email yihang6992@foxmail.com
 * @date 2024-06-15 23:34:59
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
