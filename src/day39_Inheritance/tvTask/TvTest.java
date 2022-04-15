package day39_Inheritance.tvTask;

public class TvTest {
    public static void main(String[] args) {

        TV tv1 = new TV("LG");

        tv1.turnOn();

        tv1.setVolumeLevel(2);

        System.out.println(tv1.getVolumeLevel());


       /* tv1.turnOff();

        tv1.setVolumeLevel(5);

        System.out.println(tv1.getVolumeLevel()); */

       // tv1.turnOn();

       tv1.setVolumeLevel(10);

        System.out.println(tv1.getVolumeLevel());

        tv1.channelUp();

        System.out.println(tv1.getChannel());

        tv1.volumeUp();

        System.out.println(tv1.getVolumeLevel());

        tv1.setChannel(121);










       /*tv1.turnOn();

       tv1.setVolumeLevel(3);
        System.out.println(tv1.getVolumeLevel());

        tv1.turnOff();
        tv1.turnOff();

        tv1.turnOn();

        tv1.setVolumeLevel(9);

        System.out.println(tv1.getVolumeLevel());

        tv1.channelUp();

        System.out.println(tv1.getChannel());

        tv1.volumeUp();

        System.out.println(tv1.getVolumeLevel());


       // tv1.setVolumeLevel(1);*/











    }
}
