package com.chanchifeng.qiaofeng.controller;

import com.alibaba.fastjson.JSON;
import com.chanchifeng.qiaofeng.graphql.GraphqlFacade;
import com.chanchifeng.qiaofeng.view.CheckView;
import com.chanchifeng.qiaofeng.view.MockerDataView;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author:porschan
 * @description:
 * @date: Created in 12:22 2018/12/19
 * @modified By:
 */
@Controller
@RequestMapping(value = "dsql/api/")
public class GraphqlController {
    /**
     * check the server.
     * @param request the request
     * @param response the response
     */
    @RequestMapping(value = "check")
    public void checkAlive(HttpServletRequest request, HttpServletResponse response) throws IOException {
        new CheckView(200, "ok").writeView(response.getOutputStream());
    }

    /**
     * text the mocker
     * @param request r
     * @param response r
     */
    @RequestMapping(value = "mocker")
    public void testMocker(HttpServletRequest request, HttpServletResponse response) throws IOException {
        new MockerDataView().writeView(response.getOutputStream());
    }

    /**
     * query the hsql by the graphql
     * @param ghql the query string like:->
     *             "{
     *               author(authorId:2)
     *                {
     *                authorId,
     *                authorAge,
     *                authorAddr,
     *                friends
     *                }
     *               }"
     *             the response like:->
     *              "{
     *                "author": {
     *                           "authorId": 2,
     *                           "authorAge": 32,
     *                           "authorAddr": "Ty-0021",
     *                           "friends": [1]
     *                          }
     *               }"
     *
     * @param request r
     * @param response r
     * @throws IOException e
     */
    @RequestMapping(value = "query/{ghql}")
    public void graphqlQuery(@PathVariable("ghql") String ghql, HttpServletRequest request, HttpServletResponse response)
            throws IOException {

        String result = JSON.toJSONString(GraphqlFacade.query(ghql));

        System.out.println("request query:" + ghql + " \nresult:" + result);

        //query the result.
        response.getOutputStream().write(result.getBytes());
    }
}
