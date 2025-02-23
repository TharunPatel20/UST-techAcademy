package jwt.security.config;

import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.Customizer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class WebSecurityConfig {

	private final UserDetailsService userDetailsService;
	
    
    public WebSecurityConfig(UserDetailsService userDetailsService) {
        this.userDetailsService = userDetailsService;
//        this.jwtAuthenticationFilter = jwtAuthenticationFilter;
    }

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http.csrf(csrf->csrf.disable())
            .authorizeHttpRequests(auth -> 
                auth.requestMatchers("user/register", "user/login","welcome").permitAll() // Public APIs
                    .anyRequest().authenticated() // Secure all other APIs
            )
            .formLogin(login->login.disable())
            .httpBasic(Customizer.withDefaults());
        return http.build();
    }
    
    
//    @Bean
//	public UserDetailsService setUserDetails() {
		
// 		password encoder prefix error
//		UserDetails user1 = User.builder().username("user1").password("password").roles("User").build();
//		UserDetails user2 = User.builder().username("user2").password("password").roles("User").build(); 
    	
//		password encoders : bcrypt, noop, sha-1, sha-256 ...
//		UserDetails user1 = User.builder().username("user1").password("{noop}password").roles("User").build();
//		UserDetails user2 = User.builder().username("user2").password("{noop}password").roles("User").build(); 
    
//		return new InMemoryUserDetailsManager(user1,user2);
//	}
    @Bean
    public BCryptPasswordEncoder bCryptPasswordEncoder() {
        return new BCryptPasswordEncoder();
    }
    
    @Bean
    public AuthenticationProvider authenticationProvider() {
        DaoAuthenticationProvider provider
                = new DaoAuthenticationProvider();
        provider.setUserDetailsService(userDetailsService);
        //provider.setPasswordEncoder(NoOpPasswordEncoder.getInstance());
        provider.setPasswordEncoder(bCryptPasswordEncoder());
        return provider;
    }
}
