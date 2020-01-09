import java.util.ArrayList;

class Question3 {

    public static void removeConsecutives(ArrayList<Integer> nums) {
        //This method removes consecutive duplicate values from the 
        //list nums.  Hint: loop backwards through the list
        for(int i = 0; i < nums.size()-1; i++){
            int x1 = nums.get(i);
            int x2 = nums.get(i+1);
            while(x1 == x2){
                
               nums.remove(i+1);
                x1 = nums.get(i);
                x2 = nums.get(i+1);
               //nums.remove(i);
                
                
            }
            
            
            
        }
       
        
    }
    
    public static void main (String[] args) {
        ArrayList<Integer> nums = new ArrayList<Integer>();
        nums.add(1);
        nums.add(1);
        nums.add(2);
        nums.add(2);
        nums.add(2);
        nums.add(2);
        nums.add(3);
        nums.add(3);
        nums.add(1);
        System.out.println("Our list before: " + nums);
        removeConsecutives(nums); 
        System.out.println("Our list after:  " + nums);
        //should output [1,2,3,1]
    }

    
}