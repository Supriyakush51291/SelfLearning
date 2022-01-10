
public class Patterns1
{    
public static void main(String args[])   
{    
//i for rows and j for columns      
//row denotes the number of rows you want to print  
int i, j, row = 6;       
//Outer loop work for rows  
for (i=0; i<row; i++)   
{  
//inner loop work for space      
for (j=row-i; j>1; j--)   
{  
//prints space between two stars  
System.out.print(" ");   
}   
//inner loop for columns  
for (j=0; j<=i; j++ )   
{   
//prints star      
System.out.print("* ");   
}   
//throws the cursor in a new line after printing each line  
System.out.println();   
}   
}   
}  
//i = row
//j = column
// i = 0  <5
// j= 0   <5
// i= 0 
// j= 0 1 2 3 4 5(fail) 
// i= 1 
// j= 0 1 2 3 4 5(fail)