package ie.atu;

public class Passenger {
    String title;
    String name;
    String id;
    String phone;
    int age;

    public void setTitle(String t) {
        if(t=="Mr" && t=="Mrs" && t=="Ms") {
            this.title = t;
        }
        else {
            throw new IllegalArgumentException("Error, Invalid Title! Options: Mr, Mrs, Ms");
            }
    }

    public String getTitle() {
        return title;
    }

    public void setName(String n) {
        if(n.length()>3){
            this.name = n;
        }
        else{
            throw new IllegalArgumentException("This is not a valid name");
        }
    }

    public String getName(){
        return name;
    }

    public void setID(String i){
        if(i.length()>10){
            this.id=i;
        }
        else{
            throw new IllegalArgumentException("This is not a valid ID");
        }
    }

    public String getID(){
        return id;
    }

    public String phone(String p){
        this.phone = p;
        if(p.length()<7){
            throw new IllegalArgumentException("This is not a valid phone number");
        }
        return p;
    }

    public int age(int a){
        this.age = a;
        if(a<16){
            throw new IllegalArgumentException("This is not a valid age");
        }
        return a;
    }
}
