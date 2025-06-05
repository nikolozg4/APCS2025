public int walkDogs(int hour) 
{
  int availableDogs = company.numAvailableDogs(hour)
  int dogsWalked=0
  if (availableDogs <= maxDogs) 
  {
    dogsWalked = availableDogs;
  }
  else
  {
    dogsWalked = maxDogs;
  }
  company.updateDogs(hour, dogsWalked);
  return dogsWalked;
