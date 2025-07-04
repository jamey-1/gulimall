package com.atguigu.gulimall.ware.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.math.BigDecimal;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 
 * 
 * @author yemingliu
 * @email yeming.jamesliu@gmail.com
 * @date 2025-04-21 20:33:38
 */
@Data
@TableName("wms_purchase_detail")
public class PurchaseDetailEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	@TableId
	private Long id;
	/**
	 * ²É¹ºµ¥id
	 */
	private Long purchaseId;
	/**
	 * ²É¹ºÉÌÆ·id
	 */
	private Long skuId;
	/**
	 * ²É¹ºÊýÁ¿
	 */
	private Integer skuNum;
	/**
	 * ²É¹º½ð¶î
	 */
	private BigDecimal skuPrice;
	/**
	 * ²Ö¿âid
	 */
	private Long wareId;
	/**
	 * ×´Ì¬[0ÐÂ½¨£¬1ÒÑ·ÖÅä£¬2ÕýÔÚ²É¹º£¬3ÒÑÍê³É£¬4²É¹ºÊ§°Ü]
	 */
	private Integer status;

}
