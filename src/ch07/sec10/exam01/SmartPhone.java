package ch07.sec10.exam01;

public class SmartPhone extends Phone {
    SmartPhone(String owner) {
        super(owner);
//        System.out.println("자식 생성자 호출");
    }

    void internetSearch() {
        System.out.println("인터넷을 검색합니다.");
    }
}
