package project;

import lombok.Data;

@Data
public class CharStatus {
    
	private int hungry; 
	private int fun; 
	private int sleep;
	
	public CharStatus() {
	      hungry = 100; 
	      fun = 100; 
	      sleep = 100;
	}
}
