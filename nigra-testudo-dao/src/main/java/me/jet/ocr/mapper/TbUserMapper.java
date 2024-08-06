package me.jet.ocr.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import me.jet.ocr.entity.TbUser;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface TbUserMapper extends BaseMapper<TbUser> {

}
