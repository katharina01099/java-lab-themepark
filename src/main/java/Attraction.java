public abstract class Attraction {

    protected String name;
    protected int rating;
    protected boolean agerestriction;

    public Attraction(String name){
        this.name = name;
    }

    public int getRating(){
        return rating;
    }

    public boolean getAgerestriction(){
        return agerestriction;
    }

}
