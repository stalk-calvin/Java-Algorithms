/*
 * Copyright Calvin Lee Since 2017.
 * All Rights Reserved.
 */

package org.calvin.LoadingProperties.Spring;

import java.io.IOException;
import java.util.Properties;
import lombok.experimental.Builder;
import org.apache.commons.lang3.Validate;

import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PropertiesLoaderUtils;

@Builder
public class Config {
    private String configFilename;

    public Properties readPropertiesFile() throws IOException {
        Validate.notEmpty(configFilename);
        Resource resource = new ClassPathResource(configFilename);
        return PropertiesLoaderUtils.loadProperties(resource);
    }
}

