package CalcTest; 
import static org.junit.Assert.*;


import org.junit.Test;

import Calc.Calc;

public class CalcTst {

	@Test
	public void testAdd_TwoPosInt_PosInt() {
		
		Calc o=new Calc();
		int res=o.add(5,8);
		assertTrue(res==13);
	}
	@Test
	public void testAdd_TwoNegInt_NegInt() {
		
		Calc o=new Calc();
		int res=o.add(-5,-8);
		assertTrue(res==-13);
	}
	
	@Test
	public void testAdd_OnePosIntWith0_PosInt() {
		
		Calc o=new Calc();
		int res=o.add(5,0);
		assertTrue(res==5);
	}
	@Test
	public void testAdd_OneNegIntWith0_NegInt() {
		
		Calc o=new Calc();
		int res=o.add(-5,0);
		assertTrue(res==-5);
	}
	@Test (timeout =1)
	public void testAdd_FirstPosIntSecondNeg_GreaterInt() {
		
		Calc o=new Calc();
		int res=o.add(5,-8);
		assertTrue(res==-3);
	}
	@Test
	public void testAdd_FirstNegIntSecondNeg_GreaterInt() {
		
		Calc o=new Calc();
		int res=o.add(-5,8);
		assertTrue(res==3);
	}
	
	@Test
	public void testSub_FirstPosGreaterSecondPosLess_PostInt() {
		
		Calc o=new Calc();
		int res=o.sub(8,5);
		assertTrue(res==3);
	}
	@Test
	public void testSub_FirstLessIntSecondGreater_NegInt() {
		
		Calc o=new Calc();
		int res=o.sub(5,8);
		assertTrue(res==-3);
	}
	@Test
	public void testSub_FirstNegIntSecondPos_NegInt() {
		
		Calc o=new Calc();
		int res=o.sub(-5,8);
		assertTrue(res==-13);
	}
	@Test
	public void testSub_FirstPosIntSecondNeg_PostInt() {
		
		Calc o=new Calc();
		int res=o.sub(5,-8);
		assertTrue(res==13);
	}
	
}
