// Snack 3: Registro Studenti
// Crea una classe RegistroStudenti che rappresenti un registro di studenti. 
// Utilizza un array privato per memorizzare oggetti Studente (creati nello Snack 1). 
// Implementa un costruttore senza parametri per inizializzare il registro vuoto e un metodo pubblico per aggiungere studenti al registro. 
// Aggiungi un metodo che stampi la lista degli studenti, senza utilizzare metodi helper.

package org.lessons.java.snack;

public class RegistroStudenti {

    // Attributo privato per memorizzare gli studenti
    private Studente[] studenti;

    // Costruttore senza parametri per inizializzare il registro vuoto
    public RegistroStudenti() {
        this.studenti = new Studente[0]; // Inizializza un array vuoto
    }

    // Metodo pubblico per aggiungere studenti al registro
    public void aggiungiStudente(Studente studente) {
        // Crea un nuovo array con una dimensione maggiore
        Studente[] nuovoRegistro = new Studente[studenti.length + 1];

        // Copia gli studenti esistenti nel nuovo array
        for (int i = 0; i < studenti.length; i++) {
            nuovoRegistro[i] = studenti[i];
        }

        // Aggiungi il nuovo studente all'ultimo posto
        nuovoRegistro[studenti.length] = studente;

        // Aggiorna il riferimento all'array di studenti
        studenti = nuovoRegistro;
    }

    // Metodo che stampa la lista degli studenti
    public void stampaStudenti() {
        if (studenti.length == 0) {
            System.out.println("Nessuno studente registrato.");
        } else {
            System.out.println("Lista degli studenti:");
            for (Studente studente : studenti) {
                System.out.println(studente.getDettagli());
            }
        }
    }
}
