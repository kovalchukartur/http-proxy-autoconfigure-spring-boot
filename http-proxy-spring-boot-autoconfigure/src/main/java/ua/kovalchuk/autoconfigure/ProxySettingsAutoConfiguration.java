package ua.kovalchuk.autoconfigure;

import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import ua.kovalchuk.ProxySettings;

@Configuration
@ConditionalOnClass({ProxySettings.class})
public class ProxySettingsAutoConfiguration {

    @ConditionalOnMissingBean(ProxySettings.class)
    @Bean(initMethod = "init")
    public ProxySettings proxySettings() {
        return new ProxySettings();
    }

}
