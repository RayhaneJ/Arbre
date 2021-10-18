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

    @Test
    public void sommeEntier(){
        Entier entier = new Entier(5);
        Assert.assertEquals(entier.sommer(new Entier(5)).getEntier(), Integer.valueOf(10));
    }

    @Test
    public void sommeEntierError(){
        Entier entier = new Entier(5);
        Assert.assertNotEquals(entier.sommer(new Entier(5)).getEntier(), Integer.valueOf(11));
    }

    @Test
    public void sommeChaine(){
        Chaine chaine = new Chaine("salut");
        Assert.assertEquals(chaine.sommer(new Chaine("cava")).getChaine(), "salutcava");
    }

    @Test
    public void sommeChaineError(){
        Chaine chaine = new Chaine("salut");
        Assert.assertNotEquals(chaine.sommer(new Chaine("cava")).getChaine(), "salutcsava");
    }

    @Test
    public void minFeuilleEntier(){
        Feuille<Entier> v = new Feuille<Entier>(new Entier(2));
        Assert.assertEquals(v.min().getEntier(), Integer.valueOf(2));
    }

    @Test
    public void minFeuilleEntierError(){
        Feuille<Entier> v = new Feuille<Entier>(new Entier(2));
        Assert.assertNotEquals(v.min().getEntier(),Integer.valueOf(1));
    }

    @Test
    public void minFeuilleChaine(){
        Feuille<Chaine> v = new Feuille<Chaine>(new Chaine("un"));
        Assert.assertEquals(v.min().getChaine(), "un");
    }

    @Test
    public void minFeuilleChaineError(){
        Feuille<Chaine> v = new Feuille<Chaine>(new Chaine("un"));
        Assert.assertNotEquals(v.min().getChaine(), "deux");
    }
}
