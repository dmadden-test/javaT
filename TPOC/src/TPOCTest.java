import main.MessageGen;

public class TPOCTest {
  public static void main(String[] args) {
		System.out.println(checkMessageContent());
			
	}

  public static String checkMessageContent() {
	  MessageGen receiveMessage = new MessageGen();
	  String result = receiveMessage.getMessage();
	  String firstMessage = "Hello, World!";
	  String success = "Testing Passed";
	  String failure = "Testing Failed";
	  if (result.equals(firstMessage)) {
		  return success;
	  }
	  else {
		  return failure;
	  }
  }
 }