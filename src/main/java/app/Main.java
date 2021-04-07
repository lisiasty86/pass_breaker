package app;

public class Main {

    /**
     * Aby uruchomić projekt musisz przejść w Intellij: Open --> znaleźć ściężkę do projektu --> zaznaczyć folder pass-braker.
     * W prawym dolnym ekranie pojawi się popup z informacją o "eneble auto import" --> kliknij na to.
     * Jeśli nie wyskoczy ten popup, to: prawy klawisz myszy na plik pom.xml --> Maven --> Reimport.
     * W klasie Main poniżej możesz mieć na czerwono RandomStringUtils. Kliknij na tym i wciśnij Alt + Enter i zaznacz import.
     * Nie masz import? to powtórz trzecią gwiazdkę :)
     * Uruchom zielonym buttonem.
     * ENJOY!
     * */

    public static void main(String[] args) {

        PassBreaker passwordToHack = new PassBreaker();
        passwordToHack.passBreaker("Twoja");
        //System.out.println("Hello twoja stara");

    }

}
