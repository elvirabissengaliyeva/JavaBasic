package HomeworkClass11;
/*1) Create a Class “Phone”. Create 3 Objects of it: iPhone, Pixel, Samsung with specific
        attributes and behaviors. */
public class PhoneTester {
    public static void main(String[] args) {
        Phone iPhone= new Phone();
        iPhone.name="iPhone14 Pro";
        iPhone.color="Gold";
        iPhone.mainCamera=48;
        iPhone.memory=512;
        iPhone.length=0.31;
        iPhone.height=5.81;
        iPhone.width=2.81;
        iPhone.availability();

        Phone Pixel= new Phone();
        Pixel.name="Pixel 7 Pro";
        Pixel.color="Hazel";
        Pixel.mainCamera=10.8;
        Pixel.memory=128;
        Pixel.length=0.3;
        Pixel.height=6.4;
        Pixel.width=3;
        Pixel.availability();

        Phone Samsung= new Phone();
        Samsung.name="Galaxy Z Fold4";
        Samsung.color="Graygreen";
        Samsung.mainCamera=4;
        Samsung.memory=512;
        Samsung.length=0.25;
        Samsung.height=6.11;
        Samsung.width=5.12;
        Samsung.availability();


    }
}

