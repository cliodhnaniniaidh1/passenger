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

        //checking if name is greater than 3 characters
        if(name.length()>3){
            this.name = name;
        }
        else{
            throw new IllegalArgumentException("This is not a valid name");
        }

        //checking if ID has more than 10 characters
        if(id.length()>10){
            this.id=id;
        }
        else{
            throw new IllegalArgumentException("This is not a valid ID");
        }

        //checking if phone is greater than 7 characters
        if(phone.length()>7){
            this.phone = phone;
        }
        else{
            throw new IllegalArgumentException("This is not a valid phone number");
        }

        //checking if age is over 16
        if(age>16) {
            this.age = age;
        }
        else{
            throw new IllegalArgumentException("This is not a valid age");
        }

    }

    //returns title from Passenger
    public String getTitle() {
        return title;
    }
    //returns name from passenger
    public String getName(){
        return name;
    }
    //returns ID from passenger
    public String getID(){
        return id;
    }
    //returns phone from passenger
    public String getPhone() {
        return phone;
    }

    public int getAge() {
        return age;
    }
}
