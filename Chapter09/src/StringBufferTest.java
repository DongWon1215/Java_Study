
public class StringBufferTest 
{
	public static void main(String[] args) 
	{
		//StringBuffer, StringBuilder
		//Buffer : 복수의 객체가 같은 버퍼를 사용(동기화 시켜야함 -> 한개의 객체가 버퍼를 점유하고 있으면 다른 객체들은 대기), 멀티스레드를 사용할 경우 버퍼를 사용하는것이 유리
		//builder : buffer와 동일하지만 단일 스레드에 최적화 되어있음(동기화 처리가 불가능함)
		//문자열의 길이와 내용을 변경하는데 용이
		
		StringBuffer sb = new StringBuffer("");
		
		StringBuilder sbd = new StringBuilder("");
		
		sb.append("");
		sb.delete(0,0);
		sb.insert(0, "");
		sb.reverse();
		
		//동기화 하고자 한다면 synchronized 키워드를 사용
	}
}
