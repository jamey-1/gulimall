package com.atguigu.gulimall.member.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.math.BigDecimal;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * »áÔ±Í³¼ÆÐÅÏ¢
 * 
 * @author yemingliu
 * @email yeming.jamesliu@gmail.com
 * @date 2025-04-21 19:52:19
 */
@Data
@TableName("ums_member_statistics_info")
public class MemberStatisticsInfoEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * id
	 */
	@TableId
	private Long id;
	/**
	 * »áÔ±id
	 */
	private Long memberId;
	/**
	 * ÀÛ¼ÆÏû·Ñ½ð¶î
	 */
	private BigDecimal consumeAmount;
	/**
	 * ÀÛ¼ÆÓÅ»Ý½ð¶î
	 */
	private BigDecimal couponAmount;
	/**
	 * ¶©µ¥ÊýÁ¿
	 */
	private Integer orderCount;
	/**
	 * ÓÅ»ÝÈ¯ÊýÁ¿
	 */
	private Integer couponCount;
	/**
	 * ÆÀ¼ÛÊý
	 */
	private Integer commentCount;
	/**
	 * ÍË»õÊýÁ¿
	 */
	private Integer returnOrderCount;
	/**
	 * µÇÂ¼´ÎÊý
	 */
	private Integer loginCount;
	/**
	 * ¹Ø×¢ÊýÁ¿
	 */
	private Integer attendCount;
	/**
	 * ·ÛË¿ÊýÁ¿
	 */
	private Integer fansCount;
	/**
	 * ÊÕ²ØµÄÉÌÆ·ÊýÁ¿
	 */
	private Integer collectProductCount;
	/**
	 * ÊÕ²ØµÄ×¨Ìâ»î¶¯ÊýÁ¿
	 */
	private Integer collectSubjectCount;
	/**
	 * ÊÕ²ØµÄÆÀÂÛÊýÁ¿
	 */
	private Integer collectCommentCount;
	/**
	 * ÑûÇëµÄÅóÓÑÊýÁ¿
	 */
	private Integer inviteFriendCount;

}
