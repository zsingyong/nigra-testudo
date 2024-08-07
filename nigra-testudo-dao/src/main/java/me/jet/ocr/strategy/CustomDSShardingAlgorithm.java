package me.jet.ocr.strategy;

import lombok.extern.slf4j.Slf4j;
import org.apache.shardingsphere.sharding.api.sharding.standard.PreciseShardingValue;
import org.apache.shardingsphere.sharding.api.sharding.standard.RangeShardingValue;
import org.apache.shardingsphere.sharding.api.sharding.standard.StandardShardingAlgorithm;
import org.springframework.stereotype.Component;

import java.util.Collection;
import java.util.Properties;

@Slf4j
@Component
public class CustomDSShardingAlgorithm implements StandardShardingAlgorithm<String> {

    private Properties properties;

    @Override
    public String getType() {
        return "STANDARD";
    }

    @Override
    public Properties getProps() {
        return properties;
    }

    @Override
    public void init(Properties properties) {
        this.properties = properties;
    }


    @Override
    public String doSharding(Collection<String> availableTargetNames, PreciseShardingValue<String> shardingValue) {
        String zoneVal = shardingValue.getValue();
        String colName = shardingValue.getColumnName();
        Integer index = Integer.valueOf(zoneVal);
        for (String availableTargetName : availableTargetNames) {
            if (availableTargetName.endsWith(index + "")) {
                return availableTargetName;
            }
        }
        throw new IllegalArgumentException("分区不支持");
    }

    @Override
    public Collection<String> doSharding(Collection<String> availableTargetNames, RangeShardingValue<String> shardingValue) {
        return availableTargetNames;
    }
}
