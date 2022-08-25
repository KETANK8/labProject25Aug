package banking.Project;

import java.util.Comparator;

public class IdComparator implements Comparator<student> {

	@Override
	public int compare(student student1, student student2) {
		// TODO Auto-generated method stub
		if(student1.studentId == student2.studentId)
			return 0;
		if(student1.studentId > student2.studentId)
			return 1;
		else
			return -1;	
	}
}
