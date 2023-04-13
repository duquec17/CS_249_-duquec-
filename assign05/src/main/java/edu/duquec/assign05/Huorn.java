package edu.duquec.assign05;

public class Huorn extends Tree {
    //Huorn constructor
    public Huorn(String name){
        super(name);
    }

    @Override
    //Pulls and displays Huorn message using parent(Tree) toString
    public String toString(){
        return "Huorn " + super.toString();
    }

    @Override
    //
    public String speak(){
        return "<angry rustling>";
    }
}
