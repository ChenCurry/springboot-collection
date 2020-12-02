import redis.clients.jedis.Jedis;

public class TestPing {
    public static void main(String[] args) {
        Jedis jedis = new Jedis("106.75.32.166",6379);
        jedis.auth("test");
        System.out.println(jedis.ping());

    }
}
