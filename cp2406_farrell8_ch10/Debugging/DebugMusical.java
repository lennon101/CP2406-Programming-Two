public class DebugMusical extends DebugPlay
{
    protected String composer;

    DebugMusical(String title, String author, String comp) {
        super(title,author);
        this.composer = comp;
    }

    public void display() {
        System.out.println("The performance is"  + getTitle() +
                " by " + getAuthor() + "\nThe music for " + getTitle() +
                " is by " + this.composer);
    }
}