package library;

import java.util.ArrayList;
import java.util.List;

public class MemberDAO {
    private final List<Member> memberList = new ArrayList<>();

    public void addMember(Member member) {
        memberList.add(member);
    }

    public void removeMember(Member member) {
        memberList.remove(member);
    }

    public void viewMember() {
        memberList.forEach(System.out::println);
    }
}
