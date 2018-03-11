package com.divine.singleton;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Main {
	
	public static void main(String[] args) {
			
		ScheduledExecutorService scheduledService = Executors.newSingleThreadScheduledExecutor();
		
		scheduledService.scheduleAtFixedRate(new Runnable() {
			
			@Override
			public void run() {
				ExecutorService service = Executors.newCachedThreadPool();
				for(int i=0; i<2; i++) {
					Future<?> future = service.submit(new Runnable() {
						
						@Override
						public void run() {
							Connection conn = Connection.getInstance();
							System.out.println(conn);
						}
					});
					
					System.out.println("Thread hashcode = "+future.hashCode());
				}
				
			}
		}, 0, 10, TimeUnit.SECONDS);
	}
}
