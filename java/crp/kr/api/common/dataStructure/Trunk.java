package crp.kr.api.common.dataStructure;

import lombok.Data;


import java.util.*;
import java.util.stream.Collectors;


/**
 * packageName:crp.kr.api.common.dataStructure
 * fileName        :Trunk
 * author           : chohyungook
 * date               :2022-05-12
 * desc            :
 * ================================
 * DATE              AUTHOR        NOTE
 * ================================
 * 2022-05-12 chohyungook 최초 생성
 */
@Data
public class Trunk<T,U>{
    private Map<T,U> map;
    public Trunk() {
        this.map = new HashMap<>();
    }
    // save,update,delete,findAll,findByName,findById,count,existsById,clear
    //add,set,remove,get(),X,get(i),size,X,clear

    public void put(T t,U u) {
        map.put(t, u);
    }

    public void replace(T t,U u) {
        map.replace(t,u);
    }

    public void remove(Object t) {
        map.remove(t);
    }

    public U findById(String id) {
        return map.get(id);
    }

    public List<U> findByName(String name) {
        List<U> list = new ArrayList<>();
        return list;
    }

    public List<U> findAll() {
        return map.values().stream().collect(Collectors.toList());
    }

    public int count() {
        return map.size();
    }

    public boolean existsById(String id) {
        return map.containsKey(id);
    }


}
