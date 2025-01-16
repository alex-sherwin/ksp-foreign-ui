package fail.stderr.ksp.fu.servlets;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class PingServlet {

  @GetMapping("/api/ping")
  public ResponseEntity<Map<String, String>> ping() {
    final HashMap<String, String> m = new HashMap<>();
    m.put("ping", "pong");
    return ResponseEntity.ok(m);
  }

}
