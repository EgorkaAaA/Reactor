package Egorka.Reactor.Handler;

import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Mono;

public interface MonoHandler {
    public Mono<ServerResponse> getResponse(ServerRequest request);
}
