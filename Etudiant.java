public class Etudiant extends Membre {
    String filiere;

    public Etudiant(String id,String nom,String email,String filiere){
        super(id, nom, email);
        this.filiere=filiere;
    }
    public String getFiliere(){
        return filiere;
    }
    public void setFiliere(String filiere){
        this.filiere=filiere;
    }

    @Override
    public int getDureeEnprunt(){
        return 3;
    }

    @Override
    public int getNombreMaxEnprunts(){
        return 14;
    }

    public void afficheInfo(){
        System.out.println("_______________Details de l\'Etudiant:_____");
        System.out.println("ID :"+ id);
        System.out.println("Nom :"+nom);
        System.out.println("Email :"+ email);
        System.out.println("Filiere :"+filiere);
    }
    


  
}
