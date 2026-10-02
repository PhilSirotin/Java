public class PersonMain {
  public static void main(String[] args) {

    Person person1 = new Person();

    Person person2 = new Person("Ivanov Ivan Ivanovich", 20);

    System.out.println(person1);
    person1.move();
    person1.talk();

    System.out.println();

    System.out.println(person2);
    person2.move();
    person2.talk();

    Person[] people = new Person[5];
    people[0] = person2;
    people[1] = new Person("Peter Petr Petrovich", 19);
    people[2] = new Person("Sidorova Anna Sergeevna", 22);
    people[3] = new Person("Abdyraev Urmat Bekovich", 21);
    people[4] = new Person("Kuznecova Maria Olegovna", 18);

   System.out.println("\n Исходный массив: ");
   printArray(people);

   sortByAge(people);
   System.out.println("После сортировки по возрасту (по возрастанию): ");
    printArray(people);

   sortByName(people);
   System.out.println("\n После сортировки по ФИО(по алфавиту): ");
   printArray(people);
  }

  static void sortByAge(Person[] arr){
    for (int i = 0; i < arr.length - 1; i++){
      for (int j = 0; j < arr.length - 1 - i; j++){
        if(arr[j].getAge() > arr[j + 1].getAge()) {
          Person tmp = arr[j];
          arr[j] = arr[j + 1];
          arr[j + 1] = tmp;
        }
      }
    }
  }


static void sortByName(Person[] arr){
  for (int i = 0; i < arr.length - 1; i++){
    for (int j = 0; j < arr.length - 1 - i; j++){
      if (arr[j].getFullName().compareTo(arr[j + 1].getFullName()) > 0) {
        Person tmp = arr[j];
        arr[j] = arr[j + 1];
        arr[j + 1] = tmp;
      }
    }
  }
}

static void printArray(Person[] arr) {
  for (Person p : arr) {
    System.out.println(p);
  }
}
}