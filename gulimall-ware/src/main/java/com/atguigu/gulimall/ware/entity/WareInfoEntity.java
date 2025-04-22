package com.atguigu.gulimall.ware.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * ²Ö¿âÐÅÏ¢
 * 
 * @author yemingliu
 * @email yeming.jamesliu@gmail.com
 * @date 2025-04-21 20:33:38
 */
@Data
@TableName("wms_ware_info")
public class WareInfoEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * id
	 */
	@TableId
	private Long id;
	/**
	 * ²Ö¿âÃû
	 */
	private String name;
	/**
	 * ²Ö¿âµØÖ·
	 */
	private String address;
	/**
	 * ÇøÓò±àÂë
	 */
	private String areacode;

}
