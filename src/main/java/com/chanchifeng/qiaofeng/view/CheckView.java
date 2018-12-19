package com.chanchifeng.qiaofeng.view;

import com.chanchifeng.qiaofeng.common.JsonFactoryHolder;
import com.chanchifeng.qiaofeng.model.CheckModel;
import com.fasterxml.jackson.core.JsonGenerator;

import java.io.IOException;
import java.io.OutputStream;

/**
 * @author:porschan
 * @description:
 * @date: Created in 12:29 2018/12/19
 * @modified By:
 */

public class CheckView {
    private CheckModel checkModel; // the check model

    public CheckView(int code, String msg) {
        this.checkModel = new CheckModel(code, msg);
    }

    public void writeView(OutputStream outputStream) throws IOException {
        try (JsonGenerator jsonFactory = JsonFactoryHolder.getJsonFactory()
                .createGenerator(outputStream)){
            jsonFactory.writeStartObject();

            jsonFactory.writeObjectFieldStart("check");

            jsonFactory.writeNumberField("code", checkModel.getCode());
            jsonFactory.writeStringField("message", checkModel.getMessage());

            jsonFactory.writeEndObject();

//            jsonFactory.writeEndObject();

        }
    }
}
