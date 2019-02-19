public class Dodgems extends Attraction implements IReview, ISecurity {



    public Dodgems(String name, int rating, boolean agerestriction) {
        super(name);
        this.rating = rating;
        this.agerestriction = agerestriction;
    }


    public String getName() {

        return name;
    }

    @Override
    public void rating(int rating){
        this.rating = rating;
    }

    @Override
    public void agerestriction(boolean agerestriction){
        this.agerestriction = agerestriction;
    }




}
