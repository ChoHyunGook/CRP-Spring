package crp.kr.api.security.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;

/**
 * packageName:crp.kr.api.config
 * fileName        :WebSecurityConfig
 * author           : chohyungook
 * date               :2022-05-23
 * desc            :
 * ================================
 * DATE              AUTHOR        NOTE
 * ================================
 * 2022-05-23chohyungook최초 생성
 */
@Configuration
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {//외부 시크리티
    @Override
    public void configure(WebSecurity web) throws Exception {
        web.ignoring()
                .antMatchers(HttpMethod.OPTIONS,"*/**")
                .antMatchers("/");
    }
    @Override
    public void configure(HttpSecurity http) throws Exception {
        http.csrf().disable();//털렸었음
        http.sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS);//무상태
        http.authorizeRequests()
                .antMatchers("/users/join").permitAll()//홈만보고 조인은 들어가게해라
                .antMatchers("/users/login").permitAll()//홈만보고 로그인은 들어가게해라
                .anyRequest().authenticated();//그외는 로그인하고 보게해라
        http.exceptionHandling().accessDeniedPage("/users/login");//다른거 누르면 로그인페이지로 보내라
    }
}
