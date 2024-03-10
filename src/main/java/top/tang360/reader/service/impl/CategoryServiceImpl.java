package top.tang360.reader.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import top.tang360.reader.entity.Category;
import top.tang360.reader.mapper.CategoryMapper;
import top.tang360.reader.service.CategoryService;

import javax.annotation.Resource;
import java.util.List;

@Service
//对当前实现类的每一个方法是不需要进行事务控制的
@Transactional(propagation = Propagation.NOT_SUPPORTED, readOnly = true)
public class CategoryServiceImpl implements CategoryService {

    @Resource
    private CategoryMapper categoryMapper;

    @Override
    public List<Category> selectAll() {

        QueryWrapper wrapper = new QueryWrapper();

//        按照category_id进行升序排列
        wrapper.orderByAsc("category_id");

        return categoryMapper.selectList(wrapper);
    }
}
