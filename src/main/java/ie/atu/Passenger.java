package ie.atu;

public class Passenger {
    String title;

    public void setTitle(String t) {
        if(t=="Mr" || t=="Mrs" || t=="Ms") {
            this.title = t;
        }
        else {
            throw new IllegalArgumentException("Error, Invalid Title! Options: Mr, Mrs, Ms");
            }
    }

    public String getTitle() {
        return title;
    }
}
