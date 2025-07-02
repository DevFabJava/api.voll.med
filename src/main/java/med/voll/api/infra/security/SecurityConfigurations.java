package med.voll.api.infra.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfigurations {

    @Bean // A anotação @Bean é essencial aqui
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        return http
                // 1. A sintaxe .csrf().disable() foi substituída pela expressão lambda.
                .csrf(csrf -> csrf.disable())

                // 2. A sintaxe .sessionManagement()... foi substituída pela expressão lambda.
                .sessionManagement(session -> session.sessionCreationPolicy(SessionCreationPolicy.STATELESS))

                // 3. O método .and() não é mais necessário.
                //    O método .build() é chamado no final da cadeia principal.
                .build();
    }
}