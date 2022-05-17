package org.jboss.fuse.tnb.jms.client;

import org.jboss.fuse.tnb.jms.DestinationType;
import org.jboss.fuse.tnb.jms.listener.JMSMessageListener;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageConsumer;
import javax.jms.Session;

import java.util.List;
import java.util.stream.Collectors;

public class JMSTopicClient extends JMSClient {
    private static final Logger LOG = LoggerFactory.getLogger(JMSTopicClient.class);

    private final JMSMessageListener listener = new JMSMessageListener();
    private MessageConsumer consumer;

    public JMSTopicClient(Session session, String topicName) {
        super(session, DestinationType.TOPIC, topicName);
    }

    public void subscribe() {
        try {
            consumer = session.createConsumer(destination);
            consumer.setMessageListener(listener);
            listener.setSubscribed(true);
        } catch (JMSException e) {
            throw new RuntimeException("Unable to subscribe to topic " + destinationName, e);
        }
    }

    @Override
    public Message receiveMessage(long timeout) {
        return listener.next(timeout);
    }

    public List<String> receiveAll() {
        return listener.getMessages().stream().map(this::getBody).collect(Collectors.toList());
    }

    public void close() {
        try {
            producer.close();
            consumer.close();
            session.close();
        } catch (Exception e) {
            LOG.warn("Unable to close topic client", e);
        }
    }
}
