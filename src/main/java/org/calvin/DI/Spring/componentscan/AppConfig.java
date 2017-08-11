package org.calvin.DI.Spring.componentscan;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages="org.calvin.DI.Spring.componentscan")
public class AppConfig {
}