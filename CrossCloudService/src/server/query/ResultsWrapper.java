package server.query;

import com.hp.hpl.jena.query.QuerySolution;
import com.hp.hpl.jena.query.ResultSet;

public class ResultsWrapper {

	ResultSet results;
	
	public ResultsWrapper(ResultSet results) {
		this.results = results;
		
		
	}
	
	public void printResults(){
		
		while(results.hasNext()){
			
			QuerySolution soln = results.nextSolution();
			System.out.println(soln.toString());
		}
		
	}
	
	
}
