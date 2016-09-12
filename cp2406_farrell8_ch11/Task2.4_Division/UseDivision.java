/**
 * Created by danelennon on 12/09/2016.
 */
public class UseDivision {
    public static void main(String[] args) {
        DomesticDivision dom = new DomesticDivision("dom1",100001,"NSW");
        InternationalDivision inter = new InternationalDivision("inter1",100002,"Aust","english");

        dom.display();
        inter.display();
    }
}
