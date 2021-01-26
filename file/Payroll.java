package file;

/** Payroll prints a file of paychecks from an input payroll file. */
public class Payroll
{ public static void main(String[] args)
  { 
//	System.out.println(System.getProperty("user.dir"));
	DialogReader starter = new DialogReader();       // 입력창으로 받으려고 dialogReader 객체 생성 starter 라는 이름은 dialog 객체다.
    String in_name = starter.readString("Please type input payroll name:");					// 읽으려는 파일의 이름이 in_name 에 저장
    String out_name = starter.readString("Please type output payroll name:");				// 내가 쓰려고 하는 파일의 이름 ( 파일명) 이 out_name 에 저장 
    if ( in_name != null  &&  out_name != null )
       { processPayroll(in_name, out_name); }											//
    System.out.println("finished");
  }

  private static void processPayroll(String in, String out)
  { PayrollReader reader = new PayrollReader(in);									// paryrollreader payrollwriter 둘다 parameter 에 file _name 이들어간다
    PayrollWriter writer = new PayrollWriter(out);
    while ( reader.getNextRecord() )
          { double pay = reader.hoursOf() * reader.payrateOf();
            writer.printCheck(reader.nameOf(), pay);
          }
    reader.close();
    writer.close();
  }
}