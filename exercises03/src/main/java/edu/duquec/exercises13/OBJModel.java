package edu.duquec.exercises13;

import edu.duquec.math.*;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.*;
import java.io.*;
public class OBJModel {
    private ArrayList<Point3D> vertices = new ArrayList<>();
    private ArrayList<Integer> indices = new ArrayList<>();

    public void save(String filename) throws IOException {
        try (
                PrintWriter writer =new PrintWriter(filename);
                ) {
            for(Point3D v: vertices){
                writer.println(v.objString());
            }

            for(int i = 0; i <indices.size(); i += 3){
                int index0 =  indices.get(i);
                int index1 =  indices.get(i+1);
                int index2 =  indices.get(i+2);
                writer.println("f " +index0
                + " " + index1
                + " " + index2);
            }
        }
    }

    public void load(String filename) throws IOException{
        try(
                Scanner fileInput = new Scanner(new File(filename));
                ) {

            vertices.clear();
            indices.clear();

            while(fileInput.hasNext()) {
                String line = fileInput.nextLine();
                line = line.trim();
                if(line.length() > 0){
                    Scanner tokens = new Scanner(line);
                    String first = tokens.next();
                    if(first.equals("v")) {
                        //vertex
                        double x =  tokens.nextDouble();
                        double y = tokens.nextDouble();
                        double z = tokens.nextDouble();
                        Point3D v = new Point3D(x, y, z);
                        vertices.add(v);
                    }
                    else if(first.equals("f")){
                        //Face
                        indices.add(tokens.nextInt());
                        indices.add(tokens.nextInt());
                        indices.add(tokens.nextInt());
                    }
                }
            }
        }
    }
}
