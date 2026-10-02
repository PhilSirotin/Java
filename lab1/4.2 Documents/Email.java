public class Email extends Document {
  private String sender;
  private String recipient;

  public Email(String title, String author, String sender, String recipient) {
    super(title, author);
    this.sender = sender;
    this.recipient = recipient;
  }

  @Override 
  public void print() {
        System.out.println("Электронное письмо: " + title);
        System.out.println("Автор: " + author);
        System.out.println("Отправитель: " + sender);
        System.out.println("Получатель: " + recipient);
  }
}