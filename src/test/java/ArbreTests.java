import org.junit.Test;
import org.junit.Assert;

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
}
