import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Noeud<T extends Sommable> implements Arbre<T> {
    private final List<Arbre> fils;

    public Noeud(final List<Arbre> fils) {
        this.fils = fils;
    }

    @Override
    public int taille() {
        int rtr = 0;
        for (final Arbre a : fils) {
            rtr += a.taille();
        }
        return rtr;
    }

    @Override
    public boolean contient(T val) {
        boolean rtr = false;
        for (final Arbre a : fils) {
            if (a.contient(val)) return true;
        }
        return rtr;
    }

    @Override
    public Set<T> valeurs() {
        Set<T> rtr = new HashSet<>();
        for (final Arbre a : fils) {
            rtr.addAll(a.valeurs());
        }
        return rtr;
    }

    public T somme() {
        if(fils == null) return null;
        if(fils.size() == 0) return null;
        T v = (T) fils.get(0).somme();
        for(int i = 1; i < fils.size(); i++)
            v = (T) v.sommer(fils.get(i).somme());
        return v;
    }

    @Override
    public T min() {
        if (fils == null || fils.size() == 0)
            return null;
        T rtr = (T) fils.get(0).min();
        for (int i = 1; i < fils.size(); i++) {
            T min = (T) fils.get(i).min();
            if (min.compareTo(rtr) == -1) {
                rtr = min;
            }
        }
        return rtr;
    }

    @Override
    public T max() {
        if (fils == null || fils.size() == 0)
            return null;
        T rtr = (T) fils.get(0).max();
        for (int i = 1; i < fils.size(); i++) {
            T max = (T) fils.get(i).max();
            if (max.compareTo(rtr) == 1) {
                rtr = max;
            }
        }
        return rtr;
    }
}