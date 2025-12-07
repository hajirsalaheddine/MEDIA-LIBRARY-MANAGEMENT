package mediaLibraryManagement;

class DVD extends Media {
    private int duration;

    public DVD(String title, int refNumber, int duration) {
        super(title, refNumber);
        this.duration = duration;
    }

    @Override
    public void afficherInfo() {
        System.out.println("DVD N" + refNumber + ": " + title + " - Duration: " + duration + " min");
    }
}
