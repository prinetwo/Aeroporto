package view;

import java.util.concurrent.Semaphore;

import controller.Aviao;
import controller.Pista;

public class Main {
	public static void main(String[] args) {
		Semaphore semaforosul = new Semaphore(1);
		Semaphore semaforonorte = new Semaphore(1);
		
		Pista pista[] = new Pista[2];
		pista[0] = new Pista(0, "Norte", semaforosul);
		pista[1] = new Pista(1, "Sul", semaforonorte);
		
		int pistaviao;
		
		for (int i = 0; i < 12; i ++){
			pistaviao = (int)(Math.random() * 2) + 1;
			Thread aviao = new Aviao(i + 1, ((pistaviao == 1) ? pista[1]:pista[0]));
			aviao.start();
		}
	}

}
