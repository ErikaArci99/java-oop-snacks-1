// Snack 2: Gestione di un Conto
// Crea una classe ContoBancario con attributi per numero di conto e saldo. Implementa un costruttore che accetta il numero di conto e inizializza il saldo a zero. Aggiungi metodi pubblici per depositare denaro sul conto, prelevare denaro dal conto e ottenere il saldo corrente.

package org.lessons.java.snack;

public class ContoBancario {

    // Attributi della classe ContoBancario
    private String numeroConto;
    private double saldo;

    // Costruttore che accetta il numero di conto e inizializza il saldo a zero
    public ContoBancario(String numeroConto) {
        this.numeroConto = numeroConto;
        this.saldo = 0.0;
    }

    // Metodo per depositare denaro sul conto
    public void deposita(double importo) {
        if (importo > 0) {
            saldo += importo;
            System.out.println("Deposito di " + importo + " effettuato. Saldo attuale: " + saldo);
        } else {
            System.out.println("Importo non valido per il deposito.");
        }
    }
}
