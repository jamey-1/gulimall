package com.atguigu.gulimall.coupon;


import com.atguigu.gulimall.coupon.dao.CouponDao;
import com.atguigu.gulimall.coupon.entity.CouponEntity;
import com.atguigu.gulimall.coupon.service.CouponService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class GulimallCouponApplicationTests {
    @Autowired
    CouponService couponService;

    @Autowired
    CouponDao couponDao;

    @Test
    public void contextLoads() {
        couponService.removeById(1);
        System.out.println("------- Test ------------");
        /*
        List<CouponEntity> coupons = couponService.list();
        System.out.println("------- Test ------------");
        System.out.println(coupons);
        */
        /*
        CouponEntity coupon = new CouponEntity();
        coupon.setCouponName("test111");

        couponDao.insert(coupon);
        */
    }

}
