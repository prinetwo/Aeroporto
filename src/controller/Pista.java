package controller;

import java.util.concurrent.Semaphore;

public class Pista {

	private int ID;
	public String nome;
	private Semaphore semaforo;

	public Pista(int ID, String nome, Semaphore semaforo) {
		this.ID = ID;
		this.nome = nome;
		this.semaforo = semaforo;
	}

	public void starta(Aviao aviao) {
		try {
			semaforo.acquire();
			aviao.manobra();
			aviao.taxia();
			aviao.decola();
			aviao.afasta();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}finally{
			semaforo.release();
		}
	}

}
