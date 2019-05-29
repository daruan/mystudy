package com.daruan.ad.controller;

import com.daruan.ad.client.SponsorClient;
import com.daruan.ad.client.vo.AdPlan;
import com.daruan.ad.client.vo.AdPlanGetRequest;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 *
 * Created with IDEA
 * author:ruanlinyu
 * Date:2019/4/23
 * Time:16:21
 */
@Slf4j
@RestController
public class searchController {
    private final RestTemplate restTemplate;
    private final SponsorClient sponsorClient;

    @Autowired
    public searchController(RestTemplate restTemplate,SponsorClient sponsorClient){
        this.restTemplate = restTemplate;
        this.sponsorClient = sponsorClient;
    }

    /**
     * 演示rebbon调用微服务
     * @param request
     * @return
     */
    @SuppressWarnings("all")
    @IgnoreResponseAdvice
    @PostMapping("/getAdplanByRebbon")
    public CommonResponse<List<AdPlan>> getAdPlansByRebbon(@RequestBody AdPlanGetRequest request){
        log.info("ad-search: getAdPlanByRebbon -> {}",
                JSON.toJSONString(request));
        return restTemplate.postForEntity(
                "http://eureka-client-ad-sponsor/ad-sponsor/get/adPlan",
                request,
                CommonResponse.class
        ).getBody();
    }

    /**
     * feign调用微服务演示
     * @param request
     * @return
     */
    @IgnoreResponseAdvice
    @PostMapping("/getAdPlans")
    public CommonResponse<List<AdPlan>> getAdPlans(
            @RequestBody AdPlanGetRequest request
    ){
        log.info("ad-search: getAdPlans -> {}",
                JSON.toJSONString(request));
        return sponsorClient.getAdPlans(request);
    }
























}
