public class Dodgems extends Attraction {

    int rating;

    public Dodgems(String name, int rating) {
        super(name);
        this.rating = rating;
    }


    public String getName() {
        return name;
    }

//    @Override
//    public void agerestriction(int age){
//        this.age = age;
//    }


    public int getRating(){
        return rating;

    }


}
