package Egorka.Reactor.domain;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;

@Data
@Getter
@Setter
@NoArgsConstructor
public class Person {
    @Id
    private long id;

    private String email;
    private String password;

    public Person(String email, String password) {
        this.email = email;
        this.password = password;
    }
}
