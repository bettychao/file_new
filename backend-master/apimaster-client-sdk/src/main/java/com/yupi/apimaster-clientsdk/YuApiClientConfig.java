package com.api_master.api_masterclientsdk;

import com.api_master.api_masterclientsdk.client.api_masterClient;
import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * api_master 客户端配置
 *
 *
 */
@Configuration
@ConfigurationProperties("api_master.client")
@Data
@ComponentScan
public class api_masterClientConfig {

    private String accessKey;

    private String secretKey;

    @Bean
    public api_masterClient api_masterClient() {
        return new api_masterClient(accessKey, secretKey);
    }

}
