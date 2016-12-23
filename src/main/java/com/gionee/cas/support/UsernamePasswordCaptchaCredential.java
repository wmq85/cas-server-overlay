package com.gionee.cas.support;

import org.jasig.cas.authentication.UsernamePasswordCredential;

/**
 * Created by Leon.Yu on 2016/12/22.
 */
public class UsernamePasswordCaptchaCredential extends UsernamePasswordCredential {

    private String captcha;

    public String getCaptcha() {
        return captcha;
    }

    public void setCaptcha(String captcha) {
        this.captcha = captcha;
    }
}
