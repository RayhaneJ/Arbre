public class Entier implements Sommable<Entier> {
    private Integer value;

    public Integer getEntier(){
        return value;
    }

    public Entier(Integer value){
        this.value = value;
    }

    @Override
    public Entier sommer(Entier value) {
        return new Entier(this.value + value.getEntier());
    }

    @Override
    public int compareTo(Entier o) {
        return Integer.compare(value, o.getEntier());
    }
}
