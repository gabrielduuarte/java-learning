//A simple tool to help analyze classroom grade stored in a ArrayList

import java.util.ArrayList;

class GradeAnalyzer{
  
  public GradeAnalyzer(){}
    
  public int getAverage(ArrayList<Integer> grades){
    if(grades.size() < 1)
    {
      System.out.println("Error! The ArrayList is empty!");
      return 0;
    }
    int sum = 0;
    for(int grade : grades)
      sum += grade;
          
    int average = sum / grades.size();
		System.out.println("The average: " + average);
    return average;
  }
  
  public static void main(String[] args){
    ArrayList<Integer> myClassroom = new ArrayList<Integer>();
    myClassroom.add(98);
    myClassroom.add(92);
    myClassroom.add(88);
    myClassroom.add(75);
    myClassroom.add(61);
    myClassroom.add(89);
    myClassroom.add(95);
    
    GradeAnalyzer myAnalyzer = new GradeAnalyzer();
    myAnalyzer.getAverage(myClassroom);
  }
    
}

