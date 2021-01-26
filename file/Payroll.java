package file;

/** Payroll prints a file of paychecks from an input payroll file. */
public class Payroll
{ public static void main(String[] args)
  { 
//	System.out.println(System.getProperty("user.dir"));
	DialogReader starter = new DialogReader();       // �Է�â���� �������� dialogReader ��ü ���� starter ��� �̸��� dialog ��ü��.
    String in_name = starter.readString("Please type input payroll name:");					// �������� ������ �̸��� in_name �� ����
    String out_name = starter.readString("Please type output payroll name:");				// ���� ������ �ϴ� ������ �̸� ( ���ϸ�) �� out_name �� ���� 
    if ( in_name != null  &&  out_name != null )
       { processPayroll(in_name, out_name); }											//
    System.out.println("finished");
  }

  private static void processPayroll(String in, String out)
  { PayrollReader reader = new PayrollReader(in);									// paryrollreader payrollwriter �Ѵ� parameter �� file _name �̵���
    PayrollWriter writer = new PayrollWriter(out);
    while ( reader.getNextRecord() )
          { double pay = reader.hoursOf() * reader.payrateOf();
            writer.printCheck(reader.nameOf(), pay);
          }
    reader.close();
    writer.close();
  }
}