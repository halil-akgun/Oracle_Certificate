import java.util.ArrayList;
import java.util.List;

public class Soru_136 {

    public static void main(String[] args) {

        List<String> arrayList = new ArrayList<>();
        arrayList.add("Tech") ;
        arrayList.add("Expert") ;
        arrayList.set(0, "Java");
//        arrayList.forEach (a ->  arrayList.set(arrayList.indexOf(a),a.concat("Forum"))); // boyle olabilirdi//[JavaForumGroup, ExpertForumGroup]
        arrayList.forEach (a ->  a.concat("Forum"));
        arrayList.replaceAll (s -> s.concat("Group") ) ;
        System.out.println(arrayList);

    }
}
