package org.spring.learning.aop;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @author 廖水生
 * @date   2022/2/27 19:44
 */
@Configuration
@EnableAspectJAutoProxy
@ComponentScan(basePackages = { "org.spring.learning.aop" })
public class SpringConfig {
}
