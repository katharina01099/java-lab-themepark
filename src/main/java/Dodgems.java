public class Dodgems extends Attraction implements IReview {



    public Dodgems(String name, int rating) {
        super(name);
        this.rating = rating;
    }


    public String getName() {
        return name;
    }

    @Override
    public void rating(int rating){
        this.rating = rating;

    }

}
