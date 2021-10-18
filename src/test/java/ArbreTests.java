import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.util.Set;

public class ArbreTests {
    @Test
    public void tailleFeuilleInt() {
        Arbre<Integer> v = new Feuille<Integer>(5);
        Assert.assertEquals(v.taille(), 1);
    }

    @Test
    public void tailleFeuilleString() {
        Arbre<String> v = new Feuille<String>("un");
        Assert.assertEquals(v.taille(), 1);
    }

    @Test
    public void containsFeuilleInt(){
        Arbre<Integer> v = new Feuille<Integer>(5);
        Assert.assertEquals(v.contient(5), true);
    }

    @Test
    public void containsFeuilleString(){
        Arbre<String> v = new Feuille<String>("un");
        Assert.assertEquals(v.contient("un"), true);
    }

    @Test
    public void valeursFeuilleInt(){
        Arbre<Integer> v = new Feuille<Integer>(5);
        Assert.assertEquals(v.valeurs(), Set.of(5));
    }

    @Test
    public void valeursFeuilleString(){
        Arbre<String> v = new Feuille<String>("un");
        Assert.assertEquals(v.contient("un"), Set.of("un"));
    }
}
