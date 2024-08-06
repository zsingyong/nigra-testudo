package me.jet.ocr.strategy;

import lombok.extern.slf4j.Slf4j;
import org.apache.shardingsphere.sharding.api.sharding.standard.PreciseShardingValue;
import org.apache.shardingsphere.sharding.api.sharding.standard.RangeShardingValue;
import org.apache.shardingsphere.sharding.api.sharding.standard.StandardShardingAlgorithm;
import org.springframework.stereotype.Component;

import java.util.Collection;
import java.util.Properties;

@Component
@Slf4j
public class CustomTBShardingAlgorithm implements StandardShardingAlgorithm<String> {

    @Override
    public String doSharding(Collection<String> collection, PreciseShardingValue<String> preciseShardingValue) {
        log.info("分期值：{}", preciseShardingValue.getValue());
        Long zoneVal = Long.valueOf(preciseShardingValue.getValue());
        String columnName = preciseShardingValue.getColumnName();
        for (String tbName : collection) {
            long tbIndex = zoneVal % 4 + 1;
        }
        return null;
    }

    @Override
    public Collection<String> doSharding(Collection<String> collection, RangeShardingValue<String> rangeShardingValue) {
        return null;
    }

    @Override
    public Properties getProps() {
        return new Properties();
    }

    @Override
    public String getType() {
        return "CUSTOM";
    }

    @Override
    public void init() {

    }
}
