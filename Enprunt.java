import java.text.SimpleDateFormat;
import java.util.Date;
public class Enprunt {
    Livre livre;
    Membre membre;
    Date date= new Date();
    SimpleDateFormat dateEnprunt =new SimpleDateFormat("dd/MM/yyyy");
    String dateRetourPrevue;
    boolean rendu;

    public Enprunt(Livre livre,Membre membre,Date date,String dateRetourPrevue,boolean rendu){
        this.livre=livre;
        this.livre.setDisponible(false);
        this.membre=membre;
        this.date=date;
        this.dateRetourPrevue=dateRetourPrevue;
        this.rendu=rendu;

    }

    public void retournerLivre(){
        rendu=true;
        livre.setDisponible(rendu);
    }
    

    public void afficheEnprunt(){
        System.out.println("_____________LES DETAILS D\'ENPRUNT_______");
        System.out.println("_______Info livre_____\n"+livre);
        System.out.println("Date d\'enprunt :"+dateEnprunt.format(date));
        System.out.println("Date de retoure Prevue :"+dateEnprunt.format(dateRetourPrevue));
        System.out.println("Le livre a ete rendu :"+rendu);
    }
}
