package me.jet.ocr.entity;

import org.springframework.context.annotation.Description;

import java.io.Serializable;

@Description(value = "用于映射到分表分库具体的表和库中去")
public class TbZoneRouteID implements Serializable {
    private String tenantId;
    private String sysNo;
    private String zoneKey;
}
