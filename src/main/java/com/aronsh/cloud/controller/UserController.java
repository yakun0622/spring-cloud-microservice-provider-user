package com.aronsh.cloud.controller;

import com.aronsh.cloud.dao.UserRepository;
import com.aronsh.cloud.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wangyakun
 * @date 2017/12/27.
 */
@RestController
public class UserController {
    @Autowired
    private DiscoveryClient discoveryClient;

    @Autowired
    private UserRepository userRepository;

    /**
     * 注：@GetMapping("/{id}")是spring 4.3的新注解等价于：
     * @RequestMapping(value = "/id", method = RequestMethod.GET)
     * 类似的注解还有@PostMapping等等
     * @param id
     * @return
     */
    @GetMapping("/{id}")
    @ResponseBody
    public User findById(@PathVariable Long id){
        User user = userRepository.findOne(id);
        return user;
    }

    /**
     * 本地服务实例的信息
     * @return
     */
    @GetMapping("/instance-info")
    public ServiceInstance showInfo(){
        return discoveryClient.getLocalServiceInstance();
    }
}
