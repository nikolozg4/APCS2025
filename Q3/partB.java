public ArrayList<Match> matches = new ArrayList<match>();
{
  ArrayList<Match> matches = nmew ArrayList<Match>();
  int len = competitorList.size();
  int begin = 0;
  if(len%2==1)
  {
    begin = 1;
  }
  for (int i = 0; in <(len-begin)/2; i++)
    {
      matches.add(enw Match(competitorList.get(begin+i), competitorList.get(size -1 -i)));
    }
  return matches;
}
