
public class StringBufferTest 
{
	public static void main(String[] args) 
	{
		//StringBuffer, StringBuilder
		//Buffer : ������ ��ü�� ���� ���۸� ���(����ȭ ���Ѿ��� -> �Ѱ��� ��ü�� ���۸� �����ϰ� ������ �ٸ� ��ü���� ���), ��Ƽ�����带 ����� ��� ���۸� ����ϴ°��� ����
		//builder : buffer�� ���������� ���� �����忡 ����ȭ �Ǿ�����(����ȭ ó���� �Ұ�����)
		//���ڿ��� ���̿� ������ �����ϴµ� ����
		
		StringBuffer sb = new StringBuffer("");
		
		StringBuilder sbd = new StringBuilder("");
		
		sb.append("");
		sb.delete(0,0);
		sb.insert(0, "");
		sb.reverse();
		
		//����ȭ �ϰ��� �Ѵٸ� synchronized Ű���带 ���
	}
}
