package com.daruan.ad.service;

import com.daruan.ad.exception.AdException;
import com.daruan.ad.vo.AdUnitDistrictRequest;
import com.daruan.ad.vo.AdUnitDistrictResponse;
import com.daruan.ad.vo.AdUnitItRequest;
import com.daruan.ad.vo.AdUnitItResponse;
import com.daruan.ad.vo.AdUnitKeywordRequest;
import com.daruan.ad.vo.AdUnitKeywordResponse;
import com.daruan.ad.vo.AdUnitRequest;
import com.daruan.ad.vo.AdUnitResponse;
import com.daruan.ad.vo.CreativeUnitRequest;
import com.daruan.ad.vo.CreativeUnitResponse;

/**
 * Created by Qinyi.
 */
public interface IAdUnitService {

    AdUnitResponse createUnit(AdUnitRequest request) throws AdException;

    AdUnitKeywordResponse createUnitKeyword(AdUnitKeywordRequest request)
        throws AdException;

    AdUnitItResponse createUnitIt(AdUnitItRequest request)
        throws AdException;

    AdUnitDistrictResponse createUnitDistrict(AdUnitDistrictRequest request)
        throws AdException;

    CreativeUnitResponse createCreativeUnit(CreativeUnitRequest request)
        throws AdException;
}
