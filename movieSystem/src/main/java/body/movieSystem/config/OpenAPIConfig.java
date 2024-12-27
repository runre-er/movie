package body.movieSystem.config;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.servers.Server;
import org.springframework.context.annotation.Configuration;

@Configuration
@OpenAPIDefinition(
        info =
        @Info(
                contact = @Contact(name = "Ernur Kaya", email = "ernurkaya9b@gmail.com"),
                description = "OpenApi documentation"),
        servers = {@Server(description = "Local ENV", url = "http://localhost:8080")})
public class OpenAPIConfig {
}
