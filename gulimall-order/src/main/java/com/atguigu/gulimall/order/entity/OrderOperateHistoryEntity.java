package com.atguigu.gulimall.order.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * ¶©µ¥²Ù×÷ÀúÊ·¼ÇÂ¼
 * 
 * @author yemingliu
 * @email yeming.jamesliu@gmail.com
 * @date 2025-04-21 20:05:19
 */
@Data
@TableName("oms_order_operate_history")
public class OrderOperateHistoryEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * id
	 */
	@TableId
	private Long id;
	/**
	 * ¶©µ¥id
	 */
	private Long orderId;
	/**
	 * ²Ù×÷ÈË[ÓÃ»§£»ÏµÍ³£»ºóÌ¨¹ÜÀíÔ±]
	 */
	private String operateMan;
	/**
	 * ²Ù×÷Ê±¼ä
	 */
	private Date createTime;
	/**
	 * ¶©µ¥×´Ì¬¡¾0->´ý¸¶¿î£»1->´ý·¢»õ£»2->ÒÑ·¢»õ£»3->ÒÑÍê³É£»4->ÒÑ¹Ø±Õ£»5->ÎÞÐ§¶©µ¥¡¿
	 */
	private Integer orderStatus;
	/**
	 * ±¸×¢
	 */
	private String note;

}
