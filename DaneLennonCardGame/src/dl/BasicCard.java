package dl;

/**
 * Created by xander on 19/08/2016.
 */
public class BasicCard implements Card {

    private String _imageName;
    private String _imageFile;
    private String _title;

    public BasicCard(String title, String imageName, String imageFile) {
        _imageName = imageName;
        _imageFile = imageFile;
        _title = title;
    }

    @Override
    public String imageFile() {
        return _imageFile;
    }

    @Override
    public String imageName() {
        return _imageName;
    }

    @Override
    public String title() {
        return _title;
    }

    @Override
    public String toString() {
        return "BasicCard{" +
                "imageName='" + _imageName + '\'' +
                ", imageFile='" + _imageFile + '\'' +
                ", title='" + _title + '\'' +
                '}';
    }
}
