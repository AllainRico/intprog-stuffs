/*Write a program that allows the user to create two(2) sets.
  Given these two sets, apply the following set operations specified
  in the Set interface.
*/
public interface Set{
  public Set union(Set set);
  public Set intersection(Set set);
  public Set differenceA(Set set);
  public Set differenceB(Set set);
  public boolean isSubset(Set set);
  public int cardinality();
}