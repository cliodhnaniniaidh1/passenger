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

    public void setPhone(String p){
        if(p.length()>7){
            this.phone = p;
        }
        else{
            throw new IllegalArgumentException("This is not a valid phone number");
        }
    }

    public String getPhone(){
        return phone;
    }

    public void setAge(int a){
        if(a>16) {
            this.age = a;
        }
        else{
            throw new IllegalArgumentException("This is not a valid age");
        }
    }

    public int getAge(){
        return age;
    }
}
