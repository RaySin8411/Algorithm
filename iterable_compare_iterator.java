# iterable interface
public interface Iterable<Item>
{
   Iterator<Item> iterator();
}

# iterator interface
public interface Iterator<Item>
{
   boolean hasNext();
   Item next();
   void remove();
}

# equivalent code(longhand)
Iterator<String> i = stack.iterator();      
while (i.hasNext())
{
   String s = i.next();
   StdOut.println(s);
}