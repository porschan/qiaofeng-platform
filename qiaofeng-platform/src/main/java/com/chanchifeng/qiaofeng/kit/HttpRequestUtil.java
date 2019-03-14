package com.chanchifeng.qiaofeng.kit;

import org.springframework.http.*;
import org.springframework.http.client.SimpleClientHttpRequestFactory;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;

import java.io.IOException;

/**
 * @author:porschan
 * @description:
 * @date: Created in 18:06 2019/2/13
 * @modified By:
 */

public class HttpRequestUtil {

    /**
     * 发送http请求
     * @param url
     * @param method
     * @param params
     * @return
     * @throws IOException
     */
    public static String httpRestClient(String url, HttpMethod method, MultiValueMap<String, String> params) throws IOException {
        SimpleClientHttpRequestFactory requestFactory = new SimpleClientHttpRequestFactory();
        requestFactory.setConnectTimeout(10 * 1000);
        requestFactory.setReadTimeout(10 * 1000);
        RestTemplate client = new RestTemplate(requestFactory);
        HttpHeaders headers = new HttpHeaders();
        //  请勿轻易改变此提交方式，大部分的情况下，提交方式都是表单提交
        headers.setContentType(MediaType.APPLICATION_FORM_URLENCODED);
        HttpEntity<MultiValueMap<String, String>> requestEntity = new HttpEntity<MultiValueMap<String, String>>(params, headers);
        //  执行HTTP请求
        ResponseEntity<String> response = client.exchange(url, method, requestEntity, String.class);
        return response.getBody();
    }

}
