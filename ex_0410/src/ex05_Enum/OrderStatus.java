package ex05_Enum;
//온라인 쇼핑몰의 주문상태를 관리하는시스템
//상태에 따라 다음 상태로 바뀌면된다.
//각 상태에서 next()메서드를 호출하면 다음 상태로 전환 되도록 구현하기
//ex) ORDERED -> SHIPPED// SHIPPED -> DELIVERED//DELIVERED -> "완료상태이며 상태전환 불가.
public enum OrderStatus {
	ORDERED{
		@Override
		OrderStatus next() {
			return SHIPPED;
		}
	},
	SHIPPED{
		@Override
		OrderStatus next() {
			return DELIVERED;
			
		}
	},
	DELIVERED{
		@Override
		OrderStatus next() throws Exception {
			throw new Exception("더 이상 상태를 전환할 수 없습니다.");
		}
	};

	
	
	abstract OrderStatus next() throws Exception;
	
}
