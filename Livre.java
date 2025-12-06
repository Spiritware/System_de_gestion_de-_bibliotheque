public class Livre{
    private String isbn ;
    private String titre;
    private String  auteur;
    private int anneePublication;
    private boolean disponible;

    public Livre( String isbn ,String titre,String  auteur,int anneePublication,boolean disponibl){

        this.isbn=isbn;
        this.titre=titre;
        this.auteur=auteur;
        this.anneePublication=anneePublication;
        this.disponible=true;

    }
    public String getIsbn(){
        return isbn;
    }
    public void setIsbn (String isbn){
        this.isbn=isbn;
    }
     public String getTitre(){
        return titre;
    }
    public void setTitre (String titre){
        this.titre=titre;
    }
     public String getAuteur(){
        return auteur;
    }
    public void setAuteur (String auteur){
        this.auteur=auteur;
    }
     public int getAnneePublication(){
        return anneePublication;
    }
    public void setAnneePublication (int anneePublication){
        this.anneePublication=anneePublication;
    }
    public boolean isDisponible(){
        return disponible;
    }
    public void setDisponible(boolean disponible){
        this.disponible=disponible;
    }
    public void afficherDetails(){
        System.out.println("l\'identifiant du livre c\'est: "+ isbn);
        System.out.println("le titre du livre c\'est: "+ titre);
        System.out.println("le nom de lauter du livre c\'est: "+ auteur);
        System.out.println("L\'annee de publication du livre c\'est: "+anneePublication);
        System.out.println("le livres est a la bibliotheque: "+ disponible);


    }
    public int age(){
        int year=2025;
        int Age=year-this.anneePublication; 
        return Age;

    }
    




}