package me.jet.ocr.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import me.jet.ocr.api.IExampleApi;
import me.jet.ocr.entity.TbUser;
import me.jet.ocr.input.ExampleInput;
import me.jet.ocr.mapper.TbUserMapper;
import me.jet.ocr.output.ExampleOutput;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.List;

@Primary
@Service
public class ExampleImpl implements IExampleApi {

    @Autowired
    private TbUserMapper tbUserMapper;

    @Override
    public ExampleOutput process(ExampleInput exampleInput) {
        TbUser entity = new TbUser();
        entity.setUserName("测试");
        entity.setShardingVal("0004");
        tbUserMapper.insert(entity);
        LambdaQueryWrapper<TbUser> queryWrapper = new LambdaQueryWrapper<>();
        queryWrapper.eq(TbUser::getUserName, "测试");
        List<TbUser> tbUsers = tbUserMapper.selectList(queryWrapper);
        System.out.println(tbUsers);
        return null;
    }
}
