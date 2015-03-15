package UebAnnotationen;

import java.lang.reflect.Method;

public class TestRunner {
	static void executeTests(String className) {
		try {
			executeTests(Class.forName(className));
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	static void executeTests(Class<?> clazz) {
		try {
			Object testObject = clazz.newInstance();
			Method[] methods = testObject.getClass().getDeclaredMethods();

			for (Method amethod : methods) {
				Test testAnnotation = amethod.getAnnotation(Test.class);
				if (testAnnotation != null) {
					Class<?> classOfException = testAnnotation.expected();
					String result = invoke(amethod, testObject, classOfException);
					System.out.println(result);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	static String invoke(Method m, Object o, Class classOfException) {
		try {
			m.invoke(o, (Object[]) null);
			return "passed";
		} catch (Exception x) {
			if (x.getCause().getClass().equals(classOfException)) {
				return "passed";
			}
			return "failed";
		}
	}

	public static void main(String[] args) {
		executeTests("UebAnnotationen.TestUsage");
		// executeTests( ClassToTest.class );
	}
}
