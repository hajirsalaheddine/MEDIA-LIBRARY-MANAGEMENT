package mediaLibraryManagement;

class Book extends Media {
    private String author;

    public Book(String title, int refNumber, String author) {
        super(title, refNumber);
        this.author = author;
    }

    @Override
    public void afficherInfo() {
        System.out.println("Book N" + refNumber + ": " + title + " written by " + author);
    }
}
