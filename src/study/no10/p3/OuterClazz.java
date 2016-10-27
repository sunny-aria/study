package study.no10.p3;

import study.no10.p2.Destination;

public class OuterClazz {
	
	
	protected class InnerClazz implements  Destination{

		private int a = 0;

		public InnerClazz() {
			// TODO Auto-generated constructor stub
		}

		@Override
		public String des() {
			return "destination";
		}
		
	}
	
	
	public static void main(String[] args) {
		
	}
}
