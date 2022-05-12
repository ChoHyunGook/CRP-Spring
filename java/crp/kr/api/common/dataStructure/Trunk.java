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
public class Trunk<T>{
    private final Map<String,Trunk> map;
    private final List<Trunk> list;
    public Trunk() {
        map = new HashMap<>();
        this.list = new ArrayList<>();
    }
    // save,update,delete,findAll,findByName,findById,count,existsById,clear
    //add,set,remove,get(),X,get(i),size,X,clear

    public void save(Trunk trunk){map.put(trunk.get(),trunk);}
    public void update(Trunk trunk){map.replace(trunk.get(),trunk);}
    public void delete(Trunk trunk){map.remove(trunk.get());}
    public List<T> findById(String id) {return map.get(id);}
    public T findByName(String name) {
        List<T> t =new ArrayList<T>();
        map.forEach((key,value)->{
            if(value..equals(name)){
              t.add(value);
            }
        });
        return t;}
    public T findByAll(String id) {return map.values().stream().collect(Collectors.toList());}
    public int count(){return map.size();}
    public void clear(){map.clear();}
    public boolean existsById(String id){return map.containsKey(id);}

}
