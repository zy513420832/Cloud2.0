package com.zzlt.auth.service.impl;

import com.zzlt.auth.vo.UserVo;
import org.springframework.web.bind.annotation.RequestBody;

public interface UserLoginService {

    boolean login(@RequestBody UserVo vo);
    boolean logOut(@RequestBody UserVo vo);
}
