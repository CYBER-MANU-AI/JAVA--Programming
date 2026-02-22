public class Studentmarks{
    public static void main(String[] args){
        int [] marks ={98, 78, 63, 64, 56, 39};
        double total= 0;
        int max = marks[0]; 
        int min = marks[0] ;
        double avg  ;
        
        for ( int mark : marks){
            total += mark;
            if (mark > max){
                max = mark;
            }
            if (mark < min){
                min = mark;
            }
        }
        avg = total / marks.length ;

        System.out.println("highestt mark ="+ max); 
        System.out.println("lowest mark ="+ min); 
        System.out.println("avg mark =" + avg); 
        System.out.println("total mark ="+ total);   
    }
}
