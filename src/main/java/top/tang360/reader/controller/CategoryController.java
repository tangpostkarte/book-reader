package top.tang360.reader.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import top.tang360.reader.entity.Category;
import top.tang360.reader.service.CategoryService;
import top.tang360.reader.utils.ResponseUtils;

import javax.annotation.Resource;
import java.util.List;
import java.util.Objects;

// @RestController注解表示所有方法返回的是json字符串
@RestController
// @RequestMapping表示当前控制器映射的前缀是什么
@RequestMapping("/api/category")
public class CategoryController {
    @Resource
    private CategoryService categoryService;

    @GetMapping("/list")
    public ResponseUtils list() {
        ResponseUtils resp = null;
        try {
            List<Category> categories = categoryService.selectAll();
            resp = new ResponseUtils().put("list", categories);
        } catch (Exception e) {
            e.printStackTrace();
            resp = new ResponseUtils(e.getClass().getSimpleName(), e.getMessage());
        }

        return resp;
    }
}
