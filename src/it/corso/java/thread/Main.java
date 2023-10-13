package it.corso.java.thread;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.Future;

import it.corso.java.thread.concorrenza.GetSitePage;
import it.corso.java.thread.concorrenza.GetSitePageExecutor;
import it.corso.java.thread.concorrenza.GetSitePageForkJoin;

public class Main {

	public static void main(String[] args) {
		Main m = new Main();
		
		try {
			m.esempioConcorrenzaThread();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			m.esempioConconrrenzaExecutor();
		} catch (InterruptedException e) {
			e.printStackTrace();
		} catch (ExecutionException e) {
			e.printStackTrace();
		}
		
		m.esempioConcorrenzaForkJoin();
	}
	
	@SuppressWarnings("unused")
	private void esempioConcorrenzaForkJoin() {
		@SuppressWarnings("resource")
		ForkJoinPool f = new ForkJoinPool();
		
		System.out.println(f.invoke(new GetSitePageForkJoin("http://www.paolopreite.it")));
		System.out.println(f.invoke(new GetSitePageForkJoin("http://www.google.it")));
		
		f.shutdown();
	}
	
	@SuppressWarnings("unused")
	private void esempioConconrrenzaExecutor() throws InterruptedException, ExecutionException {
		List<Callable<String>> siti = new ArrayList<Callable<String>>();
		
		siti.add(new GetSitePageExecutor("http://www.paolopreite.it"));
		siti.add(new GetSitePageExecutor("http://www.google.it"));
		
		ExecutorService ex = Executors.newSingleThreadExecutor();
		
		List<Future<String>> out = ex.invokeAll(siti);
		
		for (Future<String> future : out) {
			System.out.println(future.get());
		}
		
		ex.shutdown();
	}
	
	private void esempioConcorrenzaThread() throws InterruptedException {
		
		GetSitePage s1 = new GetSitePage("http://www.paolopreite.it");
		GetSitePage s2 = new GetSitePage("http://www.google.it");
		
		s1.start();
		s2.start();
		
		s1.join();
		s2.join();
	
		System.out.println("OUTPUT PAOLOPREITE");
		System.out.println(s1.getContent());
		
		System.out.println("OUTPUT GOOGLE");
		System.out.println(s2.getContent());
	}
	
	@SuppressWarnings("unused")
	private void esempioThread() {
		EsempioThread et = new EsempioThread();
		
		et.start();
		
		Thread t = new Thread(new EsempioRunnable());
		
		t.start();	
	}
	
	@SuppressWarnings("unused")
	private void esempioMultiThread() {
		EsempioThread et1 = new EsempioThread();
		et1.setName("Thread 1");
		
		EsempioThread et2 = new EsempioThread();
		et2.setName("Thread 2");
		
		EsempioThread et3 = new EsempioThread();
		et3.setName("Thread 3");
		
		EsempioThread et4 = new EsempioThread();
		et4.setName("Thread 4");
		
		EsempioThread et5 = new EsempioThread();
		et5.setName("Thread 5");

		et1.start();
		et2.start();
		et3.start();
		et4.start();
		et5.start();
	}
}
