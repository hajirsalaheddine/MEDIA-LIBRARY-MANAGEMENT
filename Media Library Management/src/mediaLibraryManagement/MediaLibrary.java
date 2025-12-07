package mediaLibraryManagement;

import java.util.ArrayList;

public class MediaLibrary {
    public static void main(String[] args) {

        ArrayList<Media> myList = new ArrayList<Media>();

        
        myList.add(new Livre("The Little Prince", 101, "Saint-Exupéry"));
        myList.add(new DVD("Inception", 202, 148));
        myList.add(new Livre("Java for Dummies", 303, "B. Burd"));

        System.out.println("--- Media Library Content ---\n");


        for (Media m : myList) {
            m.afficherInfo(); 
        }
    }
}
