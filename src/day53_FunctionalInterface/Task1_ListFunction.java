package day53_FunctionalInterface;

import java.util.List;

@FunctionalInterface

public interface Task1_ListFunction <T,R>{
   R apply (List<T> list);
}

