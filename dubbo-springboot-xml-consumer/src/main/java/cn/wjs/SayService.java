package cn.wjs;

import org.apache.dubbo.config.annotation.Reference;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SayService  {

    @Reference
    DemoService demoService;

    public String say (String name) {

        return demoService.sayHello(name);
    }

}
