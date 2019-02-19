public abstract class Attraction {

    protected String name;
    protected int rating;

    public Attraction(String name){
        this.name = name;
    }

    public int getRating(){
        return rating;
    }

}
