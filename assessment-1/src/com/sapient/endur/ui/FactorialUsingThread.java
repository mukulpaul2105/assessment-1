package com.sapient.endur.ui;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class FactorialUsingThread {

	private static final Integer number=5;
	public static void main(String[] args) {
		
		ExecutorService executorService= Executors.newSingleThreadExecutor();
		Future<Long> future= executorService.submit( ()->{
			long fact=1;
			int n=number;
			while(n>0) {
				fact=fact* n--;
			}
			return fact;
		});
		try {
			System.out.println(future.get());
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		} catch (ExecutionException e) {
			
			e.printStackTrace();
		}
	}

}
