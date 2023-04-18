package edu.duquec.assign06;

import edu.duquec.assign04.*;
import java.io.PrintWriter;
import java.util.*;

public class GameState implements Loadable{
    //Variable list
    ArrayList<Loadable> loadables = new ArrayList<>();
    CharBoard map = new CharBoard(12,30, '.');
    private int lines = 0;
    private String typeName;

    public Loadable createLoadable(String typeName) throws GameFileException {
        //Switch cases
        switch (typeName) {
            case "Skeleton" -> {
                return new Skeleton();
            }
            case "Rat" -> {
                return new Rat();
            }
            case "Item" -> {
                return new Item();
            }
            case "Book" -> {
                return new Book();
            }
            //Throws exception as default (all other responses)
            default -> {
                throw new GameFileException("Unknown type: " + typeName);
            }
        }
    }

    public void load(Scanner input) throws GameFileException {
        //Reset map & loadable
        map.clear();
        loadables.clear();

        //Acquire number of repetition
        lines = input.nextInt();
        for(int i = 0; i < lines; ++i){
            //Acquire type and pass it to load
            typeName = input.next();
            Loadable m = createLoadable(typeName);

            //Load
            m.load(input);

            //Add value to array
            loadables.add(m);
            if(m instanceof Drawable d) {
                //Draw map if possible
                d.draw(map);
            }
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        //Add both map and creatures to a string
        sb.append("MAP:\n" + map.getMapString() + "\nCREATURES:\n");
        for(int i = 0; i < loadables.size(); ++i) {
            //Add any Creatures to the String
            if(loadables.get(i) instanceof Creature c) {
                sb.append("* " + c + "\n");
            }
        }

        //Add inventory
        sb.append("INVENTORY:\n");
        for(int i = 0; i < loadables.size(); ++i) {
            if(loadables.get(i) instanceof Item x) {
                //Add an items to the string
                sb.append("* " + x + "\n");
            }
        }

        //Return string
        return sb.toString();
    }

    public void save(String fileName) throws GameFileException {
        try {
            PrintWriter writer = new PrintWriter(fileName);
            writer.print(this.toString());
            writer.close();
        } catch(Exception e) {
            throw new GameFileException("Failed to save file!", e);
        }
    }
}
