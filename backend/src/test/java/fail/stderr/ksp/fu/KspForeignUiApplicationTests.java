package fail.stderr.ksp.fu;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;

@Import(TestcontainersConfiguration.class)
@SpringBootTest
class KspForeignUiApplicationTests {

	@Test
	void contextLoads() {
	}

}
