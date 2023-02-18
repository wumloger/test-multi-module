package top.wuml.ajax;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;

public class main {
    public static void main(String[] args) {
        User user = new User();
        user.setName("wuml");
        user.setAge(11);
        user.setAddress("南京");
        String jsonString = JSON.toJSONString(user);
        System.out.println(jsonString);
        User userjson = JSON.parseObject(jsonString,User.class);
        System.out.println(userjson);

    }
}
