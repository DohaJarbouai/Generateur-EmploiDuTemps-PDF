package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Cours> emploiDuTemps = new ArrayList<>();

        System.out.println("Bienvenue dans le générateur d'emploi du temps !");
        boolean continuer = true;

        while (continuer) {
            System.out.println("Entrez les informations pour un nouveau cours :");

            System.out.print("Nom du cours : ");
            String nom = scanner.nextLine();

            System.out.print("Nom de l'enseignant : ");
            String enseignant = scanner.nextLine();

            System.out.print("Salle : ");
            String salle = scanner.nextLine();

            System.out.print("Horaire (ex : 10:00-12:00) : ");
            String horaire = scanner.nextLine();

            System.out.print("Jour (ex : Lundi) : ");
            String jour = scanner.nextLine();

            emploiDuTemps.add(new Cours(nom, enseignant, salle, horaire, jour));

            System.out.print("Voulez-vous ajouter un autre cours ? (oui/non) : ");
            String reponse = scanner.nextLine().toLowerCase();
            if (!reponse.equals("oui")) {
                continuer = false;
            }
        }

        System.out.print("Entrez le nom du fichier PDF à générer (ex : emploi_du_temps.pdf) : ");
        String nomFichier = scanner.nextLine();

        try {
            GenerateurPDF.genererEmploiDuTemps(emploiDuTemps, nomFichier);
        } catch (Exception e) {
            System.err.println("Erreur lors de la génération du fichier PDF : " + e.getMessage());
        }

        System.out.println("Merci d'avoir utilisé l'application !");
    }
}
