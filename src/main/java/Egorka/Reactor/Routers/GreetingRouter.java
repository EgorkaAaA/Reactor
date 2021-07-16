package Egorka.Reactor.Routers;

import Egorka.Reactor.Handler.GreetingHandler;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.server.*;

@Configuration
public class GreetingRouter {

    @Bean
    public RouterFunction<ServerResponse> route(GreetingHandler greetingHandler) {
        RequestPredicate route =
                RequestPredicates
                        .GET("/hello")
                        .and(RequestPredicates.accept(MediaType.APPLICATION_JSON));

        return RouterFunctions
                .route(route, greetingHandler::getResponse);
    }
}
