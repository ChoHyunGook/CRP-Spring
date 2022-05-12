package crp.kr.api.common.dataStructure;

import lombok.Data;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * packageName:crp.kr.api.common.dataStructure
 * fileName        :Box
 * author           : chohyungook
 * date               :2022-05-12
 * desc            :
 * ================================
 * DATE              AUTHOR        NOTE
 * ================================
 * 2022-05-12chohyungook최초 생성
 */
@Component @Data @Lazy
public class Box<T> {
    private final ArrayList<T> list;
    public Box() {this.list = new ArrayList<>();}
    // save,update,delete,findAll,findByName,findById,count,existsById,clear
    //add,set,remove,get(),X,get(i),size,X,clear

        public void add(T t){list.add(t);}
        public void set(int i, T t){list.set(i,t);}
        public void remove(T t){list.remove(t);}
        public List<T> get() {return list;}
        public T get(int i){return list.get(i);}
        public int size(){return list.size();}
        public void clear(){list.clear();}
}
