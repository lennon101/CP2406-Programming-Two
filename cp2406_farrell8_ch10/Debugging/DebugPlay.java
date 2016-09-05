public class DebugPlay
{
   private String title;
   protected String author;

   public DebugPlay(String title, String author)
   {
      this.title = title;
      this.author = author;
   }
   public void display() {
      System.out.println("The performance is " + title +
        " by " + author);
   }

   public String getTitle() {
      return title;
   }

   public String getAuthor() {
      return author;
   }
}