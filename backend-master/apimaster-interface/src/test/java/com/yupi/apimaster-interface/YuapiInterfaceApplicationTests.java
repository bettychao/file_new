package com.api_master.api_masterinterface;

import com.api_master.api_masterclientsdk.client.api_masterClient;
import com.api_master.api_masterclientsdk.model.User;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

/**
 * 测试类
 *
 *
 */
@SpringBootTest
class api_masterInterfaceApplicationTests {

    @Resource
    private api_masterClient api_masterClient;

    @Test
    void contextLoads() {
        String result = api_masterClient.getNameByGet("api_master");
        User user = new User();
        user.setUsername("User");
        String usernameByPost = api_masterClient.getUsernameByPost(user);
        System.out.println(result);
        System.out.println(usernameByPost);
    }

}
