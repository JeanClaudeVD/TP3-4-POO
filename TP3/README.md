JPA : permet de gérer un grand nombre de données dans une BDD. Permet la persistance des données

Hibernate : le Framework Hibernate permet de représenter une BDD en objet Java et inversement. Il facilite la persistance et la recherche des données.

Web : Permet de monter une application web ave Tomcat, permet d'utiliser les API REST

Thymeleaf : Permet de mettre en place des fragments pour réutiliser des bouts de code dans les différentes pages html

H2 : API qui permet de gérer et créer des BDD avec java

DevTools : Permet de relancer plus rapidement, de modifier la configuration

-------


### Etape 13 :
1.  public String greeting(@RequestParam(name="nameGET", required=false, defaultValue="World") String nameGET, Model model)
2.  model.addAttribute("nomTemplate", nameGET);
3.  On passe par une méthode GET qui prend en argument le String passé dans l'URL.

### Etape 17 :
Une table Address a été rajoutée.

-------

### Etape 18 :

l'annotation @Entity permet de déclarer une classe comme entité dans la BDD avec Hibernate

-------

### Etape 20 :
Après avoir inséré à la main les commandes INSERT et redémarré l'application, on ne voit plus les données.
Toutefois, en ajoutant la ligne "spring.jpa.defer-datasource-initialization=true" dans application.properties,
En faisant un SELECT * FROM address, on voit bien toutes les données de la table même après redémarrage

-------

### Etape 22 :
@Autowired sert à injecter automatiquement les dépendances en gérant les beans de Spring

-------

### Etape 30 :

Il suffit d'ajouter une dependency dans pom.xml. Puis de rajouter le lien vers le style CSS de bootstrap

"<dependency>
<groupId>org.webjars</groupId>
			<artifactId>bootstrap</artifactId>
			<version>3.3.6</version>

</dependency>"


----------------------------------------------------------------------------------------------------------------------------------

## Deuxième Partie

### Etape 6

1. Il est nécessaire d'avoir un token pour utiliser l'API MeteoConcept. Pour obtenir ce token il suffit de créer un compte, choisir une offre et autoriser les requêtes.
2. On utilise cette URL en remplaçant ... par le token et en donnant les coordonnées séparées par "-" pour obtenir les prévisions météo. "https://api.meteo-concept.com/api/forecast/daily/0?token=...latlng="
3. On utilise la méthode GET
4. Les paramètres passent dans l'URL avant d'être récupérés puis exploités par la classe MeteoController
5. Les données sont dans des fichiers JSON obtenus grâce aux API. Il suffit alors de désérializer pour obtenir les informations voulues.
6. La température est dans la section "observation" du JSON de MeteoConcept
7. Les prévisions sont dans "forecast" avec "tmin" et "tmax"

-----
### Lien du Git
