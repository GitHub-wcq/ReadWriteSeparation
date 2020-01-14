package com.wcq.readwriteseparation.config;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.jdbc.DataSourceProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

@Configuration
@EnableConfigurationProperties(DataSourceProperties.class)
public class HikariDataSourceConfig {
	
	@Value("${spring.datasource.url}")
    private String jdbcUrl;
    @Value("${spring.datasource.username}")
    private String user;
    @Value("${spring.datasource.password}")
    private String password;
    @Value("${spring.datasource.hikari.pool-name}")
    private String poolName;
    @Value("${spring.datasource.hikari.maximum-pool-size}")
    private int maxImumPoolSize;
    @Value("${spring.datasource.hikari.minimum-idle}")
    private int minimumIdle;
    @Value("${spring.datasource.hikari.connection-timeout}")
    private int connectionTimeout;
    @Value("${spring.datasource.hikari.idle-timeout}")
    private int idleTimeout;
    @Value("${spring.datasource.hikari.max-lifetime}")
    private int maxLifetime;
    @Value("${spring.datasource.hikari.connection-test-query}")
    private String connectionTestQuery;

    @Bean(name = "datasource1")
    public DataSource dataSource1() {
        HikariConfig config = new HikariConfig();
        config.setJdbcUrl(jdbcUrl); //数据源
        config.setUsername(user); //用户名
        config.setPassword(password); //密码
        config.setPoolName(poolName);
        config.setMaximumPoolSize(maxImumPoolSize);
        config.setMinimumIdle(minimumIdle);
        config.setConnectionTimeout(connectionTimeout);
        config.setIdleTimeout(idleTimeout);
        config.setMaxLifetime(maxLifetime);
        config.setConnectionTestQuery(connectionTestQuery);
        HikariDataSource ds = new HikariDataSource(config);
        System.out.println(ds.toString());
        return ds;
    }
    
    @Value("${spring.datasource2.url}")
    private String jdbcUrl2;
    @Value("${spring.datasource2.username}")
    private String user2;
    @Value("${spring.datasource2.password}")
    private String password2;
    @Value("${spring.datasource2.hikari.pool-name}")
    private String poolName2;
    @Value("${spring.datasource2.hikari.maximum-pool-size}")
    private int maxImumPoolSize2;
    @Value("${spring.datasource2.hikari.minimum-idle}")
    private int minimumIdle2;
    @Value("${spring.datasource2.hikari.connection-timeout}")
    private int connectionTimeout2;
    @Value("${spring.datasource2.hikari.idle-timeout}")
    private int idleTimeout2;
    @Value("${spring.datasource2.hikari.max-lifetime}")
    private int maxLifetime2;
    @Value("${spring.datasource2.hikari.connection-test-query}")
    private String connectionTestQuery2;

    @Bean(name = "datasource2")
    public DataSource dataSource2() {
        HikariConfig config = new HikariConfig();
        config.setJdbcUrl(jdbcUrl2); //数据源
        config.setUsername(user2); //用户名
        config.setPassword(password2); //密码
        config.setPoolName(poolName2);
        config.setMaximumPoolSize(maxImumPoolSize2);
        config.setMinimumIdle(minimumIdle2);
        config.setConnectionTimeout(connectionTimeout2);
        config.setIdleTimeout(idleTimeout2);
        config.setMaxLifetime(maxLifetime2);
        config.setConnectionTestQuery(connectionTestQuery2);
        HikariDataSource ds = new HikariDataSource(config);
        return ds;
    }
    
    
}
