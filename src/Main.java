
import ArtGallerySystem.Artwork;
import ArtGallerySystem.Artist;
import ArtGallerySystem.ArtGallery;
import java.io.PrintStream;

import static java.lang.System.*;

public class Main {
    public static void main(String[] args) {
        int painting = 0;
        ArtGallerySystem.Artwork TheLastSupper  = new Artwork("The last Supper", "Louvre", painting);
        ArtGallerySystem.Artwork Starrynight     = new Artwork("Starry night", "Louvre", painting);
        Artist artist= new Artist ("Leonardo Da Vinci","1495");
        ArtGallery artGallery= new ArtGallery("Louver", "Paris");

        ArtGallery.belongsArtwork(TheLastSupper);
        ArtGallery.belongsArtwork(Starrynight);

        boolean ArtGallery = false;
        out.println(ArtGallery);
        out.println("\nArtist" + artist.getName() + " \n" + "belongs" + Starrynight.getName());
        Starrynight.belongs();
        out.println(TheLastSupper );
        out.println(Starrynight );

    }
}