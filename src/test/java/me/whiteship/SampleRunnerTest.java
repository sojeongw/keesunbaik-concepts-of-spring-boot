package me.whiteship;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.env.Environment;
import org.springframework.test.context.TestPropertySource;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@TestPropertySource(locations = "classpath:/test.properties")
@SpringBootTest
public class SampleRunnerTest {

    @Autowired
    Environment environment;

    @Test
    void test() {
        assertThat(environment.getProperty("keesun.name")).isEqualTo("keesun2");
    }
}