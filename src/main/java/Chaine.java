public class Chaine implements Sommable<Chaine> {
    private String chaine;

    public Chaine(String chaine){
        this.chaine = chaine;
    }

    @Override
    public Chaine sommer(Chaine value) {
        StringBuffer sb = new StringBuffer();
        sb.append(String.format("%s%s", chaine, value));
        return new Chaine(sb.toString());
    }

    public String getChaine() {
        return chaine;
    }

    @Override
    public String toString() {
        return chaine;
    }
}
