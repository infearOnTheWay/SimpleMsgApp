package com.app.msg.service;

import com.app.msg.common.UserSessionInfo;
import com.app.msg.interfaces.LoginReq;
import com.app.msg.interfaces.RegisterReq;
import com.app.msg.interfaces.vo.UserVO;

import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * Created by infear on 2017/5/25.
 */
public interface UserInfoService {
    boolean login(LoginReq req, HttpSession session);

    String register(RegisterReq req, HttpSession session);

    List<UserVO> searchByName(String name, UserSessionInfo info);
}
