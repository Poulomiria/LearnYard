class Compute
{
    public long[] minAnd2ndMin(long a[], long n)
    {
        long[] result = new long[2];
        long min = Long.MAX_VALUE;
        long secondMin = Long.MAX_VALUE;
        for(int i = 0; i < n; i++)
        {
            min = Math.min(min, a[i]);
        }
        for(int i = 0; i < n; i++)
        {
            if(a[i] > min )
            {
                secondMin = Math.min(secondMin, a[i]);
            }
        }
        if(min == Long.MAX_VALUE || secondMin == Long.MAX_VALUE)
        {
            return new long[]{-1};

        }else{
            return new long[]{min, secondMin};
        }
    }
}
