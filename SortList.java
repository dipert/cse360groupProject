package groupProject;
import java.io.*;
import java.util.*;

public class SortList extends ListItem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<ListItem> toDoList = new ArrayList<ListItem>(1); 
		ListItem one = new ListItem();
		ListItem two = new ListItem();
		ListItem three = new ListItem();
		ListItem four = new ListItem();
		one.setPriority(5);
		two.setPriority(7);
		three.setPriority(4);
		four.setPriority(6);
		
		one.setDueDay(15);
		one.setDueMonth(4);
		one.setDueYear(2020);
		two.setDueDay(12);
		two.setDueMonth(4);
		two.setDueYear(2020);
		three.setDueDay(15);
		three.setDueMonth(4);
		three.setDueYear(2020);
		four.setDueDay(5);
		four.setDueMonth(4);
		four.setDueYear(2019);
		
		one.setStartDay(1);
		one.setStartMonth(1);
		one.setStartYear(2020);
		two.setStartDay(1);
		two.setStartMonth(1);
		two.setStartYear(2019);
		three.setStartDay(1);
		three.setStartMonth(1);
		three.setStartYear(2020);
		four.setStartDay(5);
		four.setStartMonth(4);
		four.setStartYear(2019);
		
		one.setFinishDay(5);
		one.setFinishMonth(4);
		one.setFinishYear(7);
		two.setFinishDay(5);
		two.setFinishMonth(4);
		two.setFinishYear(7);
		three.setFinishDay(5);
		three.setFinishMonth(4);
		three.setFinishYear(7);
		four.setFinishDay(5);
		four.setFinishMonth(4);
		four.setFinishYear(7);
		
		toDoList.add(one);
		toDoList.add(two);
		toDoList.add(three);
		toDoList.add(four);
		
		for(int i = 0; i < toDoList.size(); i++)
		{
			System.out.println(toDoList.get(i).getPriority());
		}
		System.out.print("\n");
		/*for(int toDoIndex = 0; toDoIndex < toDoList.size(); toDoIndex++)
		{
			if(toDoIndex < toDoList.size() - 1)
			{
				if(toDoList.get(toDoIndex).getPriority() > toDoList.get(toDoIndex + 1).getPriority())
				{
					Collections.swap(toDoList, toDoIndex, toDoIndex + 1);
				}
			}
		}*/
		//SortByPriority
		ListItem temp = new ListItem();
		for (int j = 1; j < toDoList.size(); j++) {  
            temp = toDoList.get(j);  
            int index = j - 1;  
            while ((index > -1) && ( toDoList.get(index).getPriority() > temp.getPriority())) {  
                toDoList.set(index + 1, toDoList.get(index));  
                index--;  
            }  
            toDoList.set(index + 1, temp);  
        }  
		
		
		//ListItem tempo = new ListItem();
		//SortByPriority
		for (int j = 1; j < toDoList.size(); j++) {  
            temp = toDoList.get(j);  
            int index = j - 1;  
            if(toDoList.get(index).getDueYear() == temp.getDueYear())
            {
            	if(toDoList.get(index).getDueMonth() == temp.getDueMonth())
            	{
            		if(toDoList.get(index).getDueDay() == temp.getDueDay())
            		{
            			//SortByPriority
            			while ((index > -1) && ( toDoList.get(index).getPriority() > temp.getPriority())) 
            			{  
            				toDoList.set(index + 1, toDoList.get(index));  
            				index--;  
            			}  
        
            		}
            		else
            		{
            			while ((index > -1) && ( toDoList.get(index).getDueDay() < temp.getDueDay())) 
            			{  
            				toDoList.set(index + 1, toDoList.get(index));  
            				index--;  
            			}  
            		}
            	}
            	else
            	{
            		while ((index > -1) && ( toDoList.get(index).getDueMonth() < temp.getDueMonth())) 
                	{  
                    	toDoList.set(index + 1, toDoList.get(index));  
                    	index--;  
                	}
            	}
            }
            else
            {
            	while ((index > -1) && ( toDoList.get(index).getDueYear() < temp.getDueYear())) 
            	{  
                	toDoList.set(index + 1, toDoList.get(index));  
                	index--;  
            	}  
            }
            toDoList.set(index + 1, temp);  
        }  
		
		
		
		for(int i = 0; i < toDoList.size(); i++)
		{
			System.out.println(toDoList.get(i).getPriority());
		}
	}

/*public static void swap(ListItem less, ListItem more)
{
	
}*/

	
}
