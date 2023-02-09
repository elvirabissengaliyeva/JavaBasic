package class19;
/*Write program: userClass  that has a constructor that initializes instance variable name and mobile number.
        Create a subclass  userInfo that will have user address variable and it also being initialized through
        constructor call. Print users name, mobile number and address in userDetails method. Test your code.*/
public class UserClass {
    String name;
    String mobileNumber;


    UserClass(String name, String mobileNumber){
        this.name=name;
        this.mobileNumber=mobileNumber;
    }

}

class UserInfo extends UserClass {
    String address;

    UserInfo(String name, String mobileNumber, String address) {
        super(name, mobileNumber);
        this.address = address;
    }

    void userDetails() {
        System.out.println("User name is " + name + " and mobile number is " + mobileNumber + " address is " + address);

    }
}