import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class ScheduleTest {
	Work w[]=new Work[4];
	Schedule s;
	@Test
	public void testFCFS() {
		s=new Schedule();
		List<Work> l= new ArrayList<Work>();
		w[1]=new Work("1", 1, 3);
		w[2]=new Work("2", 2, 4);
		w[3]=new Work("3", 3, 4);
		for(int i=1;i<=3;i++){
			l.add(w[i]);
		}
		List<Double> re=s.FCFS(l);
		assertEquals(6.0, re.get(0),0.0);
		assertEquals(4.75/3.0, re.get(1),0.0);
		
	}
	@Test
	public void testSJF1() {
		s=new Schedule();
		List<Work> l= new ArrayList<Work>();
		w[1]=new Work("1", 1, 3);
		w[2]=new Work("2", 2, 4);
		w[3]=new Work("3", 3, 4);
		for(int i=1;i<=3;i++){
			l.add(w[i]);
		}
		List<Double> re=s.SJF(l);
		assertEquals(6.0, re.get(0),0.0);
		assertEquals(4.75/3.0, re.get(1),0.0);
	}
	@Test
	public void testSJF2() {
		s=new Schedule();
		List<Work> l= new ArrayList<Work>();
		w[1]=new Work("1", 1, 3);
		w[2]=new Work("2", 2, 4);
		w[3]=new Work("3", 2, 3);
		for(int i=1;i<=3;i++){
			l.add(w[i]);
		}
		List<Double> re=s.SJF(l);
		
		assertEquals(17.0/3.0, re.get(0),0.0);
		assertEquals((1+2.25+5.0/3.0)/3.0, re.get(1),0.0);
	}
	@Test
	public void testWork() {
		w[1]=new Work("1", 1, 3);
		assertEquals(0, w[1].getPriority());
	}
}
