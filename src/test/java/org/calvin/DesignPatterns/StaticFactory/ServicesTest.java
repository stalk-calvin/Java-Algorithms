/*
 * Copyright Calvin Lee - 2016.
 * All Rights Reserved.
 */

package org.calvin.DesignPatterns.StaticFactory;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.assertEquals;

public class ServicesTest {

    @Rule
    public ExpectedException expectedException = ExpectedException.none();

    private static final Provider DEFAULT_PROVIDER = new Provider() {
        public Service newService() {
            return new Service() {
                public String deliver() {return "DP"; }
                @Override
                public String toString() {
                    return "Default service";
                }
            };
        }
    };

    private static final Provider COMP_PROVIDER = new Provider() {
        public Service newService() {
            return new Service() {
                public String deliver() {return "CP";}
                @Override
                public String toString() {
                    return "Complementary service";
                }
            };
        }
    };

    private static final Provider ARMED_PROVIDER = new Provider() {
        public Service newService() {
            return new Service() {
                public String deliver() {return "AP";}
                @Override
                public String toString() {
                    return "Armed service";
                }
            };
        }
    };

    @Test
    public void shouldRegisterForServicesForEachDifferentProviders() {
        Services.registerDefaultProvider(DEFAULT_PROVIDER);
        Services.registerProvider("comp", COMP_PROVIDER);
        Services.registerProvider("armed", ARMED_PROVIDER);

        Service s1 = Services.newInstance();
        Service s2 = Services.newInstance("comp");
        Service s3 = Services.newInstance("armed");
        assertEquals("DP", s1.deliver());
        assertEquals("CP", s2.deliver());
        assertEquals("AP", s3.deliver());
    }

    @Test
    public void shouldNotGetAServiceIfUnknown() {
        expectedException.expect(IllegalArgumentException.class);
        expectedException.expectMessage("No provider");
        Services.registerDefaultProvider(DEFAULT_PROVIDER);
        Services.registerProvider("comp", COMP_PROVIDER);
        Services.registerProvider("armed", ARMED_PROVIDER);

        Service s1 = Services.newInstance();
        Service s2 = Services.newInstance("??");
        Service s3 = Services.newInstance("unknown");
    }
}