package ArtGallerySystem;
import java.util.ArrayList;
public class ArtGallery {
    private String name ;
    private String adress ;
    private ArrayList<Artwork> artworks;
    public ArtGallery (String name,String adress) {
        this.name=name;
        this.adress=adress;
        this.artworks=new ArrayList<>();
    }

    public static void belongsArtwork(ArtGallerySystem.Artwork theLastSupper) {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public ArrayList<Artwork> getArtworks() {
        return artworks;
    }

    public void setArtworks(ArrayList<Artwork> artworks) {
        this.artworks = artworks;
    }
    @Override
    public String toString(){
        return "ArtGallery{name=' " + name + " ' ,adress= '" + adress + "', artworks=" +artworks+ "}";
    }
}
