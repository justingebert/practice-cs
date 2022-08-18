package Easy;

public class DefangingAnIPAddress1108 {

    public String defangIPaddr(String address) {
        return address.replace(".","[.]");
    }

    public static void main(String[] args) {
        DefangingAnIPAddress1108 test01 = new DefangingAnIPAddress1108();
        System.out.println(test01.defangIPaddr("1.1.1.1"));

    }
}
