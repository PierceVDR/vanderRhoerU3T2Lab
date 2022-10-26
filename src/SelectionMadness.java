public class SelectionMadness {
    // No instance variables //

    public SelectionMadness() {}

    public boolean flipCoin() {
        return (int) (Math.random() * 2) == 1;
    }

    public int largest(int num1, int num2, int num3) {
        if (num1 > num2) {
            // Not num2
            if (num1 > num3) {
                // It's num1
                return num1;
            }
            // It's num3
        } else {
            // Not num1
            if (num2 > num3) {
                // It's num2
                return num2;
            }
            // It's num3
        }

        // It's num3
        return num3;
    }

    public boolean rightTriangle(int side1, int side2, int side3) { // if statements are lame!
        return 0 == Math.pow(side1,2) + Math.pow(side2,2) + Math.pow(side3,2) - 2*Math.pow( largest(side1,side2,side3) ,2);
    }

}