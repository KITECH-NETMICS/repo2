/**
 * 
 */
package kr.re.kitech.biz.api.server.service;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import kr.re.kitech.biz.api.server.enums.AprProcess;

/**
 * 
 * @author James
 * @since 2022. 6. 29.
 */
@Component
public class BpmPostFactory {
  private Map<AprProcess, BpmPostProcess> processes;
  
  @Autowired
  public BpmPostFactory(Set<BpmPostProcess> processSet) {
     this.createProcess(processSet);
     System.out.println("생성: " + processes);
  }
  
  public BpmPostProcess findProcess(AprProcess type) {
     return this.processes.get(type);
  }
  
  private void createProcess(Set<BpmPostProcess> processSet) {
      this.processes = new HashMap<AprProcess, BpmPostProcess>();
      processSet.forEach( process -> {
    	  processes.put(process.getAprProcess(), process);
    	  System.out.println("PUT: " + process.getAprProcess());
	  });
  }
}