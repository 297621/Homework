package Homework;

public class Test {
    public static void main(String[] args) {
        Circle circle=new Circle();
        Square square=new Square();
        circle.makeVisible();
        circle.moveDown();
        circle.moveDown();
        circle.makeInvisible();
        circle.makeInvisible();
        circle.slowMoveHorizontal(-70);
        circle.changeColor("red");
        circle.changeColor("brown");
        Circle circle1=new Circle();
        Circle circle2=new Circle();
        circle1.changeColor("yellow");
        circle1.makeVisible();
        circle1.changeSize(60);
        circle1.moveHorizontal(50);
        circle2.changeColor("green");
        circle2.makeVisible();
        circle2.changeSize(15);
        circle2.moveRight();
        circle2.moveRight();
        circle2.moveRight();
        Picture picture=new Picture();
        picture.draw();
        picture.setBlackAndWhite();
        picture.setColor();
    }
}
