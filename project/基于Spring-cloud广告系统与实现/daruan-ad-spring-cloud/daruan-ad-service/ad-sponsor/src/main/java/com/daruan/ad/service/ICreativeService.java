package com.daruan.ad.service;

import com.daruan.ad.vo.CreativeRequest;
import com.daruan.ad.vo.CreativeResponse;

/**
 * Created by Qinyi.
 */
public interface ICreativeService {

    CreativeResponse createCreative(CreativeRequest request);
}
