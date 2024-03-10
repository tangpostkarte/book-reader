package top.tang360.reader.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;

//将spring和测试框架整合在一起
@RunWith(SpringJUnit4ClassRunner.class)
//指明要加载的配置文件
@ContextConfiguration(locations = {"classpath:applicationContext.xml"})
public class TestServiceTestor {
    @Autowired
    private TestService testService;

    @Test
    public void batchImport() {

        testService.batchImport();
        System.out.println("批量导入成功");
    }
}