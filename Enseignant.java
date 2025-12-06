public class Enseignant extends Membre {
    String departement;

    public Enseignant(String id,String nom,String email,String departement){
        super(id, nom, email);
        this.departement=departement;
    }
    public String getDepartement(){
        return departement;
    }
    public void setDepartement(String departement){
        this.departement=departement;
    }
    @Override
    public int getDureeEnprunt(){
        return 5;
    }

    @Override
    public int getNombreMaxEnprunts(){
        return 30;
    }
    public void afficheInfo(){
        System.out.println("_______________Details de l\'Enseignant:_____");
        System.out.println("ID :"+ id);
        System.out.println("Nom :"+nom);
        System.out.println("Email :"+ email);
        System.out.println("Departement :"+departement);
    }

}
