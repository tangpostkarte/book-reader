package top.tang360.reader.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import top.tang360.reader.entity.Category;

//必须继承BaseMapper<Category>， 并声明泛型为Category
public interface CategoryMapper extends BaseMapper<Category> {
    // 不用声明任何方法，但是还是需要写xml
}
