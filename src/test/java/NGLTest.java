import lombok.AllArgsConstructor;
import lombok.Getter;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

@Getter
@AllArgsConstructor
public class NGLTest {
    private String id;
    private Personne auteur;
    private List<Message> messages;


    public void setUp() {
        id = "1";
        auteur = new Personne();
        Message m = new Message("test","2025-09-12","inscrite");
        messages.add(m);
    }

    @Test
    public void test() {
     Publication p = new Publication(id,auteur,messages);
     p.afficher();
    }

    public static void main(String[] args) {
        NGLTest ngl = new NGLTest("2",null,"Bonjour");
        ngl.test();
        System.out.println(ngl);

        NGLTest messagePublic = new NGLTest("3", "Louis", "welcome home");
        messagePublic.test();
        System.out.println(messagePublic);

    }


}
