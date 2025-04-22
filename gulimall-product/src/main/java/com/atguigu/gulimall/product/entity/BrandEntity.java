package com.atguigu.gulimall.product.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * Æ·ÅÆ
 * 
 * @author yemingliu
 * @email yeming.jamesliu@gmail.com
 * @date 2025-04-19 17:30:52
 */
@Data
@TableName("pms_brand")
public class BrandEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * Æ·ÅÆid
	 */
	@TableId
	private Long brandId;
	/**
	 * Æ·ÅÆÃû
	 */
	private String name;
	/**
	 * Æ·ÅÆlogoµØÖ·
	 */
	private String logo;
	/**
	 * ½éÉÜ
	 */
	private String descript;
	/**
	 * ÏÔÊ¾×´Ì¬[0-²»ÏÔÊ¾£»1-ÏÔÊ¾]
	 */
	private Integer showStatus;
	/**
	 * ¼ìË÷Ê××ÖÄ¸
	 */
	private String firstLetter;
	/**
	 * ÅÅÐò
	 */
	private Integer sort;

}
