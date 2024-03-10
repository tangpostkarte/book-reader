package top.tang360.reader.mapper;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

import static org.junit.Assert.*;

//将spring和测试框架整合在一起
@RunWith(SpringJUnit4ClassRunner.class)
//指明要加载的配置文件
@ContextConfiguration(locations = {"classpath:applicationContext.xml"})
public class TestMapperTestor {

    @Resource
    private TestMapper testMapper;

    @Test
    public void insertSample() {
        testMapper.insertSample();
    }
}