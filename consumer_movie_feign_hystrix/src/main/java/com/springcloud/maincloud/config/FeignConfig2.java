package com.springcloud.maincloud.config;

import com.springcloud.maincloud.ExcludeFromComponentScan;
import feign.Contract;
import feign.auth.BasicAuthRequestInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@ExcludeFromComponentScan
public class FeignConfig2
{
    @Bean
    public Contract feignContract()
    {
        return new feign.Contract.Default();
    }

    @Bean
    public BasicAuthRequestInterceptor basicAuthRequestInterceptor()
    {
        return new BasicAuthRequestInterceptor("alex", "becauseofyou7");
    }
}
