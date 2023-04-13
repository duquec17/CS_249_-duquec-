package edu.duquec.assign05;

public class Tree extends Giant {
    //Tree Constructor
    public Tree(String name) {
        super(name);
    }

    @Override
    //Displays tree title and parent method of toString
    public String toString(){
        return super.toString() + " of the trees";
    }

    //Displays tree message
    public String speak() {
        return "<rustling>";
    }
}
