package crp.kr.api.common.dataStructure;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

import java.util.*;

/**
 * packageName:crp.kr.api.common.dataStructure
 * fileName        :MemberCRUD
 * author           : chohyungook
 * date               :2022-05-09
 * desc            :
 * ================================
 * DATE              AUTHOR        NOTE
 * ================================
 * 2022-05-09chohyungook최초 생성
 */
public class MemberCRUD {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        MemberService service = new MemberServiceImpl();
        while (true){
            System.out.println("0.exit 1.save 2.update 3.delete 4.findById 5.findByName 6.findAll 7.count 8.existsById 9.Clear");
            switch (s.next()){
                case"0":
                    System.out.println("exit");return;
                case"1":
                    Member hong = new Member.Builder("hong")
                            .email("hong.test.com")
                            .password("1")
                            .name("홍길동")
                            .phone("010-0000-0000")
                            .profileImg("hong.jpg")
                            .build();
                    service.save(hong);
                Member lee = new Member.Builder("lee")
                        .email("lee.test.com")
                        .password("2")
                        .name("이순신")
                        .phone("010-1111-1111")
                        .profileImg("lee.jpg")
                        .build();
                service.save(lee);
                Member kang = new Member.Builder("kang")
                        .email("kang.test.com")
                        .password("3")
                        .name("강감찬")
                        .phone("010-2222-2222")
                        .profileImg("kang.jpg")
                        .build();
                service.save(kang);break;
                case"2":
                    Member up = new Member();
                    service.update(up);
                    break;
                case"3":
                    Member temp = new Member();
                    temp.setUserid(s.next());
                    service.delete(temp);
                    break;
                case"4":
                    Member find =new Member();
                    find.setUserid(s.next());
                    service.findById(find.userid);
                    String res = find.userid==null?"해당 ID가 없습니다.":"해당 ID가 있습니다.";
                    System.out.println(res);
                    break;
                case"5":
                    Member find1 =new Member();
                    find1.setName(s.next());
                    service.findByName(find1.name);
                    String res1= find1.name==null?"해당 이름을 가진 가입자가 없습니다.":"해당 이름을 가진 가입자가 있습니다.";
                    System.out.println(res1);
                    break;
                case"6":
                    System.out.println("총회원목록:"+service.findAll());break;
                case"7":
                    System.out.println("총회원수: " +service.count()+"명");break;
                case"8":
                    Member exist = new Member();
                    exist.setUserid(s.next());
                    service.existById(exist.userid);
                    String res2=exist.userid==null?"사용중이지 않는 ID입니다.":"사용 중인 ID입니다.";
                    System.out.println(res2);
                    break;
                case"9": service.clear();break;
                default:break;

            }
        }
    }
    @Data @NoArgsConstructor
    static class Member{
        protected String userid, name, password, profileImg, phone, email;

        public Member(Builder builder) {
            this.userid = builder.userid;
            this.name = builder.name;
            this.password = builder.password;
            this.profileImg = builder.profileImg;
            this.phone = builder.phone;
            this.email = builder.email;
        }

        static class Builder{
            private String userid, name, password, profileImg, phone, email;
            public Builder(String userid){this.userid=userid;}
            public Builder name(String name){this.name=name; return this;}
            public Builder password(String password){this.password=password; return this;}
            public Builder profileImg(String profileImg){this.profileImg=profileImg; return this;}
            public Builder phone(String phone){this.phone=phone;return this;}
            public Builder email(String email){this.email=email; return this;}
            Member build(){return new Member(this);}
        }
        @Override public String toString(){
            return String.format("[사용자 스펙] userid: %s, name: %s, password: %s, profileImg: %s, phone: %s, email: %s ",
                    userid, name, password, profileImg, phone, email);
        }
    }
    interface MemberService{
        void save(Member member);
        void update(Member member);
        void delete(Member member);
        Member findById(String userid);
        List<Member> findByName(String name);
        List<Member> findAll();
        int count();
        boolean existById(String userid);
        void clear();
    }

    static class MemberServiceImpl implements MemberService{
        private final Map<String, Member> map;

        MemberServiceImpl(){
            this.map = new HashMap<>();
        }

        @Override public void save(Member member){
            map.put(member.getUserid(), member);
        }

        @Override
        public void update(Member member) {
            map.replace(member.getUserid(),member);
        }

        @Override
        public void delete(Member member) {
            map.remove(member.getUserid());
        }

        @Override
        public Member findById(String userid) {
            return map.get(userid);
        }

        @Override
        public List<Member> findByName(String name) {
            return (List<Member>) map.get(name);
        }

        @Override
        public List<Member> findAll() {
            return (List<Member>) map.get(map.keySet());
        }

        @Override
        public int count() {
            return map.size();
        }

        @Override
        public boolean existById(String userid) {
            return map.containsKey(userid);
        }

        @Override
        public void clear() {
            map.clear();
        }
    }
}
