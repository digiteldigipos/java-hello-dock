package digitel.digipos.hellodock;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.xml.ws.Response;

@SpringBootApplication
@RestController
public class HelloDockApplication {

    public static void main(String[] args) {
        SpringApplication.run(HelloDockApplication.class, args);
    }

    @GetMapping("/hello")
    public ResponseEntity hello(@RequestParam(name = "name", required = false) String name){
        return ResponseEntity.ok(
                String.format("Hello, %s", name != null ? name : "who are you?")
        );
    }
}
