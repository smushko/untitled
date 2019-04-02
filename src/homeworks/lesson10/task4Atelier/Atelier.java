package homeworks.lesson10.task4Atelier;


public class Atelier {
    public static void main(String[] args) {
        Clothing tshirt = new Tshirt(32, 50, "green");
        Clothing tie = new Tie(34, 200, "Striped");
        Clothing skirt = new Skirt(36, 150, "black");
        Clothing pants = new Pants(38, 100, "pinc");

        Clothing[] clothing = {tie, skirt, pants, tshirt};

        System.out.println("женская одежда");
        Women(clothing);
        System.out.println("мужская одежда");
        Men(clothing);
        System.out.println(tshirt.getSize());
    }

    private static void Women(Clothing[] clothing) {
        for (Clothing www : clothing) {
            if (www instanceof WomensClothing) {
                ((WomensClothing) www).dressingWoman();
            }
        }
    }

    private static void Men(Clothing[] clothing) {
        for (Clothing www : clothing) {
            if (www instanceof MensClothing) {
                ((MensClothing) www).dressingMan();
            }
        }
    }
}
