//Add Phidgets Library
import com.phidget22.*;

public class PhidgetScale {
    public static void main(String[] args) throws Exception{
        //Create
        VoltageRatioInput scale = new VoltageRatioInput();
        
        //Open
        scale.open(1000);
        
        //Use your Phidgets
        while(true){
            System.out.println("Offset Value: " + scale.getVoltageRatio());
            Thread.sleep(250);
        }
    }    
}
  

/* 
Screen Dump;
Offset Value: -2.8619077069973143E-5
Offset Value: -2.863211558602383E-5
Offset Value: -2.8624199344135914E-5
Offset Value: -2.8614886118385422E-5
Offset Value: -2.862373368284839E-5
Offset Value: -2.862373368284839E-5
*/