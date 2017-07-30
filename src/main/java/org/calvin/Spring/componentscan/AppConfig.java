package org.calvin.Spring.componentscan;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages="org.calvin.Spring.componentscan")
public class AppConfig {
}