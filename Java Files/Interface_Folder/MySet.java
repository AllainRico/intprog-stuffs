public class MySet implements Set
{
   int [] items;
   int count;
  
  public MySet(int size)
  {
      items = new int[size];
  }
  
  public MySet()
  {
      this(10);
  }
  
  public boolean isEmpty()
  {
      return count == 0;
  }
  
  public boolean isFull()
  {
      return count == items.length;
  }
  
  public void add(int item) {
	    for (int i = 0; i < count; i++) {
	        if (items[i] == item) {
	            return;
	        }
	    }
	    if (!isFull()) {
	        items[count++] = item;
	    }
	}
  
  public Set union(Set set) {
	    MySet union = new MySet();
	    MySet argSet = (MySet) set;

	    for (int i = 0; i < count; i++) {
	        union.add(items[i]);
	    }

	    for (int i = 0; i < argSet.count; i++) {
	        union.add(argSet.items[i]);
	    }

	    return union;
	}
  
  public Set intersection(Set set)
  {
      MySet intersection = new MySet();
      MySet argSet = (MySet)set;

      for (int i = 0; i < count; i++) 
      {
          if (argSet.isFound(items[i])) 
          {
              if (!intersection.isFound(items[i])) {
                  intersection.add(items[i]);
              }
          }
      }
      return intersection;  
  }
   
   public Set differenceA(Set set) 
   {
	    MySet differenceA = new MySet();
	    MySet argSet = (MySet) set;

	    for (int i = 0; i < count; i++) 
	    {
	        if (!argSet.isFound(items[i])) 
	        {
	            differenceA.add(items[i]);
	        }
	    }
	    return differenceA;
	}

   public Set differenceB(Set set) 
   {
	   MySet differenceB = new MySet();
	   MySet argSet = (MySet) set;

	    for (int i = 0; i < argSet.count; i++) 
	    {
	        if (!isFound(argSet.items[i])) 
	        {
	            differenceB.add(argSet.items[i]);
	        }
	    }
	    return differenceB;
	}
   
   public boolean isSubset(Set set) 
   {
       MySet argSet = (MySet) set;
       if (count >= argSet.count) {
           return false;
       }
       for (int i = 0; i < count; i++) 
       {
           if (!argSet.isFound(items[i])) 
           {
               return false;
           }
       }
       return true;
   }
     

   public int cardinality()
   {
	   return count;
   }
  
  public String toString()
  {
      StringBuffer sb = new StringBuffer();
      sb.append("{ ");
         for(int i = 0; i < count; i++)
         sb.append(items[i] + " ");
         sb.append("}");
         return sb.toString();
  }
  
  public boolean isFound(int item)
  {
      boolean flag = false;
      
      for(int i = 0; i < count; i++)
         if(items[i] == item)
         {
            flag = true;
            break;
         }
         
         return flag;
  }
  
  public boolean equals(Object obj)
  {
      boolean flag = false;
      if(obj instanceof Set)
      {
         MySet set = (MySet)obj;
         for(int i = 0; i < count; i++)
         
         if(!set.isFound(items[i]))
         {
            flag = false;
            break;
         }
      }
      
      return flag;
  }
  
  public static void main(String [] args)
  {
      MySet setA = new MySet();
      MySet setB = new MySet();
      setA.add(5);
      setA.add(6);
      setA.add(4);
      setA.add(2);
   
      setB.add(5);
      setB.add(8);
      setB.add(9);
      setB.add(2);
      setB.add(3);
      
      System.out.println("set A contains: " + setA);
      System.out.println("set B contains: " + setB +"\n");
      System.out.println("set A union set B: " + setA.union(setB));
      System.out.println("set A intersection set B: " + setA.intersection(setB));
      System.out.println("set A - B: " + setA.differenceA(setB)+ " | set B - A: " +setA.differenceB(setB));
      System.out.println("set B subset of set A?: " + setA.isSubset(setB));
      //System.out.println("set A cardinality: "+"["+setA.cardinality()+"]"+ " | set B cardinality: "+"["+setB.cardinality()+"]");
  }
}