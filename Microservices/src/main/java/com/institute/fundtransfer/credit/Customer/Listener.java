package com.institute.fundtransfer.credit.Customer;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class Listener {
    @Value("${fundsTransferRequest.topic.name}")
	private String topicName;
	
	@KafkaListener(
	topicPartitions = @TopicPartition(topic="${fundstransfer.topic.name}",partitions= {"0","1","2","3","4"}),
	containerFactory = "fundsTransferReqKafkaListnerContainerFactory")
	
	public void FTMessageListner(com.institute.fundtransfer.Credit.pay.moneytransfer tran) {
		
		System.out.println("From Customer...");
		System.out.println(tran);
		
	}
    
}
