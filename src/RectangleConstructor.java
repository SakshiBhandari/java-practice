public class RectangleConstructor {

    /*Create as many constructors as possible.

Here are some examples:
- 4 parameters are specified: left, top, width, height
- width/height is not specified (both are 0)
- height is not specified (it is equal to the width), we'll create a square
- create a copy of another rectangle passed in as an argument */

    int top;
    int left;
    int width;
    int height;

    public RectangleConstructor(int left, int top, int width, int height) {
        this.left = left;
        this.top = top;
        this.width = width;
        this.height = height;
    }

    public RectangleConstructor(int left, int top) {
        this.left = left;
        this.top = top;
    }

    public RectangleConstructor(int left, int top, int width) {
        this.left = left;
        this.top = top;
        this.width = width;
        this.height = height;
    }

    public RectangleConstructor(RectangleConstructor toCopy) {
        top = toCopy.top;
        left = toCopy.left;
        width = toCopy.width;
        height = toCopy.height;
    }

    public static void main(String[] args) {


    }
}

