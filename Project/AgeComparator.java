package banking.Project;

import java.util.Comparator;

public class AgeComparator implements Comparator<student> {

	@Override
	public int compare(student student1, student student2) {
		// TODO Auto-generated method stub
		if(student1.studentAge == student2.studentAge)
			return 0;
		if(student1.studentAge > student2.studentAge)
			return 1;
		else
			return -1;	
	}
}
