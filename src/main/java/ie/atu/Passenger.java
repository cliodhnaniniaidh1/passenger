package ie.atu;

public class Passenger {
    String title;

    public String title(String t) {
        this.title = t;

        if(t!="Mr" && t!="Mrs" && t!="Ms"){
            throw new IllegalArgumentException("Error, Invalid Title! Options: Mr, Mrs, Ms");
        }
        return t;
    }
}
