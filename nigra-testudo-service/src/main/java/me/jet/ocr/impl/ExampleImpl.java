package me.jet.ocr.impl;

import me.jet.ocr.api.IExampleApi;
import me.jet.ocr.entity.TbUser;
import me.jet.ocr.input.ExampleInput;
import me.jet.ocr.mapper.TbUserMapper;
import me.jet.ocr.output.ExampleOutput;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ExampleImpl implements IExampleApi {
    @Autowired
    private TbUserMapper tbUserMapper;

    @Override
    public ExampleOutput process(ExampleInput exampleInput) {
        TbUser entity = new TbUser();
        entity.setUserName("测试");
        entity.setZoneVal("0004");
        tbUserMapper.insert(entity);
        return null;
    }
}
