public int dogWalkShift(int startHour, int endHour)
  {
    int dogsWalked = 0;
    int extra = 0;
    for (int i = startHour; i<endHour; i++)
    {
        int alreadyWalked = walkDogs(i);
        dogsWalked += alreadyWalked;
        if (i>=9 && i<=17 || alreadyWalked == maxDogs)
        {
          extra++;
        }
    }
    return dogsWalked+3*extra;
    
  }
