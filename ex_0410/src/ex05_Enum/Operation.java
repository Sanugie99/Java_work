package ex05_Enum;

public enum Operation {
	PLUS{
		@Override
		public int apply(int x, int y) {
			return x+y;
		}
	},
	MINUS{
		@Override
		public int apply(int x, int y) {
			return x-y;
		}
	},
	MULTI{
		@Override
		public int apply(int x, int y) {
			return x*y;
		}
	},
	DIV{
		@Override
		public int apply(int x, int y) {
			return x/y;
		}
	};
	
	
	public abstract int apply(int x, int y);
}
