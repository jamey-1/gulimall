package com.atguigu.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.atguigu.common.utils.PageUtils;
import com.atguigu.gulimall.product.entity.AttrAttrgroupRelationEntity;

import java.util.Map;

/**
 * ÊôÐÔ&ÊôÐÔ·Ö×é¹ØÁª
 *
 * @author yemingliu
 * @email yeming.jamesliu@gmail.com
 * @date 2025-04-19 17:30:52
 */
public interface AttrAttrgroupRelationService extends IService<AttrAttrgroupRelationEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

