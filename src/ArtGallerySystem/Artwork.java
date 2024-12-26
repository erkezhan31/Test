package ArtGallerySystem;
public class Artwork{
    private String name;
    private String ArtGallery;
    private int style;
    private boolean artist;

    public Artwork( String name, String ArtGallery,int style){
        this.name = name;
        this.ArtGallery = ArtGallery;
        this.style = style;
        this.artist = false;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getArtGallery() {
        return ArtGallery;
    }

    public void setArtGallery(String ArtGallery) {
        this.ArtGallery= ArtGallery;
    }
    public int getStyle(){
        return style;
    }

    public void setStyle(int style) {
        this.style = style;
    }

    public boolean isArtist() {
        return artist;
    }
    public void Artist(){
        this.artist=true;
    }

    @Override
    public  String toString() {
        return "{Artwork='" + name + "',ArtGallery= ' " + ArtGallery + "',style = '" + style+ "', artist=" + artist + "}";
    }

    public String getName(ArtGallerySystem.Artwork starrynight) {
        return this.name;
    }

    public void belongs() {
    }
}
