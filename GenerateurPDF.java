package application;

import com.itextpdf.text.*;
import com.itextpdf.text.pdf.*;
import java.io.FileOutputStream;
import java.util.List;

public class GenerateurPDF {
    public static void genererEmploiDuTemps(List<Cours> emploiDuTemps, String nomFichier) throws Exception {
        // Création d'un document PDF
        Document document = new Document();
        PdfWriter.getInstance(document, new FileOutputStream(nomFichier));
        document.open();

        // Titre du document
        document.add(new Paragraph("Emploi du Temps", FontFactory.getFont(FontFactory.HELVETICA_BOLD, 16)));
        document.add(new Paragraph("\n")); // Espace

        // Tableau
        PdfPTable table = new PdfPTable(5); // 5 colonnes
        table.setWidthPercentage(100);
        table.setSpacingBefore(10f);
        table.setSpacingAfter(10f);

        // En-têtes du tableau
        table.addCell(new PdfPCell(new Phrase("Jour", FontFactory.getFont(FontFactory.HELVETICA_BOLD))));
        table.addCell(new PdfPCell(new Phrase("Horaire", FontFactory.getFont(FontFactory.HELVETICA_BOLD))));
        table.addCell(new PdfPCell(new Phrase("Cours", FontFactory.getFont(FontFactory.HELVETICA_BOLD))));
        table.addCell(new PdfPCell(new Phrase("Enseignant", FontFactory.getFont(FontFactory.HELVETICA_BOLD))));
        table.addCell(new PdfPCell(new Phrase("Salle", FontFactory.getFont(FontFactory.HELVETICA_BOLD))));

        // Remplir les données dans le tableau
        for (Cours c : emploiDuTemps) {
            table.addCell(c.getJour());
            table.addCell(c.getHoraire());
            table.addCell(c.getNom());
            table.addCell(c.getEnseignant());
            table.addCell(c.getSalle());
        }

        document.add(table);
        document.close();
        System.out.println("Le fichier PDF a été généré : " + nomFichier);
    }
}
