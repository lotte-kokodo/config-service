package shop.kokodo.configservice;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@Slf4j
public class AwsSecretsManagerTest {

    @Value("${encrypt.keystore.location}")
    String encryptKeystoreLocation;

    @Value("${encrypt.keystore.password}")
    String encryptKeystorePassword;

    @Value("${encrypt.keystore.alias}")
    String encryptKeystoreAlias;

    @Test
    @DisplayName("AWS Secrets Manager 보안 암호 값 Read")
    void getAwsSecretsManagerKey () {

        Assertions.assertNotNull(encryptKeystoreLocation);
        Assertions.assertNotNull(encryptKeystorePassword);
        Assertions.assertNotNull(encryptKeystoreAlias);

        log.error("encrypt.keystore.location: {}", encryptKeystoreLocation);
        log.error("encrypt.keystore.password: {}", encryptKeystorePassword);
        log.error("encrypt.keystore.alias: {}", encryptKeystoreAlias);

    }
}
