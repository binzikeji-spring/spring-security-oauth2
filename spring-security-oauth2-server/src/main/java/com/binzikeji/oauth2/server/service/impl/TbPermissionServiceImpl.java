package com.binzikeji.oauth2.server.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.binzikeji.oauth2.server.mapper.TbPermissionMapper;
import com.binzikeji.oauth2.server.service.TbPermissionService;
@Service
public class TbPermissionServiceImpl implements TbPermissionService{

    @Resource
    private TbPermissionMapper tbPermissionMapper;

}
