package ie.atu;

public class Passenger {
    String title;
    String name;
    String id;
    String phone;
    int age;

    //object for all information regarding passenger
    public Passenger(String title, String name, String id, String phone, int age){

        //checking if title is either Mr, Mrs or Ms
        if(title=="Mr" || title=="Mrs" || title=="Ms") {
            this.title = title;
        }
        else {
            throw new IllegalArgumentException("Error, Invalid Title! Options: Mr, Mrs, Ms");
        }
    }

    //returns title from Passenger
    public String getTitle() {
        return title;
    }

}
