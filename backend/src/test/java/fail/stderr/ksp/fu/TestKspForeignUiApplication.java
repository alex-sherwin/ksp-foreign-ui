package fail.stderr.ksp.fu;

import org.springframework.boot.SpringApplication;

public class TestKspForeignUiApplication {

	public static void main(String[] args) {
		SpringApplication.from(KspForeignUiApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
