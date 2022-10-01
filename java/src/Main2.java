public class Main2 {
  public static void main(String[] args) {
    Person[] members = new Person[5];

    members[0] = new Person();
    members[1] = new Person("キノコ", 42);
    members[2] = new Person("りお", 33);
    members[3] = new Person("あんず", 20);
    members[4] = new Person("みく", 18);

    for(Person member : members) {
      member.introduce();
    }
  }
}
