package message;

import jakarta.ejb.ActivationConfigProperty;
import jakarta.ejb.EJB;
import jakarta.ejb.MessageDriven;
import jakarta.jms.JMSException;
import jakarta.jms.Message;
import jakarta.jms.MessageListener;
import jakarta.jms.ObjectMessage;

@MessageDriven(
        activationConfig = {
                @ActivationConfigProperty(propertyName = "destinationLookup",propertyValue = "iot")
        }
)
public class MessageReceiver implements MessageListener {
    @Override
    public void onMessage(Message message) {

    try {
        String msg = message.getBody(String.class);
        System.out.println(msg);
    } catch (JMSException e) {
        throw new RuntimeException(e);
    }


      //  ObjectMessage objectMessage = (ObjectMessage) message;
    //    IotDevice iotDevice = (IotDevice) objectMessage.getObject();



    }
}
