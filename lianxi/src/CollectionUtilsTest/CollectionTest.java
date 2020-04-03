package CollectionUtilsTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import org.apache.commons.collections4.CollectionUtils;

public class CollectionTest {
	
	
	public   static void   main(String [] args)
    {
	  String   []  A=new  String []{"A","B","C","D","E","F"};
	  String [] B =new  String  [] {"B", "D", "F", "G", "H", "K" };
	  List<String> listA= Arrays.asList(A);
	  List<String> listB= Arrays.asList(B);
	 List<String> list= (List<String>) CollectionUtils.union(listA, listB);
      System.out.println(CollectionUtils.union(listA, listB));
      System.out.println("-------------------------------并集------------------------------------------------------");
      
   List<String>list1=(List<String>) CollectionUtils.intersection(listA,listB);
  	System.out.println(list1);
    System.out.println("-------------------------------交集------------------------------------------------------");
     
    List<String> list2=  (List<String>) CollectionUtils.disjunction(listA,listB);
	System.out.println(list2);
    System.out.println("-------------------------------交集的补集------------------------------------------------------");
    
    List<String> list3=  (List<String>) CollectionUtils.subtract(listA, listB); 
    System.out.println(list3);
    System.out.println("-------------------------------A差集------------------------------------------------------");
    List<String> list4=  (List<String>) CollectionUtils.subtract(listB, listA); 
    System.out.println(list4);
    System.out.println("-------------------------------B差集------------------------------------------------------");
    
      boolean   b =CollectionUtils.isEmpty(listA);   
      System.out.println ("判断集合是否为空"+b);   //  判断集合是否为空
      boolean  a =CollectionUtils.isNotEmpty(listB);
      System.out.println("判断集合是否不为空"+a);  // 判断集合是否不为空
      		 
    List<String>  listC=Arrays.asList(new String[]{"a","b","c"});
    List<String>  listD=Arrays.asList(new String[]{"A","B","C"});
    List<String>  listE=Arrays.asList(new String[]{"b","a","c"});
    List<String>  listF=Arrays.asList(new String[]{"b","a","c","a"});
    List<String>  listG=new  ArrayList<String>();
    listG.add("a");
    System.out.println(CollectionUtils.isEqualCollection(listC, listF));
    System.out.println("-------------------------------集合内容相等就可以------------------------------------------------------");
      
      Collection <String>   listH=CollectionUtils.unmodifiableCollection(listG);
        listG.add("d");
        listG.add("e");
       // listH.add("111");
       System.out.println(listG);
       System.out.println(listH);
       
      }

	
	
}
