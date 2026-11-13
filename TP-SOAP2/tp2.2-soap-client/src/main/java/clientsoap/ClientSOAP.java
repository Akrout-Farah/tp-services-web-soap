package clientsoap;

import clientsoap.generated.CalculatriceService;
import clientsoap.generated.ICalculatrice;


public class ClientSOAP {
    public static void main(String[] args) {
        // Création du service à partir des classes générées
        CalculatriceService service = new CalculatriceService();

        // Récupération du port (proxy client)
        ICalculatrice port = service.getCalculatricePort();

        // Appel des méthodes du service comme si elles étaient locales
        double a = 34;
        double b = 39;

        System.out.println("Somme de " + a + " et " + b + " : " + port.somme(a, b));
        System.out.println("Soustraction : " + port.soustraction(a, b));
        System.out.println("Multiplication : " + port.multiplication(a, b));
        System.out.println("Division : " + port.division(a, b));
    }
}