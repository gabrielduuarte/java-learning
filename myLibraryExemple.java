import java.util.HashMap;

class Library{

  public Library(){}
	
  public void getFinishedBooks(HashMap<String, Boolean> library){
    if(library.size() < 1)
    {
      System.out.println("Error! The HashMap is empty...");
      return;
    }
    for(String book : library.keySet())
    {
      if(library.get(book) == true)
        System.out.println("The " + book + " was already read.");
    }
  }
    
  public static void main(String[] args){
    HashMap<String, Boolean> myBooks = new HashMap<String, Boolean>();
    
    myBooks.put("Road Down the Funnel", true);
    myBooks.put("Rat: A Biology", false);
    myBooks.put("TimeIn", true);
    myBooks.put("3D Food Printing", false);
  	Library myLibrary = new Library();
  	myLibrary.getFinishedBooks(myBooks);
  }   
}

