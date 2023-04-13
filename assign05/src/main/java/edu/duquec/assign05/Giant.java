package edu.duquec.assign05;

public class Giant {
    //Variable
    private String name;

    //Giant Constructor
    public Giant(String name) {
        setName(name);
    }

    //Obtains creature(giant) name
    public String getName(){
        return name;
    }

    //Assigns creature(giant) name
    public void setName(String name) {
        this.name = name;
    }

    //Displays creature(giant) name
    public String toString() {
        return getName();
    }
}
