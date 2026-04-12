package com.jpmc.midascore.component;

import com.jpmc.midascore.foundation.Transaction;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class TransactionKafkaListener {

    @KafkaListener(topics = "${general.kafka-topic}", groupId = "midas-test-group")
    public void handleTransaction(Transaction transaction) {
        System.out.println("=== TRANSACTION RECEIVED === " + transaction);
    }
}