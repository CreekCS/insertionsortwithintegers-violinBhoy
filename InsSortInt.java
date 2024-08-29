import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.Scanner; // Import the Scanner class to read text files
import java.util.*;

public class InsSortInt {
    public static void main(String args[]) {
    ArrayList<String> fileData = new ArrayList<>();
    try {//copy pasted from w3c schools
        File myObj = new File("randInts.txt");
        Scanner myReader = new Scanner(myObj);
        while (myReader.hasNextLine()) {
            String data = myReader.nextLine();
            fileData.add(data);
        }
        myReader.close();
    } catch (FileNotFoundException e) {
        System.out.println("An error occurred.");
        e.printStackTrace();
    }
    int nums[] = new int[fileData.size()];
    for (int i = 0; i < nums.length; i++) {
        nums[i] = Integer.parseInt(fileData.get(i));
    }

    //sort algorithm now
    insertion(nums);
    System.out.println(nums[0]);
    System.out.println(nums[nums.length-1]);
    }

    public static void insertion(int nums[]) {
        for (int i  = 1; i < nums.length; i++) {
        int index = i;
        while (index-1 >= 0 && nums[index] < nums[index-1]) {
            int tmp = nums[index-1];
            nums[index-1] = nums[index];
            nums[index] = tmp;
            index--;
        }
        }   
    }
}
