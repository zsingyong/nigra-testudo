package me.jet.ocr.entity;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import org.springframework.context.annotation.Description;

@Description(value = "用于映射到分表分库具体的表和库中去")
@TableName(schema = "beilu", value = "tb_zone_route")
public class TbZoneRoute {
    @TableId
    private String tenantId;
    @TableId
    private String sysNo;
    @TableId
    private String zoneKey;
    private String zoneVal;

    @TableField(fill = FieldFill.INSERT)
    private String createTime;

    @TableField(fill = FieldFill.UPDATE)
    private String updateTime;

}
