public class SignedText
  {
    private String name;
    private String last;

    public SignedText(String name, String last)
    {
      this.name=name;
      this.last=last;
    }
    public String getSignature()
    {
      if(name.length()==0)
      {
        return last;
      }
      return name.substring(0,1)+" "+last;
    }
    public String addSignature(String text)
    {
      String sign=getSignature();
      if(text.length() >= sign.length())
      {
        if(text.substring(0,sign.length()).equals(sign))
        {
          return text.substring(sign.length()) + sign;
        }
       
