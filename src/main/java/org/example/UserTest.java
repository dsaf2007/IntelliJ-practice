package org.example;

public class UserTest {
    public static void main(String[] args) {
        User user1 = new User();

        user1.name = "aaa";
        user1.age = 20;
        user1.phoneNum = "010-xxxx-xxxx";

        System.out.printf("%s님은 성인? %s\n",user1.name, user1.isAdult());
    }
}
