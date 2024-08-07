package me.jet.ocr.strategy;

import lombok.extern.slf4j.Slf4j;
import org.apache.shardingsphere.sharding.algorithm.sharding.classbased.ClassBasedShardingAlgorithmStrategyType;
import org.apache.shardingsphere.sharding.api.sharding.standard.PreciseShardingValue;
import org.apache.shardingsphere.sharding.api.sharding.standard.RangeShardingValue;
import org.apache.shardingsphere.sharding.api.sharding.standard.StandardShardingAlgorithm;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

import java.util.Collection;
import java.util.List;
import java.util.Properties;

@Slf4j
@ComponentScan
public class CustomDSShardingAlgorithm implements StandardShardingAlgorithm<String> {

    @Override
    public String getType() {
        return StandardShardingAlgorithm.super.getType();
    }

    @Override
    public Collection<String> doSharding(Collection<String> collection, RangeShardingValue<String> rangeShardingValue) {
        return List.of();
    }

    @Override
    public String doSharding(Collection<String> collection, PreciseShardingValue<String> preciseShardingValue) {
        log.info("分区值：{}", preciseShardingValue.getValue());
        Long shardingVal = Long.valueOf(preciseShardingValue.getValue());
        String columnName = preciseShardingValue.getColumnName();
        for (String tbName : collection) {
            long tbIndex = shardingVal % 4 + 1;
        }
        return null;
    }

    @Override
    public Properties getProps() {
        return null;
    }

    @Override
    public void init(Properties properties) {

    }
}
