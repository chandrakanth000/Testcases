package com.institute.fundtransfer.FundTransfering.dataTransfer;
import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(name= ForexServiceRemoteClient.SERVICE_NAME,configuration=FeignConfig.class)

public interface ServiceRemote {
    @RequestMapping(method=RequestMethod.POST,value="api/fx")
	@CircuitBreaker(name=SERVICE_NAME)
	public ForexResponse getForexRates(@RequestBody ForexRequest fxReq);

}

