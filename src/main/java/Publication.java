
import lombok.AllArgsConstructor;
import lombok.Getter;
import java.util.List;

@Getter
@AllArgsConstructor
public class Publication {
   private final String id;
   private final Personne auteur;
   private final List<Message> messages;

   public void afficher() {
       System.out.println(Publication.this);
   }
   public void ajouterMessage(Message m){
       messages.add(m);
   }

}


