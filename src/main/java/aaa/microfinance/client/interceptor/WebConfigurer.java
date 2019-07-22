package aaa.microfinance.client.interceptor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
@Configuration
public class WebConfigurer implements WebMvcConfigurer {
   @Autowired
    private UserInfoInterceptor userInfoInterceptor;

   @Autowired
   private ServerInterceptor serverInterceptor;

    // 这个方法是用来配置静态资源的，比如html，js，css，等等
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        /*registry.addResourceHandler("/css/**").addResourceLocations("classpath:/css/");*/
    }

    // 这个方法用来注册拦截器，我们自己写好的拦截器需要通过这里添加注册才能生效
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        //注册客户端拦截器
        registry.addInterceptor(userInfoInterceptor).addPathPatterns ("/client/**").excludePathPatterns("/client/aboutus","/client/login", "/client/register","/client/index","/client/top","/client/foot","/client/userlogin","/client/userregister","/client/dropout");
        //注册客户端拦截器
        registry.addInterceptor(serverInterceptor).addPathPatterns ("/server/**").excludePathPatterns("/server/sysLogin","/server/checkSysLogin");
    }

}
