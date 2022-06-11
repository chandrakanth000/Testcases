package com.institute.fundtransfer.Debit.Customer;
@Component
public class Listener {
    @Value("${fundsTransferRequest.topic.name}")
	private String topicName;
	
	@KafkaListener(
	topicPartitions = @TopicPartition(topic="${fundstransfer.topic.name}",partitions= {"0","1","2","3","4"}),
	containerFactory = "fundsTransferReqKafkaListnerContainerFactory")
	
	public void FTMessageListner(moneytransfer tran) {
		
		System.out.println("From Constomer...");
		System.out.println(tran);
		
	}
}
