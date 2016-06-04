package modele;

/**
 * Created by khale on 28/05/2016.
 */
public class Image {
    private int id;
    private String file;
    private boolean principale;
    public static int cp = 0;

    public Image() {
    }


    public Image(String file,Boolean principale) {
        this.id = cp;
        this.file = file;
        this.principale = principale;
        cp++;
    }


    public Image(String file) {
        this.id = cp;
        this.file = file;
        this.principale = false;
        cp++;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFile() {
        return file;
    }

    public void setFile(String file) {
        this.file = file;
    }

    public boolean isPrincipale() {
        return principale;
    }

    public void setPrincipale(boolean principale) {
        this.principale = principale;
    }
}
