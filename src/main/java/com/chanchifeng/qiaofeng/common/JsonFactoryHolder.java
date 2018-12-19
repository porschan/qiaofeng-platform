package com.chanchifeng.qiaofeng.common;

import com.fasterxml.jackson.core.JsonFactory;

/**
 * @author:porschan
 * @description:
 * @date: Created in 12:22 2018/12/19
 * @modified By:
 */

public class JsonFactoryHolder {
    private static final JsonFactory JSON_FACTORY = new JsonFactory();

    /**
     * get the only json factory.
     * @return shared handler
     */
    public static JsonFactory getJsonFactory() {
        return JSON_FACTORY;
    }
}
