package Egorka.Reactor.Routers;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.BodyInserters;
import org.springframework.web.reactive.function.server.RequestPredicates;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.RouterFunctions;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Mono;

@Configuration
public class HomeRouter {
//    @Bean
//    public RouterFunctions<ServerResponse> home() {
//        return RouterFunctions.route(RequestPredicates.GET("/"),
//                serverRequest -> {
//                    return ServerResponse
//                            .ok()
//                            .body(BodyInserters.fromValue("Hello, my friend"));
//                });
//    }
}
