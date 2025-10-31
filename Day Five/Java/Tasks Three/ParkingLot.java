public class ParkingLot {
    
    private boolean[] slots;

    
    public ParkingLot() {
        slots = new boolean[20]; 
    }

    
    public int parkCar() {
      
        for (int i = 0; i < slots.length; i++) {
       
	     if (!slots[i]) {
              
	 
	      slots[i] = true; 
            
	      System.out.println("Car parked in slot " + (i + 1));
                
		return i + 1; 
            }
        }
       
        System.out.println("No free slots available.");
        
	return -1; 
    }

    
    public void leaveSlot(int slotNumber) {
        
	if (slotNumber < 1 || slotNumber > 20) {
         
	   System.out.println("Invalid slot number.");
         
	   return;
        }
      
        if (slots[slotNumber - 1]) {
      
           slots[slotNumber - 1] = false; 
       
           System.out.println("Slot " + slotNumber + " is now free.");
      
	  } else {
       
	     System.out.println("Slot " + slotNumber + " is already free.");
        }
    }

  
    public void displaySlots() {
   
         System.out.println("Parking Lot Status:");
   
	     
	for (int i = 0; i < slots.length; i++) {
        
	    System.out.println("Slot " + (i + 1) + ": " + (slots[i] ? "Occupied" : "Free"));
        }
    }

    public static void main(String[] args) {
        
	ParkingLot parkingLot = new ParkingLot()
        
	parkingLot.parkCar(); 
        
	parkingLot.parkCar(); 
        
	parkingLot.displaySlots();
        
	parkingLot.leaveSlot(1); 
        
	parkingLot.displaySlots(); 
    }
}