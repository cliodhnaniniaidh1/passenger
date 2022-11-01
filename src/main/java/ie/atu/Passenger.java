package ie.atu;

public class Passenger {
    String title;
    String name;

    public String title(String t) {
        this.title = t;

        if(t!="Mr" && t!="Mrs" && t!="Ms"){
            throw new IllegalArgumentException("Error, Invalid Title! Options: Mr, Mrs, Ms");
        }
        return t;
    }

    public String name(String n) {
        this.name = n;
        if(n.length()<3){
            throw new IllegalArgumentException("This is not a valid name");
        }
        return n;
    }
}
