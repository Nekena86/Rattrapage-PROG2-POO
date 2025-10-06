
import lombok.Getter;
import java.util.List;

@Getter

public class Publication {
   private String id;
   private personne auteur;
   private List<message> messages;

   public Publication(String id, personne auteur){
       this.id = id;
       this.auteur = auteur;
       this.messages = null;
   }

   public void afficher(){
       System.out.println(Publication.this);
   }

   public void ajouterMessage(message m){
       messages.add(m);
   }


}


