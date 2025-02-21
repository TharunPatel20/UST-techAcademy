package jwt.security.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class WebSecurityConfig {
	
	@Bean
	public SecurityFilterChain securityFilterChain(HttpSecurity httpSecurity ) throws Exception {
		
		
		httpSecurity
				.csrf(csrf-> csrf.disable())
				.authorizeHttpRequests(
						request -> request
						.requestMatchers("register","login").permitAll()
						.anyRequest().authenticated()
				)
				.formLogin(Customizer.withDefaults())
				.httpBasic(Customizer.withDefaults())
				;
		return httpSecurity.build();
	}
	
	
//	inmemory user details manager
	
	@Bean
	public UserDetailsService setUserDetails() {
		
		// password encoder prefix error
//		UserDetails user1 = User.builder().username("user1").password("password").roles("User").build();
//		UserDetails user2 = User.builder().username("user2").password("password").roles("User").build(); 
		
		
//		password encoders : bcrypt, noop, sha-1, sha-256 ...
		UserDetails user1 = User.builder().username("user1").password("{noop}password").roles("User").build();
		UserDetails user2 = User.builder().username("user2").password("{noop}password").roles("User").build(); 
		
		return new InMemoryUserDetailsManager(user1,user2);
	}

}
