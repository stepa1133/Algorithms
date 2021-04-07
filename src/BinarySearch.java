public class BinarySearch {
    public static int binarySearch(int[]array,int numForSearch){
        int lowIndex = 0;
        int highIndex = array.length-1;
        while(lowIndex <= highIndex){
            int midIndex = (highIndex+lowIndex)/2;
            int currentValue = array[midIndex];
            if (numForSearch==currentValue) return midIndex;
            if (numForSearch<currentValue)  highIndex=midIndex-1;
            else  lowIndex=midIndex+1;
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(binarySearch(new int[]{1,2,4,5,7,9,11},4));
    }
}
