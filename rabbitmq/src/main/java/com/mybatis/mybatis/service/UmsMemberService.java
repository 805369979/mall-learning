package com.mybatis.mybatis.service;

import com.mybatis.mybatis.common.api.CommonResult;

/**
 * 会员管理Service
 */
public interface UmsMemberService {

    /**
     * 生成验证码
     */
    CommonResult generateAuthCode(String telephone);

    /**
     * 判断验证码和手机号码是否匹配
     */
    CommonResult verifyAuthCode(String telephone, String authCode);

}
