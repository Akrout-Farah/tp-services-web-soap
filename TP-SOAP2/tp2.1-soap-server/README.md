Farah Akrout – Licence en sciences informatiques/lsi3 1.1
## TP 1 – CalculatriceWS (service web SOAP)

Service web SOAP de calculatrice développé avec Jakarta XML Web Services (JAX-WS) et Maven.

## Fonctionnalités

Le service expose 4 opérations : `somme`, `soustraction`, `multiplication` et `division`
(la division par zéro renvoie une erreur SOAP).

## Technologies

- Java 17
- Maven
- JAX-WS (`jakarta.xml.ws-api`, `jaxws-rt`, `jakarta.jws-api`)
- SoapUI (tests)

## Structure

```
src/main/java
├── service
│   ├── ICalculatrice.java   # interface (@WebService, @WebMethod, @WebParam)
│   └── Calculatrice.java    # implémentation métier
└── serveur
    └── ServeurJWS.java      # publication avec Endpoint.publish
```

## Lancer le service

1. Ouvrir le projet dans IntelliJ IDEA.
2. Exécuter la méthode `main` de `serveur.ServeurJWS`.
3. Le service est publié sur `http://localhost:8585/calculatrice`.
4. Le WSDL est sur `http://localhost:8585/calculatrice?wsdl` et le XSD sur `?xsd=1`.

## Tester avec SoapUI

1. Créer un nouveau projet SOAP.
2. Importer le WSDL `http://localhost:8585/calculatrice?wsdl`.
3. Ouvrir la requête d'une opération, remplacer les `?` par deux valeurs et l'exécuter.

## Suite

Le client qui consomme ce service est dans le dossier `../TP2-client-soap`.