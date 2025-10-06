import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Date;

@Getter
@AllArgsConstructor
public class message {
    private String texte;
    private Date date;
    private personne auteur;
    private String indication;

   public void afficher(){
    System.out.println(message.this);
   }

}
