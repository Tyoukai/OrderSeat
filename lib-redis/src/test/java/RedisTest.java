import com.orderseat.redis.service.RedisService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.alibaba.fastjson.JSONObject;

public class RedisTest {

    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("orderseat-redis-config.xml");

        RedisService redisService = (RedisService) ac.getBean("redisService");

        JSONObject jsonObject = new JSONObject();
        jsonObject.put("id", "1");
        jsonObject.put("userId", "2");

        redisService.set("orderseat-1", jsonObject.toString());

        System.out.println(redisService.get("orderseat-1"));

    }
}
