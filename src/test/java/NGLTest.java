import lombok.AllArgsConstructor;
import lombok.Getter;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

@Getter
@AllArgsConstructor
public class NGLTest {
    private String id;
    private personne auteur;
    private List<message> messages;



    @BeforeEach
   public void setUp() {
        id = "1";
        auteur = new personne();
        messages = null;
        message m = new message("test",null,"test");
        messages.add(m);
    }

    @Test
   public void test() {
        System.out.println(id);
    }
}
