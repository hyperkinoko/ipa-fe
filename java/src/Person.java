public class Person {
  String name;
  int age;

  public Person() {
    this.name = "名無しの権兵衛";
    this.age = 10;
  }

  public Person(String name, int age) {
    this.name = name;
    this.age = age;
  }

  public void introduce() {
    System.out.println("私は" + this.name + "です。" + this.age + "歳です。");
  }
}
