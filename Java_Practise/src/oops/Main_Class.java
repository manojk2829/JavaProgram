package oops;

public class Main_Class {

	public static void main(String[] args) {
		CarClass c=new CarClass();
		Ferrari_Class fc=new Ferrari_Class();
		fc.startCar();
		fc.refule();
		fc.backCamera_F();
		
		
		CarClass cf = new Ferrari_Class();
		cf.startCar();
		cf.startCar();
		
        BMW_Class bm=new BMW_Class();
        bm.Wifi();
        
        c.stopCar();

        CarClass cbmw= new BMW_Class();
        cbmw.startCar();
        cbmw.stopCar();
		
	}

}
