/**
 * Created by danelennon on 20/08/2016.
 */

package dl;

public class PlayCard implements Card {
    private String _imageFile;
    private String _imageName;
    private String _cardType;
    private String _title;
    private String _chemistry;
    private String _classification;
    private String _crystal_system;
    private String[] _occurrence;
    private String _hardnesss;
    private String _specific_gravity;
    private String _cleavage;
    private String _crustal_abundance;
    private String _economic_value;

    public PlayCard(String _imageFile, String _imageName, String _cardType, String _title, String _chemistry, String _classification, String _crystal_system, String[] _occurrence, String _hardnesss, String _specific_gravity, String _cleavage, String _crustal_abundance, String _economic_value) {
        this._imageFile = _imageFile;
        this._imageName = _imageName;
        this._cardType = _cardType;
        this._title = _title;
        this._chemistry = _chemistry;
        this._classification = _classification;
        this._crystal_system = _crystal_system;
        this._occurrence = _occurrence;
        this._hardnesss = _hardnesss;
        this._specific_gravity = _specific_gravity;
        this._cleavage = _cleavage;
        this._crustal_abundance = _crustal_abundance;
        this._economic_value = _economic_value;
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
