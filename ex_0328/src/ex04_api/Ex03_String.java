package ex04_api;

import java.util.Arrays;

public class Ex03_String {
	public static void main(String[] args) {
		String str = "Kim Mal Ddong";
		
		//1. lenght()
		//문자열의 길이를 반환하는 메서드
		System.out.println("문자열 str의 길이 : " + str.length());
		
		//2. indextOf(char ch)
		//인자로 전달된 글자의 인덱스 값을 반환한다.
		//왼쪽부터 오른쪽으로 탐색하고
		//같은 글자가 여러개 있을 떄 가장 먼저 만나는 글자의 index값을 반환.
		System.out.println("글자 M의 위치 : " + str.indexOf('M'));
		
		//3. charAt(int index)
		//인자로 전달죈인덱스에 해당하는 글자를 반환
		System.out.println("4번 index의 글자 : " + str.charAt(4));
		
		//4. substring(int offet, int end)
		//일정 인덱스 만큼 글자를 잘라서 반환
		System.out.println(str.substring(0,5));
		
		//5. split()
		//인자로 전달되는 값을 구분자로 문자열을 분할하여 배열형태로 반환
		String [] arr = str.split(" ");
		System.out.println(Arrays.toString(arr));
		
		//6. replace()
		//특정 문자열을 치환해주는 메서드
		System.out.println(str.replace("Mal","Gae"));
		
		//7. contains()
		//특정 문자열을 포함하고 있는지 판별
		System.out.println(str.contains("a"));
		
		//8. isEmpty
		//문자열의 길이가 0인경우 true를 반환
		System.out.println(str.isEmpty());
		
		//9. trim()
		//앞뒤 공백 제거
		String str2 = "   Hong Gil Dong   ";
		System.out.println(str2.trim());
		
		//10. concat()
		//두개의 문자열을 이어붙힌다.
		System.out.println(str.concat(str2));
		
		//11. startsWith()
		//인자로 전달된 문자열로 시작하는지 확인
		System.out.println(str.startsWith("Kim"));
		
		//12. endsWith()
		//인자로 전달된 문자열로 끝나는지 확인
		System.out.println(str.endsWith("Ddong"));
		
	
	}
}
