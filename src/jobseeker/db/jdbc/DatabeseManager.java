package jobseeker.db.jdbc;

import java.util.ArrayList;
import java.util.List;

import jobseeker.db.Job;
import jobseeker.db.Person;

public class DatabeseManager {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// New Job
		Job garbageCollector = new Job();
		List<Job> jobs =  new ArrayList<Job>();
		// New Person
		Person manolo = new Person("Manolo", jobs);
		// Add the job to the person
		jobs.add(garbageCollector);
		// Add the person to the job
		garbageCollector.addPerson(manolo);
		System.out.println(manolo);
	}

}
