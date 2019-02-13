package com.chanchifeng.qiaofeng.service.impl;

import com.chanchifeng.qiaofeng.kit.HttpRequestUtil;
import com.chanchifeng.qiaofeng.service.PageService;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;

import java.io.IOException;

import static com.chanchifeng.qiaofeng.common.CheckList.API_ICIBA;

/**
 * @author:porschan
 * @description:
 * @date: Created in 18:12 2019/2/13
 * @modified By:
 */
@Service
public class PageServiceImpl implements PageService {

    @Override
    public String gainICIBA() {
        HttpRequestUtil httpRequestUtil = new HttpRequestUtil();

        //api url地址
        String url = API_ICIBA;
        //post请求
        HttpMethod method =HttpMethod.GET;
        // 封装参数，千万不要替换为Map与HashMap，否则参数无法传递
        MultiValueMap<String, String> params= new LinkedMultiValueMap<String, String>();
        //发送http请求并返回结果
        String result = null;
        try {
            result = httpRequestUtil.HttpRestClient(url,method,params);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return result;
    }
}
