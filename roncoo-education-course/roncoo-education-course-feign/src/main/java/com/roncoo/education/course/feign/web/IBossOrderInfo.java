package com.roncoo.education.course.feign.web;

import org.springframework.cloud.openfeign.FeignClient;

import com.roncoo.education.course.common.interfaces.web.BossOrderInfo;

/**
 * 订单信息表 
 *
 * @author wujing
 */
@FeignClient(value = "roncoo-education-course-service")
public interface IBossOrderInfo extends BossOrderInfo {

}
