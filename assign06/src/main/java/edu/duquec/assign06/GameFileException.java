package edu.duquec.assign06;

public class GameFileException extends Exception{
    //Constructor
    public GameFileException(String message) {
        //Call super(message) in this constructor to take advantage of Exception's constructor.
        super(message);
    }

    public GameFileException(String message, Exception e) {
        //Call super(message, e) in this constructor to take advantage of Exception's constructor.
        super(message, e);
    }
}
