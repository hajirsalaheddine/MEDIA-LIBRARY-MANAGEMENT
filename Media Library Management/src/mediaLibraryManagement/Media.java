package mediaLibraryManagement;

public class Media {
    protected String title;
    protected int refNumber;

    public Media(String title, int refNumber) {
        this.title = title;
        this.refNumber = refNumber;
    }

    public void afficherInfo() {
        System.out.println("Media N" + refNumber + ": " + title);
    }
}
