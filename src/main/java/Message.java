import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Date;

@Getter
@AllArgsConstructor
public class Message {
    private String texte;
    private Date date;
    private Personne auteur;
    private String indication;

   public void afficher(){
    System.out.println(Message.this);
   }

}
