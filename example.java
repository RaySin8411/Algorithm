/*Less. Is item v less than w ?*/
private static boolean less(Comparable v, Comparable w)
{  return v.compareTo(w) < 0;  }

/*Exchange.  Swap item in array a[] at index i with the one at index j.*/
private static void exch(Comparable[] a, int i, int j)
{
   Comparable swap = a[i];
   a[i] = a[j];
   a[j] = swap;
}

/*Goal.  Test if an array is sorted.*/
private static boolean isSorted(Comparable[] a)
{
   for (int i = 1; i < a.length; i++)
      if (less(a[i], a[i-1])) return false;
   return true;
}