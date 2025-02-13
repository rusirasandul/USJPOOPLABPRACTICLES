public class Main {
    public static void main(String[] args) {
        Book Book1 =new Book("djffhje"," efhjbewh");
        Book Book2 =new Book("nefjhnq","nefhbqe");

        System.out.println("Title :" + Book1.getTitle());
        System.out.println("Auther :" + Book1.getAuther());

        Book1.setAuther("b vfe jebher");
        Book1.setTitle(" hjberv");

        System.out.println("Updated :" +Book1.getAuther());
        System.out.println("updated :" +Book1.getTitle());
    }
}