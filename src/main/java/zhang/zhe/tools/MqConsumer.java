package zhang.zhe.tools;

import com.rabbitmq.client.Channel;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.rabbit.core.ChannelAwareMessageListener;

/**
 * Created by zzm on 2016/9/7.
 * 暂时没有用到
 */
public class MqConsumer implements ChannelAwareMessageListener {
    @Override
    public void onMessage(Message message, Channel channel) throws Exception {

        channel.basicAck(message.getMessageProperties().getDeliveryTag(), false);

    }
}
