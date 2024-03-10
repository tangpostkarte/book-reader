package top.tang360.reader.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import top.tang360.reader.entity.Category;

import java.util.List;

import static org.junit.Assert.*;
@RunWith(SpringJUnit4ClassRunner.class)
//指明要加载的配置文件
@ContextConfiguration(locations = {"classpath:applicationContext.xml"})
public class CategoryServiceTest {
    @Autowired
    private CategoryService categoryService;

    @Test
    public void selectAll() {
        List<Category> categories = categoryService.selectAll();
        for (Category c : categories) {
            System.out.println(c);
        }
    }
}