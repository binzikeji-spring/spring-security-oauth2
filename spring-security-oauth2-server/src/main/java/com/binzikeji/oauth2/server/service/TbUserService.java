package com.binzikeji.oauth2.server.service;

import com.binzikeji.oauth2.server.domain.TbUser;

public interface TbUserService{

    TbUser getByUsername(String username);
}
