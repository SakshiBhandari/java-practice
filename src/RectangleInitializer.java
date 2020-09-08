public class RectangleInitializer {


    /*Create a Rectangle class. The data for this class will be top, left, width, height.
       Create as many initialize(...) methods as possible

       Here are some examples:
    - 4 parameters are specified: left, top, width, and height
    - width/height is not specified (both are 0)
    - height is not specified (it is equal to the width), we'll create a square
    - create a copy of another rectangle passed as an argument */

    int top, left, width, height;

    public void initialize(int top, int left) {
        this.top = top;
        this.left = left;
        width = 0;
        height = 0;
    }

    public void initialize(int top, int left, int width) {
        this.top = top;
        this.left = left;
        this.width = width;
        height = this.width;
    }

    public void initialize(int top, int left, int width, int height) {
        this.top = top;
        this.left = left;
        this.width = width;
        this.height = height;
    }

    public void initialize(RectangleInitializer copy) {
        this.top = copy.top;
        this.left = copy.left;
        this.width = copy.width;
        this.height = copy.height;
    }

    public static void main(String[] args) {
    }
}



