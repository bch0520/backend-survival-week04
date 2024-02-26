package kr.megaptera.assignment.models;

import com.github.f4b6a3.tsid.TsidCreator;

import java.util.Objects;

public class PostId {
    private String value;
    public PostId(String value) {
        this.value = value;
    }
    public static PostId of(String value) {
        return new PostId(value);
    }
    public static PostId generate() { //static 사용
        return new PostId(TsidCreator.getTsid().toString());
    }

    @Override
    public String toString() {
        return this.value;
    }

    @Override
    public boolean equals(Object o) { //해쉬이퀄 동일성 찾아보기
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PostId postId = (PostId) o;
        return Objects.equals(value, postId.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
