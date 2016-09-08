package zhang.zhe.dubbo.provider;

/**
 * Created by zzm on 2016/9/8.
 */
public class DemoServiceImpl implements DemoService {
    @Override
    public String sayHello(String name) {
        return "Hello Dubbo,Hello " + name;
    }
}
