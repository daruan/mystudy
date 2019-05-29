package com.daruan.ad.service.impl;

import com.daruan.ad.dao.CreativeRepository;
import com.daruan.ad.entity.Creative;
import com.daruan.ad.service.ICreativeService;
import com.daruan.ad.vo.CreativeRequest;
import com.daruan.ad.vo.CreativeResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Qinyi.
 */
@Service
public class CreativeServiceImpl implements ICreativeService {

    private final CreativeRepository creativeRepository;

    @Autowired
    public CreativeServiceImpl(CreativeRepository creativeRepository) {
        this.creativeRepository = creativeRepository;
    }

    @Override
    public CreativeResponse createCreative(CreativeRequest request) {

        Creative creative = creativeRepository.save(
                request.convertToEntity()
        );

        return new CreativeResponse(creative.getId(), creative.getName());
    }
}
