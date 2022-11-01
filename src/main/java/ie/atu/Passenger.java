package ie.atu;

public class Passenger {
    String title;
    String name;
    String id;

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

    public String id(String i){
        this.id=i;
        if(i.length()<10){
            throw new IllegalArgumentException("This is not a valid ID");
        }
        return i;
    }
}
