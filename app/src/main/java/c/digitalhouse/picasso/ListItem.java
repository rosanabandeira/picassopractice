package c.digitalhouse.picasso;

public class ListItem {

    private String texto;
    private String imageUrl;

    public ListItem() {
    }

    public ListItem(String texto, String imageUrl) {
        this.texto = texto;
        this.imageUrl = imageUrl;
    }

    public String getTexto() {
        return texto;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }
}