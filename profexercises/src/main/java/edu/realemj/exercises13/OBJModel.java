package edu.realemj.exercises13;

import edu.realemj.math.*;
import java.util.*;
import java.io.*;

public class OBJModel {
    private ArrayList<Point3D> vertices = new ArrayList<>();
    private ArrayList<Integer> indices = new ArrayList<>();

    public void save(String filename) throws IOException {
        try (
                PrintWriter writer = new PrintWriter(filename);
                ) {
            for(Point3D v: vertices) {
                writer.println(v.objString());
            }

            for(int i = 0; i < indices.size(); i += 3) {
                int index0 = indices.get(i);
                int index1 = indices.get(i+1);
                int index2 = indices.get(i+2);
                writer.println("f " + index0
                                + " " + index1
                                + " " + index2);
            }
        }
    }

    public void load(String filename) throws IOException {
        try (
                Scanner fileInput = new Scanner(new File(filename));
                ) {

            vertices.clear();
            indices.clear();

            while(fileInput.hasNextLine()) {
                String line = fileInput.nextLine();
                line = line.trim();
                if(line.length() > 0) {
                    Scanner tokens = new Scanner(line);
                    String first = tokens.next();
                    if(first.equals("v")) {
                        // Vertex
                        double x = tokens.nextDouble();
                        double y = tokens.nextDouble();
                        double z = tokens.nextDouble();
                        Point3D v = new Point3D(x, y, z);
                        vertices.add(v);
                    }
                    else if(first.equals("f")) {
                        // Face
                        indices.add(tokens.nextInt());
                        indices.add(tokens.nextInt());
                        indices.add(tokens.nextInt());
                    }
                }
            }
        }
    }

    public void scale(double sx, double sy, double sz) {
        for(int i = 0; i < vertices.size(); i++) {
            Point3D v = vertices.get(i);
            v.setX(v.getX()*sx);
            v.setY(v.getY()*sy);
            v.setZ(v.getZ()*sz);
        }
    }

    public static void main(String [] args) {
        try {
            OBJModel model = new OBJModel();
            model.load("bunny.obj");
            model.scale(1.0, 2.0, 1.0);
            model.save("tallbunny.obj");
        }
        catch(IOException e) {
            System.err.println(e.getMessage());
        }
    }
}
