/*
 * Copyright Calvin Lee Since 2016.
 * All Rights Reserved.
 */

package org.calvin.Cryptography;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import com.google.common.base.Strings;

public class AESEncryptionTest {
    private static final String password = "mypassword";
    @Test
    public void shouldEncryptAndDecrypt() throws Exception {
        String passwordEnc = AESEncryption.encrypt(password);
        assertFalse(Strings.isNullOrEmpty(passwordEnc));
        assertFalse(passwordEnc.equals(password));

        String passwordDec = AESEncryption.decrypt(passwordEnc);
        assertTrue(passwordDec.equals(password));
    }


}
