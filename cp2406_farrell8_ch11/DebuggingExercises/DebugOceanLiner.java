public class DebugOceanLiner extends DebugBoat {
   public DebugOceanLiner() {
      super("ocean liner ");
      setPassengers();
      setPower();
   }

   @Override
   public void setPower() {
      super.power = "four engines";
   }

   public void setPassengers() {
      super.passengers = 2400;
   }
}
