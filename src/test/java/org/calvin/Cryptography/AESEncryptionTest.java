/*
 * Copyright Calvin Lee - 2016.
 * All Rights Reserved.
 */

package org.calvin.Cryptography;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

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