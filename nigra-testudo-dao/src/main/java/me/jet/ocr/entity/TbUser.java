package me.jet.ocr.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.context.annotation.Description;

@Data
@NoArgsConstructor
@Description(value = "用于映射到分表分库具体的表和库中去")
@TableName(schema = "beilu", value = "tb_user")
public class TbUser {
    @TableId
    private String userName;
    private String zoneVal;
}
