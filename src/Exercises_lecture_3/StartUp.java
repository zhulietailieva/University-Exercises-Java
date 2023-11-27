public class StartUp {
    public static void main(String[] args) {

        Figure[] figure = new Figure[2];
        figure[0] = new Rectangle(4,5);
        figure[1]  =new Circle(2);

        for(Figure f : figure){

            System.out.printf("Area is: %.2f\n", f.CalculateArea());

        }


    }
}
