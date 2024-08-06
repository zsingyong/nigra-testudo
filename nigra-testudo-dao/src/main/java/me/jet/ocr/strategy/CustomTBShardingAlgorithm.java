package me.jet.ocr.strategy;

import org.apache.shardingsphere.sharding.api.sharding.standard.PreciseShardingValue;
import org.apache.shardingsphere.sharding.api.sharding.standard.RangeShardingValue;
import org.apache.shardingsphere.sharding.api.sharding.standard.StandardShardingAlgorithm;
import org.springframework.stereotype.Component;

import java.util.Collection;
import java.util.Properties;

@Component
public class CustomTBShardingAlgorithm implements StandardShardingAlgorithm<String> {

    @Override
    public String doSharding(Collection<String> collection, PreciseShardingValue<String> preciseShardingValue) {
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
