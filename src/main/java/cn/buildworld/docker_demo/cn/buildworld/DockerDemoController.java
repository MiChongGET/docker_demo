package cn.buildworld.docker_demo.cn.buildworld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author MiChong
 * @Email: 1564666023@qq.com
 * @Create 2019-07-15 16:24
 * @Version: V1.0
 */
@RestController
public class DockerDemoController {
    @GetMapping("/")
    public String index (){
        return "hello world，Jenkins && Docker协同开发部署完成！流程跑成功！！！";
    }
}
