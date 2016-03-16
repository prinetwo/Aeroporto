package controller;

import java.util.concurrent.Semaphore;

public class Aviao extends Thread {

	private int ID;
	private Pista pista;

	public Aviao(int ID, Pista pista) {
		this.ID = ID;
		this.pista = pista;
	}

	@Override
	public void run() {
		Aviao aviao = new Aviao(this.ID, this.pista);
		pista.starta(aviao);
	}

	public void manobra() {
		System.out.println("O avião " + ID + " está manobrando na pista "
				+ pista.nome + "!");
		try {
			Thread.sleep((int) (Math.random() * 7011) + 3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public void taxia() {
		System.out.println("O avião " + ID + " está taxiando na pista "
				+ pista.nome + "!");
		try {
			Thread.sleep((int) (Math.random() * 10111) + 5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public void decola() {
		System.out.println("O avião " + ID + " está decolando na pista "
				+ pista.nome + "!");
		try {
			Thread.sleep((int) (Math.random() * 4011) + 1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public void afasta() {
		System.out.println("O avião " + ID + " está se afastando!");
		try {
			Thread.sleep((int) (Math.random() * 8011) + 3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
