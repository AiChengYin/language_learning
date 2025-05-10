package com.yinaicheng;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceTransactionManagerAutoConfiguration;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;
/**
 * @author yinaicheng
 */
@SpringBootApplication(exclude={DataSourceAutoConfiguration.class, DataSourceTransactionManagerAutoConfiguration.class})
@ServletComponentScan /*让项目扫描到Druidservlet，以便可以访问Druid连接池的UI页面*/
@EnableAsync /* 启用异步 */
@EnableCaching /* @EnableCaching开启缓存支持 */
@EnableScheduling /* 启用定时任务的配置 */
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
