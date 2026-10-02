public class PhoneMain {
  public static void main(String[] args) {

    Phone phone = new Phone();
    Phone phone1 = new Phone();
    Phone phone2 = new Phone("+996777309821", "Nokia 3310");
    Phone phone3 = new Phone("+996777777777", " Iphone Duo");

    System.out.println(phone1);
    System.out.println(phone2);
    System.out.println(phone3);

    System.out.println();

    phone1.receiveCall("Oleg");
    System.out.println("Number: " + phone1.getNumber());

    phone2.receiveCall("Maria");
    System.out.println("Number" + phone2.getNumber());

    phone3.receiveCall("Aidar");
    System.out.println("Number" + phone3.getNumber());

    System.out.println();

    phone.receiveCall("Elena", "+996787877787");

    System.out.println();

    phone3.sendMessage("+996773737373", " +996473857324", "+996324237467");
  }
}