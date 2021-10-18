package td1.arbres;

import java.util.Set;

public interface Arbre<T>  {
    int taille();
    boolean contient(T val);
    Set<T> valeurs();
}