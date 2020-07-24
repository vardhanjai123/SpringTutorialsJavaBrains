package com.jaivardhan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class PersonConfig {


    @Bean(initMethod = "myInit",destroyMethod = "myDestroy")
    @Scope("prototype")
    public Person personSingleton()
    {
        return new Person();
    }
}
