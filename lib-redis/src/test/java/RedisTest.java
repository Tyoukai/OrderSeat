import com.orderseat.redis.service.RedisService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class RedisTest {

    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("orderseat-redis-config.xml");

        RedisService redisService = (RedisService) ac.getBean("redisService");

        redisService.set("test2", "123");

        System.out.println(redisService.get("key"));

    }
}
