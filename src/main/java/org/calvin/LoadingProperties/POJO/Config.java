/*
 * Copyright Calvin Lee Since 2017.
 * All Rights Reserved.
 */

package org.calvin.LoadingProperties.POJO;

import java.io.IOException;
import java.util.Properties;
import lombok.experimental.Builder;
import org.apache.commons.lang3.Validate;

@Builder
public class Config {
    private String configFilename;

    public Properties readPropertiesFile() throws IOException {
        Validate.notEmpty(configFilename);
        Properties properties = new Properties();
        properties.load(this.getClass().getClassLoader().getResourceAsStream(configFilename));
        return properties;
    }
}

