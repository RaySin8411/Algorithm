public class Selection
{
   public static void sort(Comparable[] a)
   {
      int N = a.length;
      for (int i = 0; i < N; i++)
      {
         int min = i;
         for (int j = i+1; j < N; j++)
            if (less(a[j], a[min]))
               min = j;
         exch(a, i, min);
      }
   }
   private static boolean less(Comparable v, Comparable w)
   {  /* as before */  }
   private static void exch(Comparable[] a, int i, int j)
   {  /* as before */  }
}