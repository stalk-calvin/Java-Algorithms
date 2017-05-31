/*
 * Copyright Calvin Lee Since 2017.
 * All Rights Reserved.
 */

package org.calvin.LoadingProperties.ApacheCommons;

import lombok.experimental.Builder;
import org.apache.commons.configuration.ConfigurationException;
import org.apache.commons.configuration.PropertiesConfiguration;
import org.apache.commons.lang3.Validate;

@Builder
public class Config {
    private String configFilename;

    public PropertiesConfiguration readPropertiesFile() throws ConfigurationException {
        Validate.notEmpty(configFilename);
        return new PropertiesConfiguration(configFilename);
    }
}
