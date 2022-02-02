package test;

		import java.io.*;
		import java.lang.*;
		import java.util.*;

		class one {
			public void dog()
			{
				System.out.println("dog");
			}
		}

		class two extends one {
			public void elephant() { System.out.println("elephant"); }
		}
		
		public class SingleLevel {
			public static void main(String[] args)
			{
				two g = new two();
				g.dog();
				g.elephant();
				
			}
		


	}