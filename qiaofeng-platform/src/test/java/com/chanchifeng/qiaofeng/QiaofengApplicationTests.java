package com.chanchifeng.qiaofeng;

import com.chanchifeng.qiaofeng.service.PageService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

@RunWith(SpringRunner.class)
@SpringBootTest
public class QiaofengApplicationTests {

    @Resource
    private PageService pageService;

    @Test
    public void gainICIBATest(){
        pageService.gainICIBA();
    }

}

