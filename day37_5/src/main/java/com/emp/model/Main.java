package com.emp.model;

import java.util.logging.Level;

import org.apache.log4j.Logger;

public class Main {
	static java.util.logging.Logger javaLog = java.util.logging.Logger.getGlobal();
/*
 * [%d{HH:mm:ss}] %C %M(..)
%p debug, info, warn, error, fatal 등의 priority 가 출력된다.
%m 로그내용이 출력됩니다
%d 로깅 이벤트가 발생한 시간을 기록합니다. 포맷은 %d{HH:mm:ss, SSS}, %d{yyyy MMM dd HH:mm:ss, SSS}같은 형태로 사용하며 SimpleDateFormat에 따른 포맷팅을 하면 된다
%d{ABSOLUTE}
%d{DATE}
%d{ISO8601}
%t 로그이벤트가 발생된 쓰레드의 이름을 출력합니다.
%% % 표시를 출력하기 위해 사용한다.
%n 플랫폼 종속적인 개행문자가 출력된다. rn 또는 n 일것이다.
%c 카테고리를 표시합니다 예) 카테고리가 a.b.c 처럼 되어있다면 %c{2}는 b.c가 출력됩니다.
%C 클래스명을 포시합니다. 예)클래스구조가 org.apache.xyz.SomeClass 처럼 되어있다면 %C{2}는 xyz.SomeClass 가 출력됩니다
%F 로깅이 발생한 프로그램 파일명을 나타냅니다.
%l 로깅이 발생한 caller의 정보를 나타냅니다
%L 로깅이 발생한 caller의 라인수를 나타냅니다
%M 로깅이 발생한 method 이름을 나타냅니다.
%r 어플리케이션 시작 이후 부터 로깅이 발생한 시점의 시간(milliseconds)
%x 로깅이 발생한 thread와 관련된 NDC(nested diagnostic context)를 출력합니다.
%X 로깅이 발생한 thread와 관련된 MDC(mapped diagnostic context)를 출력합니다. %X{key} 형태.
*/
	
	/*
	 * TRACE < DEBUG < INFO < WARN < ERROR < FATAL
		public void trace(Object message);
	    public void debug(Object message);
	    public void info(Object message);
	    public void warn(Object message);
	    public void error(Object message);
	    public void fatal(Object message);
	*/
	static Logger logger = Logger.getLogger(Main.class);
	
	public static void main(String[] args) {
		javaLog.setLevel(Level.WARNING);
		System.out.println("콘솔에 출력...");
		javaLog.info("콘솔에 출력 로깅...");
		logger.info("로깅 프레임워크로 출력");
		logger.info("로깅 프레임워크로 출력");
	}
}
