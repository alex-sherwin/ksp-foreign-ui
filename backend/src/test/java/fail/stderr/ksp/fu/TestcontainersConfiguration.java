package fail.stderr.ksp.fu;

import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.context.annotation.Bean;
import org.testcontainers.containers.NginxContainer;
import org.testcontainers.utility.MountableFile;

import java.util.List;

@TestConfiguration(proxyBeanMethods = false)
class TestcontainersConfiguration {

  @Bean
  public NginxContainer<?> nginxContainer() {
    final NginxContainer<?> c = new NginxContainer<>("nginx:1.26")
      .withCopyFileToContainer(MountableFile.forClasspathResource("nginx.conf"), "/etc/nginx/conf.d/default.conf");
    c.setPortBindings(List.of("8080:80"));
    return c;
  }

}
