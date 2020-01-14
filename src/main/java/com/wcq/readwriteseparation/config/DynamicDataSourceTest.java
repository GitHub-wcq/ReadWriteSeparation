package com.wcq.readwriteseparation.config;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;
import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.stereotype.Component;
import org.springframework.transaction.PlatformTransactionManager;

import com.wcq.readwriteseparation.aspect.DynamicDataSource;

@Component
public class DynamicDataSourceTest {
	
	@Resource(name="datasource1")
	private DataSource datasource1;
	@Resource(name="datasource2")
	private DataSource datasource2;

	
	/**
     * 动态数据源: 通过AOP在不同数据源之间动态切换
     * @return
     */
    @Primary
    @Bean(name = "dynamicDataSource")
    public DataSource dynamicDataSource() {
    	DynamicDataSource dynamicDataSource = new DynamicDataSource();
        // 默认数据源
        dynamicDataSource.setDefaultTargetDataSource(datasource1);
        // 配置多数据源
        Map<Object, Object> dsMap = new HashMap<Object, Object>();
        
        System.out.println(datasource1.toString());
        System.out.println(datasource2.toString());
        dsMap.put("datasource1", datasource1);
        dsMap.put("datasource2", datasource2);

        dynamicDataSource.setTargetDataSources(dsMap);
        return dynamicDataSource;
    }
    
    /**
     * 配置@Transactional注解事物
     * @return
     */
    @Bean
    public PlatformTransactionManager transactionManager() {
        return new DataSourceTransactionManager(dynamicDataSource());
    }
	
}
