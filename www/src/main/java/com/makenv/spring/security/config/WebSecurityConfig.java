package com.makenv.spring.security.config;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.annotation.web.servlet.configuration.EnableWebMvcSecurity;
import org.springframework.security.web.util.AntPathRequestMatcher;

@Configuration
@EnableWebMvcSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {
	@Override
	protected void configure(HttpSecurity http) throws Exception {
//		http.authorizeRequests().antMatchers("/", "home").permitAll();
//		http.formLogin().loginPage("/login").permitAll().and().logout()
//				.permitAll();
//			http.authorizeRequests()
//					.anyRequest().authenticated()
//					.and()
//					.formLogin()
//					.loginPage("/login")
//					.permitAll()
//					.and()
//					.httpBasic();
//			http.authorizeRequests().antMatchers("/login").permitAll()
//					.anyRequest().fullyAuthenticated().and().formLogin()
//					.loginPage("/login").failureUrl("/login?error").and()
//					.logout()
//					.logoutRequestMatcher(new AntPathRequestMatcher("/logout"))
//					.and().exceptionHandling()
//					.accessDeniedPage("/access?error");
//			http.authorizeRequests()
//					.antMatchers("/admin/**").access("hasRole('ROLE_ADMIN')")
//					.antMatchers("/dba/**").access("hasRole('ROLE_ADMIN') or hasRole('ROLE_DBA')")
//					.and().formLogin();
			http
				.authorizeRequests()
				.antMatchers("/","/home","/login").permitAll()
				.antMatchers("/admin/index").hasRole("USERS")
				.antMatchers("/admin/detial").hasRole("USERS")
				.antMatchers("/admin/**").hasRole("ADMIN")
				.anyRequest().authenticated().and()
			.formLogin().loginPage("/login").failureUrl("/login?error").permitAll()
				.and().logout()
				.permitAll()
				.and()
				.httpBasic();
	}

	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth.inMemoryAuthentication().withUser("user").password("111").roles("USERS");
		auth.inMemoryAuthentication().withUser("admin").password("111").roles("USERS","ADMIN");
		auth.inMemoryAuthentication().withUser("root").password("111").roles("ADMIN");

	}
}
