Farah Akrout – Licence en sciences informatiques/lsi3 1.1
# TP 2 – Client SOAP

Application Java qui consomme le service web du TP 1 grâce à un proxy (stub) généré à partir du WSDL.

## Technologies

- Java 17
- Maven
- `jaxws-maven-plugin` (outil `wsimport`) pour générer le stub
- `jaxws-api` et `jaxws-rt`

## Prérequis

Le service du dossier `../TP1-CalculatriceWS` doit être lancé sur `http://localhost:8585/calculatrice`.

## Générer le proxy client

Dans IntelliJ, ouvrir le panneau **Maven**, puis **Plugins > jaxws > jaxws:wsimport**
(ou en ligne de commande : `mvn clean jaxws:wsimport`).
Les classes sont générées dans le package `clientsoap.generated`
(`CalculatriceService`, `ICalculatrice`, etc.).

## Lancer le client

Exécuter la méthode `main` de `clientsoap.ClientSOAP`. Résultat attendu :

```
Somme de 34.0 et 39.0 : 73.0
Soustraction : -5.0
Multiplication : 1326.0
Division : 0.8717948717948718
```

## Principe

Le client ne connaît pas le code du serveur : il utilise uniquement le contrat WSDL/XSD.
`wsimport` génère le stub, et l'appel `port.somme(a, b)` est transformé en message SOAP envoyé par HTTP.