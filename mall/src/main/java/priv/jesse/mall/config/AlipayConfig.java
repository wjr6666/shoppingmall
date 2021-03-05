package priv.jesse.mall.config;

import java.io.FileWriter;
import java.io.IOException;

public class AlipayConfig {

    // 应用ID,您的APPID，收款账号既是您的APPID对应支付宝账号,开发时使用沙箱提供的APPID，生产环境改成自己的APPID
    public static String APP_ID = "2016102800774598";

    // 商户私钥，您的PKCS8格式RSA2私钥
    public static String APP_PRIVATE_KEY = "MIIEvQIBADANBgkqhkiG9w0BAQEFAASCBKcwggSjAgEAAoIBAQCfvZK2hVRvECBB8H8PoFbVeAtnuxQUk1bXA7i3WNWwgsxLAGwes/gLY5E6NVi2lRkHA3xUhhG2H0ki28fn9tddRIIC20pIlgYEVfNfR+zwr5GMd/AKXZ696LKFLU4zBIiU571GTG+VJnowOecnSNnSF6Jk+JddGTgU+Zi4lEwnNScz2yeB8tNC9XJrVdTG8AYTv4VABLrauJ5b3MVPyE643B9iT5aCPs3B3yPabEg8hRBgoIissPlVwNYahQaOhiRuE1d6qjJfebA/ktG9I5t35PD7ziecAPHhSwWMG1OM91HlFuSuc6xo54I+y7ueco/Of7RJ9lb5q3W40UioyiAFAgMBAAECggEAYJM2Tg8R2wu+1N7XktT3apvnGVGrdD0X9WqUlJSqrMqHRJj+xRk9T3Vk6fIyrkA6H1lmI5vivV7w0phZpc5AqmyuxZdas8Ov45MrTmGnyGP89RXWFA5B2MMEmyum6YVGJfBtKEEx/NSEbv+y1rdeqXwMfEsnB+wlUdkNEhrmZ5Tvbzjpy+K3Ussn0zca3r9FrsnO1OIDsrRxVAjLPSYY+h56JxFqDLdHkHU35V5PY8xg++uMvFJOtvvjeVvvI+25bVT/58AlE3c42SIeto4sdiYK0yxFbTl0ovtV5q2JuJ4E2DX0CKLLcW4JFmReuy30d07Bv/0HqPcuL+9upZPpAQKBgQDe4K2/+CTD+qVdxS96ChCo5LqyGReCe6gsE1JGcSsSNw7JYHn/zVqXVBgpJxyeoG3co+VUJ96NByKeHPW/xcAs/Ij2DYDrsvBquN42W7JEKH3lIV4MJeMTMyd8Wfzl436uwDee67jgZ0evPtXd7FuZpsTJV1rpE8+kIFIN0QjFYQKBgQC3etvimnVNhL8XLeqdbgVW3UbfSA2wkXWm9remb/4FrVcYzE0B9ZV58tTKbrtw5NSpPG/kDbzp+q9dB7UVWFu2UnkYgIf6Fk1CXvNoz+HfiHNNl9fa5JG3ra/MvVUZaKfVEtc1IEfKIZWFnpU22SYYeykLzcYqPNuawoxKVHM5JQKBgCoJhJwFqKGSP+h8zaSeC2Bfq9r1opqIykJt7oG8zJvl6JMQ8FHQILsUMG5qoxpENhR8kT+bOX2uD9h0q+Fc4g9aHlcSWvOZz4DBl5/3EZuLa5tw/LUb3EV9y3/H1Uxi6Tz6okMGQNuKf1nNZzcxYmGLs+gp4sq9YteZBQD4IUhhAoGAI6UeqrtPJqwvY5VsCwGgz+tVJXOeFTttG+66Zv9C3l96mDq4izTmwTZH2LwCdkA+gFJZenigxuQIxY4FxAvSZW1IUVZHFHLYt5gyuZ4JR5/+pohlSwU0ufZoPOJbcgA++soaPRv0VnSH09mnK2ysVf03UC+9297O2xYIozgc2nECgYEAjSdPFsFDAbv6i1fN47bksHihUYEOCiw9lqm4MuZnfQQX9mr/SYoHzxx7wXYxGbGrjbBMrOoNL/8QmrZaMrWTzL03a3Z0LrF6piaeOG0B1F61H2EchcmqrnizbA1M2rgZnny14A+5YT5j2MYlgYuJw3oYFweQ8T4W6ylh7X3Y6RI=";

    // 支付宝公钥,查看地址：https://openhome.alipay.com/platform/keyManage.htm 对应APPID下的支付宝公钥。
    public static String ALIPAY_PUBLIC_KEY = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAhTFxsTlbsXhYJstR3n1ecgwvxKLbeZHWt20EAEA60LSJONXSBYyx8Giiq3zr2MnmrlosCCTH66z+NQFF51x27q96jlVSkzKW22wPjrDOVd9zjJRdyxSyzzwKKzjOEbrczTA8bY8VEh7BEg3HusbvrT0dR5RhsWPv9sKWdyRHoSCUod0p0cPULbW3mdt+EVvW5jXCHZtnAEbhbJ4P49OBBYux1fNyUPYSopY/s8LTG2ZXP1/gq+8gRwp23TcLsBkyJQTCJdo0F1XKUBvsCf/fibpS3s0AI4lK9hCZ+HFgg/Vy+fTBuU9MAKSA2d6TN+vyX/rB8HGXOy6qm0LrmykEqwIDAQAB";

    // 服务器异步通知页面路径  需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
    public static String notify_url = "http://www.baidu.com";

    // 页面跳转同步通知页面路径 需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问(其实就是支付成功后返回的页面)
    public static String return_url = "http://localhost:/mall/order/toList.html";

    // 签名方式
    public static String sign_type = "RSA2";

    // 字符编码格式
    public static String CHARSET = "utf-8";

    // 支付宝网关，这是沙箱的网关
    public static String gatewayUrl = "https://openapi.alipaydev.com/gateway.do";

    // 支付宝网关
    public static String log_path = "C:\\";


//↑↑↑↑↑↑↑↑↑↑请在这里配置您的基本信息↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑

    /**
     * 写日志，方便测试（看网站需求，也可以改成把记录存入数据库）
     * @param sWord 要写入日志里的文本内容
     */
    public static void logResult(String sWord) {
        FileWriter writer = null;
        try {
            writer = new FileWriter(log_path + "alipay_log_" + System.currentTimeMillis()+".txt");
            writer.write(sWord);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (writer != null) {
                try {
                    writer.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

}
