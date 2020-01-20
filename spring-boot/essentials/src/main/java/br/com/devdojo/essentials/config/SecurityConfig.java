package br.com.devdojo.essentials.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import br.com.devdojo.essentials.service.CustomUserDetailService;

@Configuration
// @EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {


    @Autowired
    private CustomUserDetailService customUserDetailService;

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        // http.authorizeRequests().anyRequest().authenticated().and().httpBasic().and()
        //         .sessionManagement().sessionCreationPolicy(STATELESS);
        http.authorizeRequests()
        .anyRequest().authenticated()//
        .and()//
        .httpBasic()//
        .and()//
        .csrf()//
        .disable();
    }


    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception{
        auth.userDetailsService(customUserDetailService).passwordEncoder(new BCryptPasswordEncoder());
    }

    // @Override
    // protected void configure(AuthenticationManagerBuilder auth) throws Exception {

    //     PasswordEncoder encoder = PasswordEncoderFactories.createDelegatingPasswordEncoder();

    //     auth.inMemoryAuthentication().withUser("lucas").password(encoder.encode("password"))
    //             .roles("USER").and().withUser("admin").password("password").roles("USER", "ADMIN");

    // }

}
