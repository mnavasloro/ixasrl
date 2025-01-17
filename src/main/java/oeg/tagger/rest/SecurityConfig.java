package oeg.tagger.rest;

import oeg.tagger.rest.helper.RequestRejectedExceptionFilter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.web.access.channel.ChannelProcessingFilter;



/**
 * Configuration of the security. 
 * This is for the moment only "in memory": very weak!
 * @author Victor https://dzone.com/articles/securing-spring-data-rest-with-preauthorize
 */
@EnableWebSecurity
@EnableGlobalMethodSecurity(prePostEnabled = true)
public class SecurityConfig extends WebSecurityConfigurerAdapter {
	@Autowired
	public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {

	}
//    protected void configure(HttpSecurity http) throws Exception {
//	    http.authorizeRequests().antMatchers("/internal/**").hasAnyRole("ADMIN","USER").and().httpBasic().and().csrf().disable();		   
//    }
        
    
    @Override
protected void configure(HttpSecurity http) throws Exception {
     http.addFilterBefore(new RequestRejectedExceptionFilter(),
             ChannelProcessingFilter.class);
//             http.requiresChannel().anyRequest().requiresSecure();
     	    http.authorizeRequests().antMatchers("/internal/**").hasAnyRole("ADMIN","USER").and().httpBasic().and().csrf().disable();	

}
}