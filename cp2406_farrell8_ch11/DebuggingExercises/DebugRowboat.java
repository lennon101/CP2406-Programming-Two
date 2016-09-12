public class DebugRowboat extends DebugBoat {
   public DebugRowboat() {
      super("row");
      setPassengers();
      setPower();
   }

   @Override
   public void setPassengers() {
      super.passengers = 2;
   }

   @Override
   public void setPower() {
      super.power = "oars";
   }
}