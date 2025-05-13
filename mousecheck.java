public class mousecheck {

    public static void main(String[] args) {

        mouse2 m2 = new mouse2();

        m2.leftclick();
        m2.rightclick();
        m2.scrollup();
        m2.scrolldown();

        m2.bluetooth();
        System.out.println("Mouse is working fine");

    }

}
