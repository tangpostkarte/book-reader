package top.tang360.reader.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import top.tang360.reader.mapper.TestMapper;

import javax.annotation.Resource;

@Service
public class TestService {
    @Resource
    private TestMapper testMapper;

//    在执行当前方法时开启声明式事务
    @Transactional(rollbackFor = Exception.class)
    public void batchImport() {
        for (int i = 0; i < 5; i++) {
//            if (i == 2) {
//                throw new RuntimeException("未处理异常");
//            }
            testMapper.insertSample();
        }
    }
}
