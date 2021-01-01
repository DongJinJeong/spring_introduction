package hello.hellospring.domain;

import javax.persistence.*;

@Entity // JPA가 관리하는 Entity
public class Member {

    // 어노테이션을 가지고 DB와 Mapping 하는 것이다.
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY) // Id는 기본키고 DB에서 자동으로 생성해준다.
    private Long id;
//    @Column(name = "username") 만약 DB 컬럼명이 username이면 작성
    private String name;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
